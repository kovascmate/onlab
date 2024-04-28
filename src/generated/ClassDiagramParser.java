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
		T__24=25, T__25=26, WHITESPACE=27, NEWLINE=28, VISIBILITY=29, NUMBERS=30, 
		CLASS_NAME=31, IDENTIFIER=32, QualifiedImportName=33;
	public static final int
		RULE_program = 0, RULE_imports = 1, RULE_class = 2, RULE_interface = 3, 
		RULE_interface_def = 4, RULE_variables = 5, RULE_functions = 6, RULE_enumerations = 7, 
		RULE_package_def = 8, RULE_package_def_name = 9, RULE_import_def = 10, 
		RULE_import_def_name = 11, RULE_parameter_list = 12, RULE_parameter_name = 13, 
		RULE_variable = 14, RULE_class_def = 15, RULE_class_name = 16, RULE_extended_class_name = 17, 
		RULE_interface_name = 18, RULE_function = 19, RULE_function_name = 20, 
		RULE_string_variable = 21, RULE_int_variable = 22, RULE_boolean_variable = 23, 
		RULE_variable_name = 24, RULE_return_state = 25, RULE_connections = 26, 
		RULE_enumeration = 27, RULE_enum_constants = 28, RULE_aggregation = 29, 
		RULE_association = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "imports", "class", "interface", "interface_def", "variables", 
			"functions", "enumerations", "package_def", "package_def_name", "import_def", 
			"import_def_name", "parameter_list", "parameter_name", "variable", "class_def", 
			"class_name", "extended_class_name", "interface_name", "function", "function_name", 
			"string_variable", "int_variable", "boolean_variable", "variable_name", 
			"return_state", "connections", "enumeration", "enum_constants", "aggregation", 
			"association"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'implements'", "'interface'", "'package'", "';'", 
			"'import'", "'class'", "'extends'", "'void'", "'('", "')'", "'string'", 
			"'='", "'\"'", "'int'", "'boolean'", "'true'", "'false'", "'double'", 
			"'return'", "'enum'", "','", "'aggregation'", "':'", "'association'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WHITESPACE", "NEWLINE", "VISIBILITY", "NUMBERS", "CLASS_NAME", 
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
		public Package_defContext package_def() {
			return getRuleContext(Package_defContext.class,0);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<InterfaceContext> interface_() {
			return getRuleContexts(InterfaceContext.class);
		}
		public InterfaceContext interface_(int i) {
			return getRuleContext(InterfaceContext.class,i);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(62);
				package_def();
				}
			}

			setState(65);
			imports();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536871184L) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(66);
					class_();
					}
					break;
				case 2:
					{
					setState(67);
					interface_();
					}
					break;
				}
				}
				setState(72);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(73);
				import_def();
				}
				}
				setState(78);
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
			setState(79);
			class_def();
			setState(80);
			match(T__0);
			setState(81);
			variables();
			setState(82);
			functions();
			setState(83);
			connections();
			setState(84);
			enumerations();
			setState(85);
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
	public static class InterfaceContext extends ParserRuleContext {
		public Interface_defContext interface_def() {
			return getRuleContext(Interface_defContext.class,0);
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
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(87);
				match(VISIBILITY);
				}
			}

			setState(90);
			interface_def();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(91);
				match(T__2);
				setState(92);
				interface_name();
				}
			}

			setState(95);
			match(T__0);
			setState(96);
			variables();
			setState(97);
			functions();
			setState(98);
			connections();
			setState(99);
			enumerations();
			setState(100);
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
	public static class Interface_defContext extends ParserRuleContext {
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public Interface_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterInterface_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitInterface_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitInterface_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_defContext interface_def() throws RecognitionException {
		Interface_defContext _localctx = new Interface_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interface_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__3);
			setState(103);
			interface_name();
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
		enterRule(_localctx, 10, RULE_variables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					variable();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 12, RULE_functions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					function();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_enumerations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(117);
				enumeration();
				}
				}
				setState(122);
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
		public Package_def_nameContext package_def_name() {
			return getRuleContext(Package_def_nameContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_package_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(124);
			package_def_name();
			setState(125);
			match(T__5);
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
	public static class Package_def_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public Package_def_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_def_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterPackage_def_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitPackage_def_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitPackage_def_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_def_nameContext package_def_name() throws RecognitionException {
		Package_def_nameContext _localctx = new Package_def_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_package_def_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==IDENTIFIER) ) {
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
	public static class Import_defContext extends ParserRuleContext {
		public Import_def_nameContext import_def_name() {
			return getRuleContext(Import_def_nameContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_import_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__6);
			setState(130);
			import_def_name();
			setState(131);
			match(T__5);
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
	public static class Import_def_nameContext extends ParserRuleContext {
		public TerminalNode QualifiedImportName() { return getToken(ClassDiagramParser.QualifiedImportName, 0); }
		public Import_def_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_def_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterImport_def_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitImport_def_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitImport_def_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_def_nameContext import_def_name() throws RecognitionException {
		Import_def_nameContext _localctx = new Import_def_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_import_def_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(QualifiedImportName);
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
		public List<Parameter_nameContext> parameter_name() {
			return getRuleContexts(Parameter_nameContext.class);
		}
		public Parameter_nameContext parameter_name(int i) {
			return getRuleContext(Parameter_nameContext.class,i);
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
		enterRule(_localctx, 24, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1253376L) != 0)) {
				{
				{
				setState(135);
				variable_name();
				setState(136);
				parameter_name();
				}
				}
				setState(142);
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
	public static class Parameter_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENTIFIER);
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
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(145);
				string_variable();
				}
				break;
			case 2:
				{
				setState(146);
				int_variable();
				}
				break;
			case 3:
				{
				setState(147);
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
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public Extended_class_nameContext extended_class_name() {
			return getRuleContext(Extended_class_nameContext.class,0);
		}
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(150);
				match(VISIBILITY);
				}
			}

			setState(153);
			match(T__7);
			setState(154);
			class_name();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(155);
				match(T__8);
				setState(156);
				extended_class_name();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(159);
				match(T__2);
				setState(160);
				interface_name();
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
	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
	public static class Extended_class_nameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public Extended_class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterExtended_class_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitExtended_class_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitExtended_class_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extended_class_nameContext extended_class_name() throws RecognitionException {
		Extended_class_nameContext _localctx = new Extended_class_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extended_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
	public static class Interface_nameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassDiagramParser.CLASS_NAME, 0); }
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterInterface_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitInterface_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitInterface_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VISIBILITY() { return getToken(ClassDiagramParser.VISIBILITY, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Return_stateContext return_state() {
			return getRuleContext(Return_stateContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ClassDiagramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ClassDiagramParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(169);
				match(VISIBILITY);
				}
			}

			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				{
				setState(172);
				match(T__9);
				setState(173);
				function_name();
				setState(174);
				match(T__10);
				setState(175);
				parameter_list();
				setState(176);
				match(T__11);
				setState(177);
				match(T__0);
				setState(178);
				variables();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(179);
					match(IDENTIFIER);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__1);
				}
				}
				break;
			case T__12:
			case T__15:
			case T__16:
			case T__19:
				{
				{
				setState(187);
				variable_name();
				setState(188);
				function_name();
				setState(189);
				match(T__10);
				setState(190);
				parameter_list();
				setState(191);
				match(T__11);
				setState(192);
				match(T__0);
				setState(193);
				variables();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(194);
					match(IDENTIFIER);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				return_state();
				setState(201);
				match(T__1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClassDiagramParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramListener ) ((ClassDiagramListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassDiagramVisitor ) return ((ClassDiagramVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(IDENTIFIER);
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
		enterRule(_localctx, 42, RULE_string_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(207);
				match(VISIBILITY);
				}
			}

			setState(210);
			match(T__12);
			setState(211);
			match(IDENTIFIER);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(212);
				match(T__13);
				setState(213);
				match(T__14);
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(T__14);
				}
			}

			setState(218);
			match(T__5);
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
		enterRule(_localctx, 44, RULE_int_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(220);
				match(VISIBILITY);
				}
			}

			setState(223);
			match(T__15);
			setState(224);
			match(IDENTIFIER);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(225);
				match(T__13);
				setState(226);
				match(NUMBERS);
				}
			}

			setState(229);
			match(T__5);
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
		enterRule(_localctx, 46, RULE_boolean_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(231);
				match(VISIBILITY);
				}
			}

			setState(234);
			match(T__16);
			setState(235);
			match(IDENTIFIER);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(236);
				match(T__13);
				setState(237);
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

			setState(240);
			match(T__5);
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
		enterRule(_localctx, 48, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 50, RULE_return_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__20);
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==NUMBERS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			match(T__5);
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
		enterRule(_localctx, 52, RULE_connections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 620756992L) != 0)) {
				{
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(248);
					aggregation();
					}
					break;
				case 2:
					{
					setState(249);
					association();
					}
					break;
				}
				}
				setState(254);
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
		enterRule(_localctx, 54, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__21);
			setState(256);
			match(CLASS_NAME);
			setState(257);
			match(T__0);
			setState(258);
			enum_constants();
			setState(259);
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
		enterRule(_localctx, 56, RULE_enum_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(CLASS_NAME);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(262);
				match(T__22);
				setState(263);
				match(CLASS_NAME);
				}
				}
				setState(268);
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
		enterRule(_localctx, 58, RULE_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(269);
				match(VISIBILITY);
				}
			}

			setState(272);
			match(T__23);
			setState(273);
			match(CLASS_NAME);
			setState(274);
			match(T__24);
			setState(275);
			match(IDENTIFIER);
			setState(276);
			match(T__5);
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
		enterRule(_localctx, 60, RULE_association);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBILITY) {
				{
				setState(278);
				match(VISIBILITY);
				}
			}

			setState(281);
			match(T__25);
			setState(282);
			match(CLASS_NAME);
			setState(283);
			match(T__24);
			setState(284);
			match(IDENTIFIER);
			setState(285);
			match(T__5);
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
		"\u0004\u0001!\u0120\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0003\u0000@\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0001\u0005\u0001"+
		"K\b\u0001\n\u0001\f\u0001N\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0003\u0003Y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"^\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0006\u0005\u0006"+
		"q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0007\u0005\u0007w\b\u0007\n"+
		"\u0007\f\u0007z\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u008b\b\f\n\f\f\f\u008e\t\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0095\b\u000e\u0001\u000f\u0003\u000f"+
		"\u0098\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u009e\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a2\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0003\u0013\u00ab\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00b5"+
		"\b\u0013\n\u0013\f\u0013\u00b8\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00c4\b\u0013\n\u0013\f\u0013\u00c7\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cc\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0003\u0015\u00d1\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d9\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0003\u0016\u00de\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e4\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0003\u0017\u00e9\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00ef\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u00fb\b\u001a\n\u001a\f\u001a\u00fe\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0109\b\u001c\n\u001c"+
		"\f\u001c\u010c\t\u001c\u0001\u001d\u0003\u001d\u010f\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0003\u001e\u0118\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<\u0000\u0004\u0001\u0000\u001f \u0001\u0000\u0012\u0013\u0003"+
		"\u0000\r\r\u0010\u0011\u0014\u0014\u0002\u0000\u001e\u001e  \u011e\u0000"+
		"?\u0001\u0000\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004O\u0001"+
		"\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000"+
		"\u0000\nl\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000ex\u0001"+
		"\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000"+
		"\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000"+
		"\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u008f\u0001\u0000"+
		"\u0000\u0000\u001c\u0094\u0001\u0000\u0000\u0000\u001e\u0097\u0001\u0000"+
		"\u0000\u0000 \u00a3\u0001\u0000\u0000\u0000\"\u00a5\u0001\u0000\u0000"+
		"\u0000$\u00a7\u0001\u0000\u0000\u0000&\u00aa\u0001\u0000\u0000\u0000("+
		"\u00cd\u0001\u0000\u0000\u0000*\u00d0\u0001\u0000\u0000\u0000,\u00dd\u0001"+
		"\u0000\u0000\u0000.\u00e8\u0001\u0000\u0000\u00000\u00f2\u0001\u0000\u0000"+
		"\u00002\u00f4\u0001\u0000\u0000\u00004\u00fc\u0001\u0000\u0000\u00006"+
		"\u00ff\u0001\u0000\u0000\u00008\u0105\u0001\u0000\u0000\u0000:\u010e\u0001"+
		"\u0000\u0000\u0000<\u0117\u0001\u0000\u0000\u0000>@\u0003\u0010\b\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AF\u0003\u0002\u0001\u0000BE\u0003\u0004\u0002\u0000CE\u0003\u0006"+
		"\u0003\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u0001\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003\u0014"+
		"\n\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0003\u001e\u000f\u0000PQ\u0005\u0001\u0000"+
		"\u0000QR\u0003\n\u0005\u0000RS\u0003\f\u0006\u0000ST\u00034\u001a\u0000"+
		"TU\u0003\u000e\u0007\u0000UV\u0005\u0002\u0000\u0000V\u0005\u0001\u0000"+
		"\u0000\u0000WY\u0005\u001d\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z]\u0003\b\u0004\u0000[\\"+
		"\u0005\u0003\u0000\u0000\\^\u0003$\u0012\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0001\u0000"+
		"\u0000`a\u0003\n\u0005\u0000ab\u0003\f\u0006\u0000bc\u00034\u001a\u0000"+
		"cd\u0003\u000e\u0007\u0000de\u0005\u0002\u0000\u0000e\u0007\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0004\u0000\u0000gh\u0003$\u0012\u0000h\t\u0001\u0000"+
		"\u0000\u0000ik\u0003\u001c\u000e\u0000ji\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"m\u000b\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u0003&\u0013"+
		"\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uw\u00036\u001b\u0000vu\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u000f\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0005"+
		"\u0000\u0000|}\u0003\u0012\t\u0000}~\u0005\u0006\u0000\u0000~\u0011\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080\u0013\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0083\u0003"+
		"\u0016\u000b\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0015\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005!\u0000\u0000\u0086\u0017\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u00030\u0018\u0000\u0088\u0089\u0003\u001a\r"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0019\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005 \u0000\u0000"+
		"\u0090\u001b\u0001\u0000\u0000\u0000\u0091\u0095\u0003*\u0015\u0000\u0092"+
		"\u0095\u0003,\u0016\u0000\u0093\u0095\u0003.\u0017\u0000\u0094\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u001d\u0001\u0000\u0000\u0000\u0096\u0098\u0005"+
		"\u001d\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\b\u0000\u0000\u009a\u009d\u0003 \u0010\u0000\u009b\u009c\u0005\t\u0000"+
		"\u0000\u009c\u009e\u0003\"\u0011\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a2\u0003$\u0012\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u001f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001f\u0000\u0000\u00a4"+
		"!\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000\u00a6#\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8%\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0005\u001d\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0003(\u0014"+
		"\u0000\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u00b0\u0003\u0018\f\u0000"+
		"\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0005\u0001\u0000\u0000\u00b2"+
		"\u00b6\u0003\n\u0005\u0000\u00b3\u00b5\u0005 \u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0002\u0000\u0000\u00ba\u00cc\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u00030\u0018\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd\u00be\u0005\u000b"+
		"\u0000\u0000\u00be\u00bf\u0003\u0018\f\u0000\u00bf\u00c0\u0005\f\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0001\u0000\u0000\u00c1\u00c5\u0003\n\u0005\u0000"+
		"\u00c2\u00c4\u0005 \u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u00032\u0019\u0000\u00c9\u00ca"+
		"\u0005\u0002\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00ac"+
		"\u0001\u0000\u0000\u0000\u00cb\u00bb\u0001\u0000\u0000\u0000\u00cc\'\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005 \u0000\u0000\u00ce)\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0005\u001d\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005\r\u0000\u0000\u00d3\u00d8\u0005 \u0000\u0000"+
		"\u00d4\u00d5\u0005\u000e\u0000\u0000\u00d5\u00d6\u0005\u000f\u0000\u0000"+
		"\u00d6\u00d7\u0005 \u0000\u0000\u00d7\u00d9\u0005\u000f\u0000\u0000\u00d8"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0006\u0000\u0000\u00db"+
		"+\u0001\u0000\u0000\u0000\u00dc\u00de\u0005\u001d\u0000\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0010\u0000\u0000\u00e0\u00e3"+
		"\u0005 \u0000\u0000\u00e1\u00e2\u0005\u000e\u0000\u0000\u00e2\u00e4\u0005"+
		"\u001e\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0006\u0000\u0000\u00e6-\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005\u001d"+
		"\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0011"+
		"\u0000\u0000\u00eb\u00ee\u0005 \u0000\u0000\u00ec\u00ed\u0005\u000e\u0000"+
		"\u0000\u00ed\u00ef\u0007\u0001\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005\u0006\u0000\u0000\u00f1/\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0002\u0000\u0000\u00f31\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u0015\u0000\u0000\u00f5\u00f6\u0007\u0003\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0006\u0000\u0000\u00f73\u0001\u0000\u0000\u0000\u00f8\u00fb"+
		"\u0003:\u001d\u0000\u00f9\u00fb\u0003<\u001e\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd5\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\u0016\u0000\u0000\u0100\u0101\u0005\u001f\u0000"+
		"\u0000\u0101\u0102\u0005\u0001\u0000\u0000\u0102\u0103\u00038\u001c\u0000"+
		"\u0103\u0104\u0005\u0002\u0000\u0000\u01047\u0001\u0000\u0000\u0000\u0105"+
		"\u010a\u0005\u001f\u0000\u0000\u0106\u0107\u0005\u0017\u0000\u0000\u0107"+
		"\u0109\u0005\u001f\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109"+
		"\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b9\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0005\u001d\u0000\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0018\u0000\u0000\u0111\u0112"+
		"\u0005\u001f\u0000\u0000\u0112\u0113\u0005\u0019\u0000\u0000\u0113\u0114"+
		"\u0005 \u0000\u0000\u0114\u0115\u0005\u0006\u0000\u0000\u0115;\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0005\u001d\u0000\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005\u001a\u0000\u0000\u011a\u011b\u0005\u001f"+
		"\u0000\u0000\u011b\u011c\u0005\u0019\u0000\u0000\u011c\u011d\u0005 \u0000"+
		"\u0000\u011d\u011e\u0005\u0006\u0000\u0000\u011e=\u0001\u0000\u0000\u0000"+
		"\u001d?DFLX]lrx\u008c\u0094\u0097\u009d\u00a1\u00aa\u00b6\u00c5\u00cb"+
		"\u00d0\u00d8\u00dd\u00e3\u00e8\u00ee\u00fa\u00fc\u010a\u010e\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}