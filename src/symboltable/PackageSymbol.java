package symboltable;

public class PackageSymbol extends Symbol {
    private final SymbolType symbolType;

    public PackageSymbol(String _packageName) {
        super(_packageName);
        symbolType = SymbolType.PACKAGESYMBOL;
    }

    public String getPackageName() {
        return getName();
    }

    @Override
    public String toString() {
        return "Package: " + getName();
    }
}

