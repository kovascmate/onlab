package Main;

import generated.ClassDiagram.ClassDiagramLexer;
import generated.ClassDiagram.ClassDiagramParser;
import generated.DotGrammar.DotGrammarLexer;
import generated.DotGrammar.DotGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Functions4use {
    public Functions4use(){}
    public static ClassDiagramParser.ProgramContext ReadAST(File selectedFile){
        String fileContent = readFile(selectedFile);
        ANTLRInputStream inputStream = new ANTLRInputStream(fileContent);
        ClassDiagramLexer lexer = new ClassDiagramLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ClassDiagramParser parser      = new ClassDiagramParser(tokenStream);
        ClassDiagramParser.ProgramContext context     = parser.program();
        return  context;
    }
    public static DotGrammarParser.DiagramContext ReadASTdot(File selectedFile){
        String fileContent = readFile(selectedFile);
        ANTLRInputStream inputStream = new ANTLRInputStream(fileContent);
        DotGrammarLexer lexer = new DotGrammarLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DotGrammarParser parser     = new DotGrammarParser(tokenStream);
        DotGrammarParser.DiagramContext context = parser.diagram();
        return context;
    }
    public static String readFile(File file) {
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
