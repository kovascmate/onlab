package symboltable;

public class ImportSymbol extends Symbol{
    private final SymbolType symbolType;

    public ImportSymbol(String _importedName) {
       super(_importedName);
       symbolType = SymbolType.IMPORTSYMBOL;
    }

    public String getImportedName() {
        return getName();
    }

    @Override
    public String toString() {
        return "Imported: " + getName();
    }
}
