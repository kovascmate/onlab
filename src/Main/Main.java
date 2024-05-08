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
       // doTheMagic();
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
       // Process process = Runtime.getRuntime().exec("dot -Tsvg graph_viz.dot > output.svg");
        doTheMagic();
    }


    public void Visitor(ClassDiagramParser.ProgramContext _context) throws IOException {

       // Process process = Runtime.getRuntime().exec("dot -Tsvg graph_viz.dot > output.svg");

    }
    public static void doTheMagic() throws IOException {
        String path = Functions4use.readFile(new File("folder_path.txt"));
//        System.out.println(path);
//        ProcessBuilder processBuilder = new ProcessBuilder();
     //   processBuilder.directory(new File(path));
//        processBuilder.command("dot -Tsvg "+path+"\\graph_viz.dot >"+path+"\\output.svg");
//        Process process = Runtime.getRuntime().exec("dot -Tsvg "+path+"\\graph_viz.dot >"+path+"\\output.svg");
//        Process process = Runtime.getRuntime().exec("cmd.exe");
//        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
//        Process process = processBuilder.start();
        //Process process = Runtime.getRuntime().exec("cd " + path +"\n"+"dot -Tsvg graph_viz.dot > output.svg");



        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "dot -Tsvg graph_viz.dot > output.svg && output.svg");
//                "cd \"C:\\Users\\kmate\\Desktop\\6. felev\\Onlab\\onlab\" && ");

        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }

    }
}