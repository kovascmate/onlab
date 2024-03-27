import generated.ClassDiagramLexer;
import generated.ClassDiagramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String fileContent = readFile(selectedFile);
            ANTLRInputStream    inputStream = new ANTLRInputStream(fileContent);
            ClassDiagramLexer       lexer       = new ClassDiagramLexer(inputStream);
            CommonTokenStream   tokenStream = new CommonTokenStream(lexer);
            ClassDiagramParser      parser      = new ClassDiagramParser(tokenStream);
            ClassDiagramParser.ProgramContext context     = parser.program();
            //var ast = ReadAST(fileChooser.getSelectedFile());

        } else {
            System.out.println("Nincs fájl kiválasztva.");
        }
    }
    private static String readFile(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}