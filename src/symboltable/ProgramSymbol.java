package symboltable;

import java.util.List;

public class ProgramSymbol extends  Symbol {
    private final SymbolType symbolType;
    public PackageSymbol package_symbol;
    public List<ImportSymbol> imports_symbol;
    public ClassSymbol class_symbol;
    public ProgramSymbol(String _name){
        super(_name);
        symbolType = SymbolType.PRORGRAMSYMBOL;
    }

    public boolean addClass(ClassSymbol _class_symbol){
        class_symbol = _class_symbol;
        return false;
    }
    public boolean addImport(ImportSymbol _import_symbol){
        if(imports_symbol.contains(_import_symbol)){
            System.out.println(_import_symbol.getImportedName()+" already in the list");
            return true;
        }
        imports_symbol.add(_import_symbol);
        return false;
    }
    public boolean addPackage(PackageSymbol _package_symbol){
        package_symbol = _package_symbol;
        return false;
    }

}
