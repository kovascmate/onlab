package Main;

import TypeSystem.TypeSystem;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagramParser;
import visualizer.Translator;

import javax.swing.*;
import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        Translator t = new Translator();
        TypeSystem typeSystem = new TypeSystem();
        ClassDiagramExceptionHandler exceptionHandler = new ClassDiagramExceptionHandler();
        ClassDiagramVisitor visitor = new ClassDiagramVisitor(exceptionHandler,typeSystem);
        ClassDiagramSemanticAnalyzer semanticAnalyzer = new ClassDiagramSemanticAnalyzer(typeSystem,exceptionHandler);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ClassDiagramParser.ProgramContext context = Functions4use.ReadAST(selectedFile);

            visitor.visitProgram(context);
            semanticAnalyzer.SemanticAnalyze();
            t.fillVizObjects(typeSystem.getHashMap());
            t.fillString();
            int asd = 2;
        } else {
            System.out.println("Nincs fájl kiválasztva.");
        }
    }


    public void Visitor(ClassDiagramParser.ProgramContext _context){

    }
}