package codegen;

import TypeSystem.TypeSystem;
import generated.ClassDiagram.ClassDiagramBaseVisitor;
import generated.ClassDiagram.ClassDiagramParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import symboltable.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassDiagramCodeGenerator extends ClassDiagramBaseVisitor<Object> {

    public String generatedCode = "";
    TypeSystem _typeSystem;

    public ClassDiagramCodeGenerator(TypeSystem typeSystem) {
        _typeSystem = typeSystem;

    }

    public void visit() {

        for(Object symbol : _typeSystem.getHashMap().values()){
            if(symbol instanceof ClassSymbol){
                visitClassSymbol((ClassSymbol) symbol);
            }
            if(symbol instanceof InterfaceSymbol){
                visitInterfaceSymbol((InterfaceSymbol) symbol);
            }

        }
        writeGeneratedCodeToFile("output.java");
    }

    private void visitClassSymbol(ClassSymbol _classSymbol) {
        generatedCode = generatedCode.concat("class " + _classSymbol.getName());
        if(_classSymbol.getParantClass() != null){
            generatedCode = generatedCode.concat(" extends "+_classSymbol.getParantClass());
        }
        if(_classSymbol.getInterface() != null){
            generatedCode = generatedCode.concat(" implements "+_classSymbol.getInterface());
        }
        generatedCode = generatedCode.concat(" {\n");

        if(_classSymbol.getVariableSymbols() != null) {
            for (Symbol variable : _classSymbol.getVariableSymbols())
                visitVariableSymbol((VariableSymbol) variable);
        }
        if (_classSymbol.getFunctionsSymbols() != null) {
            for (Symbol symbol : _classSymbol.getFunctionsSymbols())
                visitFunctionSymbol((FunctionSymbol) symbol);
        }
        if(_classSymbol.getConnectionsSymbols() != null) {
            for (Symbol symbol : _classSymbol.getConnectionsSymbols())
                visitConnectionSymbol((ConnectionSymbol) symbol);
        }
        generatedCode = generatedCode.concat("}\n");
    }
    private void visitInterfaceSymbol(InterfaceSymbol _interfaceSymbol) {
        generatedCode = generatedCode.concat("interface " + _interfaceSymbol.getName() + " {\n");
        if(_interfaceSymbol.getVariableSymbols() != null) {
            for (Symbol symbol : _interfaceSymbol.getVariableSymbols())
                visitVariableSymbol((VariableSymbol) symbol);
        }
        generatedCode = generatedCode.concat("}\n");
    }
    private void visitConnectionSymbol(ConnectionSymbol connectionSymbol) {
        generatedCode = generatedCode.concat("\t"+connectionSymbol.getVisibility() +" "+connectionSymbol.getConnectionType()+" "+connectionSymbol.getClassName()+" : "+connectionSymbol.getName());
        if(connectionSymbol.getSourceMultiplicity() != null)
            generatedCode = generatedCode.concat(" "+connectionSymbol.getSourceMultiplicity());
        generatedCode = generatedCode.concat("; \n");
    }
    private void visitFunctionSymbol(FunctionSymbol functionSymbol) {
        generatedCode = generatedCode.concat("\t"+functionSymbol.getVisibility() +" "+functionSymbol.getReturnType()+" "+functionSymbol.getName()+"(){\n");
        if(functionSymbol.getReturnType() != "void")
            generatedCode = generatedCode.concat("\t\treturn null;\n");
        generatedCode = generatedCode.concat("\t}\n");
    }
    private void visitVariableSymbol(VariableSymbol variableSymbol) {
        generatedCode = generatedCode.concat("\t"+variableSymbol.getVisibility() +" "+variableSymbol.getType()+" "+variableSymbol.getName()+";\n");
    }
    public void writeGeneratedCodeToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(generatedCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
