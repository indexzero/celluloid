grammar celluloid;

// Start number literals
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;


EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// End number literals

// Start whitespace
WS 	:   	( ' '
        	| 	'\t'
        	| 	'\r'
        	| 	'\n'
        		     ) {$channel=HIDDEN;}
    	;   
// End whitespace

// Start time literals	
MILISECOND 
	:	FLOAT 'ms' | WS
	;
SECOND 	:	FLOAT 's' MILISECOND | MILISECOND
	;
MINUTE 	:	FLOAT 'm' SECOND | SECOND
	;
HOUR 	:	FLOAT 'h' MINUTE | MINUTE
	;
DAY 	:	FLOAT 'd' HOUR | HOUR
	;
TIME	:	DAY
	;
// End time literals

// Start string literal	
STRING	:  	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    	;

HEX_DIGIT 	: 	('0'..'9'|'a'..'f'|'A'..'F') 
	;
ESC_SEQ	:   	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	|   	UNICODE_ESC
    	|	OCTAL_ESC
    	;
OCTAL_ESC	:   	'\\' ('0'..'3') ('0'..'7') ('0'..'7')
    	|   	'\\' ('0'..'7') ('0'..'7')
    	|   	'\\' ('0'..'7')
    	;
UNICODE_ESC	
	:   	'\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    	;
// End string literal
    	
  // Start function 
function_block
	:	'function' [function_name] [function_arguments] [code_section] 'end'
	;
function_name 
	:	ID
	;
function_arguments
	:	'(' [expression_list] ')'
	;
// End function

// Start predicate
predicate_block 
	:	'predicate' [predicate_name] [predicate_arguments] [returns_section] 'end'
	;
predicate_name 
	:	ID
	;
predicate_arguments
	:	'(' [expression_list] ')'
	;
// End predicate
