package dotFactory;

import TypeSystem.TypeSystem;
import generated.DotGrammar.DotGrammarParser;
import symboltable.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DotVisitor {
    private  TypeSystem typeSystem;
    public DotVisitor(TypeSystem _typeSystem) {
        typeSystem = _typeSystem;
    }

    public static String readDotFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return new String(Files.readAllBytes(path));
    }
    public Object visitDiagram(DotGrammarParser.DiagramContext _context){
        DotGrammarParser.NodesContext nodesContext = _context.nodes();
            visitNodes(nodesContext);
        DotGrammarParser.EdgesContext edgesContext = _context.edges();
            visitEdges(edgesContext);
        return null;
    }
    public Object visitNodes(DotGrammarParser.NodesContext _context){
        for (DotGrammarParser.NodeContext nodeContext : _context.node()){
            visitNode(nodeContext);
        }
        return null;
    }
    public Object visitEdges(DotGrammarParser.EdgesContext _context){
        for (DotGrammarParser.EdgeContext edgeContext : _context.edge()){
            visitEdge(edgeContext);
        }
        return null;
    }

    public Object visitNode(DotGrammarParser.NodeContext _context){
        String node_name = _context.node_title().getText();
        DotGrammarParser.Node_bodyContext node_bodyContext = _context.node_body();
        if(node_bodyContext.interface_name() != null){
            InterfaceSymbol interfaceSymbol = new InterfaceSymbol(node_name);
            for(DotGrammarParser.Dot_variableContext variableContext : node_bodyContext.dot_variables().dot_variable()){
                interfaceSymbol.addVariable(visitVariable(variableContext));
            }
            typeSystem.add(node_name,interfaceSymbol);
        }
        else{
            ClassSymbol classSymbol = new ClassSymbol(node_name);
            for (DotGrammarParser.Dot_variableContext variableContext : node_bodyContext.dot_variables().dot_variable()){
                classSymbol.addVariable(visitVariable(variableContext));
            }
            for (DotGrammarParser.Dot_functionContext functionContext : node_bodyContext.dot_functions().dot_function()){
                classSymbol.addFunction(visitFunction(functionContext));
            }
            typeSystem.add(node_name,classSymbol);
        }
        return null;
    }
    public FunctionSymbol visitFunction(DotGrammarParser.Dot_functionContext _context){
        String  visibility = "";
        switch (_context.VISIBILITY_ICON().getText()){
            case "+":
                visibility =  "public";
            case "-":
                visibility =  "private";
            case "#":
                visibility = "protected";
        }
        String name = _context.IDENTIFIER().getText();
        String returnType;
        if(_context.variable_type() != null){
            returnType = _context.variable_type().getText();
        }else{
            returnType = "void";
        }
        FunctionSymbol functionSymbol = new FunctionSymbol(name,returnType,null,visibility);
        return functionSymbol;
    }
    public VariableSymbol visitVariable(DotGrammarParser.Dot_variableContext _context){
        String visibility = "";
        switch (_context.VISIBILITY_ICON().getText()){
            case "+":
                visibility =  "public";
                break;
            case "-":
                visibility =  "private";
                break;
            case "#":
                visibility = "protected";
                break;
        }
        String name = _context.IDENTIFIER().getText();
        String type = _context.variable_type().getText();
        VariableSymbol variableSymbol = new VariableSymbol(name,type,visibility);
        return variableSymbol;
    }
    public Object visitEdge(DotGrammarParser.EdgeContext _context){
        String source = _context.CLASS_NAME(0).getText();
        String target = _context.CLASS_NAME(1).getText();

        String connectionType = "";

        if(_context.edge_attributes().style() != null){
            String arrowHead = _context.edge_attributes().arrow_head().getFirst().ARROWHEAD_TYPE().getText();

            switch (arrowHead){
                case "empty":
                    connectionType = "implementation";
                    break;
                case "odiamond":
                    connectionType = "aggregation";
                    break;
                case "diamond":
                    connectionType = "composition";
                    break;
                case "curve":
                    connectionType = "association";
                    break;
            }
        }else{
            connectionType = "inheritance";
        }

        String xLabel = "",tailLabel = "";
        if(_context.edge_labels() != null){
            if(_context.edge_labels().xlabel() != null){
                 xLabel = _context.edge_labels().xlabel().getText();
            }
            if(_context.edge_labels().taillabel() != null){
                tailLabel = _context.edge_labels().taillabel().multiplicity().getText();
            }
        }
        ConnectionSymbol connectionSymbol = new ConnectionSymbol(source,connectionType,target,"public",tailLabel,xLabel);
        typeSystem.add(source+""+target,connectionSymbol);
        return null;
    }
}
