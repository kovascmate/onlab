package symboltable;

public abstract class Symbol {
    private final String name;
    private  static SymbolType symbolType;

    public Symbol(String name) {
        symbolType  = SymbolType.SYMBOL;
        this.name = name;
    }
    public static SymbolType getSymbolType(){
        return symbolType;
    }
    public Symbol(){
        symbolType  = SymbolType.SYMBOL;
        name = "";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
