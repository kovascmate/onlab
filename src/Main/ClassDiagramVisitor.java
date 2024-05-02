package Main;

import TypeSystem.TypeSystem;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagramBaseVisitor;
import generated.ClassDiagramParser;
import symboltable.*;

import java.util.List;

//Szemantikai elemzés
public class ClassDiagramVisitor extends ClassDiagramBaseVisitor<Object> {
    private Scope scope;
    private ClassDiagramExceptionHandler exceptionHandler;
    private TypeSystem typeSystem;

    public ClassDiagramVisitor(ClassDiagramExceptionHandler _exceptionHandler,TypeSystem _ts){
        exceptionHandler =_exceptionHandler;
        typeSystem = _ts;
        scope = new Scope(null);
    }



    public Object visitProgram(ClassDiagramParser.ProgramContext _context){
        ClassDiagramParser.Package_defContext packageDefContext =  _context.package_def();
            visitPackage(packageDefContext);
        ClassDiagramParser.ImportsContext importsContext =  _context.imports();
            visitImports(importsContext);
        List<ClassDiagramParser.ClassContext> classContext = _context.class_();
        for(ClassDiagramParser.ClassContext ctx : classContext) {
            visitClass(ctx);
        }
        List<ClassDiagramParser.InterfaceContext> intefaceContext = _context.interface_();
        for(ClassDiagramParser.InterfaceContext ctx : intefaceContext) {
            visitInterface(ctx);
        }
        return null;
    }
    public Object visitClassDef(ClassDiagramParser.Class_defContext _contex){
        var class_def_name = _contex.class_name().getText();
        return  null;
    }

    public Object visitClass(ClassDiagramParser.ClassContext _context){
        var class_name = _context.class_def().class_name().getText();
        ClassSymbol classSymbol = new ClassSymbol(class_name);
        if(_context.class_def().extended_class_name() != null) {
            classSymbol.addParentClass(_context.class_def().extended_class_name().getText());
        }
        if(_context.class_def().interface_name() != null) {
            classSymbol.addImplementedInterface(_context.class_def().interface_name().getText());
        }
        typeSystem.add(class_name,classSymbol);
        return null;
    }

    public Object visitInterface(ClassDiagramParser.InterfaceContext _context){
        var interface_name = _context.interface_def().interface_name().getText();
        InterfaceSymbol interfaceSymbol = new InterfaceSymbol(interface_name);
        typeSystem.add(interface_name,interfaceSymbol);
        return null;
    }

    public Object visitPackage(ClassDiagramParser.Package_defContext _context){
        var package_def_name = _context.package_def_name().getText();
        PackageSymbol packageSymbol = new PackageSymbol(package_def_name);
        typeSystem.add(package_def_name,packageSymbol);
        return null;
    }
    public Object visitImports(ClassDiagramParser.ImportsContext _context){
        for(int i = 0; i < _context.getChildCount();i++){
            visitImport(_context.import_def(i));
        }
        return null;
    }
    public Object visitImport(ClassDiagramParser.Import_defContext  _context){
        var import_def_name = _context.import_def_name().getText();
        ImportSymbol importSymbol = new ImportSymbol(import_def_name);
        typeSystem.add(import_def_name,importSymbol);
        return null;
    }
    public Object visitFunction(ClassDiagramParser.FunctionContext _context){
        var function_name = _context.function_name().getText();
        FunctionSymbol functionSymbol = new FunctionSymbol(function_name);
        typeSystem.add(function_name,functionSymbol);
        return null;
    }
    public Object visitConnection(ClassDiagramParser.ConnectionsContext _context){
        return null;
    }
    public Object visitEnum(ClassDiagramParser.EnumerationContext _context){
        return null;
    }
    public Object visitVariable(ClassDiagramParser.VariableContext _context){

        return null;
    }
}

