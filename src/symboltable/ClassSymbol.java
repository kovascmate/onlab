package symboltable;

import java.util.List;

public class ClassSymbol extends  Symbol {

    public String visibility;
    private final SymbolType symbolType;
   /* public ClassSymbol parent_classSymbol;*/
    public String parentClass;
    public String implementedInterface;

    public List<VariableSymbol> variables_symbol;
    public List<FunctionSymbol> functions_symbol;


    public ClassSymbol(String _name){
        super(_name);
        symbolType = SymbolType.CLASSSYMBOL;

    }
    public void addParentClass(String _name){
        parentClass = _name;
    }
    public void addImplementedInterface(String _name){
        implementedInterface = _name;
    }

    /*public boolean addParentClass(ClassSymbol _parent_classSymbol){
       if(_parent_classSymbol == null){

       }
        parent_classSymbol = _parent_classSymbol;
       return  false;
    }*/
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
}
