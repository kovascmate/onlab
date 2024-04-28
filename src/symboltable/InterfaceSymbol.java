package symboltable;

public class InterfaceSymbol extends Symbol{
    private final SymbolType symbolType;
    public InterfaceSymbol(String _name){
        super(_name);
        symbolType = SymbolType.INTERFACESYMBOL;
    }
    public String getName(){
        return super.getName();
    }
    @Override
    public String toString(){
        return "Interface: " + this.getName();
    }
}
