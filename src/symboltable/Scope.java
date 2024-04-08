package symboltable;

import java.util.HashMap;

public class Scope {
    private final Scope previous;
    private final HashMap<String, VariableSymbol> variables = new HashMap<>();
    private final HashMap<String, FunctionSymbol> functions = new HashMap<>();

    public Scope(Scope previous) {
        this.previous = previous;
    }

    public boolean addVariable(String name, VariableSymbol symbol) {
        if (variables.containsKey(name)) {
            System.out.println("Variable '" + name + "' is already in scope");
            return true;
        }
        variables.put(name, symbol);
        return false;
    }

    public boolean addFunction(String name, FunctionSymbol symbol) {
        if (functions.containsKey(name)) {
            System.out.println("Function '" + name + "' is already in scope");
            return true;
        }
        functions.put(name, symbol);
        return false;
    }

    public VariableSymbol getVariable(String name) {
        VariableSymbol variableSymbol = variables.get(name);
        if (variableSymbol != null) {
            return variableSymbol;
        } else if (previous != null) {
            return previous.getVariable(name);
        } else {
            return null;
        }
    }

    public FunctionSymbol getFunction(String name) {
        FunctionSymbol functionSymbol = functions.get(name);
        if (functionSymbol != null) {
            return functionSymbol;
        } else if (previous != null) {
            return previous.getFunction(name);
        } else {
            return null;
        }
    }

    public Scope getPrevious() {
        return previous;
    }
}

