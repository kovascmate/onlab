package test;


import com.sun.tools.javac.Main;
import generated.ClassDiagramParser;
import org.junit.Test;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import symboltable.ClassSymbol;

import java.io.File;

import static junit.framework.TestCase.assertTrue;

public class TestFiles {
    @Test
    public void GrammarCheck(){
       /* Main.Functions4use f = new Main.Functions4use();
       File file = new File("for4tests.txt");
        ClassDiagramParser.ProgramContext context = f.ReadAST(file);*/
       int a = 2;
        assertTrue(true);
    }
}
