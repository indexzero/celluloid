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
    :	 variableDeclaration -> passThrough(text = { $variableDeclaration.st } )
    |    predicateHeader -> passThrough(text = { $predicateHeader.st } )
    |    functionHeader -> passThrough(text = { $functionHeader.st } )
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
    :    variableDeclaration -> passThrough(text = { $variableDeclaration.st } )
    |    predicateDefinition -> passThrough(text = { $predicateDefinition.st } )
    |    functionDefinition -> passThrough(text = { $functionDefinition.st } )
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
    :    variableDeclaration -> passThrough(text = { $variableDeclaration.st } )
    |    expression -> passThrough(text = { $expression.st } )
    |    inStatement -> passThrough(text = { $inStatement.st } ) // Remark: Unknown behavior if called from inStatement
    |    ifStatement -> passThrough(text = { $ifStatement.st } )
    |    functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
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
    :   whenStatement -> passThrough(text = { $whenStatement.st } )
    |   everyStatement -> passThrough(text = { $everyStatement.st } )
    |   constraintFunctionCall -> passThrough(text = { $constraintFunctionCall.st } )
    ;

ifStatement
    :  ^(IF exp = logicalORExpression block = ifBlock) {
    	  $st = %ifStatement();
    	  %{$st}.exp = $exp.text; // @TODO: This is a hack (possibly wrong)
    	  %{$st}.block = $block.st;
    	}
    ;
ifBlock
    :   ^(IFBLOCK (block += ifBlockDeclaration)+) ^(ELSEIFS (elifStmt += elseIfStatement)*) ^(ELSE elseStmt = elseStatement?) {
    	  $st = %ifBlock();
    	  %{$st}.block = $block;
     	  %{$st}.elifStmt = $elifStmt;
      	  %{$st}.elseStmt = $elseStmt.st;
    	}
    ;    

elseIfStatement 
    :   ^(ELSEIF (exp = logicalORExpression) ^(IFBLOCK (block += ifBlockDeclaration)+)) {
    	  $st = %elseIfStatement();
    	  %{$st}.exp = $exp.text; // @todo: This is a hack (possibly wrong)
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
    :	variableDeclaration -> passThrough(text = { $variableDeclaration.st } )
    |   expression -> passThrough(text = { $expression.st } )
    |   inStatement -> passThrough(text = { $inStatement.st } )
    |   ifStatement -> passThrough(text = { $ifStatement.st } )
    |   functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
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
    :    constraintFunctionCall -> passThrough(text = { $constraintFunctionCall.st } )
    |    expression -> passThrough(text = { $expression.st } )
    |    variableDeclaration -> passThrough(text = { $variableDeclaration.st } )
    |    functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
    ;
    
constraintFunctionCall 
    :    ^(OBJCALL target = ID function = ID ^(AT (time = TIME)?) ^(ARGS expressionList?)) {
         $st = %constraintFunctionCall();
         %{$st}.timeline = $inStatement::timeline;
         %{$st}.target = $target.text;
         %{$st}.type = "JMFAudio"; // TODO: inter timeline through semantic analysis
         %{$st}.function = $function.text;
         %{$st}.time = $time.text != "@start" ? $time.text : 0;
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
    :    (exps += expression)+ -> expressionList(exps = { $exps })
         //-> expressionList(exps = { $exps })
    ;

variableDeclaration 
    :    ^(VARDEF 'timeline' ID)        -> timelineDeclaration(name = { $ID.text })
    |    ^(ARG 'timeline' ID)           -> timelineArgument(name = { $ID.text }) 
    |    ^(VARDEF TYPE ID initializer?) -> variableDeclaration(type = { $TYPE.text }, name = { $ID.text }, init = { $initializer.st })
    |    ^(ARG TYPE ID)                 -> variableArgument(type = { $TYPE.text }, name = { $ID.text }) 
    ;
    
initializer      
    :    logicalORExpression -> passThrough(text = { $logicalORExpression.st } )
    ;
    
expression 
    :    ^(ASSIGNMENT_OPERATOR logicalORExpression expression)
    ;
logicalORExpression      
    :	 ^('or' 'not'? logicalORExpression logicalORExpression)
    |    ^('and' logicalORExpression logicalORExpression)
    |    ^(EQUALITY_OPERATOR logicalORExpression logicalORExpression)
    |    ^(RELATIONAL_OPERATOR logicalORExpression logicalORExpression)
    |    ^(ADDITIVE_OPERATOR logicalORExpression logicalORExpression)
    |    ^(MULTIPLICATIVE_OPERATOR logicalORExpression logicalORExpression)
    |	 ID -> passThrough(text = { $ID.text } )
    |	 BOOL -> passThrough(text = { $BOOL.text } )
    |	 NUMBER -> passThrough(text = { $NUMBER.text } )
    ;
    
// Start generic literals 
literal : BOOL | NUMBER | STRING | TIME;

// Start language blocks
//languageBlockDefinition : 'in' LANGUAGE START (lines += LANGUAGECODE)* END -> ^(LANGBLOCK $lines*);
//LANGUAGE                : 'JAVA' | 'java' | 'Java';
//LANGUAGECODE            : '<' '<' ANYTHING* NEWLINE;
// End generic literals language blocks
