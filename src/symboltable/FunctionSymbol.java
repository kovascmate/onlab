package symboltable;

import java.util.List;

public class FunctionSymbol extends Symbol {
    private final String returnType;
    private final List<String> parameters;

    public FunctionSymbol(String name, String returnType, List<String> parameters) {
        super(name);
        this.returnType = returnType;
        this.parameters = parameters;
    }


    public String getReturnType() {
        return returnType;
    }

    public List<String> getParameters() {
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
}

