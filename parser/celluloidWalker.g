tree grammar celluloidWalker;

options {
	tokenVocab=celluloid;
	ASTLabelType=CommonTree;
	output=template;
}

@header { 
  import java.util.HashMap;  
}

@members {
  private class SymbolEntry {
    private String name;
    private String type;
    
    public SymbolEntry(String name, String type) {
      this.name = name;
      this.type = type;
    }
    
    public String getName() {
      return this.name;
    }
    
    public String getType() {
      return this.type;
    }
  }

  private HashMap<String, SymbolEntry> symbolTable;  
}


// Program main entry point
program 
@init {
  this.symbolTable = new HashMap<String, SymbolEntry>();
}
    :    ^(PROGRAM 
             ^(EVENTS eventDefinition NEWLINE*)
             ^(CONSTRAINTS constraintDefinition NEWLINE*)
             ^(DEVICES deviceDefinition NEWLINE*)
             ^(FUNCTIONS (functionDefinition | predicateDefinition)*)
             ^(PROGBLOCK functionPredicateBlockDeclaration*))
    ;

// Event definition
eventDefinition 
    :    ^(EVENT ID) {
           $st = %eventDefinition();
           %{$st}.name = $ID.text;
           this.symbolTable.put($ID.text, new SymbolEntry($ID.text, "event"));
         }
    ;

// Announcement definition
announcementDeclaration
    :    ^(ANNOUNCEMENT ID ID variableDeclaration?)
    ; 

constraintDefinition
    :    ^(CONSTRAINT ID ^(REQUIRES requires = idList?) ^(ANNOUNCES announces = idList?) constraintBlock) {
           $st = %constraintDefinition();
           %{$st}.name = $ID.text;
           %{$st}.require = requires != null ? "implements" : ""; 
           %{$st}.requires = $requires.st;
           %{$st}.block = $constraintBlock.st;
           
           // TODO: Semantic analysis
           System.out.println(announces);
         }
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
    :    ^(DEVICE ID ^(ACCEPTS accepts = idList?) deviceBlock) {
           $st = %deviceDefinition();
           %{$st}.name = $ID.text;
           %{$st}.accept = accepts != null ? "implements" : "";
           %{$st}.accpets = $accepts.st;
           %{$st}.block = $deviceBlock.st;
         }
    ;
deviceBlock 
    :    ^(DEVBLOCK (block += deviceBlockDeclaration)*) {
           $st = %statementList();
           %{$st}.statements = $block;
         }
    ;
deviceBlockDeclaration
    :    variableDeclaration 
    |    predicateDefinition 
    |    functionDefinition
    ;
    	
// Function / Predicate definitions
functionHeader
    :    ^(FUNHEAD ID ^(ARGS args = variableList?)) {
           $st = %functionHeader();
           %{$st}.name = $ID.text;
           %{$st}.args = args != null ? $args.st : "";
         } 
    ;
functionDefinition 
    :    ^(FUNC ID ^(ARGS args = variableList?) block = functionBlock?) {
           $st = %functionDefinition();
           %{$st}.name = $ID.text;
           %{$st}.args = args != null ? $args.st : "";
           %{$st}.block = block != null ? $block.st : "";
         }
    ;
functionBlock      
    :    ^(FUNBLOCK RETURN (block += functionPredicateBlockDeclaration)*) {
           $st = %statementList();
           %{$st}.statements = $block;
         } 
    ;
functionPredicateBlockDeclaration 
    :    variableDeclaration
    |    expression
    |    inStatement // Remark: Unknown behavior if called from inStatement
    |    ifStatement
    |    functionPredicateCall
    ;

predicateHeader     
    :    ^(PREDHEAD ID ^(ARGS variableList?))
    ;    
predicateDefinition 
    :    ^(PRED ID ^(ARGS variableList?) predicateBlock) 
    ;	    
predicateBlock      
    :    ^(FUNBLOCK ^(RETURN expression) functionPredicateBlockDeclaration*) 
    ;

// Timline and procedural blocks
inStatement
    :  ^(IN ID inBlock) 
    ;
    
inBlock 
    :	^(INBLOCK (block += inBlockDeclaration)*) {
           $st = %statementList();
           %{$st}.statements = $block;
    }
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
    :    ^(OBJCALL function = ID target = ID ^(AT (time = TIME)?) ^(ARGS expressionList?)) {
         $st = %constraintFunctionCall();
         %{$st}.timeline = "";
         %{$st}.target = $target.text;
         %{$st}.type = ""; // TODO: inter timeline through semantic analysis
         %{$st}.function = $function.text;
         %{$st}.time = time != null ? $time.text : 0;
         %{$st}.args = $expressionList.st;
    }
    ;
    
functionPredicateCall       
    :    ^(CALL ID ^(ARGS expressionList))
         //-> functionCall(name = { $ID.text }, args = { $expressionList.st })
    ;	

// Lists of IDs, variables, and expressions
idList 
    :    ids += ID+ -> idList(ids = { $ids }) 
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
