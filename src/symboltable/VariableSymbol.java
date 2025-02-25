package symboltable;

public class VariableSymbol extends Symbol{
    private  String visibility;
    private  String type;
    private  SymbolType symbolType;

    public VariableSymbol(String name, String type,String _visibility) {
        super(name);
        visibility = _visibility;
        this.type = type;
        symbolType = SymbolType.VARIABLESYMBOL;
    }
    public void setVisibility(String _visibility){
        visibility = _visibility;
    }
    public void setType(String _type){
        type = _type;
    }
    public void setName(String _name){
        super.setName(_name);
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
                return "#";
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

