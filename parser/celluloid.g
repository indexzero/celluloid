grammar celluloid;

options {
  output = AST;
  backtrack = true;
  memoize = true;
}

tokens {
  VARDEF;
  
  FUNC;
  PRED;
  ARG;
  ARGS;
  CALL;
  PROGRAM;
  EVENTS;
  CONSTRAINTS;
  DEVICES;
  FUNCTIONS;
  
  IF;
  ELSEIF;
  ELSE;
  LISTENER;
  EVERY;
  COND;
  RETURN;
  IN;
  WHEN;
  EVERY;
  
  PROGBLOCK;
  INBLOCK;
  LISTENBLOCK;
  IFBLOCK;
  FUNBLOCK;
  CONBLOCK;
  DEVBLOCK;
  
  FUNHEAD;
  PREDHEAD;
    
  EVENT;
  
  CONSTRAINT;
  REQUIRES;
  
  ANNOUNCES;
  ANNOUNCEMENT;
  ANNOUNCEMENTS;
  
  DEVICE;
  ACCEPTS;
}

// Start boolean literal
BOOL    : 'true' | 'false';
TYPE    : 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output';
// End boolean literal

// Start language blocks
language_block_decl : 'in' LANGUAGE START language_block END;
LANGUAGE            : 'JAVA';
language_block      : '*'; // TODO: Make this match anything
// End language blocks

// Start core literals
ID    :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
START : ('do' | '{') NEWLINE?;
END   : ('end' | '}') NEWLINE?;
// End core literals

// Start line and whitespace delimiters
NEWLINE : '\n' | '\r\n' | '\r';
WS      : ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};   
COMMENT : '#' ~(NEWLINE)* {$channel=HIDDEN;};
// End line and whitespace delimiters

// Start number literals
NUMBER :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
       |   '.' ('0'..'9')+ EXPONENT?
       |   ('0'..'9')+ EXPONENT?;
fragment EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// End number literals


// Start time literals	
fragment SECOND : NUMBER 's';
fragment MINUTE : NUMBER 'm' SECOND | SECOND;
fragment HOUR 	: NUMBER 'h' MINUTE | MINUTE;
fragment DAY 	: NUMBER 'd' HOUR | HOUR;
TIME	        : '@'(DAY | 'start' | 'now');
// End time literals

// Start string literal	
//STRING	  :  '"' ( ESC_SEQ | CHAR )* '"';
fragment STRING  : '"' ( ESCAPE | ~('"'|'\\') )* '"' ;
fragment CHAR    : ('0'..'9'|'a'..'f'|'A'..'F');
fragment ESCAPE  : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
// End string literal

// Start operators
// TODO: LOCAL OPERATORS
ASSIGNMENT_OPERATOR      : '=' | '*=' | '/=' | '%=' | '+=' | '-=' ;
EQUALITY_OPERATOR        : '==' | '!=';
RELATIONAL_OPERATOR      : '>' | '<' | '<=' | '>=';
ADDITIVE_OPERATOR        : '+' | '-';
MULTIPLICATIVE_OPERATOR  : '*' | '/' | '%';
// End operators 

// Start generic literals and declarations
LITERAL : BOOL | NUMBER | STRING | TIME;

// This may allow derivations of literal = variable
// TODO: Templates for all expressions
// TODO: Grammar rules for Local operations
variableDeclaration 
    :    'timeline' ID 
         (NEWLINE -> ^(VARDEF 'timeline' ID)
         |        -> ^(ARG 'timeline' ID))
         //-> timelineDeclaration(name = { $ID.text })
         // TODO: What should we do about the conditional NEWLINE? Include the ';' in the NEWLINE st?
    |    TYPE ID initializer? 
         (NEWLINE -> ^(VARDEF TYPE ID initializer?)
         |        -> ^(ARG TYPE ID))
         //-> variableDeclaration(type = { $TYPE.text }, name = { $ID.text }, init = { $initializer.st })
    ;
    
initializer      
    :    '=' LITERAL
         //-> initializer(exp = { $assignmentExpression.st })
    ;
                    
assignmentExpression     
        : logicalORExpression
        | primaryExpression ASSIGNMENT_OPERATOR^ assignmentExpression;
	          	                 
logicalORExpression      
        : 'not'? logicalANDExpression ('or'^ logicalORExpression)?;	
	 
logicalANDExpression
        : equalityExpression ('and'^ logicalANDExpression)?;

equalityExpression       
        :  relationalExpression (EQUALITY_OPERATOR^ equalityExpression)?;

relationalExpression     
        : additiveExpression (RELATIONAL_OPERATOR^ relationalExpression)?;

additiveExpression      
        : multiplicativeExpression (ADDITIVE_OPERATOR^ additiveExpression)?;

multiplicativeExpression 
	: primaryExpression (MULTIPLICATIVE_OPERATOR^ multiplicativeExpression)?;	

primaryExpression
	: ID
	| 'new' ID '(' expressionList ')'
	| LITERAL
	| functionPredicateCall
	;
// End generic literals and declarations

// Start boolean expressions and declarations
//short_bool_exp  : ID bool_op (literal | ID | short_bool_exp)*;
// End boolean expressions and declarations

// Start lists and generic declartions
idList 
    :    ids += ID (',' ids += ID)* -> ID+
         //-> idList(ids = { $ids })
    |    '(' ids += ID (',' ids += ID)* ')' -> ID+
         //-> idList(ids = { $ids })
    ;

variableList  
    :    vars += variableDeclaration (',' vars += variableDeclaration)* 
         -> variableDeclaration+
         //-> variableList(vars = { $vars })
    |    '(' vars += variableDeclaration (',' vars += variableDeclaration)* ')'
         -> variableDeclaration+
         //-> variableList(vars = { $vars })
    ;

expressionList 
    :    exps += assignmentExpression (',' exps += assignmentExpression)*
         //-> expressionList(exps = { $exps })
    |    '(' exps += assignmentExpression (',' exps += assignmentExpression)* ')'
         //-> expressionList(exps = { $exps })
    ;
// End lists and generic declarations

// Begin timline and procedural blocks
// Need templates for prodcedural code
inBlockDeclaration
    :	assignmentExpression NEWLINE
    |   ifStatement NEWLINE
    |   whenStatement NEWLINE
    |   everyStatement NEWLINE
    |   constraintFunctionCall NEWLINE
    ;
inBlock 
    :	START
            (block += inBlockDeclaration | NEWLINE)*
        END
        -> ^(INBLOCK $block*)
    ;
inStatement
    :  'in' ID inBlock
        -> ^(IN ID inBlock)
        //-> inStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
   
ifStatement
    :  'if' ifTest = logicalORExpression
        START
            (ifBlock += (assignmentExpression | inStatement | ifStatement) NEWLINE )+
            (elseifBlock += elseIfStatement)*
            elseStatement?
        END
        -> ^(IF $ifTest ^(IFBLOCK $ifBlock) ^(ELSEIF $elseifBlock?) ^(ELSE elseStatement?))
        
    ;
elseIfStatement 
    :   'else if' (elseIfTest = logicalORExpression NEWLINE) 
        (statements += (assignmentExpression | inStatement | ifStatement) NEWLINE )*
        -> ^($elseIfTest ^(IFBLOCK $statements))
    ;

elseStatement 
    :   'else' (statements += (assignmentExpression | inStatement | ifStatement) NEWLINE)*
        -> ^(IFBLOCK $statements)
    ;

listenerBlockDeclaration
    :    (assignmentExpression 
          |  constraintFunctionCall 
          |  ifStatement
          |  constraintFunctionCall) 
         NEWLINE
    ;
listenerBlock
    :  START
           (block += listenerBlockDeclaration)*
       END 
       -> ^(LISTENBLOCK $block*)
    ;
whenStatement
    :   cond = ('when' | 'unless') logicalORExpression listenerBlock
        -> ^(LISTENER EVERY ^(COND $cond logicalORExpression) listenerBlock)
        //-> whenStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
everyStatement
    :  'every' TIME (cond = ('when' | 'unless') logicalORExpression)? listenerBlock
        -> ^(LISTENER ^(EVERY TIME) ^(COND $cond? logicalORExpression?) listenerBlock)
        //-> everyStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
    
constraintFunctionCall 
    :    ID idList expressionList 
    ;
    

functionPredicateCall       
    :    ID '(' expressionList ')' NEWLINE?
         -> ^(CALL ID ^(ARGS expressionList))
         //-> functionCall(name = { $ID.text }, args = { $expressionList.st })
    ;	
// End timeline and procedural blocks

// Start function blocks
functionHeader
    :    'function' ID '(' variableList ')' NEWLINE
         -> ^(FUNHEAD ID variableList)
    ;

functionPredicateBlockDeclaration 
    :    variableDeclaration
    |    functionPredicateCall
    |    inStatement
    |    assignmentExpression NEWLINE
    ;
functionBlock      
    :    START 
           ( block += functionPredicateBlockDeclaration | NEWLINE )* 
         END 
         -> ^(FUNBLOCK[$START, "FUNCBLOCK"] RETURN $block*) 
         //| in_timeline_stmt | if_stmt
         // TODO: Define this template
         //-> functionBlock(statements = { $statements })
    ;
functionDefinition 
    :    'function' ID '(' variableList ')' functionBlock 
         -> ^(FUNC ID variableList functionBlock?)
         //-> functionDefinition(name = { $ID.text}, args = { variableList.st }, block = { $functionBlock.st })
    ;
// End function blocks

// Start predicate blocks
predicateHeader     
    :    'predicate' ID '(' variableList ')' NEWLINE
         -> ^(PREDHEAD ID variableList)
         //-> predicateHeader(name = { $ID.text }, args = { $variableList.st }) 
    ;	

predicateDefinition 
    :    'predicate' ID '(' variableList ')' predicateBlock 
    	 -> ^(PRED ID variableList predicateBlock)
         //-> predicateDefinition(header = { $predicateHeader.st}, block = { $predicateBlock.st})
    ;
predicateBlock      
    :    // VERY  WEAK IMPLEMENTATION
         START
           ( block += functionPredicateBlockDeclaration | NEWLINE )* 
           'return' retexp = assignmentExpression NEWLINE 
         END
         -> ^(FUNBLOCK[$START, "FUNBLOCK"] ^(RETURN $retexp) $block*) 
         //'return' returns = assignmentExpression 
         //-> predicateBlock(block = { $functionBlock.st }, exp = { $assignmentExpression.st })
    ;
// End predicate blocks

// Start event definition
eventDefinition 
    :    'event' ID NEWLINE
         -> ^(EVENT ID)
         //-> eventDefinition(name = { $ID.text })
    ;
// End event definitions

// Start constraint declarations
announcementDeclaration
    :    //TODO: Replace this with short_bool_exp
         'announce' eventName = ID 'when' functionName = ID (predicateExpr = variableDeclaration)? NEWLINE
         -> ^(ANNOUNCEMENT $eventName $functionName $predicateExpr?)
    ; 
// End constraint declarations

// Start device definitions
constraintBlockDeclaration
    :	variableDeclaration 
    |   predicateHeader 
    |   functionHeader 
    ;
constraintBlock 
    :    START 
             (block += constraintBlockDeclaration | announcements += announcementDeclaration)*
         END  
         -> ^(CONBLOCK $block* ^(ANNOUNCEMENTS $announcements*))
    ;    	

constraintDefinition
    :    'constraint' ID ('requires' requires = idList)?
         ('announces' announces = idList)? 
         constraintBlock
         -> ^(CONSTRAINT ID ^(REQUIRES $requires?) ^(ANNOUNCES $announces?) constraintBlock)
         // TODO: Need to write code to compile announcements into decorators for functions
         //-> constraintDefinition(name = { $ID.text }, requires = { $constraintList.st }) 
            // variableDeclaration* functionHeader* predicateHeader*)
    ;
deviceBlockDeclaration
    :    variableDeclaration 
    |    predicateDefinition 
    |    functionDefinition
    ;
deviceBlock 
    :    START 
              (block += deviceBlockDeclaration)*
         END	
         -> ^(DEVBLOCK $block*)
    ;
deviceDefinition     
    :    'device' ID ('accepts' accepts = idList)? deviceBlock
         -> ^(DEVICE ID ^(ACCEPTS $accepts?) deviceBlock)
         //-> deviceDefinition(name = { $ID.text }, accepts = { $constraintList.st })
    ;
// End device definitions

// Begin program entry point

program 
    :    (events += eventDefinition NEWLINE)* 
         NEWLINE*
         (constraints += constraintDefinition NEWLINE)*
         NEWLINE* 
         (devices += deviceDefinition NEWLINE)*
         NEWLINE*
         (functionsPredicates += functionDefinition 
          | functionsPredicates += predicateDefinition
          | NEWLINE)*
         NEWLINE*
         (block += functionPredicateBlockDeclaration)*
         NEWLINE*
         -> ^(PROGRAM 
                ^(EVENTS $events*)
                ^(CONSTRAINTS $constraints*)
                ^(DEVICES $devices*)
                ^(FUNCTIONS $functionsPredicates*)
                ^(PROGBLOCK $block*))
    ;

// End program entry point


