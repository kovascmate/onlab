package dotFactory;

import TypeSystem.TypeSystem;
import generated.DotGrammar.DotGrammarParser;

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
        String node_body = node_bodyContext.getText();
        System.out.println(node_name + " " + node_body);
        return null;
    }

    public Object visitEdge(DotGrammarParser.EdgeContext _context){

        return null;
    }
}
