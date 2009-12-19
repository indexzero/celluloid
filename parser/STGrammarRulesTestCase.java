import junit.framework.TestCase;
import org.junit.Test;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;
import java.io.*;


/**
 * Created by IntelliJ IDEA.
 * User: Charlie
 * Date: Dec 19, 2009
 * Time: 4:01:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class STGrammarRulesTestCase extends TestCase {
    private String testPath;
    private String templatePath;

    public STGrammarRulesTestCase(String name, String testPath, String templatePath) {
        super(name);
        this.testPath = testPath;
        this.templatePath = templatePath;
    }

    public STGrammarRulesTestCase() {
        this.testPath = "\\tests";
        this.templatePath = "celluloid.java.stg";
    }


    @Test
    public void shouldGenerateConstraintDefinition() throws IOException, RecognitionException {
        System.out.println("Testing constraintDefinition: constraintDefinition.cld");
        FileReader groupFileR = new FileReader(this.templatePath);
        StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
        groupFileR.close();
        
        FileInputStream inputFileS = new FileInputStream(testPath + "constraintDefinition.cld");
        ANTLRInputStream input = new ANTLRInputStream(inputFileS);
        celluloidLexer lexer = new celluloidLexer(input); // create lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        celluloidParser parser = new celluloidParser(tokens); // create parser

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(parser.constraintDefinition().getTree());
        nodes.setTokenStream(tokens);

        celluloidWalker walker = new celluloidWalker(nodes);
        walker.setTemplateLib(templates);
        celluloidWalker.constraintDefinition_return r = walker.constraintDefinition();

        StringTemplate output = (StringTemplate)r.getTemplate();
        System.out.println(output.toString());

    }


    /**
     * Prints the tree output
     * @param output
     */
    public void printTestResults(CommonTree output) {
        System.out.println(output.toStringTree());
        System.out.println();
    }

    /**
     * Creates an instance of the celluloidParser for the input at fileName
     * @param fileName
     * @return an instance of the celluloidParser for the input at fileName
     * @throws IOException
     */
    private celluloidParser createParserFromFile(String fileName) throws IOException {
        FileInputStream inputFileS = new FileInputStream(testPath + fileName);
        ANTLRInputStream input = new ANTLRInputStream(inputFileS);
        celluloidLexer lexer = new celluloidLexer(input); // create lexer
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        celluloidParser parser = new celluloidParser(tokens); // create parser
        return parser;
    }



}
