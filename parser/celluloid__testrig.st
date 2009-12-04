import org.antlr.runtime.*;
import org.antlr.stringtemplate.*;
import java.io.*;

public class Test {
  public static void main(String[] args) throws Exception {
    // load in T.stg template group, put in templates variable
    FileReader groupFileR = new FileReader("celluloid.java.stg");
    StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
    groupFileR.close();
    
    // PARSE INPUT AND COMPUTE TEMPLATE
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    celluloidLexer lexer = new celluloidLexer(input); // create lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    celluloidParser parser = new celluloidParser(tokens); // create parser
    parser.setTemplateLib(templates); // give parser templates
    celluloidParser.deviceDefinition_return r = parser.deviceDefinition(); // parse rule
    //StringTemplate output = r.getTemplate(); 
    //System.out.println(output.toString());// emit translation
  }
}