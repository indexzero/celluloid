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
    protected String name;
    protected String type;
    protected String pseudoType;
    
    public SymbolEntry(String name, String type) {
      this.name = name;
      this.type = type;
    }
    
    public SymbolEntry(String name, String type, String pseudoType) {
      this.name = name;
      this.type = type;
      this.pseudoType = pseudoType;
    }
    
    public String getName() {
      return this.name;
    }
    
    public String getType() {
      return this.type;
    }
    
    public String getPseudoType() {
      return this.pseudoType;
    }
  }
  
  class FunctionEntry extends SymbolEntry {
    private ArrayList arguments = new ArrayList();
    
    public FunctionEntry(String name, String type) {
      super(name, type);
      this.name = name;
      this.type = type;
    }
    
    public ArrayList getArguments() {
      return this.arguments;
    }
  }
  
  HashMap<String, String> typeMap = new HashMap<String, String>();
  HashMap<String, SymbolEntry> symbolTable = new HashMap<String, SymbolEntry>();
  HashMap<String, FunctionEntry> functionTable = new HashMap<String, FunctionEntry>();

  public static String parseTime(String time) {
    if("@start".equals(time)) return "0F";
    if("@now".equals(time)) return "0F"; //@TODO support @NOW
    time = time.substring(1, time.length());
    
    int builtTime = 0;
    int buildUp = 0;
    while(time.length() > 0) {
      char cur = time.charAt(0);
      time = time.substring(1, time.length());
      switch(cur) {
        case 'd':
          builtTime += 86400000*buildUp;
          buildUp = 0;
          break;
        case 'h':
          builtTime += 3600000*buildUp;
          buildUp = 0;
          break;
        case 'm':
          builtTime += 60000*buildUp;
          buildUp = 0;
          break;
        case 's':
          builtTime += 1000*buildUp;
          buildUp = 0;
          break;
        default:
          buildUp = buildUp*10 + new Integer(String.valueOf(cur));
      }
    }
    return new String(Integer.valueOf(builtTime).toString())+"F";	 
    }
}


// Program main entry point
program 
@init {
  this.symbolTable = new HashMap<String, SymbolEntry>();
  this.functionTable = new HashMap<String, FunctionEntry>();
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
           
           // TODO: Add the announces section to compile-time storage for later use (i.e. by device declarations)
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
    |    predicateHeader     -> passThrough(text = { $predicateHeader.st } )
    |    functionHeader      -> passThrough(text = { $functionHeader.st } )
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
    |    functionDefinition  -> passThrough(text = { $functionDefinition.st } )
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
           
           // TODO: Add arguments to the structure we store so that we can do type checking
           this.functionTable.put($ID.text, new FunctionEntry($ID.text, "function"));
         }
    ;
functionBlock      
    :    ^(FUNBLOCK RETURN (block += functionPredicateBlockDeclaration)*) {
           $st = %statementList();
           %{$st}.statements = $block;
         } 
    ;
functionPredicateBlockDeclaration 
    :    variableDeclaration   -> passThrough(text = { $variableDeclaration.st } )
    |    expression            -> passThrough(text = { $expression.st } )
    |    inStatement           -> passThrough(text = { $inStatement.st } ) // Remark: Unknown behavior if called from inStatement
    |    ifStatement           -> passThrough(text = { $ifStatement.st } )
//    |    functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
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
           
           // TODO: Add arguments to the structure we store so that we can do type checking
           this.functionTable.put($ID.text, new FunctionEntry($ID.text, "predicate"));
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
    :   whenStatement[$with]          -> passThrough(text = { $whenStatement.st } )
    |   everyStatement[$with]         -> passThrough(text = { $everyStatement.st } )
    |   constraintFunctionCall[$with] -> passThrough(text = { $constraintFunctionCall.st } )
    ;

ifStatement
    :  ^(IF exp = expression block = ifBlock) {
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
    :   ^(ELSEIF (exp = expression) ^(IFBLOCK (block += ifBlockDeclaration)+)) {
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
    :	variableDeclaration   -> passThrough(text = { $variableDeclaration.st } )
    |   expression            -> passThrough(text = { $expression.st } )
    //|   inStatement         -> passThrough(text = { $inStatement.st } )
    |   ifStatement           -> passThrough(text = { $ifStatement.st } )
//    |   functionPredicateCall -> passThrough(text = { $functionPredicateCall.st } )
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
    |    expression                    -> passThrough(text = { $expression.st } )
    |    variableDeclaration           -> passThrough(text = { $variableDeclaration.st } )
 //   |    functionPredicateCall         -> passThrough(text = { $functionPredicateCall.st } )
    ;
    
constraintFunctionCall[String with]
    :    ^(OBJCALL target = ID function = ID ^(AT (time = TIME)?) ^(ARGS expressionList?)) {
           SymbolEntry targetSymbol = this.symbolTable.get($target.text);
           SymbolEntry withSymbol = this.symbolTable.get($with);
           String withType = withSymbol.getType();
         
           $st = withType != "Timeline" ? %outputConstraintFunctionCall() : %constraintFunctionCall();
           %{$st}.with = $with;
           %{$st}.target = $target.text;
           
           %{$st}.type = targetSymbol.getType(); 
           %{$st}.function = $function.text;
           %{$st}.time = parseTime(new String($time.text));; // TODO: @start should be parsed in logical or expression...
           %{$st}.args = $expressionList.st;
         }
    ;
    catch[NullPointerException ex] {
      System.err.println("<Celluloid> Cannot execute constraint function on undefined media: " + $target.text); 
    }
    
// IMPORTANT: WE ARE GETTING 'EXPECTING <UP>' FOR THIS RULE!!!
functionPredicateCall       
    :    ^(CALL ID ^(ARGS args = expressionList?)) {
           FunctionEntry symbolEntry = this.functionTable.get($ID.text);
           if(symbolEntry == null) {
             System.err.println("<Celluloid> Cannot execute undefined function / predicate: " + $ID.text);
           }
           
           // TODO: Get arguments from FunctionEntry object and perform existence and type checking.
           $st = %functionPredicateCall();
           %{$st}.name = $ID.text;
           %{$st}.args = $args.st;
         }
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
    ;

// Variable declaration and expressions
variableDeclaration 
    :    ^(VARDEF 'timeline' ID) {
           $st = %timelineDeclaration();
           %{$st}.name = $ID.text;
           this.symbolTable.put($ID.text, new SymbolEntry($ID.text, "Timeline"));
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
           typeMap =  new HashMap<String, String>();
           typeMap.put("AudioFile", "JMFAudio");
           typeMap.put("Output", "output");
           typeMap.put("input", "input");
           if($realType.text .equals("AudioFile")) {
           	$st = %audioDeviceDeclaration();
           }
           else if($realType.text.equals("Output")){
           	$st = %outputDeclaration();
           }
           else{
          	$st = %deviceDeclaration();
           }
           
                     	%{$st}.type   = this.typeMap.get($realType.text);
         	%{$st}.name = $name;
          	%{$st}.args   = $args.st;
          
           
           this.symbolTable.put($name.text, new SymbolEntry($name.text, this.typeMap.get($realType.text), $PSEUDOTYPE.text));
         }
    ;

initializer      
    :    expression -> initializer(exp = { $expression.st })
    ;
    
// IMPORTANT: NEEDS TEMPLATE!
expression 
    :    ^(ASSIGNMENT_OPERATOR lhs = expression rhs = expression) {
    	   $st = %expressionLine();
           %{$st}.lhand = $lhs.st;
           if(":=".equals($ASSIGNMENT_OPERATOR.text)) {
             %{$st}.op = new String("=");
           } else {
             %{$st}.op = $ASSIGNMENT_OPERATOR.text;
           }
           %{$st}.rhand = $rhs.st;
    	}
    |    ^('not' lhs = expression) -> simpleExpression(lhand = { $lhs.st })
    |    ^('or' lhs = expression rhs = expression) -> expression(lhand = { $lhs.st }, op = { "or" }, rhand = { $rhs.st })
    |    ^('and' lhs = expression rhs = expression) -> expression(lhand = { $lhs.st }, op = { "and" }, rhand = { $rhs.st })
    |    ^(EQUALITY_OPERATOR lhs = expression rhs = expression) -> expression(lhand = { $lhs.st }, op = { $EQUALITY_OPERATOR.text }, rhand = { $rhs.st })
    |    ^(RELATIONAL_OPERATOR lhs = expression rhs = expression) -> expression(lhand = { $lhs.st }, op = { $RELATIONAL_OPERATOR.text }, rhand = { $rhs.st })
    |    ^(ADDITIVE_OPERATOR lhs = expression rhs = expression) -> expression(lhand = { $lhs.st }, op = { $ADDITIVE_OPERATOR.text }, rhand = { $rhs.st })
    |    ^(MULTIPLICATIVE_OPERATOR lhs = expression rhs = expression) -> expression(lhand = { $lhs.st }, op = { $MULTIPLICATIVE_OPERATOR.text }, rhand = { $rhs.st })
    |	 ID     -> passThrough(text = { $ID.text } ) // Needs Action; Check if it exists
    |	 BOOL   -> passThrough(text = { $BOOL.text } ) // Needs Template
    |	 NUMBER -> passThrough(text = { $NUMBER.text } ) // Needs Template
    |	 STRING -> passThrough(text = { $STRING.text } ) // Needs Template
    |	 TIME  {
    	   $st = %passThrough();
    	   %{$st}.text = parseTime(new String($TIME.text));
    	 }  // Needs Action; Needs to be parsed into Milliseconds
    |    functionPredicateCall       -> passThrough(text = { $functionPredicateCall.st })
    ;	
    
// IMPORTANT: ALL OF THESE DERIVATIONS NEED ACTIONS OR TEMPLATES
//logicalORExpression      
  //  :	 ^('not' logicalORExpression) // Needs Template
   // |	 ^('or' logicalORExpression logicalORExpression) // Needs Template
  //  |    ^('and' logicalORExpression logicalORExpression) // Needs Template
//    |    ^(EQUALITY_OPERATOR logicalORExpression logicalORExpression) // Needs Template
//    |    ^(RELATIONAL_OPERATOR logicalORExpression logicalORExpression) // Needs Template
//    |    ^(ADDITIVE_OPERATOR logicalORExpression logicalORExpression) // Needs Template
//    |    ^(MULTIPLICATIVE_OPERATOR logicalORExpression logicalORExpression) // Needs Template
//    |	 ID     -> passThrough(text = { $ID.text } ) // Needs Action; Check if it exists
//    |	 BOOL   -> passThrough(text = { $BOOL.text } ) // Needs Template
//    |	 NUMBER -> passThrough(text = { $NUMBER.text } ) // Needs Template
//    |	 STRING -> passThrough(text = { $STRING.text } ) // Needs Template
//    |	 TIME   -> passThrough(text = { $TIME.text } )  // Needs Action; Needs to be parsed into Milliseconds
//    |    functionPredicateCall       -> passThrough(text = { $functionPredicateCall.st })
//    ;	
    
// Start generic literals 
literal : BOOL | NUMBER | STRING | TIME;

// Start language blocks
//languageBlockDefinition : 'in' LANGUAGE START (lines += LANGUAGECODE)* END -> ^(LANGBLOCK $lines*);
//LANGUAGE                : 'JAVA' | 'java' | 'Java';
//LANGUAGECODE            : '<' '<' ANYTHING* NEWLINE;
// End generic literals language blocks
