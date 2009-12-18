tree grammar celluloidWalker;

options {
	tokenVocab=celluloid;
	ASTLabelType-CommonTree;
}

BOOL    	: 	'true' | 'false';
TYPE    	: 	'time' | 'number' | 'string' | 'boolean' | 'input' | 'output';

language_block_decl 
	: 	'in' LANGUAGE START language_block END;
LANGUAGE            
	: 	'JAVA';
language_block      
	: 	'*';

ID    	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
START 	
	: 	('do' | '{') NEWLINE?;
END   
	: 	('end' | '}') NEWLINE?;

NEWLINE 	
	: 	'\n' | '\r\n' | '\r';
WS      
	: 	( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};   
COMMENT 
	: 	'#' ~(NEWLINE)* {$channel=HIDDEN;};

NUMBER 
	:   	('0'..'9')+ '.' ('0'..'9')* EXPONENT?
       	|   	'.' ('0'..'9')+ EXPONENT?
       	|   	('0'..'9')+ EXPONENT?;
fragment EXPONENT 
	: 	('e'|'E') ('+'|'-')? ('0'..'9')+ ;
	
fragment SECOND 
	: 	NUMBER 's';
fragment MINUTE 
	: 	NUMBER 'm' SECOND | SECOND;
fragment HOUR 	
	: 	NUMBER 'h' MINUTE | MINUTE;
fragment DAY 	
	: 	NUMBER 'd' HOUR | HOUR;
TIME	
        	: 	'@'(DAY | 'start' | 'now');

fragment STRING  
	: 	'"' ( ESCAPE | ~('"'|'\\') )* '"' ;
fragment CHAR    
	: 	('0'..'9'|'a'..'f'|'A'..'F');
fragment ESCAPE  
	: 	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

ASSIGNMENT_OPERATOR      
	: 	'=' | '*=' | '/=' | '%=' | '+=' | '-=' ;
EQUALITY_OPERATOR        
	: 	'==' | '!=';
RELATIONAL_OPERATOR      
	: 	'>' | '<' | '<=' | '>=';
ADDITIVE_OPERATOR        
	: 	'+' | '-';
MULTIPLICATIVE_OPERATOR  
	: 	'*' | '/' | '%';

LITERAL 
	: 	BOOL | NUMBER | STRING | TIME;

variableDeclaration 
    	:    	^(VARDEF 'timeline' ID)
       	| 	^(ARG       'timeline' ID)
       	| 	^(VARDEF TYPE ID initializer?)
       	| 	^(ARG TYPE ID)
    	;
    
initializer      
    	:    '=' LITERAL
    	;

primaryExpression
	:	 ID
	|	 'new' ID '(' expressionList ')'
	|	 LITERAL
	|	 functionPredicateCall
	;
                    
logicalORExpression     
	:	^('or' logicalORExpression logicalORExpression)
	|	^('or' ('nor' logicalORExpression) logicalORExpression) 
	|	^('and' logicalORExpression  logicalORExpression)
	|	^(EQUALITY_OPERATOR logicalORExpression  logicalORExpression)
	|	^(RELATIONAL_OPERATOR  logicalORExpression  logicalORExpression)
	| 	^(ADDITIVE_OPERATOR logicalORExpression  logicalORExpression)
	|	^(MULTIPLICATIVE_OPERATOR primaryExpression  logicalORExpression) 
	;
	
assignmentExpression 
	:	logicalORExpression
	|	^(ASSIGNMENT_OPERATOR primaryExpression assignmentExpression)
	;


idList 
 	:    	ID+
    	;

variableList  
    	:    	variableDeclaration+
    	;

expressionList 
   	:    	exps += logicalORExpression (',' exps += logicalORExpression)*
    	|    	'(' exps += logicalORExpression (',' exps += logicalORExpression)* ')'
    	;

inBlockDeclaration
    	:	logicalORExpression NEWLINE
   	|   	ifStatement NEWLINE
    	|   	whenStatement NEWLINE
   	|   	everyStatement NEWLINE
    	|   	constraintFunctionCall NEWLINE
    	;
    	
inBlock 
   	:	^(INBLOCK  inBlockDeclaration)
        	| 	^(INBLOCK  NEWLINE)
    	;
inStatement
    	:  	^(IN ID inBlock)
    	;

ifStatement
    	:  	^(IF logicalORExpression 
	        	^(IFBLOCK  (assignmentExpression | inStatement | ifStatement) NEWLINE )+) 	
	        	^(ELSEIF elseIfStatement?) 
	        	^(ELSE elseStatement?))
	 ;

elseIfStatement 
    	: 	^(logicalORExpression NEWLINE 
        			^(IFBLOCK (logicalORExpression | inStatement | ifStatement) NEWLINE))
    	;

elseStatement 
    	:   	^(IFBLOCK logicalORExpression NEWLINE)
        	| 	^(IFBLOCK inStatement NEWLINE)
        	| 	^(IFBLOCK ifStatement NEWLINE)
    	;

listenerBlockDeclaration
   	:    	(logicalORExpression 
         		|  constraintFunctionCall 
          		|  ifStatement
          		|  constraintFunctionCall) 
         		NEWLINE
    	;
    	
listenerBlock
    	:   	^(LISTENBLOCK  listenerBlockDeclaration*)
    	;
    	
whenStatement
    	:    	^(LISTENER EVERY ^(COND  ('when' | 'unless') logicalORExpression listenerBlock logicalORExpression) listenerBlock)
    	;
    	
everyStatement
    	:  	^(LISTENER ^(EVERY TIME) ^(COND  (('when' | 'unless') logicalORExpression)? logicalORExpression?) listenerBlock)
    	;
    
constraintFunctionCall 
    	:    	ID idList expressionList 
   	 ;
    

functionPredicateCall       
    	:    	^(CALL ID ^(ARGS expressionList))
 	;	

functionHeader
    	:    	^(FUNHEAD ID variableList)
   	;

functionPredicateBlockDeclaration 
    	:    	variableDeclaration
    	|   	functionPredicateCall
   	|    	inStatement
    	|    	logicalORExpression NEWLINE
    	;
    	
functionBlock      
    	:   	^(FUNBLOCK[$START, "FUNCBLOCK"] RETURN  (functionPredicateBlockDeclaration | NEWLINE)*) 
    	;
    	
functionDefinition 
    	:   	^(FUNC ID variableList functionBlock?)
 	;

predicateHeader     
    	:    	^(PREDHEAD ID variableList)
	;	

predicateDefinition 
    	:   	^(PRED ID variableList predicateBlock)
	;
	
predicateBlock      
    	:   	^(FUNBLOCK[$START, "FUNBLOCK"] ^(RETURN  logicalORExpression NEWLINE) (functionPredicateBlockDeclaration | NEWLINE )*) 
 	;

eventDefinition 
    	:   	^(EVENT ID)
	;

announcementDeclaration
   	:    	^(ANNOUNCEMENT ID 'when' ID variableDeclaration?)
    	; 

constraintBlockDeclaration
    	:	variableDeclaration 
    	|   	predicateHeader 
    	|   	functionHeader 
   	;
   	
constraintBlock 
    	:    	^(CONBLOCK constraintBlockDeclaration* ^(ANNOUNCEMENTS announcementDeclaration*))
    	;    	

constraintDefinition
    	:   	^(CONSTRAINT ID ^(REQUIRES  idList?) ^(ANNOUNCES  idList?) constraintBlock)
 	;
 	
deviceBlockDeclaration
    	:   	variableDeclaration 
    	|    	predicateDefinition 
    	|    	functionDefinition
    	;
    	
deviceBlock 
    	:    	^(DEVBLOCK deviceBlockDeclaration*)
    	;
    	
deviceDefinition     
    	:    	^(DEVICE ID ^(ACCEPTS  idList?) deviceBlock)
 	;

program 
    	:    	^(PROGRAM 
                			^(EVENTS eventDefinition NEWLINE*)
                			^(CONSTRAINTS constraintDefinition NEWLINE*)
                			^(DEVICES deviceDefinition NEWLINE*)
                			^(FUNCTIONS (functionDefinition | predicateDefinition)*)
                			^(PROGBLOCK functionPredicateBlockDeclaration*))
    	;


