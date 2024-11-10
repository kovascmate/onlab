// Generated from C:/Users/kmate/Documents/�nlab/onlab/src/ANTLR/DotGrammar.g4 by ANTLR 4.13.2
package generated.DotGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DotGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, WHITESPACE=29, NEWLINE=30, INTERFACE_NAME=31, 
		HEADER=32, ARROWHEAD_TYPE=33, CLASS_NAME=34, IDENTIFIER=35, NUMBERS=36, 
		STYLE_TYPE=37, VISIBILITY_ICON=38;
	public static final int
		RULE_diagram = 0, RULE_nodes = 1, RULE_edges = 2, RULE_node = 3, RULE_node_title = 4, 
		RULE_node_body = 5, RULE_dot_functions = 6, RULE_dot_variables = 7, RULE_dot_variable = 8, 
		RULE_edge = 9, RULE_edge_attributes = 10, RULE_edge_labels = 11, RULE_dot_function = 12, 
		RULE_arrow_head = 13, RULE_style = 14, RULE_xlabel = 15, RULE_taillabel = 16, 
		RULE_variable_type = 17, RULE_multiplicity = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"diagram", "nodes", "edges", "node", "node_title", "node_body", "dot_functions", 
			"dot_variables", "dot_variable", "edge", "edge_attributes", "edge_labels", 
			"dot_function", "arrow_head", "style", "xlabel", "taillabel", "variable_type", 
			"multiplicity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'digraph '", "'{'", "'[ label = \"{'", "' }\"]'", "'|'", "':'", 
			"'\\n'", "'edge'", "'['", "']'", "'->'", "'('", "')'", "'void'", "'\\n'", 
			"'arrowhead = '", "'style = '", "'style='", "'xlabel=\"'", "'\"'", "'taillabel=\"'", 
			"'int'", "'boolean'", "'string'", "'double'", "'date'", "'..'", "'*'", 
			null, null, null, "'node [ shape = \"record\"] edge [ arrowhead = \"empty\"]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WHITESPACE", "NEWLINE", "INTERFACE_NAME", 
			"HEADER", "ARROWHEAD_TYPE", "CLASS_NAME", "IDENTIFIER", "NUMBERS", "STYLE_TYPE", 
			"VISIBILITY_ICON"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DotGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DotGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiagramContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(DotGrammarParser.CLASS_NAME, 0); }
		public TerminalNode HEADER() { return getToken(DotGrammarParser.HEADER, 0); }
		public NodesContext nodes() {
			return getRuleContext(NodesContext.class,0);
		}
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public DiagramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterDiagram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitDiagram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitDiagram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagramContext diagram() throws RecognitionException {
		DiagramContext _localctx = new DiagramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_diagram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(CLASS_NAME);
			setState(40);
			match(T__1);
			setState(41);
			match(HEADER);
			setState(42);
			nodes();
			setState(43);
			edges();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodesContext extends ParserRuleContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public NodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodesContext nodes() throws RecognitionException {
		NodesContext _localctx = new NodesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_NAME) {
				{
				{
				setState(45);
				node();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgesContext extends ParserRuleContext {
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public EdgesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterEdges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitEdges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitEdges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgesContext edges() throws RecognitionException {
		EdgesContext _localctx = new EdgesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(51);
				edge();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public Node_titleContext node_title() {
			return getRuleContext(Node_titleContext.class,0);
		}
		public Node_bodyContext node_body() {
			return getRuleContext(Node_bodyContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			node_title();
			setState(58);
			match(T__2);
			setState(59);
			node_body();
			setState(60);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Node_titleContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(DotGrammarParser.CLASS_NAME, 0); }
		public Node_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterNode_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitNode_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitNode_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_titleContext node_title() throws RecognitionException {
		Node_titleContext _localctx = new Node_titleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CLASS_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Node_bodyContext extends ParserRuleContext {
		public Dot_variablesContext dot_variables() {
			return getRuleContext(Dot_variablesContext.class,0);
		}
		public Dot_functionsContext dot_functions() {
			return getRuleContext(Dot_functionsContext.class,0);
		}
		public TerminalNode INTERFACE_NAME() { return getToken(DotGrammarParser.INTERFACE_NAME, 0); }
		public TerminalNode CLASS_NAME() { return getToken(DotGrammarParser.CLASS_NAME, 0); }
		public Node_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterNode_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitNode_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitNode_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_bodyContext node_body() throws RecognitionException {
		Node_bodyContext _localctx = new Node_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_node_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==INTERFACE_NAME || _la==CLASS_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(T__4);
			setState(66);
			dot_variables();
			setState(67);
			match(T__4);
			setState(68);
			dot_functions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_functionsContext extends ParserRuleContext {
		public List<Dot_functionContext> dot_function() {
			return getRuleContexts(Dot_functionContext.class);
		}
		public Dot_functionContext dot_function(int i) {
			return getRuleContext(Dot_functionContext.class,i);
		}
		public Dot_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterDot_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitDot_functions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitDot_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_functionsContext dot_functions() throws RecognitionException {
		Dot_functionsContext _localctx = new Dot_functionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dot_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VISIBILITY_ICON) {
				{
				{
				setState(70);
				dot_function();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_variablesContext extends ParserRuleContext {
		public List<Dot_variableContext> dot_variable() {
			return getRuleContexts(Dot_variableContext.class);
		}
		public Dot_variableContext dot_variable(int i) {
			return getRuleContext(Dot_variableContext.class,i);
		}
		public Dot_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterDot_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitDot_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitDot_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_variablesContext dot_variables() throws RecognitionException {
		Dot_variablesContext _localctx = new Dot_variablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dot_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VISIBILITY_ICON) {
				{
				{
				setState(76);
				dot_variable();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_variableContext extends ParserRuleContext {
		public TerminalNode VISIBILITY_ICON() { return getToken(DotGrammarParser.VISIBILITY_ICON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DotGrammarParser.IDENTIFIER, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Dot_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterDot_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitDot_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitDot_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_variableContext dot_variable() throws RecognitionException {
		Dot_variableContext _localctx = new Dot_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dot_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VISIBILITY_ICON);
			setState(83);
			match(IDENTIFIER);
			setState(84);
			match(T__5);
			setState(85);
			variable_type();
			setState(86);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeContext extends ParserRuleContext {
		public Edge_attributesContext edge_attributes() {
			return getRuleContext(Edge_attributesContext.class,0);
		}
		public List<TerminalNode> CLASS_NAME() { return getTokens(DotGrammarParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(DotGrammarParser.CLASS_NAME, i);
		}
		public Edge_labelsContext edge_labels() {
			return getRuleContext(Edge_labelsContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__7);
			setState(89);
			match(T__8);
			setState(90);
			edge_attributes();
			setState(91);
			match(T__9);
			setState(92);
			match(CLASS_NAME);
			setState(93);
			match(T__10);
			setState(94);
			match(CLASS_NAME);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(95);
				edge_labels();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_attributesContext extends ParserRuleContext {
		public List<Arrow_headContext> arrow_head() {
			return getRuleContexts(Arrow_headContext.class);
		}
		public Arrow_headContext arrow_head(int i) {
			return getRuleContext(Arrow_headContext.class,i);
		}
		public List<StyleContext> style() {
			return getRuleContexts(StyleContext.class);
		}
		public StyleContext style(int i) {
			return getRuleContext(StyleContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(DotGrammarParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(DotGrammarParser.WHITESPACE, i);
		}
		public Edge_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterEdge_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitEdge_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitEdge_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_attributesContext edge_attributes() throws RecognitionException {
		Edge_attributesContext _localctx = new Edge_attributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_edge_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537329664L) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(98);
					arrow_head();
					}
					break;
				case T__16:
				case T__17:
					{
					setState(99);
					style();
					}
					break;
				case WHITESPACE:
					{
					setState(100);
					match(WHITESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_labelsContext extends ParserRuleContext {
		public XlabelContext xlabel() {
			return getRuleContext(XlabelContext.class,0);
		}
		public TaillabelContext taillabel() {
			return getRuleContext(TaillabelContext.class,0);
		}
		public Edge_labelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterEdge_labels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitEdge_labels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitEdge_labels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_labelsContext edge_labels() throws RecognitionException {
		Edge_labelsContext _localctx = new Edge_labelsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_edge_labels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(107);
				xlabel();
				}
				break;
			case T__20:
				{
				setState(108);
				taillabel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_functionContext extends ParserRuleContext {
		public TerminalNode VISIBILITY_ICON() { return getToken(DotGrammarParser.VISIBILITY_ICON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DotGrammarParser.IDENTIFIER, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Dot_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterDot_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitDot_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitDot_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_functionContext dot_function() throws RecognitionException {
		Dot_functionContext _localctx = new Dot_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dot_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(VISIBILITY_ICON);
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(T__11);
			setState(116);
			match(T__12);
			setState(117);
			match(T__5);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(118);
				match(T__13);
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				{
				setState(119);
				variable_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arrow_headContext extends ParserRuleContext {
		public TerminalNode ARROWHEAD_TYPE() { return getToken(DotGrammarParser.ARROWHEAD_TYPE, 0); }
		public Arrow_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterArrow_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitArrow_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitArrow_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_headContext arrow_head() throws RecognitionException {
		Arrow_headContext _localctx = new Arrow_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrow_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__15);
			setState(125);
			match(ARROWHEAD_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_TYPE() { return getToken(DotGrammarParser.STYLE_TYPE, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_style);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__16);
				setState(128);
				match(STYLE_TYPE);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__17);
				setState(130);
				match(STYLE_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XlabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DotGrammarParser.IDENTIFIER, 0); }
		public XlabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xlabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterXlabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitXlabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitXlabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XlabelContext xlabel() throws RecognitionException {
		XlabelContext _localctx = new XlabelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_xlabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__18);
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TaillabelContext extends ParserRuleContext {
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public TaillabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taillabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterTaillabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitTaillabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitTaillabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaillabelContext taillabel() throws RecognitionException {
		TaillabelContext _localctx = new TaillabelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_taillabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__20);
			setState(138);
			multiplicity();
			setState(139);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_typeContext extends ParserRuleContext {
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitVariable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130023424L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicityContext extends ParserRuleContext {
		public List<TerminalNode> NUMBERS() { return getTokens(DotGrammarParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(DotGrammarParser.NUMBERS, i);
		}
		public MultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).enterMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotGrammarListener ) ((DotGrammarListener)listener).exitMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotGrammarVisitor ) return ((DotGrammarVisitor<? extends T>)visitor).visitMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicityContext multiplicity() throws RecognitionException {
		MultiplicityContext _localctx = new MultiplicityContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicity);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__8);
				setState(144);
				match(NUMBERS);
				setState(145);
				match(T__26);
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==NUMBERS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__8);
				setState(149);
				match(NUMBERS);
				setState(150);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001"+
		"\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0005\u0006H\b\u0006\n\u0006\f\u0006K\t\u0006\u0001\u0007"+
		"\u0005\u0007N\b\u0007\n\u0007\f\u0007Q\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\ta\b\t\u0001\n\u0001\n\u0001\n\u0005\nf\b\n\n"+
		"\n\f\ni\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bn\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\fy\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0084\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0098"+
		"\b\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0003\u0002"+
		"\u0000\u001f\u001f\"\"\u0001\u0000\u0016\u001a\u0002\u0000\u001c\u001c"+
		"$$\u0092\u0000&\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00046\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b>\u0001"+
		"\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fI\u0001\u0000\u0000\u0000"+
		"\u000eO\u0001\u0000\u0000\u0000\u0010R\u0001\u0000\u0000\u0000\u0012X"+
		"\u0001\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016j\u0001\u0000"+
		"\u0000\u0000\u0018q\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000"+
		"\u001c\u0083\u0001\u0000\u0000\u0000\u001e\u0085\u0001\u0000\u0000\u0000"+
		" \u0089\u0001\u0000\u0000\u0000\"\u008d\u0001\u0000\u0000\u0000$\u0097"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005\"\u0000\u0000"+
		"()\u0005\u0002\u0000\u0000)*\u0005 \u0000\u0000*+\u0003\u0002\u0001\u0000"+
		"+,\u0003\u0004\u0002\u0000,\u0001\u0001\u0000\u0000\u0000-/\u0003\u0006"+
		"\u0003\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000035\u0003\u0012\t\u000043\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u0005\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9:\u0003\b\u0004\u0000:;\u0005\u0003\u0000\u0000;<\u0003\n\u0005\u0000"+
		"<=\u0005\u0004\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\"\u0000"+
		"\u0000?\t\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000\u0000AB\u0005\u0005"+
		"\u0000\u0000BC\u0003\u000e\u0007\u0000CD\u0005\u0005\u0000\u0000DE\u0003"+
		"\f\u0006\u0000E\u000b\u0001\u0000\u0000\u0000FH\u0003\u0018\f\u0000GF"+
		"\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000J\r\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000f"+
		"\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005&\u0000\u0000"+
		"ST\u0005#\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0003\"\u0011\u0000"+
		"VW\u0005\u0007\u0000\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0005\b\u0000"+
		"\u0000YZ\u0005\t\u0000\u0000Z[\u0003\u0014\n\u0000[\\\u0005\n\u0000\u0000"+
		"\\]\u0005\"\u0000\u0000]^\u0005\u000b\u0000\u0000^`\u0005\"\u0000\u0000"+
		"_a\u0003\u0016\u000b\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\u0013\u0001\u0000\u0000\u0000bf\u0003\u001a\r\u0000cf\u0003\u001c"+
		"\u000e\u0000df\u0005\u001d\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0015\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0005\t\u0000\u0000kn\u0003\u001e"+
		"\u000f\u0000ln\u0003 \u0010\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\n\u0000\u0000p\u0017\u0001"+
		"\u0000\u0000\u0000qr\u0005&\u0000\u0000rs\u0005#\u0000\u0000st\u0005\f"+
		"\u0000\u0000tu\u0005\r\u0000\u0000ux\u0005\u0006\u0000\u0000vy\u0005\u000e"+
		"\u0000\u0000wy\u0003\"\u0011\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u000f\u0000\u0000{\u0019"+
		"\u0001\u0000\u0000\u0000|}\u0005\u0010\u0000\u0000}~\u0005!\u0000\u0000"+
		"~\u001b\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080"+
		"\u0084\u0005%\u0000\u0000\u0081\u0082\u0005\u0012\u0000\u0000\u0082\u0084"+
		"\u0005%\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u001d\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u0013\u0000\u0000\u0086\u0087\u0005#\u0000\u0000\u0087\u0088\u0005\u0014"+
		"\u0000\u0000\u0088\u001f\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0015"+
		"\u0000\u0000\u008a\u008b\u0003$\u0012\u0000\u008b\u008c\u0005\u0014\u0000"+
		"\u0000\u008c!\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0001\u0000\u0000"+
		"\u008e#\u0001\u0000\u0000\u0000\u008f\u0090\u0005\t\u0000\u0000\u0090"+
		"\u0091\u0005$\u0000\u0000\u0091\u0092\u0005\u001b\u0000\u0000\u0092\u0093"+
		"\u0007\u0002\u0000\u0000\u0093\u0098\u0005\n\u0000\u0000\u0094\u0095\u0005"+
		"\t\u0000\u0000\u0095\u0096\u0005$\u0000\u0000\u0096\u0098\u0005\n\u0000"+
		"\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0098%\u0001\u0000\u0000\u0000\u000b06IO`egmx\u0083\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}