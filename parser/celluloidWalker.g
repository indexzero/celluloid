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
  class SymbolEntry {
    private String name;
    private String type;
    private String pseudoType;
    
    public SymbolEntry(String name, String type) {
      this.name = name;
      this.type = type;
    }
    
    public SymbolEntry(String name, String type, String pseudoType) {
      this.name = name;
      this.type = type;
    }
    
    public String getName() {
      return this.name;
    }
    
    public String getType() {
      return this.type;
    }
    
    public String getPseduoType() {
      return this.pseudoType;
    }
  }
  
  HashMap<String, String> typeMap = new HashMap<String, String>();
  HashMap<String, SymbolEntry> symbolTable = new HashMap<String, SymbolEntry>();
}


// Program main entry point
program 
@init {
  this.symbolTable = new HashMap<String, SymbolEntry>();
  typeMap.put("number", "double");
  typeMap.put("string", "String");
  typeMap.put("time", "long");
  typeMap.put("boolean", "boolean");
}
    :    ^(PROGRAM 
             ^(EVENTS (events += eventDefinition)*)
             ^(CONSTRAINTS (constraints += constraintDefinition)*)
             ^(DEVICES (devices += deviceDefinition)*)
             ^(FUNCTIONS (functions += functionDefinition | predicates += predicateDefinition)*)
             ^(PROGBLOCK (code += functionPredicateBlockDeclaration)*)) {
            $st = %program();
            %{$st}.events = $events;
            %{$st}.constraints = $constraints;
            %{$st}.devices = $devices;
            %{$st}.functions = $functions;
            %{$st}.predicates = $predicates;
            %{$st}.code = $code;
         }        
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
    :    ^(CONSTRAINT ID ^(REQUIRES requires = idList?) ^(ANNOUNCES announces = idList?) block = constraintBlock) {
           $st = %constraintDefinition();
           %{$st}.name = $ID.text;
           %{$st}.require = requires != null ? "implements" : ""; 
           %{$st}.requires = $requires.st;
           %{$st}.block = $block.st;
           
           // TODO: Semantic analysis
           //System.out.println(announces);
         }
    ;
constraintBlock 
    :    ^(CONBLOCK (block += constraintBlockDeclaration)* ^(ANNOUNCEMENTS announcementDeclaration*)) {
            $st = %statementList();
            %{$st}.statements = $block;
          }
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
    :    ^(FUNBLOCK ^(RETURN retexp = logicalORExpression) (block += functionPredicateBlockDeclaration)*) {
           $st = %predicateBlock();
           %{$st}.statements = $block;
           %{$st}.returns = $retexp.st;
         }  
    ;

// Timline and procedural blocks

inStatement
    :  ^(IN ID block = inBlock[$ID.text]) {
        $st = %passThrough();
	%{$st}.text = $block.st;
       }
    ;
    
inBlock[String with] 
    :	^(INBLOCK (block += inBlockDeclaration[$with])*) {
           $st = %statementList();
           %{$st}.statements = $block;
   	 }
    ;
inBlockDeclaration[String with]
    :   whenStatement[$with] -> passThrough(text = { $whenStatement.st } )
    |   everyStatement[$with] -> passThrough(text = { $everyStatement.st } )
    |   constraintFunctionCall[$with] -> passThrough(text = { $constraintFunctionCall.st } )
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
    //|   inStatement -> passThrough(text = { $inStatement.st } )
    |   ifStatement -> passThrough(text = { $ifStatement.st } )
    |   functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
    ;

whenStatement[String with]
    :   ^(LISTENER ^(ARG ID?) EVERY ^(COND 'when'? 'unless' ID?) listenerBlock[$with])
        //-> whenStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
everyStatement[String with]
    :   ^(LISTENER ^(ARG ID?) ^(EVERY TIME) ^(COND 'when'? 'unless'? ID?) listenerBlock[$with])
        //-> everyStatement(name = { $ID.text }, accepts = { $assignmentExpression.st }
    ;
listenerBlock[String with]
    :  ^(LISTENBLOCK listenerBlockDeclaration[$with]*)
    ;
listenerBlockDeclaration[String with]
    :    constraintFunctionCall[$with] -> passThrough(text = { $constraintFunctionCall.st } )
    |    expression -> passThrough(text = { $expression.st } )
    |    variableDeclaration -> passThrough(text = { $variableDeclaration.st } )
    |    functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
    ;
    
constraintFunctionCall[String with]
    :    ^(OBJCALL target = ID function = ID ^(AT (time = TIME)?) ^(ARGS expressionList?)) {
           $st = %constraintFunctionCall();
           %{$st}.with = $with;
           %{$st}.target = $target.text;
           
           SymbolEntry targetSymbol = this.symbolTable.get($target.text);
           %{$st}.type = targetSymbol.getType(); 
           %{$st}.function = $function.text;
           %{$st}.time = $time.text != "@start" ? $time.text : 0;
           %{$st}.args = $expressionList.st;
         }
    ;
    catch[NullPointerException ex] {
      System.err.println("<Celluloid> Cannot execute constraint function on undefined media: " + $target.text); 
    }
    
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

initializer      
    :    logicalORExpression -> passThrough(text = { $logicalORExpression.st } )
    ;

variableDeclaration 
    :    ^(VARDEF 'timeline' ID) {
           $st = %timelineDeclaration();
           %{$st}.name = $ID.text;
           this.symbolTable.put($ID.text, new SymbolEntry($ID.text, "timeline"));
         }
    |    ^(ARG 'timeline' ID)           -> timelineArgument(name = { $ID.text }) 
    |    ^(VARDEF TYPE ID initializer?) {
    	   // TODO REMOVE THIS CODE BECAUSE ITS CALLED IN PROGRAM INIT!
    	   // TODO GET THIS TEST WORKING
           typeMap = new HashMap<String, String>();
           typeMap.put("number", "double");
	   typeMap.put("string", "String");
	   typeMap.put("time", "long");
	   typeMap.put("boolean", "boolean");
    
           $st = %variableDeclaration();
           %{$st}.name = $ID.text;
           %{$st}.type = this.typeMap.get($TYPE.text);
           %{$st}.init = $initializer.st;
           
           this.symbolTable.put($ID.text, new SymbolEntry($ID.text, $TYPE.text));
         }
    |    ^(ARG TYPE ID) {
           // TODO REMOVE THIS CODE BECAUSE ITS CALLED IN PROGRAM INIT!
           typeMap = new HashMap<String, String>();
           typeMap.put("number", "double");
	   typeMap.put("string", "String");
	   typeMap.put("time", "long");
	   typeMap.put("boolean", "boolean");
    
           $st = %variableArgument();
           %{$st}.name = $ID.text;
           %{$st}.type = this.typeMap.get($TYPE.text);
         }
    |    ^(OBJDEF PSEUDOTYPE name = ID realType = ID args = expressionList?) {
           $st = %deviceDeclaration();
           %{$st}.type = $realType;
           %{$st}.name = $name;
           %{$st}.args = $args.st;
           
           this.symbolTable.put($name.text, new SymbolEntry($name.text, $realType.text, $PSEUDOTYPE.text));
         } 
        
    ;
    
    
expression 
    :    ^(ASSIGNMENT_OPERATOR logicalORExpression expression)
    ;
logicalORExpression      
    :	 ^('not' logicalORExpression)
    |	 ^('or' logicalORExpression logicalORExpression)
    |    ^('and' logicalORExpression logicalORExpression)
    |    ^(EQUALITY_OPERATOR logicalORExpression logicalORExpression)
    |    ^(RELATIONAL_OPERATOR logicalORExpression logicalORExpression)
    |    ^(ADDITIVE_OPERATOR logicalORExpression logicalORExpression)
    |    ^(MULTIPLICATIVE_OPERATOR logicalORExpression logicalORExpression)
    |	 ID     -> passThrough(text = { $ID.text } )
    |	 BOOL   -> passThrough(text = { $BOOL.text } )
    |	 NUMBER -> passThrough(text = { $NUMBER.text } )
    |	 STRING -> passThrough(text = { $STRING.text } )
    |	 TIME   -> passThrough(text = { $TIME.text } )
    |    ^(OBJDEF ID expressionList) -> passThrough(text = { $ID.text }) //THIS IS WRONG, SHOULD BE NEW ID(LIST);
    |    functionPredicateCall       -> passThrough(text = { $functionPredicateCall.st })
    ;	
    
// Start generic literals 
literal : BOOL | NUMBER | STRING | TIME;

// Start language blocks
//languageBlockDefinition : 'in' LANGUAGE START (lines += LANGUAGECODE)* END -> ^(LANGBLOCK $lines*);
//LANGUAGE                : 'JAVA' | 'java' | 'Java';
//LANGUAGECODE            : '<' '<' ANYTHING* NEWLINE;
// End generic literals language blocks
