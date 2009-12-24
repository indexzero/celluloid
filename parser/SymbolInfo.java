/**
 * Created by IntelliJ IDEA.
 * User: Charlie
 * Date: Dec 24, 2009
 * Time: 5:24:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class SymbolInfo {
    protected String name;
    protected String type;

    public SymbolInfo(String name, String type) {
      this.name = name;
      this.type = type;
    }

    public String getName() {
      return this.name;
    }

    public String getType() {
      return this.type;
    }
}
