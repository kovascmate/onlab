package symboltable;

public abstract class Symbol {
    private  String name;
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
    public void setName(String _name){
        name = _name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
