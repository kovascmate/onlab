package symboltable;

public class ConnectionSymbol extends  Symbol{
    private final String connectionType; // A kapcsolat típusa (összetétel, asszociáció stb.)
    private final SymbolType symbolType;
    private final String className; // Az érintett osztály neve
    private final String visibility;
    private final String sourceMultiplicity; // Forrás multiplicitása
    private final String targetMultiplicity; // Cél multiplicitása

    public ConnectionSymbol(String _name, String connectionType, String className, String _visibility, String sourceMultiplicity, String targetMultiplicity) {
        super(_name);
        this.connectionType = connectionType;
        this.className = className;
        this.symbolType = SymbolType.CONNECTIONSYMBOL;
        this.visibility = _visibility;
        this.sourceMultiplicity = sourceMultiplicity;
        this.targetMultiplicity = targetMultiplicity;
    }
    public String getConnectionName(){
        return getName();
    }

    // A kapcsolat típusának lekérdezése
    public String getConnectionType() {
        return connectionType;
    }

    // Az érintett osztály nevének lekérdezése
    public String getClassName() {
        return className;
    }

    // Forrás multiplicitásának lekérdezése
    public String getSourceMultiplicity() {
        return sourceMultiplicity;
    }

    // Cél multiplicitásának lekérdezése
    public String getTargetMultiplicity() {
        return targetMultiplicity;
    }

    @Override
    public String toString() {
        return "Connection: " + connectionType + " -> " + className;
    }
}
