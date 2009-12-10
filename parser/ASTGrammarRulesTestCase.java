import junit.framework.TestCase;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;
import java.io.*;

/**
 * Tests the VALID AST parsing rules in the celluloid grammar (celluloid.g)
 */
public class ASTGrammarRulesTestCase extends TestCase {
    private String testPath;

    /**
     * Initializes a new instance of the ASTGrammarRulesTestCase class
     * @param name
     * @param testPath
     */
    public ASTGrammarRulesTestCase(
            String name,
            String testPath) {
        super(name);
        this.testPath = testPath;
    }

    /**
     * Runs all tests in this class, ouputing results.
     * @throws IOException
     * @throws RecognitionException
     */
    public void runAllTests() throws IOException, RecognitionException {
        this.printTestResults(this.shouldParseNumberDeclaration());
        this.printTestResults(this.shouldParseNumberDeclarationWithInitializer());
        this.printTestResults(this.shouldParseIdList());
        this.printTestResults(this.shouldParseVariableList());
        this.printTestResults(this.shouldParseExpressionList());
        this.printTestResults(this.shouldParseFunctionHeader());
        this.printTestResults(this.shouldParseFunctionBlock());
        this.printTestResults(this.shouldParseFunctionDefinition());
        this.printTestResults(this.shouldParseFunctionCall());
        this.printTestResults(this.shouldParsePredicateHeader());
        this.printTestResults(this.shouldParsePredicateBlock());
        this.printTestResults(this.shouldParsePredicateDefinition());
        this.printTestResults(this.shouldParsePredicateCall());
    }

    /**
     * Tests the variableDeclaration rule in celluloid.g with no newline (i.e. ARG)
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseNumberDeclaration() throws IOException, RecognitionException {
        System.out.println("Testing variableDeclaration: numberDeclaration.cld");
        celluloidParser parser = this.createParserFromFile("numberDeclaration.cld");
        return (CommonTree)parser.variableDeclaration().getTree();
    }

    /**
     * Tests the functionDefinition rule in celluloid.g with initializer (i.e. VARDEF)
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseNumberDeclarationWithInitializer() throws IOException, RecognitionException {
        System.out.println("Testing variableDeclaration: numberDeclarationInitializer.cld");
        celluloidParser parser = this.createParserFromFile("numberDeclarationInitializer.cld");
        return (CommonTree)parser.variableDeclaration().getTree();
    }

    /**
     * Tests the idList rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseIdList() throws IOException, RecognitionException {
        System.out.println("Testing idList: idList.cld");
        celluloidParser parser = this.createParserFromFile("idList.cld");
        return (CommonTree)parser.idList().getTree();
    }

    /**
     * Tests the variableList rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseVariableList() throws IOException, RecognitionException {
        System.out.println("Testing variableList: variableList.cld");
        celluloidParser parser = this.createParserFromFile("variableList.cld");
        return (CommonTree)parser.variableList().getTree();
    }

    /**
     * Tests the expressionList rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseExpressionList() throws IOException, RecognitionException {
        System.out.println("Testing expressionList: expressionList.cld");
        celluloidParser parser = this.createParserFromFile("expressionList.cld");
        return (CommonTree)parser.expressionList().getTree();
    }

    /**
     * Tests the functionHeader rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseFunctionHeader() throws IOException, RecognitionException {
        System.out.println("Testing functionHeader: functionHeader.cld");
        celluloidParser parser = this.createParserFromFile("functionHeader.cld");
        return (CommonTree)parser.functionHeader().getTree();
    }

    /**
     * Tests the functionBlock rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseFunctionBlock() throws IOException, RecognitionException {
        System.out.println("Testing functionBlock: functionBlock.cld");
        celluloidParser parser = this.createParserFromFile("functionBlock.cld");
        return (CommonTree)parser.functionBlock().getTree();
    }

    /**
     * Tests the functionDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseFunctionDefinition() throws IOException, RecognitionException {
        System.out.println("Testing functionDefinition: functionDefinition.cld");
        celluloidParser parser = this.createParserFromFile("functionDefinition.cld");
        return (CommonTree)parser.functionDefinition().getTree();
    }

    /**
     * Tests the functionDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseFunctionCall() throws IOException, RecognitionException {
        System.out.println("Testing functionCall: functionCall.cld");
        celluloidParser parser = this.createParserFromFile("functionCall.cld");
        return (CommonTree)parser.functionCall().getTree();
    }

    /**
     * Tests the predicateHeader rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParsePredicateHeader() throws IOException, RecognitionException {
        System.out.println("Testing predicateHeader: predicateHeader.cld");
        celluloidParser parser = this.createParserFromFile("predicateHeader.cld");
        return (CommonTree)parser.predicateHeader().getTree();
    }

    /**
     * Tests the predicateBlock rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParsePredicateBlock() throws IOException, RecognitionException {
        System.out.println("Testing predicateBlock: predicateBlock.cld");
        celluloidParser parser = this.createParserFromFile("predicateBlock.cld");
        return (CommonTree)parser.predicateBlock().getTree();
    }

    /**
     * Tests the predicateDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParsePredicateDefinition() throws IOException, RecognitionException {
        System.out.println("Testing predicateDefinition: predicateDefinition.cld");
        celluloidParser parser = this.createParserFromFile("predicateDefinition.cld");
        return (CommonTree)parser.predicateDefinition().getTree();
    }

    /**
     * Tests the functionDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParsePredicateCall() throws IOException, RecognitionException {
        System.out.println("Testing predicateCall: predicateCall.cld");
        celluloidParser parser = this.createParserFromFile("predicateCall.cld");
        return (CommonTree)parser.predicateCall().getTree();
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
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        celluloidParser parser = new celluloidParser(tokens); // create parser
        return parser;
    }
}
