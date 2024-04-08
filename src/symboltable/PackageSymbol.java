package symboltable;

public class PackageSymbol {
    private final String packageName;

    public PackageSymbol(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    @Override
    public String toString() {
        return "Package: " + packageName;
    }
}

