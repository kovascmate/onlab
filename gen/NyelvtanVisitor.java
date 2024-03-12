// Generated from C:/Users/kmate/IdeaProjects/Onlab/src/Nyelvtan.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NyelvtanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NyelvtanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NyelvtanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(NyelvtanParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(NyelvtanParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#package_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def(NyelvtanParser.Package_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#import_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_def(NyelvtanParser.Import_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(NyelvtanParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(NyelvtanParser.Class_defContext ctx);
}