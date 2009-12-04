grammar celluloid;
options {
  output = template;
  backtrack = true;
}

// Start boolean literal
fragment BOOL   	: 'true' | 'false';
// End boolean literal

// Start language blocks
language_block_decl : 'in' LANGUAGE START language_block END;
LANGUAGE            : 'JAVA';
language_block      : '*';
// End language blocks

// Start core literals
ID    :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
START : ('do' | '{') NEWLINE;
END   : ('end' | '}') NEWLINE;
// End core literals

// Start line and whitespace delimiters
NEWLINE : '\n' | '\r';
WS      : ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};   
COMMENT : '#' ~(NEWLINE)* {$channel=HIDDEN;};
// End line and whitespace delimiters

// Start number literals
fragment NUMBER :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
       |   '.' ('0'..'9')+ EXPONENT?
       |   ('0'..'9')+ EXPONENT;
fragment EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// End number literals


// Start time literals	
fragment SECOND : NUMBER 's';
fragment MINUTE : NUMBER 'm' SECOND | SECOND;
fragment HOUR 	: NUMBER 'h' MINUTE | MINUTE;
fragment DAY 	: NUMBER 'd' HOUR | HOUR;
fragment TIME	: '@'DAY;
// End time literals

// Start string literal	
fragment STRING	  :  '"' ( ESC_SEQ | CHAR )* '"';
fragment CHAR     :  ('0'..'9'|'a'..'f'|'A'..'F');
fragment ESC_SEQ  :  '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
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
LITERAL             : STRING | TIME | NUMBER | BOOL; 

timelineDeclaration 
    :    'timeline' ID NEWLINE
         -> template(name = { $ID.text }) "timeline <name> = new timeline();"
    ;
variableDeclaration 
	:	 timelineDeclaration
	     -> template(decl = { $timelineDeclaration.st }) "<decl>"
	     // TODO: What should we do about the conditional NEWLINE? Include the ';' in the NEWLINE st?
    |    type = ('time' | 'number' | 'string' | 'boolean' | 'input' | 'output') ID initializer? NEWLINE?
         -> template(type = { $type.text },
                     name = { $ID.text },
                     init = { $initializer.st })
            "<type> <name> <init>"
    ;
                    
initializer      
	:    '=' assignmentExpression
         -> template() ""
	;

// This may allow derivations of literal = variable
assignmentExpression     
        : logicalORExpression
        | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression;
	                 
logicalORExpression      
        : logicalANDExpression ('or' logicalANDExpression)*;	

logicalANDExpression     
        : equalityExpression ('and' equalityExpression)*;

equalityExpression       
        :  relationalExpression (EQUALITY_OPERATOR  relationalExpression)*;

relationalExpression     
        : additiveExpression (RELATIONAL_OPERATOR  additiveExpression)*;

additiveExpression      
        : multiplicativeExpression (ADDITIVE_OPERATOR  multiplicativeExpression)*;

multiplicativeExpression 
	: primaryExpression (MULTIPLICATIVE_OPERATOR  primaryExpression)*;	

primaryExpression
	: ID
	| 'new' ID '(' expressionList ')'
	| LITERAL
	| functionCall
	| predicateCall
	;
// End generic literals and declarations

// Start boolean expressions and declarations
//short_bool_exp  : ID bool_op (literal | ID | short_bool_exp)*;
// End boolean expressions and declarations

// Start lists and generic declartions
idList 
    :    ids += ID (',' ids += ID)* 
         -> template(ids = { $ids }) "<ids; separator=\", \">"
    |    '(' ids += ID (',' ids += ID)* ')'
         -> template(ids = { $ids }) "(<ids; separator=\", \">)"
    ;

variableList  
    :    vars += variableDeclaration (',' vars += variableDeclaration)* 
         -> template(vars = { $vars }) "<vars; separator=\", \">"
    |    '(' vars += variableDeclaration (',' vars += variableDeclaration)* ')'
         -> template(vars = { $vars }) "(<vars; separator=\", \">)"
    ;

expressionList 
    :    exps += assignmentExpression (',' exps += assignmentExpression)*
         -> template(exps = { $exps }) "<exps; separator=\", \">"
    |    '(' exps += assignmentExpression (',' exps += assignmentExpression)* ')'
         -> template(exps = { $exps }) "(<exps; separator=\", \">)"
    ;

// End lists and generic declarations


// Start function blocks
functionHeader     
    :    'function' ID '(' variableList ')'
         // TODO: Move this template into another file
         -> template(name = { $ID.text },
                     args = { $variableList.st }) 
            "public void <name> (<args>)"
    ;	
functionDefinition : functionHeader START functionBlock END
         // TODO: Move this template into another file
         -> template(header = { $functionHeader.st},
                     block = { $functionBlock.st})
         <<
           <header> "{"
             <block>
           "}"
         >>
    ;
functionBlock      
    :    (language_block | functionCall | predicateCall | variableDeclaration)*
         //| in_timeline_stmt | if_stmt
         // TODO: Define this template
         -> template() "" 
    ;
functionCall       
    :    ID '(' expressionList ')' NEWLINE
         // TODO: Move this template into another file
         -> template(name = { $ID.text },
                     args = { $expressionList.st }) 
            "<name>(<args>);"
    ;	
// End function blocks

// Start predicate blocks
predicateHeader     
    :    'predicate' ID '(' args = variableList ')'
         // TODO: Move this template into another file
         -> template(name = { $ID.text },
                     args = { $variableList.st }) 
            "public bool <name> (<args>)"
    ;	
predicateDefinition 
    :    predicateHeader START predicateBlock END
         // TODO: Move this template into another file
         -> template(header = { $predicateHeader.st},
                     block = { $predicateBlock.st})
         <<
           <header> "{"
             <block>
           "}"
         >>
    ;
predicateBlock      
    :    functionBlock 'returns' assignmentExpression 
         // TODO: Define this template
         -> template() ""
    ; // VERY  WEAK IMPLEMENTATION
predicateCall       
	:	 ID '(' expressionList ')' NEWLINE
	     // TODO: Move this template into another file
         -> template(name = { $ID.text },
                     args = { $expressionList.st }) 
            "<name>(<args>);"
	;	
// End predicate blocks

// Start event definition
eventDefinition 
    :    'event' ID NEWLINE
         // TODO: Move this template into a separate file
         -> template(name = { $ID.text }) "public class name extends event { }"
    ;
// End event definitions

// Start constraint declarations

announcement
    :    'announce' ID 'when' ID assignmentExpression //TODO: Replace this with short_bool_exp
    ; 
// End constraint declarations

// Start device definitions
constraintDefinition
    :    'constraint' ID (constraintList)?
         ('announces' announces = idList)? 
         START 
             members = (variableDeclaration | functionHeader | predicateHeader | announcement)*
         END  
         // Remark: Does Java allow for multiple inheritence of Interfaces?
         // TODO: Move this template into a separate file
         // TODO: Need to write code to compile announcements into decorators for functions
         -> template(name = { $ID.text },
                     requires = { $constraintList.st }) 
            "public interface <name> <requires> { TODO: Members }"
            // variableDeclaration* functionHeader* predicateHeader*)
    ;
constraintList
	:    'requires' idList
	     -> template(ids = { $idList.st }) "implements <ids>"
	|    'accepts' idList
	     -> template(ids = { $idList.st }) "implements <ids>"
	;

deviceDefinition     
    :    'device' ID (constraintList)? 
         START 
             members = (variableDeclaration | functionDefinition | predicateDefinition | COMMENT)* 
         END 
         -> deviceDefinition(name = { $ID.text }, accepts = { $constraintList.st })
            // variableDeclaration* functionDefinition* predicateDefinition*)
    ;
// End device definitions


