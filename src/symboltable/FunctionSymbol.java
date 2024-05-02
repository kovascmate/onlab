package symboltable;

import java.util.ArrayList;
import java.util.List;

public class FunctionSymbol extends Symbol {
    private  String returnType;
    private final SymbolType symbolType;
    private  List<VariableSymbol> parameters;
    private  String visibility;

    public FunctionSymbol(String  _name, String _returnType, List<VariableSymbol> _parameters,String _visibility) {
        super(_name);
        this.symbolType = SymbolType.FUNCTIONSYMBOL;
        this.returnType = _returnType;
        this.parameters = _parameters;
        this.visibility = _visibility;
    }
    public FunctionSymbol(String name){
        super(name);
        this.returnType = "returnType";
        this.parameters = new ArrayList<>();
        this.visibility = "public";
        this.symbolType = SymbolType.FUNCTIONSYMBOL;
    }

    public void setVisibility(String _visibility){
        visibility = _visibility;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<VariableSymbol> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(returnType).append(" ").append(getName()).append("(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i));
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
    public String getVisibilityIcon(){
        switch (visibility){
            case "public":
                return "+";
            case "private":
                return "-";
            case "protected":
                return "~";
            default:
                return " ";
        }
    }
}

