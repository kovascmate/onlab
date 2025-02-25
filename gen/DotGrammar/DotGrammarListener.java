// Generated from C:/Users/kmate/Documents/Önlab/onlab/src/ANTLR/DotGrammar.g4 by ANTLR 4.13.2
package DotGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DotGrammarParser}.
 */
public interface DotGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#diagram}.
	 * @param ctx the parse tree
	 */
	void enterDiagram(DotGrammarParser.DiagramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#diagram}.
	 * @param ctx the parse tree
	 */
	void exitDiagram(DotGrammarParser.DiagramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#nodes}.
	 * @param ctx the parse tree
	 */
	void enterNodes(DotGrammarParser.NodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#nodes}.
	 * @param ctx the parse tree
	 */
	void exitNodes(DotGrammarParser.NodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#edges}.
	 * @param ctx the parse tree
	 */
	void enterEdges(DotGrammarParser.EdgesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#edges}.
	 * @param ctx the parse tree
	 */
	void exitEdges(DotGrammarParser.EdgesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(DotGrammarParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(DotGrammarParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#node_title}.
	 * @param ctx the parse tree
	 */
	void enterNode_title(DotGrammarParser.Node_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#node_title}.
	 * @param ctx the parse tree
	 */
	void exitNode_title(DotGrammarParser.Node_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#node_body}.
	 * @param ctx the parse tree
	 */
	void enterNode_body(DotGrammarParser.Node_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#node_body}.
	 * @param ctx the parse tree
	 */
	void exitNode_body(DotGrammarParser.Node_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(DotGrammarParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(DotGrammarParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#dot_functions}.
	 * @param ctx the parse tree
	 */
	void enterDot_functions(DotGrammarParser.Dot_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#dot_functions}.
	 * @param ctx the parse tree
	 */
	void exitDot_functions(DotGrammarParser.Dot_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#dot_variables}.
	 * @param ctx the parse tree
	 */
	void enterDot_variables(DotGrammarParser.Dot_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#dot_variables}.
	 * @param ctx the parse tree
	 */
	void exitDot_variables(DotGrammarParser.Dot_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#dot_variable}.
	 * @param ctx the parse tree
	 */
	void enterDot_variable(DotGrammarParser.Dot_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#dot_variable}.
	 * @param ctx the parse tree
	 */
	void exitDot_variable(DotGrammarParser.Dot_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(DotGrammarParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(DotGrammarParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#edge_attributes}.
	 * @param ctx the parse tree
	 */
	void enterEdge_attributes(DotGrammarParser.Edge_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#edge_attributes}.
	 * @param ctx the parse tree
	 */
	void exitEdge_attributes(DotGrammarParser.Edge_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#edge_labels}.
	 * @param ctx the parse tree
	 */
	void enterEdge_labels(DotGrammarParser.Edge_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#edge_labels}.
	 * @param ctx the parse tree
	 */
	void exitEdge_labels(DotGrammarParser.Edge_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#dot_function}.
	 * @param ctx the parse tree
	 */
	void enterDot_function(DotGrammarParser.Dot_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#dot_function}.
	 * @param ctx the parse tree
	 */
	void exitDot_function(DotGrammarParser.Dot_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#arrow_head}.
	 * @param ctx the parse tree
	 */
	void enterArrow_head(DotGrammarParser.Arrow_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#arrow_head}.
	 * @param ctx the parse tree
	 */
	void exitArrow_head(DotGrammarParser.Arrow_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(DotGrammarParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(DotGrammarParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#xlabel}.
	 * @param ctx the parse tree
	 */
	void enterXlabel(DotGrammarParser.XlabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#xlabel}.
	 * @param ctx the parse tree
	 */
	void exitXlabel(DotGrammarParser.XlabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#taillabel}.
	 * @param ctx the parse tree
	 */
	void enterTaillabel(DotGrammarParser.TaillabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#taillabel}.
	 * @param ctx the parse tree
	 */
	void exitTaillabel(DotGrammarParser.TaillabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(DotGrammarParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(DotGrammarParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DotGrammarParser#multiplicity}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicity(DotGrammarParser.MultiplicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotGrammarParser#multiplicity}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicity(DotGrammarParser.MultiplicityContext ctx);
}