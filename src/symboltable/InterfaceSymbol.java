package symboltable;

import java.util.List;

public class InterfaceSymbol extends Symbol{
    public List<VariableSymbol> variables_symbol;
    public List<FunctionSymbol> functions_symbol;
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

    public List<VariableSymbol> getVariableSymbols(){
        return variables_symbol;
    }
    public List<FunctionSymbol> getFunctionsSymbols(){
        return functions_symbol;
    }

}
