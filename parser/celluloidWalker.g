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

  private HashMap<String, SymbolEntry> symbolTable = new HashMap<String, SymbolEntry>();
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
           %{$st}.accepts = $accepts.st;
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
           %{$st}.args = $args.st;
         } 
    ;
functionDefinition 
    :    ^(FUNC ID ^(ARGS args = variableList?) block = functionBlock?) {
           $st = %functionDefinition();
           %{$st}.name = $ID.text;
           %{$st}.args = $args.st;
           %{$st}.block = $block.st;
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
    :    ^(PREDHEAD ID ^(ARGS args = variableList?)) {
           $st = %predicateHeader();
           %{$st}.name = $ID.text;
           %{$st}.args = $args.st;
         } 
    ;    
predicateDefinition 
    :    ^(PRED ID ^(ARGS args = variableList?) block = predicateBlock) {
           $st = %predicateDefinition();
           %{$st}.name = $ID.text;
           %{$st}.args = $args.st;
           %{$st}.block = $block.st;
         } 
    ;	    
predicateBlock      
    :    ^(FUNBLOCK ^(RETURN retexp = expression) (block += functionPredicateBlockDeclaration)*) {
           $st = %predicateBlock();
           %{$st}.statements = $block;
           %{$st}.returns = $retexp.st;
         }  
    ;

// Timline and procedural blocks

inStatement
scope {
  String timeline;
}   :  ^(IN ID block = inBlock) {
	$inStatement::timeline = $ID.text;
	$st = %inStatement();
	%{$st}.block = $block.st;
	}
    ;
    
inBlock 
    :	^(INBLOCK (block += inBlockDeclaration)*) {
           $st = %statementList();
           %{$st}.statements = $block;
   	 }
    ;
inBlockDeclaration
    :    whenStatement -> passThrough(text = { $whenStatement.st } )
    |   everyStatement -> passThrough(text = { $everyStatement.st } )
    |   constraintFunctionCall -> passThrough(text = { $constraintFunctionCall.st } )
    ;

ifStatement
    :  ^(IF exp = logicalORExpression block = ifBlock) {
    	  $st = %ifStatement();
    	  %{$st}.exp = $exp.st;
    	  %{$st}.block = $block.st;
    	}
    ;
ifBlock
    :   ^(IFBLOCK (block += ifBlockDeclaration)+) ^(ELSEIF (elifStmt += elseIfStatement)*) ^(ELSE elseStmt = elseStatement?) {
    	  $st = %ifBlock();
    	  %{$st}.block = $block;
     	  %{$st}.elifStmt = $elifStmt;
      	  %{$st}.elseStmt = $elseStmt.st;
    	}
    ;    

elseIfStatement 
    :   ^(exp = logicalORExpression ^(IFBLOCK (block += ifBlockDeclaration)+)) {
    	  $st = %elseIfStatement();
    	  %{$st}.exp = $exp.st;
      	  %{$st}.block = $block;
    	}
    ;
elseStatement 
    :   ^(IFBLOCK (block += ifBlockDeclaration)+) {
    	  $st = %elseStatement();
      	  %{$st}.block = $block;
    	}
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
         %{$st}.timeline = $inStatement::timeline;
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
    :    (vars += variableDeclaration)+ -> variableList(vars = { $vars })  
    ;

expressionList 
    :    expression+
         //-> expressionList(exps = { $exps })
    ;

variableDeclaration 
    :    ^(VARDEF 'timeline' ID)        -> timelineDeclaration(name = { $ID.text })
    |    ^(ARG 'timeline' ID)           -> timelineArgument(name = { $ID.text }) 
    |    ^(VARDEF TYPE ID initializer?) -> variableDeclaration(type = { $TYPE.text }, name = { $ID.text }, init = { $initializer.st })
    |    ^(ARG TYPE ID)                 -> variableArgument(type = { $TYPE.text }, name = { $ID.text }) 
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
