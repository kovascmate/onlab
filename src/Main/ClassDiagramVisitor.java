package Main;

import TypeSystem.TypeSystem;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagramBaseVisitor;
import generated.ClassDiagramParser;
import symboltable.*;

import java.util.ArrayList;
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
        if(_context.functions() != null){
            for(ClassDiagramParser.FunctionContext fcxt : _context.functions().function()){
                classSymbol.addFunction(visitFunction(fcxt));
            }
        }
        if(_context.variables() != null){
            for(ClassDiagramParser.VariableContext vcxt : _context.variables().variable()){
                classSymbol.addVariable(visitVariable(vcxt));
            }
        }
        if(_context.connections() != null){
            for(ClassDiagramParser.ConnectionContext ccxt : _context.connections().connection()){
                classSymbol.addConnection(visitConnection(ccxt));
            }
        }
        typeSystem.add(class_name,classSymbol);
        return null;
    }

    public Object visitInterface(ClassDiagramParser.InterfaceContext _context){
        var interface_name = _context.interface_def().interface_name().getText();
        InterfaceSymbol interfaceSymbol = new InterfaceSymbol(interface_name);
        if(_context.functions() != null){
            for(ClassDiagramParser.FunctionContext fcxt : _context.functions().function()){
                interfaceSymbol.addFunction(visitFunction(fcxt));
            }
        }
        if(_context.variables() != null){
            for(ClassDiagramParser.VariableContext vcxt : _context.variables().variable()){
                interfaceSymbol.addVariable(visitVariable(vcxt));
            }
        }
        if(_context.connections() != null){
            for(ClassDiagramParser.ConnectionContext ccxt : _context.connections().connection()){
                interfaceSymbol.addConnection(visitConnection(ccxt));
            }
        }
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
    public ConnectionSymbol visitConnection(ClassDiagramParser.ConnectionContext _context){
        String name = "",class_name = "", connection_type = "",visibility, source_multiplicity = "", target_multiplicity = "";
       if(_context.aggregation() != null){
             class_name = _context.aggregation().CLASS_NAME().getText();
            connection_type = "aggregation";
            name = _context.aggregation().IDENTIFIER().getText();
           if (_context.aggregation().multiplicity() != null) {
               source_multiplicity = _context.aggregation().multiplicity().getText();
           }

       } else if (_context.composition() != null) {
           class_name = _context.composition().CLASS_NAME().getText();
           connection_type = "composition";
           name = _context.composition().IDENTIFIER().getText();
           if (_context.composition().multiplicity() != null) {
               source_multiplicity = _context.composition().multiplicity().getText();
           }
       }else if (_context.association() != null) {
           class_name = _context.association().CLASS_NAME().getText();
           connection_type = "association";
           name = _context.association().IDENTIFIER().getText();
           if (_context.association().multiplicity() != null) {
               source_multiplicity = _context.association().multiplicity().getText();
           }
       }
       ConnectionSymbol connectionSymbol = new ConnectionSymbol(name,connection_type,class_name,"public","","");
       typeSystem.add(name, connectionSymbol);
       return connectionSymbol;
    }
    public FunctionSymbol visitFunction(ClassDiagramParser.FunctionContext _context){
        String function_name = _context.function_name().getText();
        String function_visibility = _context.VISIBILITY().getText();
        List<VariableSymbol> parameters = new ArrayList<>();
        String function_return = new String();
        if(_context.variable_type() != null){
         function_return = _context.variable_type().getText();
        } else  {
            function_return = "void";
        }

        FunctionSymbol functionSymbol = new FunctionSymbol(function_name,function_return,parameters,function_visibility);
        typeSystem.add(function_name,functionSymbol);
        return functionSymbol;
    }
    public Object visitConnection(ClassDiagramParser.ConnectionsContext _context){
        return null;
    }
    public Object visitEnum(ClassDiagramParser.EnumerationContext _context){
        return null;
    }
    public VariableSymbol visitVariable(ClassDiagramParser.VariableContext _context){
        String var_name = "";
        String type = "";
        String visibility = "";
           if (_context.boolean_variable() != null){
               var_name = _context.boolean_variable().variable_name().getText();
               type = "boolean";
               visibility =  _context.boolean_variable().VISIBILITY().getText();
           }else if(_context.string_variable() != null){
               var_name = _context.string_variable().variable_name().getText();
               type ="string";
               visibility =  _context.string_variable().VISIBILITY().getText();
           }else if(_context.int_variable() != null){
               var_name = _context.int_variable().variable_name().getText();
               type = "int";
               visibility =  _context.int_variable().VISIBILITY().getText();
           }else if(_context.date_variable() != null){
               var_name = _context.date_variable().variable_name().getText();
               type = "date";
               visibility =  _context.date_variable().VISIBILITY().getText();
           }
           VariableSymbol sym = new VariableSymbol(var_name,type,visibility);
        return sym;
    }
}

