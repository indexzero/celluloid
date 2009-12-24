/**
 * Created by IntelliJ IDEA.
 * User: Charlie
 * Date: Dec 24, 2009
 * Time: 5:24:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class VariableInfo extends SymbolInfo {

    protected String pseudoType;

    public VariableInfo(String name, String type) {
        super(name, type);
    }

    public VariableInfo(String name, String type, String pseudoType) {
        this(name, type);
        this.pseudoType = pseudoType;
    }

    public String getPseudoType() {
        return this.pseudoType;
    }
}
