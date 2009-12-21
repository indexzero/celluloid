/**
 * Created by IntelliJ IDEA.
 * User: sean
 * Date: Dec 21, 2009
 * Time: 4:48:12 AM
 * To change this template use File | Settings | File Templates.
 */

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.*;


public class cellc {
    public static void main(String[] args) throws Exception {
        String testPath = args[0];
        String templatePath = "../celluloid.java.stg";

        FileReader groupFileR = new FileReader(templatePath);
        StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
        groupFileR.close();

        FileInputStream inputFileS = new FileInputStream(testPath);
        ANTLRInputStream input = new ANTLRInputStream(inputFileS);

        celluloidLexer lexer = new celluloidLexer(input); // create lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        celluloidParser parser = new celluloidParser(tokens); // create parser
        celluloidParser.program_return r = parser.program();

        CommonTree tree = (CommonTree)r.getTree();

        System.out.println("=====Parsing Tree=====");
        System.out.println(tree.toStringTree());
        System.out.println("=====End Parse Tree=====");
        System.out.println("=====Generating Code=====");

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);

        celluloidWalker walker = new celluloidWalker(nodes);
        walker.setTemplateLib(templates);
       

        celluloidWalker.program_return r2 = walker.program();
        StringTemplate output = (StringTemplate)r2.getTemplate();

        String fileName = testPath.substring(0, testPath.lastIndexOf(".cld")) + ".java";
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);
        fw.write(output.toString());
        fw.close();

        Runtime runtime = Runtime.getRuntime();
        runtime.exec("javac -cp ../../framework/" + fileName);

        System.out.println(output.toString());
        System.out.println("=====End Generated Code=====");
    }
}
