import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class testWalker {
    public static void main(String[] args) throws Exception {

        // Create input stream from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // Create a lexer attached to that input stream
        celluloidLexer lexer = new celluloidLexer(input);
        // Create a stream of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser attached to the token stream
        celluloidParser parser = new celluloidParser(tokens);
        // Invoke the program rule in get return value
        celluloidParser.program_return r = parser.program();
        CommonTree t = (CommonTree)r.getTree();

        // If -dot option then generate DOT diagram for AST
        if ( args.length>0 && args[0].equals("-dot") ) {
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(t);
            System.out.println(st);
        }
        else {
            System.out.println(t.toStringTree());
        }
        // Walk resulting tree; create treenode stream first
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        // AST nodes have payloads that point into token stream
        nodes.setTokenStream(tokens);
        // Create a tree Walker attached to the nodes stream
        celluloidWalker walker = new celluloidWalker(nodes);
        // Invoke the start symbol, rule program
        walker.program();

    }
}
