import junit.framework.TestCase;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;

import java.io.*;

/**
 * User: Charlie
 * Date: Dec 5, 2009
 * Time: 2:43:27 PM
 */
public class GrammarTestCase extends TestCase {
    private String testPath;
    private String rulePath;

    public GrammarTestCase(
            String name,
            String testPath,
            String rulePath) {
        super(name);
        this.testPath = testPath;
        this.rulePath = rulePath;
    }

    @org.junit.Test
    public void TestAllGrammarRules() {
        File testDirectory = new File(this.testPath);
        FilenameFilter codeFilter = new FilenameFilter() {
            public boolean accept(File file, String name){
                String ext = name.substring(name.lastIndexOf('.') + 1, name.length());
                return ext.equals("cld");
            }
        };

        FilenameFilter assertFilter = new FilenameFilter() {
            public boolean accept(File file, String name){
                String ext = name.substring(name.lastIndexOf('.') + 1, name.length());
                return ext.equals("assert");
            }
        };

        File[] codeFiles = testDirectory.listFiles(codeFilter);
        File[] assertFiles = testDirectory.listFiles(assertFilter);
        File[] allFiles = testDirectory.listFiles();

        assertTrue(codeFiles.length == assertFiles.length);

        try {
            for (File codeFile : codeFiles) {
                assertTrue(RunGrammarRuleTest(codeFile));
            }
        }
        catch (Exception ex) {
        }

    }

    private boolean RunGrammarRuleTest(File codeFile) throws Exception {
        //FileReader groupFileR = new FileReader(rulePath);
        //FileInputStream inputFileS = new FileInputStream(codeFile);
        //StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
        //groupFileR.close();

        // PARSE INPUT AND COMPUTE TEMPLATE
        //ANTLRInputStream input = new ANTLRInputStream(inputFileS);
        //celluloidLexer lexer = new celluloidLexer(input); // create lexer
        //CommonTokenStream tokens = new CommonTokenStream(lexer);
        //celluloidParser parser = new celluloidParser(tokens); // create parser
        //parser.setTemplateLib(templates); // give parser templates

        //celluloidParser.deviceDefinition_return r = parser.deviceDefinition(); // parse rule
        //StringTemplate output = (StringTemplate)r.getTemplate();
        //System.out.println(output.toString());// emit translation

        return false;
    }




}
