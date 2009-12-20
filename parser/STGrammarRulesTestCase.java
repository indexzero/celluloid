import junit.framework.TestCase;
import org.junit.Test;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.BufferedTreeNodeStream;
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

    public void runAllTests() throws IOException, RecognitionException {
        //this.shouldGenerateConstraintDefinition();
        this.shouldGenerateInStatement();
    }

    @Test
    public void shouldGenerateInStatement() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "inStatement.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.inStatement().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.inStatement_return r = walker.inStatement();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateConstraintDefinition() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "constraintDefinition.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.constraintDefinition().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.constraintDefinition_return r = walker.constraintDefinition();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    private class STTestRunner {

        private String testPath;
        private String templatePath;

        public STTestRunner(String testPath, String templatePath) {
            this.testPath = testPath;
            this.templatePath = templatePath;
        }

        public CommonTree getTree(celluloidParser parser) throws RecognitionException  {
            return null;
        }

        public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
            return null;
        }

        public void RunTest() throws IOException, RecognitionException {
            System.out.println("Testing " + this.testPath);
            FileReader groupFileR = new FileReader(this.templatePath);
            StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
            groupFileR.close();

            FileInputStream inputFileS = new FileInputStream(this.testPath);
            ANTLRInputStream input = new ANTLRInputStream(inputFileS);
            celluloidLexer lexer = new celluloidLexer(input); // create lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            celluloidParser parser = new celluloidParser(tokens); // create parser

            BufferedTreeNodeStream nodes = new BufferedTreeNodeStream(this.getTree(parser));
            nodes.setTokenStream(tokens);

            celluloidWalker walker = new celluloidWalker(nodes);
            walker.setTemplateLib(templates);
            StringTemplate output = this.getTemplate(walker);
            System.out.println(output.toString());
        }
    }


}
