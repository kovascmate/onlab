import TypeSystem.TypeSystem;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagramBaseVisitor;
import symboltable.Symbol;

import javax.swing.*;
import java.util.List;

public class ClassDiagramSemanticAnalyzer extends ClassDiagramBaseVisitor<Object> {
    private final TypeSystem typeSystem;
    private final ClassDiagramExceptionHandler exceptionHandler;
      public ClassDiagramSemanticAnalyzer(TypeSystem _ts, ClassDiagramExceptionHandler _classDiagramExceptionHandler){
          typeSystem = _ts;
          exceptionHandler = _classDiagramExceptionHandler;
      }
      public Object SemanticAnalyze(){

          return  null;
      }
      public Object checkParentClassExsistence(){
          List<Symbol> list = typeSystem.getClasses();
          for(Symbol sym : list){
          }

          return null;
      }

}
