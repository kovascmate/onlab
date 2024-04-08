package symboltable;

public class VariableSymbol {
    private final String name;
    private final String type;

    public VariableSymbol(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}

