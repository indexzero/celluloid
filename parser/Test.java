import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.stringtemplate.*;
import java.io.*;

public class Test {
  public static void main(String[] args) throws Exception {
     //ASTGrammarRulesTestCase astTests = new ASTGrammarRulesTestCase("ASTRules", "tests" + File.separator);
     //astTests.runAllTests();
      
     STGrammarRulesTestCase tests = new STGrammarRulesTestCase("STRules", "tests" + File.separator, "celluloid.java.stg");
     tests.shouldGenerateInStatement();
  }
}