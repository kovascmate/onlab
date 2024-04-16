// Generated from C:/Users/kmate/Desktop/6. felev/Onlab/onlab/src/ClassDiagram.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClassDiagramParser}.
 */
public interface ClassDiagramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ClassDiagramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ClassDiagramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(ClassDiagramParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(ClassDiagramParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(ClassDiagramParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(ClassDiagramParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(ClassDiagramParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(ClassDiagramParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(ClassDiagramParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(ClassDiagramParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#enumerations}.
	 * @param ctx the parse tree
	 */
	void enterEnumerations(ClassDiagramParser.EnumerationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#enumerations}.
	 * @param ctx the parse tree
	 */
	void exitEnumerations(ClassDiagramParser.EnumerationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#package_def}.
	 * @param ctx the parse tree
	 */
	void enterPackage_def(ClassDiagramParser.Package_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#package_def}.
	 * @param ctx the parse tree
	 */
	void exitPackage_def(ClassDiagramParser.Package_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#import_def}.
	 * @param ctx the parse tree
	 */
	void enterImport_def(ClassDiagramParser.Import_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#import_def}.
	 * @param ctx the parse tree
	 */
	void exitImport_def(ClassDiagramParser.Import_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(ClassDiagramParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(ClassDiagramParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ClassDiagramParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ClassDiagramParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(ClassDiagramParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(ClassDiagramParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ClassDiagramParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ClassDiagramParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#string_variable}.
	 * @param ctx the parse tree
	 */
	void enterString_variable(ClassDiagramParser.String_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#string_variable}.
	 * @param ctx the parse tree
	 */
	void exitString_variable(ClassDiagramParser.String_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#int_variable}.
	 * @param ctx the parse tree
	 */
	void enterInt_variable(ClassDiagramParser.Int_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#int_variable}.
	 * @param ctx the parse tree
	 */
	void exitInt_variable(ClassDiagramParser.Int_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#boolean_variable}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_variable(ClassDiagramParser.Boolean_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#boolean_variable}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_variable(ClassDiagramParser.Boolean_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(ClassDiagramParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(ClassDiagramParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#return_state}.
	 * @param ctx the parse tree
	 */
	void enterReturn_state(ClassDiagramParser.Return_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#return_state}.
	 * @param ctx the parse tree
	 */
	void exitReturn_state(ClassDiagramParser.Return_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#connections}.
	 * @param ctx the parse tree
	 */
	void enterConnections(ClassDiagramParser.ConnectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#connections}.
	 * @param ctx the parse tree
	 */
	void exitConnections(ClassDiagramParser.ConnectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(ClassDiagramParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(ClassDiagramParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#enum_constants}.
	 * @param ctx the parse tree
	 */
	void enterEnum_constants(ClassDiagramParser.Enum_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#enum_constants}.
	 * @param ctx the parse tree
	 */
	void exitEnum_constants(ClassDiagramParser.Enum_constantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(ClassDiagramParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(ClassDiagramParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassDiagramParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(ClassDiagramParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassDiagramParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(ClassDiagramParser.AssociationContext ctx);
}