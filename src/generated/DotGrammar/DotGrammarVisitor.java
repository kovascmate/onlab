// Generated from C:/Users/kmate/Documents/�nlab/onlab/src/ANTLR/DotGrammar.g4 by ANTLR 4.13.2
package generated.DotGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DotGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DotGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#diagram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagram(DotGrammarParser.DiagramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#nodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodes(DotGrammarParser.NodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#edges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdges(DotGrammarParser.EdgesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(DotGrammarParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#node_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_title(DotGrammarParser.Node_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#node_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_body(DotGrammarParser.Node_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#dot_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_functions(DotGrammarParser.Dot_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#dot_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_variables(DotGrammarParser.Dot_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#dot_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_variable(DotGrammarParser.Dot_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(DotGrammarParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#edge_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_attributes(DotGrammarParser.Edge_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#edge_labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_labels(DotGrammarParser.Edge_labelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#dot_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_function(DotGrammarParser.Dot_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#arrow_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_head(DotGrammarParser.Arrow_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(DotGrammarParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#xlabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXlabel(DotGrammarParser.XlabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#taillabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaillabel(DotGrammarParser.TaillabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(DotGrammarParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotGrammarParser#multiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicity(DotGrammarParser.MultiplicityContext ctx);
}