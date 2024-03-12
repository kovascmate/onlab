// Generated from C:/Users/kmate/IdeaProjects/Onlab/src/Nyelvtan.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NyelvtanParser}.
 */
public interface NyelvtanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NyelvtanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NyelvtanParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(NyelvtanParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(NyelvtanParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(NyelvtanParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(NyelvtanParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#package_def}.
	 * @param ctx the parse tree
	 */
	void enterPackage_def(NyelvtanParser.Package_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#package_def}.
	 * @param ctx the parse tree
	 */
	void exitPackage_def(NyelvtanParser.Package_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#import_def}.
	 * @param ctx the parse tree
	 */
	void enterImport_def(NyelvtanParser.Import_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#import_def}.
	 * @param ctx the parse tree
	 */
	void exitImport_def(NyelvtanParser.Import_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(NyelvtanParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(NyelvtanParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(NyelvtanParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(NyelvtanParser.Class_defContext ctx);
}