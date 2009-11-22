grammar celluloid;

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

// Start boolean literal
BOOL        : 'true' | 'false';
// End bool literal

// Start operators
// TODO: LOCAL OPERATORS
compare_op       : '>' | '>=' | '<' | '<=' | bool_op;
bool_op          : '==' | '!=';
math_op          : '+' | '-' | '/' | '*' | '%';
math_assign_op   : (math_op)* '=';
string_assign_op : '+=' | '=';
string_op        : '+' | bool_op;
// End operators 

// Start time expressions and declarations
time_exp        : (ID | TIME) (math_op time_exp)*;
time_short_decl : 'time' ID NEWLINE;	 
time_decl       : 'time' ID ('=' time_exp)? NEWLINE;
time_assign     : ID math_op time_exp NEWLINE;
// End time expressions and declarations

// Start number expressions and declarations
number_exp        : (ID | NUMBER) (math_op number_exp)*;
number_short_decl : 'number' ID NEWLINE;
number_decl       : 'number' ID ('=' number_exp)? NEWLINE;	
number_assign     : ID math_assign_op number_exp NEWLINE;
math_line         : (time_assign | time_exp | number_assign | 
number_exp) NEWLINE;
// End number expressions and declarations

// Start string expressions and declarations
string_exp        : (ID | STRING) (string_op string_exp)*;
string_short_decl : 'string' ID NEWLINE;	
string_decl       : 'string' ID ('=' string_exp)? NEWLINE;
string_assign     : ID string_assign_op string_exp;
string_line       : (string_assign | string_exp) NEWLINE;
// End string expressions and declarations

// Start boolean expressions and declarations
short_bool_exp  : ID bool_op (literal | ID | short_bool_exp)*;
bool_exp        : (ID | BOOL | time_exp compare_op time_exp | 
number_exp compare_op number_exp) ('and' bool_exp | 'or' bool_exp | 
bool_op bool_exp)*;
bool_short_decl : 'boolean' ID NEWLINE;	
bool_decl       : 'boolean' ID ('=' bool_exp)? NEWLINE;
bool_assign     : ID '=' bool_exp NEWLINE;
bool_line       : (bool_exp | bool_assign) NEWLINE;
// End boolean expressions and declarations

// Start timelines and input / output declarations
timeline_short_decl : 'timeline' ID NEWLINE;
// TODO: input / output declarations
// End timelines and input / output declartions

// Start lists and generic declartions
literal         : STRING | TIME | NUMBER | BOOL; 
variable_decl   : bool_decl | string_decl | time_decl | number_decl | timeline_short_decl;

short_decl      : bool_short_decl | string_short_decl | 
time_short_decl | number_short_decl | timeline_short_decl;
short_decl_list : short_decl (',' short_decl)+ | '(' short_decl (',' short_decl)+ ')';

assignment      : bool_assign | string_assign | time_assign | number_assign; 

expression      : bool_exp | string_exp | time_exp | number_exp;
expression_list : expression (',' expression)+ | '(' expression (',' expression)+ ')';

id_list : ID (',' ID)+ | '(' ID (',' ID)+ ')';
// End lists and generic declarations

// Start language blocks
language_block_decl : 'in' LANGUAGE START language_block END;
LANGUAGE            : 'JAVA';
language_block      : '*';
// End language blocks

// Start function blocks
function_header    :'function' functionname function_arguments;	
function_decl      : function_header START function_block END;
functionname       : ID;
function_arguments : '(' short_decl_list ')';
function_block     : (language_block | function_call | predicate_call | variable_decl) (function_block)*;
                 //| in_timeline_stmt
                 //| if_stmt
function_call      : functionname '(' expression_list ')' NEWLINE;	
// End function blocks

// Start predicate blocks
predicate_header    : 'predicate' predicatename 
predicate_arguments;	
predicate_decl      : predicate_header START predicate_block END;
predicatename       : ID;
predicate_arguments : '(' short_decl_list ')';
predicate_block     : function_block 'returns' bool_exp ; // VERY  WEAK IMPLEMENTATION
predicate_call      : predicatename '(' expression_list ')' NEWLINE;	
// End predicate blocks

// Start event definition
event_def : 'event' eventname NEWLINE;
eventname : ID;
// End event definitions

// Start constraint declarations
constraint_def      : 'constraint' constraintname 'requires' constraint_list 'announces' event_list START constraint_body END;
constraint_list     : id_list;
event_list          : id_list;
constraint_body     : (variable_decl NEWLINE)* constraint_headers announcements;
constraint_headers  : ((function_header | predicate_header)*);	
announcements       : (announcement)*;
announcement        : 'announce' ID 'when' ID argument_conditions;
argument_conditions : short_bool_exp;
constraintname      : ID;
// End constraint declarations

