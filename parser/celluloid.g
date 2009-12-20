grammar celluloid;

options {
  output = AST;
  backtrack = true;
  memoize = true;
}

tokens {
  VARDEF;
  OBJDEF;
  
  FUNC;
  PRED;
  ARG;
  ARGS;
  OBJCALL;
  AT;
  CALL;
  PROGRAM;
  EVENTS;
  CONSTRAINTS;
  DEVICES;
  FUNCTIONS;
  
  IF;
  ELSEIFS;
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
  LANGBLOCK;
  
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

// Begin program entry point
program 
    :    (events += eventDefinition)* 
         NEWLINE*
         (constraints += constraintDefinition NEWLINE)*
         NEWLINE* 
         (devices += deviceDefinition NEWLINE)*
         NEWLINE*
         (functionsPredicates += functionDefinition 
          | functionsPredicates += predicateDefinition
          | NEWLINE)*
         NEWLINE*
         (block += functionPredicateBlockDeclaration | NEWLINE)*
         NEWLINE*
         -> ^(PROGRAM 
                ^(EVENTS $events*)
                ^(CONSTRAINTS $constraints*)
                ^(DEVICES $devices*)
                ^(FUNCTIONS $functionsPredicates*)
                ^(PROGBLOCK $block*))
    ;
// End program entry point

// Start event definition
eventDefinition 
    :    'event' ID NEWLINE
         -> ^(EVENT ID)
         //-> eventDefinition(name = { $ID.text })
    ;
// End event definitions

// Start announcement declarations
announcementDeclaration
    :    //TODO: Replace this with short_bool_exp
         'announce' eventName = ID 'when' functionName = ID (predicateExpr = variableDeclaration)? NEWLINE
         -> ^(ANNOUNCEMENT $eventName $functionName $predicateExpr?)
    ; 
// End announcement declarations

// Start constraint definitions
constraintDefinition
    :    'constraint' ID ('requires' requires = idList)?
         ('announces' announces = idList)? 
         constraintBlock
         -> ^(CONSTRAINT ID ^(REQUIRES $requires?) ^(ANNOUNCES $announces?) constraintBlock)
         // TODO: Need to write code to compile announcements into decorators for functions
         //-> constraintDefinition(name = { $ID.text }, requires = { $constraintList.st }) 
            // variableDeclaration* functionHeader* predicateHeader*)
    ;
constraintBlock 
    :    START 
             (block += constraintBlockDeclaration | announcements += announcementDeclaration)*
         END  
         -> ^(CONBLOCK $block* ^(ANNOUNCEMENTS $announcements*))
    ;
constraintBlockDeclaration
    :	variableDeclaration 
    |   predicateHeader 
    |   functionHeader 
    ;    	
// End constraint definition

// Start device definition
deviceDefinition     
    :    'device' ID ('accepts' accepts = idList)? deviceBlock
         -> ^(DEVICE ID ^(ACCEPTS $accepts?) deviceBlock)
         //-> deviceDefinition(name = { $ID.text }, accepts = { $constraintList.st })
    ;
deviceBlock 
    :    START 
              (block += deviceBlockDeclaration)*
         END	
         -> ^(DEVBLOCK $block*)
    ;
deviceBlockDeclaration
    :    variableDeclaration 
    |    predicateDefinition 
    |    functionDefinition
    ;
// End device definitions


// Start function blocks
functionHeader
    :    'function' ID '(' variableList? ')' NEWLINE
         -> ^(FUNHEAD ID ^(ARGS variableList?))
    ;
functionDefinition 
    :    'function' ID '(' variableList? ')' functionBlock 
         -> ^(FUNC ID ^(ARGS variableList?) functionBlock)
         //-> functionDefinition(name = { $ID.text}, args = { variableList.st }, block = { $functionBlock.st })
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
functionPredicateBlockDeclaration 
    :    variableDeclaration
    |    expression
    |    inStatement // Remark: Unknown behavior if called from inStatement
    |    ifStatement
    ;
// End function blocks

// Start predicate blocks
predicateHeader     
    :    'predicate' ID '(' variableList? ')' NEWLINE
         -> ^(PREDHEAD ID ^(ARGS variableList?))
         //-> predicateHeader(name = { $ID.text }, args = { $variableList.st }) 
    ;	
predicateDefinition 
    :    'predicate' ID '(' variableList? ')' predicateBlock 
    	 -> ^(PRED ID ^(ARGS variableList?) predicateBlock)
         //-> predicateDefinition(header = { $predicateHeader.st}, block = { $predicateBlock.st})
    ;
predicateBlock      
    :    // VERY  WEAK IMPLEMENTATION
         START
           ( block += functionPredicateBlockDeclaration | NEWLINE )* 
           'return' retexp = logicalORExpression NEWLINE
         END
         -> ^(FUNBLOCK[$START, "FUNBLOCK"] ^(RETURN $retexp) $block*) 
         //'return' returns = assignmentExpression 
         //-> predicateBlock(block = { $functionBlock.st }, exp = { $assignmentExpression.st })
    ;
// End predicate blocks

// Begin timline and procedural blocks
inStatement
    :  'in' ID inBlock 
        -> ^(IN ID inBlock)
        //-> inStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
inBlock 
    :	START
            (block += inBlockDeclaration | NEWLINE)*
        END
        -> ^(INBLOCK $block*)
    ;
inBlockDeclaration
    :	whenStatement 
    |   everyStatement 
    |   constraintFunctionCall
    ;

ifStatement
    :  'if' (ifTest = logicalORExpression) ifBlock
        -> ^(IF $ifTest ifBlock)
        
    ;
ifBlock
    :   START
            (block += ifBlockDeclaration)+
            (elseifBlock += elseIfStatement)*
            elseStatement?
        END
        -> ^(IFBLOCK $block) ^(ELSEIFS $elseifBlock?) ^(ELSE elseStatement?)
    ;    
elseIfStatement 
    :   'else if' elseIfTest = logicalORExpression NEWLINE 
          (block += ifBlockDeclaration)+
        -> ^(ELSEIF $elseIfTest ^(IFBLOCK $block))
    ;
elseStatement 
    :   'else' NEWLINE (block += ifBlockDeclaration)+
        -> ^(IFBLOCK $block)
    ;
ifBlockDeclaration
    :	variableDeclaration
    |   expression 
    |   inStatement 
    |   ifStatement
    ;

whenStatement
    :   (when = 'when' | unless = 'unless') (target = ID)? (event = ID) 
          listenerBlock
        -> ^(LISTENER ^(ARG $target?) EVERY ^(COND $when? $unless? $event?) listenerBlock)
        //-> whenStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
everyStatement
    :   'every' TIME 
        ((when = 'when' | unless = 'unless') (target = ID)? (event = ID))? 
          listenerBlock
        -> ^(LISTENER ^(ARG $target?) ^(EVERY TIME) ^(COND $when? $unless? $event?) listenerBlock)
        //-> everyStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
listenerBlock
    :  START
           (block += listenerBlockDeclaration)*
       END 
       -> ^(LISTENBLOCK $block*)
    ;
listenerBlockDeclaration
    :    constraintFunctionCall 
    |    expression 
    |    variableDeclaration
    ;
    
constraintFunctionCall 
    :    function = ID id += ID (',' id += ID)* (time = TIME (',')?)? expressionList? NEWLINE?
         -> ^(OBJCALL $id $function ^(AT $time?) ^(ARGS expressionList?))* 
    ;
    
functionPredicateCall       
    :    ID '(' expressionList? ')' NEWLINE?
         -> ^(CALL ID ^(ARGS expressionList?))
         //-> functionCall(name = { $ID.text }, args = { $expressionList.st })
    ;	
// End timeline and procedural blocks

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
    :    exps += expression (',' exps += expression)*
         -> expression+
         //-> expressionList(exps = { $exps })
    |    '(' exps += expression (',' exps += expression)* ')'
         -> expression+
         //-> expressionList(exps = { $exps })
    ;
// End lists and generic declarations


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
         |        -> ^(ARG TYPE ID)
         )
    |    PSEUDOTYPE name = ID '=' 'new' realType = ID '(' expressionList? ')' NEWLINE
         -> ^(OBJDEF PSEUDOTYPE $name $realType expressionList?)
         //-> variableDeclaration(type = { $TYPE.text }, name = { $ID.text }, init = { $initializer.st })
    ;
    
initializer      
    :    '='! logicalORExpression
         //-> initializer(exp = { $assignmentExpression.st })
    ;
                    
expression     
    :    logicalORExpression (ASSIGNMENT_OPERATOR^ expression)? NEWLINE!?
    ;          	                 
logicalORExpression      
    :    logicalANDExpression ('or'^ logicalORExpression)?
    |    ('not'^ logicalORExpression)
    ;	 
logicalANDExpression
    :    equalityExpression ('and'^ logicalANDExpression)?
    ;
equalityExpression       
    :    relationalExpression (EQUALITY_OPERATOR^ equalityExpression)?
    ;
relationalExpression     
    :    additiveExpression (RELATIONAL_OPERATOR^ relationalExpression)?
    ;
additiveExpression      
    :    multiplicativeExpression (ADDITIVE_OPERATOR^ additiveExpression)?
    ;
multiplicativeExpression 
    : primaryExpression (MULTIPLICATIVE_OPERATOR^ multiplicativeExpression)?
    ;	
primaryExpression
    :    literal
    |    ID
    |    functionPredicateCall
    ;
// End generic literals and declarations

// Start operators
// TODO: LOCAL OPERATORS
ASSIGNMENT_OPERATOR      : ':=' | '*=' | '/=' | '%=' | '+=' | '-=';	
EQUALITY_OPERATOR        : '==' | '!=';
RELATIONAL_OPERATOR      : '>' | '<' | '<=' | '>=';
ADDITIVE_OPERATOR        : '+' | '-';
MULTIPLICATIVE_OPERATOR  : '*' | '/' | '%';
// End operators 

// Start generic literals
literal : BOOL | NUMBER | STRING | TIME;

// Start language blocks
//languageBlockDefinition : 'in' LANGUAGE START (lines += LANGUAGECODE)* END -> ^(LANGBLOCK $lines*);
//LANGUAGE                : 'JAVA' | 'java' | 'Java';
//LANGUAGECODE            : '<' '<' ANYTHING* NEWLINE;
// End generic literals language blocks

// Start string literal	
STRING  : '"' ( ESCAPE | ~('"'|'\\') )* '"' ;
fragment ESCAPE  : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
// End string literal

// Start time literals	
TIME	        : '@'(DAY | 'start' | 'now');
fragment DAY 	: NUMBER 'd' HOUR | HOUR;
fragment HOUR 	: NUMBER 'h' MINUTE | MINUTE;
fragment MINUTE : NUMBER 'm' SECOND | SECOND;
fragment SECOND : NUMBER 's';
// End time literals

// Start number literals
NUMBER :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
       |   '.' ('0'..'9')+ EXPONENT?
       |   ('0'..'9')+ EXPONENT?;
fragment EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// End number literals

// Start boolean literal
BOOL       : 'true' | 'false';
TYPE       : 'time' | 'number' | 'string' | 'boolean';
PSEUDOTYPE : 'input' | 'output';
// End boolean literal

// Start core literals
ID    :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
START : ('do' | '{') NEWLINE?;
END   : ('end' | '}') NEWLINE?;
// End core literals

// Start line and whitespace delimiters
NEWLINE : '\n' | '\r\n' | '\r';
WS      : ( ' ' | '\t' | '\r' | '\n' | '\r\n') {$channel=HIDDEN;};   
COMMENT : '#' ~(NEWLINE)* NEWLINE {$channel=HIDDEN;};
// End line and whitespace delimiters
