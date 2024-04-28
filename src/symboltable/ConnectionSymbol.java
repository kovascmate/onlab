package symboltable;

public class ConnectionSymbol extends  Symbol{
    private final String connectionType; // A kapcsolat típusa (összetétel, asszociáció stb.)
    private final SymbolType symbolType;
    private final String className; // Az érintett osztály neve

    public ConnectionSymbol(String connectionType, String className) {
        this.connectionType = connectionType;
        this.className = className;
        this.symbolType = SymbolType.CONNECTIONSYMBOL;
    }

    // A kapcsolat típusának lekérdezése
    public String getConnectionType() {
        return connectionType;
    }

    // Az érintett osztály nevének lekérdezése
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Connection: " + connectionType + " -> " + className;
    }
}
