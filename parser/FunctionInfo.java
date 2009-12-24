import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Charlie
 * Date: Dec 24, 2009
 * Time: 5:25:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class FunctionInfo extends SymbolInfo {
    private ArrayList arguments = new ArrayList();

    public FunctionInfo(String name, String type) {
        super(name, type);
    }

    public ArrayList getArguments() {
        return this.arguments;
    }
}
