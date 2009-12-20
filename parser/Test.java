import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.stringtemplate.*;
import java.io.*;

public class Test {
  public static void main(String[] args) throws Exception {
     STGrammarRulesTestCase tests = new STGrammarRulesTestCase("STRules", "tests" + File.separator, "celluloid.java.stg");
     tests.shouldGenerateInStatement();
  }
}