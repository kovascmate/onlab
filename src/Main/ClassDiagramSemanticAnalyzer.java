package Main;

import TypeSystem.TypeSystem;
import exceptition.ClassDiagramException;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagram.ClassDiagramBaseVisitor;
import symboltable.ClassSymbol;
import symboltable.FunctionSymbol;
import symboltable.InterfaceSymbol;
import symboltable.VariableSymbol;

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
          checkOwnParentClass();
          checkInterfaceVariableExsistence();
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
                          throw new ClassDiagramException(0, 0, exception_title);
                      } catch (ClassDiagramException e) {
                          e.showErrorDialog();
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
                        throw new ClassDiagramException(0, 0, exception_title);
                    } catch (ClassDiagramException e) {
                        e.showErrorDialog();
                    }
                }
            }
        }
        return null;
    }
    public Object checkOwnParentClass(){
        List<ClassSymbol> list = typeSystem.getClasses();
        for(ClassSymbol sym : list){
            String parentClass = sym.getParantClass();
            if(parentClass != null){
                if(parentClass.equals(sym.getName())){
                    String exception_title = "The class is its own parent class: "+sym.getClass()+" !";
                    try {
                        throw new ClassDiagramException(0, 0, exception_title); // Adjust line and column as needed
                    } catch (ClassDiagramException e) {
                        e.showErrorDialog();
                    }
                }
            }
        }
        return null;
    }
    public Object checkInterfaceVariableExsistence(){
        List<InterfaceSymbol> list = typeSystem.getInterfaces();
        for(InterfaceSymbol sym : list){
            List<VariableSymbol> variables = sym.getVariableSymbols();
            if (!variables.isEmpty()){
                String exception_title = "Interface can't have any variable!";
                try {
                    throw new ClassDiagramException(0, 0, exception_title);
                } catch (ClassDiagramException e) {
                    e.showErrorDialog();
                }
            }
        }
        return null;
    }

}
