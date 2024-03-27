// Generated from C:/Users/kmate/Desktop/Új mappa/onlab/src/Nyelvtan.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link NyelvtanParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(NyelvtanParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(NyelvtanParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(NyelvtanParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(NyelvtanParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#enumerations}.
	 * @param ctx the parse tree
	 */
	void enterEnumerations(NyelvtanParser.EnumerationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#enumerations}.
	 * @param ctx the parse tree
	 */
	void exitEnumerations(NyelvtanParser.EnumerationsContext ctx);
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
	 * Enter a parse tree produced by {@link NyelvtanParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(NyelvtanParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(NyelvtanParser.Parameter_listContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(NyelvtanParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(NyelvtanParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#string_variable}.
	 * @param ctx the parse tree
	 */
	void enterString_variable(NyelvtanParser.String_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#string_variable}.
	 * @param ctx the parse tree
	 */
	void exitString_variable(NyelvtanParser.String_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#int_variable}.
	 * @param ctx the parse tree
	 */
	void enterInt_variable(NyelvtanParser.Int_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#int_variable}.
	 * @param ctx the parse tree
	 */
	void exitInt_variable(NyelvtanParser.Int_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#boolean_variable}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_variable(NyelvtanParser.Boolean_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#boolean_variable}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_variable(NyelvtanParser.Boolean_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(NyelvtanParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(NyelvtanParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#return_state}.
	 * @param ctx the parse tree
	 */
	void enterReturn_state(NyelvtanParser.Return_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#return_state}.
	 * @param ctx the parse tree
	 */
	void exitReturn_state(NyelvtanParser.Return_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#connections}.
	 * @param ctx the parse tree
	 */
	void enterConnections(NyelvtanParser.ConnectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#connections}.
	 * @param ctx the parse tree
	 */
	void exitConnections(NyelvtanParser.ConnectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(NyelvtanParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(NyelvtanParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#enum_constants}.
	 * @param ctx the parse tree
	 */
	void enterEnum_constants(NyelvtanParser.Enum_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#enum_constants}.
	 * @param ctx the parse tree
	 */
	void exitEnum_constants(NyelvtanParser.Enum_constantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(NyelvtanParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(NyelvtanParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NyelvtanParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(NyelvtanParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NyelvtanParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(NyelvtanParser.AssociationContext ctx);
}