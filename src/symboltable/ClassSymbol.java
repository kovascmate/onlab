package symboltable;

import java.util.ArrayList;
import java.util.List;

public class ClassSymbol extends  Symbol {

    public String visibility;
    private final SymbolType symbolType;
   /* public ClassSymbol parent_classSymbol;*/
    public String parentClass;
    public String implementedInterface;

    public List<VariableSymbol> variables_symbol;
    public List<FunctionSymbol> functions_symbol;
    public List<ConnectionSymbol> connections_symbol;





    public ClassSymbol(String _name){
        super(_name);
        symbolType = SymbolType.CLASSSYMBOL;
        functions_symbol = new ArrayList<>();
        variables_symbol = new ArrayList<>();
        connections_symbol = new ArrayList<>();

    }
    public String getInterface(){
        return implementedInterface;
    }
    public String getParantClass(){
        return parentClass;
    }
    public void addParentClass(String _name){
        parentClass = _name;
    }
    public void addImplementedInterface(String _name){
        implementedInterface = _name;
    }
    public List<VariableSymbol> getVariableSymbols(){
        return variables_symbol;
    }
    public List<FunctionSymbol> getFunctionsSymbols(){
        return functions_symbol;
    }
    public List<ConnectionSymbol> getConnectionsSymbols(){
        if(connections_symbol.isEmpty()){
            return null;
        }
        return connections_symbol;
    }


    public boolean addVariable(VariableSymbol _variable_symbol){
        if(variables_symbol.contains(_variable_symbol)){
            System.out.println(_variable_symbol.getName()+" already in the list");
            return true;
        }
        variables_symbol.add(_variable_symbol);
        return false;
    }
    public boolean addFunction(FunctionSymbol _function_symbol){
        if(functions_symbol.contains(_function_symbol)){
            System.out.println(_function_symbol.getName()+" already in the list");
            return true;
        }
        functions_symbol.add(_function_symbol);
        return false;
    }
    public boolean addConnection(ConnectionSymbol _connection_symbol){
        if(connections_symbol.contains(_connection_symbol)){
            System.out.println(_connection_symbol.getName()+" already in the list");
            return true;
        }
        connections_symbol.add(_connection_symbol);
        return  false;
    }

}
