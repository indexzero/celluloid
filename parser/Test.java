import org.antlr.runtime.*;
import org.antlr.stringtemplate.*;
import java.io.*;

public class Test {
  public static void main(String[] args) throws Exception {
    // load in T.stg template group, put in templates variable
    FileReader groupFileR = new FileReader("celluloid.java.stg");
    //FileInputStream inputFileS = new FileInputStream("tests\\variableList.cld");
    FileInputStream inputFileS = new FileInputStream("tests\\variableDeclaration.cld");
    StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
    groupFileR.close();

    // PARSE INPUT AND COMPUTE TEMPLATE
    ANTLRInputStream input = new ANTLRInputStream(inputFileS);
    celluloidLexer lexer = new celluloidLexer(input); // create lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    celluloidParser parser = new celluloidParser(tokens); // create parser
    parser.setTemplateLib(templates); // give parser templates
    //celluloidParser.variableList_return r = parser.variableList(); // parse rule
    celluloidParser.variableDeclaration_return r = parser.variableDeclaration(); // parse rule
    StringTemplate output = (StringTemplate)r.getTemplate();
    System.out.println(output.toString());// emit translation
    //GrammarTestCase testCase = new GrammarTestCase("GrammarTestCase", "C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\tests", "celluloid.java.stg");
    //testCase.TestAllGrammarRules();
  }
}