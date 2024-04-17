import generated.ClassDiagramBaseVisitor;
import generated.ClassDiagramParser;
import org.antlr.v4.codegen.model.SrcOp;
import org.antlr.v4.runtime.tree.*;

public class ClassDiagramVisitor extends ClassDiagramBaseVisitor<Object> {
    private ClassDiagramParser.ProgramContext context;

    @Override
    public Object visitProgram(ClassDiagramParser.ProgramContext _context){
        visitChildren(_context);
        System.out.println("Program:");
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        for(int i = 0; i< ruleNode.getChildCount(); i++){
            var _node = ruleNode.getChild(i);
            String _text = _node.getText();
            System.out.println(_text);
        }
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
    public ClassDiagramVisitor(){
    }
    public ClassDiagramVisitor(ClassDiagramParser.ProgramContext _context){
        context = _context;
    }

    public void addContext(ClassDiagramParser.ProgramContext _context){
        context = _context;
    }
    public void asd(){
        for(int i = 0;i<context.getChildCount() ;i++){
            var configLineTree = context.getChild(i);
            if(configLineTree.getChildCount() == 1){

            }else{
                var nameTree = configLineTree.getChild(0);
                var valueTree = configLineTree.getChild(2);
                System.out.println("Name: "+nameTree.getText()+", Value: "+valueTree.getText());
            }
        }
    }


}
