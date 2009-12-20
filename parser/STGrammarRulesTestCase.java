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
        this.shouldGenerateEventDefinition();
        this.shouldGenerateConstraintDefinition();
        this.shouldGenerateDeviceDefinition();

        this.shouldGenerateFunctionHeader();
        this.shouldGenerateFunctionDefinition();

        //this.shouldGenerateInStatement();

        this.shouldGenerateVariableList();
        this.shouldGenerateIdList();
        this.shouldGenerateTimelineDeclaration();
        this.shouldGenerateNumberDeclaration();
        //this.shouldGenerateConstraintDefinition();
        this.shouldGenerateIfStatement();
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
    public void shouldGenerateEventDefinition() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "eventDefinition.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.eventDefinition().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.eventDefinition_return r = walker.eventDefinition();
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

    @Test
    public void shouldGenerateDeviceDefinition() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "deviceDefinition.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.deviceDefinition().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.deviceDefinition_return r = walker.deviceDefinition();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateFunctionHeader() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "functionHeader.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.functionHeader().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.functionHeader_return r = walker.functionHeader();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateFunctionDefinition() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "functionDefinition.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.functionDefinition().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.functionDefinition_return r = walker.functionDefinition();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateIdList() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "idList.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.idList().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.idList_return r = walker.idList();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateVariableList() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "variableList.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.variableList().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.variableList_return r = walker.variableList();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateTimelineDeclaration() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "timelineDeclaration.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.variableDeclaration().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.variableDeclaration_return r = walker.variableDeclaration();
                return (StringTemplate)r.getTemplate();
            }
        };

        testRunner.RunTest();
    }

    @Test
    public void shouldGenerateNumberDeclaration() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "numberDeclaration.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.variableDeclaration().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.variableDeclaration_return r = walker.variableDeclaration();
                return (StringTemplate)r.getTemplate();
            }
        };
    }

    public void shouldGenerateIfStatement() throws IOException, RecognitionException {
        STTestRunner testRunner = new STTestRunner(this.testPath + "ifStatement.cld", this.templatePath) {
            public CommonTree getTree(celluloidParser parser) throws RecognitionException {
                return (CommonTree)parser.ifStatement().getTree();
            }

            public StringTemplate getTemplate(celluloidWalker walker) throws RecognitionException {
                celluloidWalker.ifStatement_return r = walker.ifStatement();
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

            CommonTree tree = this.getTree(parser);
            System.out.println("=====Parse Tree=====");
            System.out.println(tree.toStringTree());
            System.out.println("=====End Parse Tree=====");
            BufferedTreeNodeStream nodes = new BufferedTreeNodeStream(tree);
            nodes.setTokenStream(tokens);

            celluloidWalker walker = new celluloidWalker(nodes);
            walker.setTemplateLib(templates);
            StringTemplate output = this.getTemplate(walker);
            String outputText = output.toString();
            System.out.println("=====Generated Code=====");
            System.out.println(outputText);
            System.out.println("=====End Generated Code=====");
            System.out.println();
        }
    }


}
