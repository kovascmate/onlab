package symboltable;

public class ImportSymbol {
    private final String importedName;

    public ImportSymbol(String importedName) {
        this.importedName = importedName;
    }

    public String getImportedName() {
        return importedName;
    }

    @Override
    public String toString() {
        return "Imported: " + importedName;
    }
}
