// Generated from C:/Users/kmate/Desktop/6. felev/Onlab/onlab/src/ClassDiagram.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassDiagramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClassDiagramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ClassDiagramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(ClassDiagramParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(ClassDiagramParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(ClassDiagramParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#interface_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_def(ClassDiagramParser.Interface_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(ClassDiagramParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(ClassDiagramParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#enumerations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerations(ClassDiagramParser.EnumerationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#package_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def(ClassDiagramParser.Package_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#package_def_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def_name(ClassDiagramParser.Package_def_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#import_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_def(ClassDiagramParser.Import_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#import_def_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_def_name(ClassDiagramParser.Import_def_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(ClassDiagramParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(ClassDiagramParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ClassDiagramParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(ClassDiagramParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(ClassDiagramParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#extended_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_class_name(ClassDiagramParser.Extended_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#interface_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_name(ClassDiagramParser.Interface_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ClassDiagramParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(ClassDiagramParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_variable(ClassDiagramParser.String_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_variable(ClassDiagramParser.Int_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#boolean_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_variable(ClassDiagramParser.Boolean_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(ClassDiagramParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#return_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_state(ClassDiagramParser.Return_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnections(ClassDiagramParser.ConnectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#enumeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(ClassDiagramParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#enum_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_constants(ClassDiagramParser.Enum_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(ClassDiagramParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassDiagramParser#association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation(ClassDiagramParser.AssociationContext ctx);
}