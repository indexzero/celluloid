tree grammar celluloidWalker;

options {
	tokenVocab=celluloid;
	ASTLabelType=CommonTree;
}

// Program main entry point
program 
    :    ^(PROGRAM 
             ^(EVENTS eventDefinition NEWLINE*)
             ^(CONSTRAINTS constraintDefinition NEWLINE*)
             ^(DEVICES deviceDefinition NEWLINE*)
             ^(FUNCTIONS (functionDefinition | predicateDefinition)*)
             ^(PROGBLOCK functionPredicateBlockDeclaration*))
    ;

// Event definition
eventDefinition 
    :    ^(EVENT ID)
    ;

// Announcement definition
announcementDeclaration
    :    ^(ANNOUNCEMENT ID 'when' ID variableDeclaration?)
    ; 

// Constraint definition
constraintDefinition
    :    ^(CONSTRAINT ID ^(REQUIRES  idList?) ^(ANNOUNCES  idList?) constraintBlock)
    ;
constraintBlock 
    :    ^(CONBLOCK constraintBlockDeclaration* ^(ANNOUNCEMENTS announcementDeclaration*))
    ;    	
constraintBlockDeclaration
    :	 variableDeclaration 
    |    predicateHeader 
    |    functionHeader 
    ;
   	
// Device definition
deviceDefinition     
    :    ^(DEVICE ID ^(ACCEPTS  idList?) deviceBlock)
    ;
deviceBlock 
    :    ^(DEVBLOCK deviceBlockDeclaration*)
    ;
deviceBlockDeclaration
    :    variableDeclaration 
    |    predicateDefinition 
    |    functionDefinition
    ;
    	
// Function / Predicate definitions
functionHeader
    :    ^(FUNHEAD ID ^(ARGS variableList))
    ;
functionDefinition 
    :    ^(FUNC ID ^(ARGS variableList) functionBlock?)
    ;
functionBlock      
    :    ^(FUNBLOCK RETURN functionPredicateBlockDeclaration*) 
    ;
functionPredicateBlockDeclaration 
    :    variableDeclaration
    |    expression
    |    inStatement // Remark: Unknown behavior if called from inStatement
    |    ifStatement
    |    functionPredicateCall
    ;

predicateHeader     
    :    ^(PREDHEAD ID ^(ARGS variableList))
    ;    
predicateDefinition 
    :    ^(PRED ID ^(ARGS variableList) predicateBlock)
    ;	    
predicateBlock      
    :    ^(FUNBLOCK ^(RETURN expression) functionPredicateBlockDeclaration*) 
    ;

// Timline and procedural blocks
inStatement
    :  ^(IN ID inBlock)
        //-> inStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
inBlock 
    :	^(INBLOCK inBlockDeclaration *)
    ;
inBlockDeclaration
    :	whenStatement 
    |   everyStatement 
    |   constraintFunctionCall
    ;

ifStatement
    :  ^(IF logicalORExpression ifBlock)
    ;
ifBlock
    :   ^(IFBLOCK ifBlockDeclaration+) ^(ELSEIF elseIfStatement*) ^(ELSE elseStatement?)
    ;    

elseStatement 
    :   ^(IFBLOCK ifBlockDeclaration)
    ;
elseIfStatement 
    :   ^(logicalORExpression ^(IFBLOCK ifBlockDeclaration))
    ;
ifBlockDeclaration
    :	variableDeclaration
    |   expression 
    |   inStatement 
    |   ifStatement
    |   functionPredicateCall
    ;

whenStatement
    :   ^(LISTENER ^(ARG ID?) EVERY ^(COND 'when'? 'unless' ID?) listenerBlock)
        //-> whenStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
everyStatement
    :   ^(LISTENER ^(ARG ID?) ^(EVERY TIME) ^(COND 'when'? 'unless'? ID?) listenerBlock)
        //-> everyStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
listenerBlock
    :  ^(LISTENBLOCK listenerBlockDeclaration*)
    ;
listenerBlockDeclaration
    :    constraintFunctionCall 
    |    expression 
    |    variableDeclaration
    |    functionPredicateCall
    ;
    
constraintFunctionCall 
    :    ^(OBJCALL ID ID ^(ARGS expressionList?)) 
    ;
    
functionPredicateCall       
    :    ^(CALL ID ^(ARGS expressionList))
         //-> functionCall(name = { $ID.text }, args = { $expressionList.st })
    ;	

// Lists of IDs, variables, and expressions
idList 
    :    ID+
    ;

variableList  
    :    variableDeclaration+
    ;

expressionList 
    :    expression+
         //-> expressionList(exps = { $exps })
    ;

variableDeclaration 
    :    ^(VARDEF 'timeline' ID)
    |    ^(ARG 'timeline' ID)
    |    ^(VARDEF TYPE ID initializer?)
    |    ^(ARG TYPE ID)
    ;
    
initializer      
    :    logicalORExpression
    ;
    
expression 
    :    ^(ASSIGNMENT_OPERATOR logicalORExpression expression)
    ;
logicalORExpression      
    :    ^('or' 'not'? logicalORExpression logicalORExpression)
    |    ^('and' logicalORExpression logicalORExpression)
    |    ^(EQUALITY_OPERATOR logicalORExpression logicalORExpression)
    |    ^(RELATIONAL_OPERATOR logicalORExpression logicalORExpression)
    |    ^(ADDITIVE_OPERATOR logicalORExpression logicalORExpression)
    |    ^(MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression)
    ;	
primaryExpression
    :	 ID
    |	 ID expressionList
    |	 literal
    |	 functionPredicateCall
    ;

// Start generic literals 
literal : BOOL | NUMBER | STRING | TIME;

// Start language blocks
//languageBlockDefinition : 'in' LANGUAGE START (lines += LANGUAGECODE)* END -> ^(LANGBLOCK $lines*);
//LANGUAGE                : 'JAVA' | 'java' | 'Java';
//LANGUAGECODE            : '<' '<' ANYTHING* NEWLINE;
// End generic literals language blocks
