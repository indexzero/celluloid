grammar celluloid;

// Start boolean literal
BOOL        : 'true' | 'false';
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
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;};   
        
        LineComment 
	: '#' ~(NEWLINE)* {$channel=HIDDEN;}
	;

// End line and whitespace delimiters

// Start number literals
NUMBER :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
       |   '.' ('0'..'9')+ EXPONENT?
       |   ('0'..'9')+ EXPONENT
       ;

EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// End number literals


// Start time literals	
SECOND 	: NUMBER 's';
MINUTE 	: NUMBER 'm' SECOND | SECOND;
HOUR 	: NUMBER 'h' MINUTE | MINUTE;
DAY 	: NUMBER 'd' HOUR | HOUR;
TIME	: '@'DAY;
// End time literals

// Start string literal	
STRING	  :  '"' ( ESC_SEQ | CHAR )* '"';
CHAR      :  ('0'..'9'|'a'..'f'|'A'..'F');
ESC_SEQ	  :  '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\'|'"');
// End string literal


// Start operators
// TODO: LOCAL OPERATORS
assignmentOperator      : '=' | '*=' | '/=' | '%=' | '+=' | '-=' ;
equalityOperator        : '==' | '!=';
relationalOperator      : '>' | '<' | '<=' | '>=';
additiveOperator        : '+' | '-';
multiplicativeOperator  : '*' | '/' | '%';
// End operators 

// Start generic literals and declarations
literal             : STRING | TIME | NUMBER | BOOL; 
timelineDeclaration : 'timeline' ID NEWLINE;
variableDeclaration : timelineDeclaration
                    | (('time' | 'number' | 'string' | 'boolean') ID) initializer? NEWLINE?;
                    
initializer         : '=' assignmentExpression;	 

// This may allow derivations of literal = variable
assignmentExpression     
	: logicalORExpression
	| primaryExpression assignmentOperator assignmentExpression;
	                 
logicalORExpression      : logicalANDExpression     ('or' logicalANDExpression)*;	

logicalANDExpression     : equalityExpression       ('and' equalityExpression)*;

equalityExpression       : relationalExpression     (equalityOperator  relationalExpression)*;

relationalExpression     : additiveExpression       (relationalOperator  additiveExpression)*;

additiveExpression       : multiplicativeExpression (additiveOperator  multiplicativeExpression)*;

multiplicativeExpression : primaryExpression        (multiplicativeOperator  primaryExpression)*
	;	

primaryExpression
	: ID
	| literal
	//| 'new' ID '(' arguments ')'
	//| function_call
	//| predicate_call
	//| objectLiteral
	;
// End generic literals and declarations

// Start boolean expressions and declarations
//short_bool_exp  : ID bool_op (literal | ID | short_bool_exp)*;
// End boolean expressions and declarations

// Start timelines and input / output declarations
// TODO: input / output declarations
// End timelines and input / output declartions

// Start lists and generic declartions
variableList : variableDeclaration (',' variableDeclaration)+ 
             | '(' variableDeclaration (',' variableDeclaration)+ ')';

expression_list : assignmentExpression (',' assignmentExpression)+ 
                | '(' assignmentExpression (',' assignmentExpression)+ ')';

idList : ID (',' ID)+ | '(' ID (',' ID)+ ')';
// End lists and generic declarations


// Start function blocks
function_header    :'function' functionname function_arguments;	
function_def      : function_header START function_block END;
functionname       : ID;
function_arguments : '(' variableList ')';
function_block     : (language_block | function_call | /*predicate_call |*/ variableDeclaration)*;
                 //| in_timeline_stmt
                 //| if_stmt
function_call      : functionname '(' expression_list ')' NEWLINE;	
// End function blocks

// Start predicate blocks
predicate_header    : 'predicate' predicatename 
predicate_arguments;	
predicate_def      : predicate_header START predicate_block END;
predicatename       : ID;
predicate_arguments : '(' variableList ')';
predicate_block     : function_block 'returns' assignmentExpression ; // VERY  WEAK IMPLEMENTATION
predicate_call      : predicatename '(' expression_list ')' NEWLINE;	
// End predicate blocks

// Start event definition
event_def : 'event' eventname NEWLINE;
eventname : ID;
// End event definitions

// Start constraint declarations
constraint_def       : 'constraint' constraintname 'requires' constraint_list 'announces' event_list START 
constraint_block END;
constraint_list      : idList;
event_list           : idList;
constraint_block     : (variableDeclaration)* constraint_headers announcements;
constraint_headers   : ((function_header | predicate_header)*);	
announcements        : (announcement)*;
announcement         : 'announce' ID 'when' ID argument_conditions;
argument_conditions  : assignmentExpression; //TODO: Replace this with short_bool_exp
constraintname       : ID;
// End constraint declarations

// Start device definitions
device_def   : 'device' devicename 'accepts' constraint_list START device_block END;	 	 
device_block : (variableDeclaration)* (function_def | predicate_def)*;	
devicename : ID;	
// End device definitions


