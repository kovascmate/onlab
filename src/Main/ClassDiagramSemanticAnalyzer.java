package Main;

import TypeSystem.TypeSystem;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagramBaseVisitor;
import symboltable.ClassSymbol;

import java.util.List;

public class ClassDiagramSemanticAnalyzer extends ClassDiagramBaseVisitor<Object> {
    private final TypeSystem typeSystem;
    private final ClassDiagramExceptionHandler exceptionHandler;
      public ClassDiagramSemanticAnalyzer(TypeSystem _ts, ClassDiagramExceptionHandler _classDiagramExceptionHandler){
          typeSystem = _ts;
          exceptionHandler = _classDiagramExceptionHandler;

      }
      public Object SemanticAnalyze() {
          checkParentClassExsistence();
          checkInterfaceExsistence();
          return  null;
      }
      public Object checkParentClassExsistence() {
          List<ClassSymbol> list = typeSystem.getClasses();
          for(ClassSymbol sym : list){
              String parentClass = sym.getParantClass();
              if(parentClass != null){
                  if(!typeSystem.containsKey(parentClass)){
                      String exception_title ="No parent class as :"+parentClass +" in the scope!";
                      try {
                          throw new Exception(exception_title);
                      } catch (Exception e) {
                          throw new RuntimeException(e);
                      }
                  }
              }
          }
          return null;
      }
    public Object checkInterfaceExsistence() {
        List<ClassSymbol> list = typeSystem.getClasses();
        for(ClassSymbol sym : list){
            String implementedInterface = sym.getInterface();
            if(implementedInterface != null){
                if(!typeSystem.containsKey(implementedInterface)){
                    String exception_title ="No interface as :"+implementedInterface +" in the scope!";
                    try {
                        throw new Exception(exception_title);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return null;
    }

}
