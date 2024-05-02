package symboltable;

public class VariableSymbol extends Symbol{
    private final String visibility;
    private final String type;
    private final SymbolType symbolType;

    public VariableSymbol(String name, String type,String _visibility) {
        super(name);
        visibility = _visibility;
        this.type = type;
        symbolType = SymbolType.VARIABLESYMBOL;
    }
    public String getVisibility(){
        return  visibility;
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " " + getName();
    }
    /*public String get*/
}

