// Generated from C:/Users/kmate/Desktop/6. felev/Onlab/onlab/src/ClassDiagram.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ClassDiagramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, WHITESPACE=26, NEWLINE=27, VISIBILITY=28, NUMBERS=29, CLASS_NAME=30, 
		IDENTIFIER=31, QualifiedImportName=32;
	public static final int
		RULE_program = 0, RULE_imports = 1, RULE_class = 2, RULE_variables = 3, 
		RULE_functions = 4, RULE_enumerations = 5, RULE_package_def = 6, RULE_import_def = 7, 
		RULE_parameter_list = 8, RULE_variable = 9, RULE_class_def = 10, RULE_function = 11, 
		RULE_string_variable = 12, RULE_int_variable = 13, RULE_boolean_variable = 14, 
		RULE_variable_name = 15, RULE_return_state = 16, RULE_connections = 17, 
		RULE_enumeration = 18, RULE_enum_constants = 19, RULE_aggregation = 20, 
		RULE_association = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "imports", "class", "variables", "functions", "enumerations", 
			"package_def", "import_def", "parameter_list", "variable", "class_def", 
			"function", "string_variable", "int_variable", "boolean_variable", "variable_name", 
			"return_state", "connections", "enumeration", "enum_constants", "aggregation", 
			"association"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'package'", "';'", "'import'", "'class'", "'extends'", 
			"'implements'", "','", "'('", "')'", "'void'", "'string'", "'='", "'\"'", 
			"'int'", "'boolean'", "'true'", "'false'", "'double'", "'return'", "'enum'", 
			"'aggregation'", "':'", "'association'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WHITESPACE", "NEWLINE", "VISIBILITY", "NUMBERS", "CLASS_NAME", 
			"IDENTIFIER", "QualifiedImportName"
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
	public String getGrammarFileName() { return "ClassDiagram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassDiagramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public Package_defContext package_def() {
			return getRuleContext(Package_defContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(44);
				package_def();
				}
			}

			setState(47);
			imports();
			setState(48);
			class_();
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
	public static class ImportsContext extends ParserRuleContext {
		public List<Import_defContext> import_def() {
			return getRuleContexts(Import_defContext.class);
		}
		public Import_defContext import_def(int i) {
			return getRuleContext(Import_defContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(50);
				import_def();
				}
				}
				setState(55);
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
	public static class ClassContext extends ParserRuleContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public EnumerationsContext enumerations() {
			return getRuleContext(EnumerationsContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			class_def();
			setState(57);
			match(T__0);
			setState(58);
			variables();
			setState(59);
			functions();
			setState(60);
			connections();
			setState(61);
			enumerations();
			setState(62);
			match(T__1);
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
	public static class VariablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					variable();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					function();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class EnumerationsContext extends ParserRuleContext {
		public List<EnumerationContext> enumeration() {
			return getRuleContexts(EnumerationContext.class);
		}
		public EnumerationContext enumeration(int i) {
			return getRuleContext(EnumerationContext.class,i);
		}
		public EnumerationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterEnumerations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitEnumerations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitEnumerations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationsContext enumerations() throws RecognitionException {
		EnumerationsContext _localctx = new EnumerationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enumerations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(76);
				enumeration();
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
	public static class Package_defContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public Package_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterPackage_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitPackage_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitPackage_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_defContext package_def() throws RecognitionException {
		Package_defContext _localctx = new Package_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_package_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__2);
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
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
	public static class Import_defContext extends ParserRuleContext {
		public TerminalNode QualifiedImportName() { return getToken(ClassDiagramParser.QualifiedImportName, 0); }
		public Import_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterImport_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitImport_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitImport_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_defContext import_def() throws RecognitionException {
		Import_defContext _localctx = new Import_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__4);
			setState(87);
			match(QualifiedImportName);
			setState(88);
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
	public static class Parameter_listContext extends ParserRuleContext {
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ClassDiagramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ClassDiagramParser.IDENTIFIER, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1253376L) != 0)) {
				{
				{
				setState(90);
				variable_name();
				setState(91);
				match(IDENTIFIER);
				}
				}
				setState(97);
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
	public static class VariableContext extends ParserRuleContext {
		public String_variableContext string_variable() {
			return getRuleContext(String_variableContext.class,0);
		}
		public Int_variableContext int_variable() {
			return getRuleContext(Int_variableContext.class,0);
		}
		public Boolean_variableContext boolean_variable() {
			return getRuleContext(Boolean_variableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(98);
				string_variable();
				}
				break;
			case 2:
				{
				setState(99);
				int_variable();
				}
				break;
			case 3:
				{
				setState(100);
				boolean_variable();
				}
				break;
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
	public static class Class_defContext extends ParserRuleContext {
		public List<TerminalNode> CLASS_NAME() { return getTokens(ClassDiagramParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(ClassDiagramParser.CLASS_NAME, i);
		}
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(103);
				match(VISIBILITY);
				}
			}

			setState(106);
			match(T__5);
			setState(107);
			match(CLASS_NAME);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(108);
				match(T__6);
				setState(109);
				match(CLASS_NAME);
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(112);
				match(T__7);
				setState(113);
				match(CLASS_NAME);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(114);
					match(T__8);
					setState(115);
					match(CLASS_NAME);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class FunctionContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ClassDiagramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ClassDiagramParser.IDENTIFIER, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public Return_stateContext return_state() {
			return getRuleContext(Return_stateContext.class,0);
		}
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
			case T__16:
			case T__19:
			case VISIBILITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VISIBILITY) {
					{
					setState(123);
					match(VISIBILITY);
					}
				}

				{
				setState(126);
				variable_name();
				setState(127);
				match(IDENTIFIER);
				setState(128);
				match(T__9);
				setState(129);
				parameter_list();
				setState(130);
				match(T__10);
				setState(131);
				match(T__0);
				setState(132);
				variables();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(133);
					match(IDENTIFIER);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				return_state();
				setState(140);
				match(T__1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(142);
				match(T__11);
				setState(143);
				match(IDENTIFIER);
				setState(144);
				match(T__9);
				setState(145);
				parameter_list();
				setState(146);
				match(T__10);
				setState(147);
				match(T__0);
				setState(148);
				variables();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(149);
					match(IDENTIFIER);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__1);
				}
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
	public static class String_variableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ClassDiagramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ClassDiagramParser.IDENTIFIER, i);
		}
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public String_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterString_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitString_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitString_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_variableContext string_variable() throws RecognitionException {
		String_variableContext _localctx = new String_variableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(159);
				match(VISIBILITY);
				}
			}

			setState(162);
			match(T__12);
			setState(163);
			match(IDENTIFIER);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(164);
				match(T__13);
				setState(165);
				match(T__14);
				setState(166);
				match(IDENTIFIER);
				setState(167);
				match(T__14);
				}
			}

			setState(170);
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
	public static class Int_variableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public TerminalNode NUMBERS() { return getToken(ClassDiagramParser.NUMBERS, 0); }
		public Int_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterInt_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitInt_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitInt_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_variableContext int_variable() throws RecognitionException {
		Int_variableContext _localctx = new Int_variableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(172);
				match(VISIBILITY);
				}
			}

			setState(175);
			match(T__15);
			setState(176);
			match(IDENTIFIER);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(177);
				match(T__13);
				setState(178);
				match(NUMBERS);
				}
			}

			setState(181);
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
	public static class Boolean_variableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public Boolean_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterBoolean_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitBoolean_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitBoolean_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_variableContext boolean_variable() throws RecognitionException {
		Boolean_variableContext _localctx = new Boolean_variableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolean_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(183);
				match(VISIBILITY);
				}
			}

			setState(186);
			match(T__16);
			setState(187);
			match(IDENTIFIER);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(188);
				match(T__13);
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(192);
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
	public static class Variable_nameContext extends ParserRuleContext {
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1253376L) != 0)) ) {
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
	public static class Return_stateContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(ClassDiagramParser.NUMBERS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public Return_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterReturn_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitReturn_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitReturn_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stateContext return_state() throws RecognitionException {
		Return_stateContext _localctx = new Return_stateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__20);
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==NUMBERS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
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
	public static class ConnectionsContext extends ParserRuleContext {
		public List<AggregationContext> aggregation() {
			return getRuleContexts(AggregationContext.class);
		}
		public AggregationContext aggregation(int i) {
			return getRuleContext(AggregationContext.class,i);
		}
		public List<AssociationContext> association() {
			return getRuleContexts(AssociationContext.class);
		}
		public AssociationContext association(int i) {
			return getRuleContext(AssociationContext.class,i);
		}
		public ConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitConnections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitConnections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionsContext connections() throws RecognitionException {
		ConnectionsContext _localctx = new ConnectionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_connections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 310378496L) != 0)) {
				{
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(200);
					aggregation();
					}
					break;
				case 2:
					{
					setState(201);
					association();
					}
					break;
				}
				}
				setState(206);
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
	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public Enum_constantsContext enum_constants() {
			return getRuleContext(Enum_constantsContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__21);
			setState(208);
			match(CLASS_NAME);
			setState(209);
			match(T__0);
			setState(210);
			enum_constants();
			setState(211);
			match(T__1);
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
	public static class Enum_constantsContext extends ParserRuleContext {
		public List<TerminalNode> CLASS_NAME() { return getTokens(ClassDiagramParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(ClassDiagramParser.CLASS_NAME, i);
		}
		public Enum_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterEnum_constants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitEnum_constants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitEnum_constants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_constantsContext enum_constants() throws RecognitionException {
		Enum_constantsContext _localctx = new Enum_constantsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enum_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(CLASS_NAME);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(214);
				match(T__8);
				setState(215);
				match(CLASS_NAME);
				}
				}
				setState(220);
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
	public static class AggregationContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(221);
				match(VISIBILITY);
				}
			}

			setState(224);
			match(T__22);
			setState(225);
			match(CLASS_NAME);
			setState(226);
			match(T__23);
			setState(227);
			match(IDENTIFIER);
			setState(228);
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
	public static class AssociationContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public AssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationContext association() throws RecognitionException {
		AssociationContext _localctx = new AssociationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_association);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(230);
				match(VISIBILITY);
				}
			}

			setState(233);
			match(T__24);
			setState(234);
			match(CLASS_NAME);
			setState(235);
			match(T__23);
			setState(236);
			match(IDENTIFIER);
			setState(237);
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

	public static final String _serializedATN =
		"\u0004\u0001 \u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t\u0003"+
		"\u0001\u0004\u0005\u0004H\b\u0004\n\u0004\f\u0004K\t\u0004\u0001\u0005"+
		"\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b^\b\b\n\b\f\ba\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\tf\b\t\u0001\n\u0003\ni\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\no\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nu\b\n\n\n\f\nx\t\n\u0003"+
		"\nz\b\n\u0001\u000b\u0003\u000b}\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0087\b\u000b\n\u000b\f\u000b\u008a\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0097\b\u000b\n\u000b"+
		"\f\u000b\u009a\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009e\b\u000b"+
		"\u0001\f\u0003\f\u00a1\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00a9\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u00ae\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0003\u000e\u00b9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00bf\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00cb\b\u0011\n\u0011\f\u0011\u00ce\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00d9\b\u0013\n\u0013\f\u0013\u00dc\t\u0013"+
		"\u0001\u0014\u0003\u0014\u00df\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u00e8\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0004\u0001\u0000"+
		"\u001e\u001f\u0001\u0000\u0012\u0013\u0003\u0000\r\r\u0010\u0011\u0014"+
		"\u0014\u0002\u0000\u001d\u001d\u001f\u001f\u00f4\u0000-\u0001\u0000\u0000"+
		"\u0000\u00025\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006"+
		"C\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000"+
		"\u0000\fR\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010"+
		"_\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014h\u0001"+
		"\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000\u0000\u0018\u00a0\u0001"+
		"\u0000\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00b8\u0001"+
		"\u0000\u0000\u0000\u001e\u00c2\u0001\u0000\u0000\u0000 \u00c4\u0001\u0000"+
		"\u0000\u0000\"\u00cc\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000"+
		"\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00de\u0001\u0000\u0000\u0000*"+
		"\u00e7\u0001\u0000\u0000\u0000,.\u0003\f\u0006\u0000-,\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0003\u0002"+
		"\u0001\u000001\u0003\u0004\u0002\u00001\u0001\u0001\u0000\u0000\u0000"+
		"24\u0003\u000e\u0007\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0003\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0003\u0014\n\u00009:\u0005"+
		"\u0001\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0003\b\u0004\u0000<=\u0003"+
		"\"\u0011\u0000=>\u0003\n\u0005\u0000>?\u0005\u0002\u0000\u0000?\u0005"+
		"\u0001\u0000\u0000\u0000@B\u0003\u0012\t\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0007\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0003"+
		"\u0016\u000b\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LN\u0003$\u0012\u0000ML\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0003\u0000\u0000ST\u0007\u0000\u0000\u0000TU\u0005\u0004\u0000"+
		"\u0000U\r\u0001\u0000\u0000\u0000VW\u0005\u0005\u0000\u0000WX\u0005 \u0000"+
		"\u0000XY\u0005\u0004\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z[\u0003"+
		"\u001e\u000f\u0000[\\\u0005\u001f\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"]Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`\u0011\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bf\u0003\u0018\f\u0000cf\u0003\u001a\r\u0000df\u0003"+
		"\u001c\u000e\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000gi\u0005\u001c"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000kn\u0005\u001e\u0000\u0000"+
		"lm\u0005\u0007\u0000\u0000mo\u0005\u001e\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000oy\u0001\u0000\u0000\u0000pq\u0005\b\u0000"+
		"\u0000qv\u0005\u001e\u0000\u0000rs\u0005\t\u0000\u0000su\u0005\u001e\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\u0015\u0001\u0000\u0000\u0000{}\u0005\u001c\u0000\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0003\u001e\u000f\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0081"+
		"\u0005\n\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083\u0005"+
		"\u000b\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0088\u0003"+
		"\u0006\u0003\u0000\u0085\u0087\u0005\u001f\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0003"+
		" \u0010\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u009e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\f\u0000\u0000\u008f\u0090\u0005\u001f\u0000"+
		"\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0003\u0010\b\u0000"+
		"\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u0094\u0005\u0001\u0000\u0000"+
		"\u0094\u0098\u0003\u0006\u0003\u0000\u0095\u0097\u0005\u001f\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0002\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d|\u0001\u0000\u0000\u0000\u009d\u008e\u0001\u0000\u0000\u0000\u009e"+
		"\u0017\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\u001c\u0000\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\r\u0000\u0000\u00a3\u00a8"+
		"\u0005\u001f\u0000\u0000\u00a4\u00a5\u0005\u000e\u0000\u0000\u00a5\u00a6"+
		"\u0005\u000f\u0000\u0000\u00a6\u00a7\u0005\u001f\u0000\u0000\u00a7\u00a9"+
		"\u0005\u000f\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0004\u0000\u0000\u00ab\u0019\u0001\u0000\u0000\u0000\u00ac\u00ae"+
		"\u0005\u001c\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0010\u0000\u0000\u00b0\u00b3\u0005\u001f\u0000\u0000\u00b1\u00b2"+
		"\u0005\u000e\u0000\u0000\u00b2\u00b4\u0005\u001d\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u001b"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u001c\u0000\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000\u00bb\u00be"+
		"\u0005\u001f\u0000\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u00bf"+
		"\u0007\u0001\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0004\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0007\u0002\u0000\u0000\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0015\u0000\u0000\u00c5\u00c6\u0007\u0003\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0004\u0000\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00cb\u0003"+
		"(\u0014\u0000\u00c9\u00cb\u0003*\u0015\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd#\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0001\u0000\u0000\u00d2\u00d3\u0003&\u0013\u0000\u00d3"+
		"\u00d4\u0005\u0002\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00da"+
		"\u0005\u001e\u0000\u0000\u00d6\u00d7\u0005\t\u0000\u0000\u00d7\u00d9\u0005"+
		"\u001e\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\'\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0005\u001c\u0000\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0017\u0000\u0000\u00e1\u00e2\u0005\u001e"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0018\u0000\u0000\u00e3\u00e4\u0005\u001f"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0004\u0000\u0000\u00e5)\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0005\u001c\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea\u00eb\u0005\u001e\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0018\u0000\u0000\u00ec\u00ed\u0005\u001f\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee+\u0001\u0000\u0000\u0000"+
		"\u001a-5CIO_ehnvy|\u0088\u0098\u009d\u00a0\u00a8\u00ad\u00b3\u00b8\u00be"+
		"\u00ca\u00cc\u00da\u00de\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}