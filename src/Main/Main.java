package Main;

import TypeSystem.TypeSystem;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagramParser;
import visualizer.Translator;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
        //  Instantiation of the Translator class, which convert the symboltable into graphViz format code
        Translator translator = new Translator();


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
            translator.fillVizObjects(typeSystem.getHashMap());
            translator.fillString();
        } else {
            System.out.println("Nincs fájl kiválasztva.");
        }
        doTheMagic();
    }

    public static void doTheMagic() throws IOException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "dot -Tsvg graph_viz.dot > output.svg && output.svg");
        Process p = builder.start();
    }
}