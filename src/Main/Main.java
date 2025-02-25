package Main;

import GUI.MainGUI;
import TypeSystem.TypeSystem;
import codegen.ClassDiagramCodeGenerator;
import dotFactory.DotVisitor;
import exceptition.ClassDiagramException;
import exceptition.ClassDiagramExceptionHandler;
import generated.ClassDiagram.ClassDiagramParser;
import visualizer.Translator;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class Main {
    public static ClassDiagramExceptionHandler exceptionHandler = null;
    public static MainGUI mainGUI = null;
    public  static ClassDiagramVisitor visitor = null;
    public static TypeSystem typeSystem = null;
    public static Translator translator = null;
    public static ClassDiagramSemanticAnalyzer semanticAnalyzer = null;
    private static final
    Path classDiagramSTPath = Paths.get("src", "codegen", "stringtemplate", "ClassDiagram.stg");
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        exceptionHandler = new ClassDiagramExceptionHandler();
        mainGUI = new MainGUI();
    }
    public static void loadFromSVG() throws IOException {
        File chosen = fileChoser();
        mainGUI.loadSVGDocument(chosen.toString());
    }

    public static void loadFromDot() throws Exception {
        File chosen = fileChoser();
        dot2svg(Path.of(chosen.getName()));
        TimeUnit.SECONDS.sleep(1);
        mainGUI.loadSVGDocument("output.svg");
    }
    public static void loadFromCode()throws Exception {
        code2typeSystem();
        typeSystem2dot();
        dot2svg(Path.of("graph_viz.dot"));
        mainGUI.refresh();
        TimeUnit.SECONDS.sleep(1);
        mainGUI.loadSVGDocument("output.svg");
    }
    public static void code2typeSystem(){
        typeSystem = TypeSystem.getInstance();
        mainGUI.setTypesystem(typeSystem);
        visitor = ClassDiagramVisitor.getInstance(exceptionHandler,typeSystem);
        semanticAnalyzer = new ClassDiagramSemanticAnalyzer(typeSystem,exceptionHandler);
        File selectedFile = fileChoser();
        ClassDiagramParser.ProgramContext context = Functions4use.ReadAST(selectedFile);
        visitor.visitProgram(context);
        semanticAnalyzer.SemanticAnalyze();

    }
    public static void dot2typeSystem() throws ClassDiagramException {
        typeSystem = TypeSystem.getInstance();
        DotVisitor dotVisitor = new DotVisitor(typeSystem);
        File selectedFile = fileChoser();
        dotVisitor.visitDiagram(Functions4use.ReadASTdot(selectedFile));
    }
    public static File fileChoser() {
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        throw new RuntimeException("Nincs fájl kiválasztva.");
    }

    public static void typeSystem2dot() throws ClassDiagramException {
        try {
            translator = Translator.getInstance();
            translator.fillVizObjects(typeSystem.getHashMap());
            translator.fillString();
        }catch (Exception e){
            throw new ClassDiagramException(0,0,e.getMessage());
        }
    }

    public static void dot2svg(Path filepath ) throws Exception {
       // ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "dot -Tsvg graph_viz.dot > output.svg && output.svg");
        System.out.println(filepath.toString());
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "dot -Tsvg "+filepath.toString()+" > output.svg ");
        Process p = builder.start();
    }
    public static void typeSystem2code() throws Exception {
        if(typeSystem == null){
            throw new Exception("TypeSystem is null");
        }
        ClassDiagramCodeGenerator ClassDiagram = new ClassDiagramCodeGenerator(typeSystem);
        ClassDiagram.visit();

    }
    public static void clear(){
        TypeSystem.resetInstance();
    }
}