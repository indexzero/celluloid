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
        this.printTestResults(this.shouldParseStringLiteral());
        this.printTestResults(this.shouldParseNumberLiteral());

        this.printTestResults(this.shouldParseNumberDeclaration());
        this.printTestResults(this.shouldParseInitializer());
        this.printTestResults(this.shouldParseNumberDeclarationWithInitializer());
        this.printTestResults(this.shouldParseFunctionPredicateCall());

        this.printTestResults(this.shouldParseExpression());

        this.printTestResults(this.shouldParseIdList());
        this.printTestResults(this.shouldParseVariableList());
        this.printTestResults(this.shouldParseExpressionList());

        this.printTestResults(this.shouldParseIfStatement());
        this.printTestResults(this.shouldParseIfElseIfElseStatement());
        this.printTestResults(this.shouldParseWhenStatement());
        this.printTestResults(this.shouldParseEveryStatement());
        this.printTestResults(this.shouldParseConstraintFunctionCall());
        this.printTestResults(this.shouldParseInStatement());

        this.printTestResults(this.shouldParseFunctionHeader());
        this.printTestResults(this.shouldParseFunctionBlock());
        this.printTestResults(this.shouldParseFunctionDefinition());
        this.printTestResults(this.shouldParsePredicateHeader());
        this.printTestResults(this.shouldParsePredicateBlock());
        this.printTestResults(this.shouldParsePredicateDefinition());

        this.printTestResults(this.shouldParseEventDefinition());
        this.printTestResults(this.shouldParseAnnouncementDeclaration());
        this.printTestResults(this.shouldParseConstraintBlock());
        this.printTestResults(this.shouldParseConstraintDefinition());
        this.printTestResults(this.shouldParseDeviceBlock());
        this.printTestResults(this.shouldParseDeviceDefinition());

        this.printTestResults(this.shouldParseProgram());
    }

    /**
     * Tests the primaryExpression rule in celluloid.g with string literals
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseStringLiteral() throws IOException, RecognitionException {
        System.out.println("Testing string literals: string.cld");
        celluloidParser parser = this.createParserFromFile("literals\\string.cld");
        return (CommonTree)parser.primaryExpression().getTree();
    }


    public CommonTree shouldParseNumberLiteral() throws IOException, RecognitionException {
        System.out.println("Testing number: literals\\number.cld");
        celluloidParser parser = this.createParserFromFile("literals\\number.cld");
        return (CommonTree)parser.primaryExpression().getTree();
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
     * Tests the initializer rule in celluloid.g 
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseInitializer() throws IOException, RecognitionException {
        System.out.println("Testing initializer: initializer.cld");
        celluloidParser parser = this.createParserFromFile("initializer.cld");
        return (CommonTree)parser.initializer().getTree();
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
    public CommonTree shouldParseExpression() throws IOException, RecognitionException {
        System.out.println("Testing expression: expression.cld");
        celluloidParser parser = this.createParserFromFile("expression.cld");
        return (CommonTree)parser.expression().getTree();
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
     * Tests the expressionList rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseIfStatement() throws IOException, RecognitionException {
        System.out.println("Testing ifStatement: ifStatement.cld");
        celluloidParser parser = this.createParserFromFile("ifStatement.cld");
        return (CommonTree)parser.ifStatement().getTree();
    }

    public CommonTree shouldParseIfElseIfElseStatement() throws IOException, RecognitionException {
        System.out.println("Testing ifStatement: ifElseIfElseStatement.cld");
        celluloidParser parser = this.createParserFromFile("ifElseIfElseStatement.cld");
        return (CommonTree)parser.ifStatement().getTree();
    }

    public CommonTree shouldParseWhenStatement() throws IOException, RecognitionException {
        System.out.println("Testing whenStatement: whenStatement.cld");
        celluloidParser parser = this.createParserFromFile("whenStatement.cld");
        return (CommonTree)parser.whenStatement().getTree();
    }

    public CommonTree shouldParseEveryStatement() throws IOException, RecognitionException {
        System.out.println("Testing everyStatement: everyStatement.cld");
        celluloidParser parser = this.createParserFromFile("everyStatement.cld");
        return (CommonTree)parser.everyStatement().getTree();
    }

    public CommonTree shouldParseConstraintFunctionCall() throws IOException, RecognitionException {
        System.out.println("Testing constraintFunctionCall: constraintFunctionCall.cld");
        celluloidParser parser = this.createParserFromFile("constraintFunctionCall.cld");
        return (CommonTree)parser.constraintFunctionCall().getTree();
    }

    public CommonTree shouldParseInStatement() throws IOException, RecognitionException {
        System.out.println("Testing inStatement: inStatement.cld");
        celluloidParser parser = this.createParserFromFile("inStatement.cld");
        return (CommonTree)parser.inStatement().getTree();
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
    public CommonTree shouldParseFunctionPredicateCall() throws IOException, RecognitionException {
        System.out.println("Testing functionPredicateCall: functionPredicateCall.cld");
        celluloidParser parser = this.createParserFromFile("functionPredicateCall.cld");
        return (CommonTree)parser.functionPredicateCall().getTree();
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
    public CommonTree shouldParseEventDefinition() throws IOException, RecognitionException {
        System.out.println("Testing eventDefinition: eventDefinition.cld");
        celluloidParser parser = this.createParserFromFile("eventDefinition.cld");
        return (CommonTree)parser.eventDefinition().getTree();
    }

    /**
     * Tests the functionDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseAnnouncementDeclaration() throws IOException, RecognitionException {
        System.out.println("Testing announcementDeclaration: announcementDeclaration.cld");
        celluloidParser parser = this.createParserFromFile("announcementDeclaration.cld");
        return (CommonTree)parser.announcementDeclaration().getTree();
    }

    /**
     * Tests the constraintBlock rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseConstraintBlock() throws IOException, RecognitionException {
        System.out.println("Testing constraintBlock: constraintBlock.cld");
        celluloidParser parser = this.createParserFromFile("constraintBlock.cld");
        return (CommonTree)parser.constraintBlock().getTree();
    }

    /**
     * Tests the constraintDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseConstraintDefinition() throws IOException, RecognitionException {
        System.out.println("Testing constraintDefinition: constraintDefinition.cld");
        celluloidParser parser = this.createParserFromFile("constraintDefinition.cld");
        return (CommonTree)parser.constraintDefinition().getTree();
    }

    /**
     * Tests the constraintBlock rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseDeviceBlock() throws IOException, RecognitionException {
        System.out.println("Testing deviceBlock: deviceBlock.cld");
        celluloidParser parser = this.createParserFromFile("deviceBlock.cld");
        return (CommonTree)parser.deviceBlock().getTree();
    }

    /**
     * Tests the constraintDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseDeviceDefinition() throws IOException, RecognitionException {
        System.out.println("Testing deviceDefinition: deviceDefinition.cld");
        celluloidParser parser = this.createParserFromFile("deviceDefinition.cld");
        return (CommonTree)parser.deviceDefinition().getTree();
    }

    /**
     * Tests the constraintDefinition rule in celluloid.g
     * @throws IOException
     * @throws RecognitionException
     */
    public CommonTree shouldParseProgram() throws IOException, RecognitionException {
        System.out.println("Testing program: program.cld");
        celluloidParser parser = this.createParserFromFile("program.cld");
        return (CommonTree)parser.program().getTree();
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
