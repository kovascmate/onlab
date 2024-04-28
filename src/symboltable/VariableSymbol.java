package symboltable;

public class VariableSymbol extends Symbol{
    private final String type;
    private final SymbolType symbolType;

    public VariableSymbol(String name, String type) {
        super(name);
        this.type = type;
        symbolType = SymbolType.VARIABLESYMBOL;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " " + getName();
    }
}

