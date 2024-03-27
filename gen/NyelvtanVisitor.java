// Generated from C:/Users/kmate/Desktop/Új mappa/onlab/src/Nyelvtan.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link NyelvtanParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(NyelvtanParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(NyelvtanParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#enumerations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerations(NyelvtanParser.EnumerationsContext ctx);
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
	 * Visit a parse tree produced by {@link NyelvtanParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(NyelvtanParser.Parameter_listContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(NyelvtanParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_variable(NyelvtanParser.String_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_variable(NyelvtanParser.Int_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#boolean_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_variable(NyelvtanParser.Boolean_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(NyelvtanParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#return_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_state(NyelvtanParser.Return_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnections(NyelvtanParser.ConnectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#enumeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(NyelvtanParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#enum_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_constants(NyelvtanParser.Enum_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(NyelvtanParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NyelvtanParser#association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation(NyelvtanParser.AssociationContext ctx);
}