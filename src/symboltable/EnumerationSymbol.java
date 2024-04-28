package symboltable;

import java.util.List;

public class EnumerationSymbol extends  Symbol {
    private final List<String> enumConstants;
    private final SymbolType symbolType;
    public EnumerationSymbol(String _enumerationName) {
        super(_enumerationName);
        enumConstants = null;
        symbolType = SymbolType.ENUMERATIONSYMBOL;
    }

    public EnumerationSymbol(String _enumerationName, List<String> enumConstants) {
        super(_enumerationName);
        this.enumConstants = enumConstants;
        symbolType = SymbolType.ENUMERATIONSYMBOL;
    }

    public String getEnumerationName() {
        return getName();
    }

    public List<String> getEnumConstants() {
        return enumConstants;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Enumeration: ").append(getName()).append(" {");
        for (int i = 0; i < enumConstants.size(); i++) {
            sb.append(enumConstants.get(i));
            if (i < enumConstants.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

