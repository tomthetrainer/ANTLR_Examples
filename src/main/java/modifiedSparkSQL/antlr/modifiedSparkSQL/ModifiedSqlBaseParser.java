// Generated from /Users/thomas.hanlon/intellij/AntlerExamples/src/main/java/modifiedSparkSQL/ModifiedSqlBase.g4 by ANTLR 4.9.1
package modifiedSparkSQL;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModifiedSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		COST=52, CREATE=53, CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, 
		CURRENT_TIMESTAMP=59, CURRENT_USER=60, DATA=61, DATABASE=62, DATABASES=63, 
		DBPROPERTIES=64, DEFINED=65, DELETE=66, DELIMITED=67, DESC=68, DESCRIBE=69, 
		DFS=70, DIRECTORIES=71, DIRECTORY=72, DISTINCT=73, DISTRIBUTE=74, DIV=75, 
		DROP=76, ELSE=77, END=78, ESCAPE=79, ESCAPED=80, EXCEPT=81, EXCHANGE=82, 
		EXISTS=83, EXPLAIN=84, EXPORT=85, EXTENDED=86, EXTERNAL=87, EXTRACT=88, 
		FALSE=89, FETCH=90, FIELDS=91, FILTER=92, FILEFORMAT=93, FIRST=94, FOLLOWING=95, 
		FOR=96, FOREIGN=97, FORMAT=98, FORMATTED=99, FROM=100, FULL=101, FUNCTION=102, 
		FUNCTIONS=103, GLOBAL=104, GRANT=105, GROUP=106, GROUPING=107, HAVING=108, 
		IF=109, IGNORE=110, IMPORT=111, IN=112, INDEX=113, INDEXES=114, INNER=115, 
		INPATH=116, INPUTFORMAT=117, INSERT=118, INTERSECT=119, INTERVAL=120, 
		INTO=121, IS=122, ITEMS=123, JOIN=124, KEYS=125, LAST=126, LATERAL=127, 
		LAZY=128, LEADING=129, LEFT=130, LIKE=131, LIMIT=132, LINES=133, LIST=134, 
		LOAD=135, LOCAL=136, LOCATION=137, LOCK=138, LOCKS=139, LOGICAL=140, MACRO=141, 
		MAP=142, MATCHED=143, MERGE=144, MSCK=145, NAMESPACE=146, NAMESPACES=147, 
		NATURAL=148, NO=149, NOT=150, NULL=151, NULLS=152, OF=153, ON=154, ONLY=155, 
		OPTION=156, OPTIONS=157, OR=158, ORDER=159, OUT=160, OUTER=161, OUTPUTFORMAT=162, 
		OVER=163, OVERLAPS=164, OVERLAY=165, OVERWRITE=166, PARTITION=167, PARTITIONED=168, 
		PARTITIONS=169, PERCENTLIT=170, PIVOT=171, PLACING=172, POSITION=173, 
		PRECEDING=174, PRIMARY=175, PRINCIPALS=176, PROPERTIES=177, PURGE=178, 
		QUERY=179, RANGE=180, RECORDREADER=181, RECORDWRITER=182, RECOVER=183, 
		REDUCE=184, REFERENCES=185, REFRESH=186, RENAME=187, REPAIR=188, REPLACE=189, 
		RESET=190, RESPECT=191, RESTRICT=192, REVOKE=193, RIGHT=194, RLIKE=195, 
		ROLE=196, ROLES=197, ROLLBACK=198, ROLLUP=199, ROW=200, ROWS=201, SCHEMA=202, 
		SELECT=203, SEMI=204, SEPARATED=205, SERDE=206, SERDEPROPERTIES=207, SESSION_USER=208, 
		SET=209, SETMINUS=210, SETS=211, SHOW=212, SKEWED=213, SOME=214, SORT=215, 
		SORTED=216, START=217, STATISTICS=218, STORED=219, STRATIFY=220, STRUCT=221, 
		SUBSTR=222, SUBSTRING=223, SYNC=224, TABLE=225, TABLES=226, TABLESAMPLE=227, 
		TBLPROPERTIES=228, TEMPORARY=229, TERMINATED=230, THEN=231, TIME=232, 
		TO=233, TOUCH=234, TRAILING=235, TRANSACTION=236, TRANSACTIONS=237, TRANSFORM=238, 
		TRIM=239, TRUE=240, TRUNCATE=241, TYPE=242, UNARCHIVE=243, UNBOUNDED=244, 
		UNCACHE=245, UNION=246, UNIQUE=247, UNKNOWN=248, UNLOCK=249, UNSET=250, 
		UPDATE=251, USE=252, USER=253, USING=254, VALUES=255, VIEW=256, VIEWS=257, 
		WHEN=258, WHERE=259, WINDOW=260, WITH=261, ZONE=262, EQ=263, NSEQ=264, 
		NEQ=265, NEQJ=266, LT=267, LTE=268, GT=269, GTE=270, PLUS=271, MINUS=272, 
		ASTERISK=273, SLASH=274, PERCENT=275, TILDE=276, AMPERSAND=277, PIPE=278, 
		CONCAT_PIPE=279, HAT=280, STRING=281, BIGINT_LITERAL=282, SMALLINT_LITERAL=283, 
		TINYINT_LITERAL=284, INTEGER_VALUE=285, EXPONENT_VALUE=286, DECIMAL_VALUE=287, 
		FLOAT_LITERAL=288, DOUBLE_LITERAL=289, BIGDECIMAL_LITERAL=290, IDENTIFIER=291, 
		BACKQUOTED_IDENTIFIER=292, SIMPLE_COMMENT=293, BRACKETED_COMMENT=294, 
		WS=295, UNRECOGNIZED=296, HELP=297;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_commentSpec = 16, RULE_query = 17, 
		RULE_insertInto = 18, RULE_partitionSpecLocation = 19, RULE_partitionSpec = 20, 
		RULE_partitionVal = 21, RULE_namespace = 22, RULE_describeFuncName = 23, 
		RULE_describeColName = 24, RULE_ctes = 25, RULE_namedQuery = 26, RULE_tableProvider = 27, 
		RULE_createTableClauses = 28, RULE_tablePropertyList = 29, RULE_tableProperty = 30, 
		RULE_tablePropertyKey = 31, RULE_tablePropertyValue = 32, RULE_constantList = 33, 
		RULE_nestedConstantList = 34, RULE_createFileFormat = 35, RULE_fileFormat = 36, 
		RULE_storageHandler = 37, RULE_resource = 38, RULE_dmlStatementNoWith = 39, 
		RULE_queryOrganization = 40, RULE_multiInsertQueryBody = 41, RULE_queryTerm = 42, 
		RULE_queryPrimary = 43, RULE_sortItem = 44, RULE_fromStatement = 45, RULE_fromStatementBody = 46, 
		RULE_querySpecification = 47, RULE_transformClause = 48, RULE_selectClause = 49, 
		RULE_setClause = 50, RULE_matchedClause = 51, RULE_notMatchedClause = 52, 
		RULE_matchedAction = 53, RULE_notMatchedAction = 54, RULE_assignmentList = 55, 
		RULE_assignment = 56, RULE_whereClause = 57, RULE_havingClause = 58, RULE_hint = 59, 
		RULE_hintStatement = 60, RULE_fromClause = 61, RULE_aggregationClause = 62, 
		RULE_groupByClause = 63, RULE_groupingAnalytics = 64, RULE_groupingSet = 65, 
		RULE_pivotClause = 66, RULE_pivotColumn = 67, RULE_pivotValue = 68, RULE_lateralView = 69, 
		RULE_setQuantifier = 70, RULE_relation = 71, RULE_joinRelation = 72, RULE_joinType = 73, 
		RULE_joinCriteria = 74, RULE_sample = 75, RULE_sampleMethod = 76, RULE_identifierList = 77, 
		RULE_identifierSeq = 78, RULE_orderedIdentifierList = 79, RULE_orderedIdentifier = 80, 
		RULE_identifierCommentList = 81, RULE_identifierComment = 82, RULE_relationPrimary = 83, 
		RULE_inlineTable = 84, RULE_functionTable = 85, RULE_tableAlias = 86, 
		RULE_rowFormat = 87, RULE_multipartIdentifierList = 88, RULE_multipartIdentifier = 89, 
		RULE_tableIdentifier = 90, RULE_functionIdentifier = 91, RULE_namedExpression = 92, 
		RULE_namedExpressionSeq = 93, RULE_partitionFieldList = 94, RULE_partitionField = 95, 
		RULE_transform = 96, RULE_transformArgument = 97, RULE_expression = 98, 
		RULE_booleanExpression = 99, RULE_predicate = 100, RULE_valueExpression = 101, 
		RULE_primaryExpression = 102, RULE_constant = 103, RULE_comparisonOperator = 104, 
		RULE_arithmeticOperator = 105, RULE_predicateOperator = 106, RULE_booleanValue = 107, 
		RULE_interval = 108, RULE_errorCapturingMultiUnitsInterval = 109, RULE_multiUnitsInterval = 110, 
		RULE_errorCapturingUnitToUnitInterval = 111, RULE_unitToUnitInterval = 112, 
		RULE_intervalValue = 113, RULE_colPosition = 114, RULE_dataType = 115, 
		RULE_qualifiedColTypeWithPositionList = 116, RULE_qualifiedColTypeWithPosition = 117, 
		RULE_colTypeList = 118, RULE_colType = 119, RULE_complexColTypeList = 120, 
		RULE_complexColType = 121, RULE_whenClause = 122, RULE_windowClause = 123, 
		RULE_namedWindow = 124, RULE_windowSpec = 125, RULE_windowFrame = 126, 
		RULE_frameBound = 127, RULE_qualifiedNameList = 128, RULE_functionName = 129, 
		RULE_qualifiedName = 130, RULE_errorCapturingIdentifier = 131, RULE_errorCapturingIdentifierExtra = 132, 
		RULE_identifier = 133, RULE_strictIdentifier = 134, RULE_quotedIdentifier = 135, 
		RULE_number = 136, RULE_alterColumnAction = 137, RULE_ansiNonReserved = 138, 
		RULE_strictNonReserved = 139, RULE_nonReserved = 140;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
			"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
			"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"matchedAction", "notMatchedAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"aggregationClause", "groupByClause", "groupingAnalytics", "groupingSet", 
			"pivotClause", "pivotColumn", "pivotValue", "lateralView", "setQuantifier", 
			"relation", "joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
			"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
			"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
			"functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
			"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
			"namedExpressionSeq", "partitionFieldList", "partitionField", "transform", 
			"transformArgument", "expression", "booleanExpression", "predicate", 
			"valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
			"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
			"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
			"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
			"ansiNonReserved", "strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFINED'", "'DELETE'", 
			"'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", "'DIRECTORY'", 
			"'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", "'END'", "'ESCAPE'", 
			"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
			"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
			"'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
			"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'IF'", "'IGNORE'", 
			"'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", 
			"'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", 
			"'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", 
			"'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", 
			"'LOCK'", "'LOCKS'", "'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", 
			"'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", 
			"'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", 
			"'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
			"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
			"'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", 
			"'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", 
			"'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", 
			"'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", 
			"'REVOKE'", "'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", 
			"'ROW'", "'ROWS'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", 
			"'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", 
			"'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", 
			"'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'ZONE'", 
			null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "IF", 
			"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
			"MAP", "MATCHED", "MERGE", "MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", 
			"NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", 
			"OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", 
			"OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
			"RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", 
			"ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SELECT", "SEMI", "SEPARATED", 
			"SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", 
			"SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
			"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "SYNC", "TABLE", "TABLES", 
			"TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TIME", 
			"TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", 
			"TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", 
			"UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", 
			"USING", "VALUES", "VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", 
			"ZONE", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", 
			"MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED", "HELP"
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
	public String getGrammarFileName() { return "ModifiedSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public ModifiedSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			statement();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(283);
				match(T__0);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(EOF);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			namedExpression();
			setState(292);
			match(EOF);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			tableIdentifier();
			setState(295);
			match(EOF);
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

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			multipartIdentifier();
			setState(298);
			match(EOF);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			functionIdentifier();
			setState(301);
			match(EOF);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			dataType();
			setState(304);
			match(EOF);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ModifiedSqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			colTypeList();
			setState(307);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(ModifiedSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(ModifiedSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(ModifiedSqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(ModifiedSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(ModifiedSqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(ModifiedSqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(ModifiedSqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(ModifiedSqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(ModifiedSqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(ModifiedSqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(ModifiedSqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(ModifiedSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(ModifiedSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ModifiedSqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(ModifiedSqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(ModifiedSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(ModifiedSqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ModifiedSqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(ModifiedSqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(ModifiedSqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(ModifiedSqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModifiedSqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(ModifiedSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ModifiedSqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode MSCK() { return getToken(ModifiedSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(ModifiedSqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(ModifiedSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(ModifiedSqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(ModifiedSqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(ModifiedSqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(ModifiedSqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ModifiedSqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(ModifiedSqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(ModifiedSqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(ModifiedSqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(ModifiedSqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(ModifiedSqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(ModifiedSqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(ModifiedSqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(ModifiedSqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(ModifiedSqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAnalyzeTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAnalyzeTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ModifiedSqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(ModifiedSqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(ModifiedSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(ModifiedSqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ModifiedSqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(ModifiedSqlBaseParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ModifiedSqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(ModifiedSqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(ModifiedSqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(ModifiedSqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ModifiedSqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(ModifiedSqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(ModifiedSqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(ModifiedSqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HelpTableContext extends StatementContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode HELP() { return getToken(ModifiedSqlBaseParser.HELP, 0); }
		public HelpTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterHelpTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitHelpTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitHelpTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(ModifiedSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(ModifiedSqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(ModifiedSqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(ModifiedSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(ModifiedSqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(ModifiedSqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ModifiedSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(ModifiedSqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(ModifiedSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(ModifiedSqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(ModifiedSqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(ModifiedSqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(ModifiedSqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(ModifiedSqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(ModifiedSqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(ModifiedSqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ModifiedSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(ModifiedSqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ModifiedSqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(ModifiedSqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(ModifiedSqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(ModifiedSqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(ModifiedSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(ModifiedSqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(ModifiedSqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ModifiedSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(ModifiedSqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(ModifiedSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(ModifiedSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ModifiedSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ModifiedSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(ModifiedSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(ModifiedSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(ModifiedSqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(ModifiedSqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(ModifiedSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(ModifiedSqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(ModifiedSqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(ModifiedSqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowTableExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowTableExtended(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ModifiedSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(ModifiedSqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(ModifiedSqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(ModifiedSqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(ModifiedSqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(ModifiedSqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(ModifiedSqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(ModifiedSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(ModifiedSqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(ModifiedSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ModifiedSqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(ModifiedSqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(ModifiedSqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(ModifiedSqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(ModifiedSqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(ModifiedSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ModifiedSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(ModifiedSqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(ModifiedSqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(ModifiedSqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(ModifiedSqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(ModifiedSqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ModifiedSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ModifiedSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				query();
				}
				break;
			case 2:
				_localctx = new HelpTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(310);
					match(HELP);
					}
					break;
				}
				setState(313);
				multipartIdentifier();
				}
				break;
			case 3:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(314);
					ctes();
					}
				}

				setState(317);
				dmlStatementNoWith();
				}
				break;
			case 4:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(USE);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(319);
					match(NAMESPACE);
					}
					break;
				}
				setState(322);
				multipartIdentifier();
				}
				break;
			case 5:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(CREATE);
				setState(324);
				namespace();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(325);
					match(IF);
					setState(326);
					match(NOT);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				multipartIdentifier();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(336);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(331);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(332);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(333);
						match(WITH);
						setState(334);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(ALTER);
				setState(342);
				namespace();
				setState(343);
				multipartIdentifier();
				setState(344);
				match(SET);
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				tablePropertyList();
				}
				break;
			case 7:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				match(ALTER);
				setState(349);
				namespace();
				setState(350);
				multipartIdentifier();
				setState(351);
				match(SET);
				setState(352);
				locationSpec();
				}
				break;
			case 8:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				match(DROP);
				setState(355);
				namespace();
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(356);
					match(IF);
					setState(357);
					match(EXISTS);
					}
					break;
				}
				setState(360);
				multipartIdentifier();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 9:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(364);
				match(SHOW);
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(366);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(367);
					multipartIdentifier();
					}
				}

				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(370);
						match(LIKE);
						}
					}

					setState(373);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(376);
				createTableHeader();
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(377);
					match(T__1);
					setState(378);
					colTypeList();
					setState(379);
					match(T__2);
					}
					break;
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(383);
					tableProvider();
					}
				}

				setState(386);
				createTableClauses();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (REDUCE - 184)) | (1L << (SELECT - 184)) | (1L << (TABLE - 184)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(387);
						match(AS);
						}
					}

					setState(390);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(393);
				match(CREATE);
				setState(394);
				match(TABLE);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(395);
					match(IF);
					setState(396);
					match(NOT);
					setState(397);
					match(EXISTS);
					}
					break;
				}
				setState(400);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(401);
				match(LIKE);
				setState(402);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || _la==ROW || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (STORED - 219)) | (1L << (TBLPROPERTIES - 219)) | (1L << (USING - 219)))) != 0)) {
					{
					setState(409);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(403);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(404);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(405);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(406);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(407);
						match(TBLPROPERTIES);
						setState(408);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 12:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(414);
				replaceTableHeader();
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(415);
					match(T__1);
					setState(416);
					colTypeList();
					setState(417);
					match(T__2);
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(421);
					tableProvider();
					}
				}

				setState(424);
				createTableClauses();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (REDUCE - 184)) | (1L << (SELECT - 184)) | (1L << (TABLE - 184)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(425);
						match(AS);
						}
					}

					setState(428);
					query();
					}
				}

				}
				break;
			case 13:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(431);
				match(ANALYZE);
				setState(432);
				match(TABLE);
				setState(433);
				multipartIdentifier();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(434);
					partitionSpec();
					}
				}

				setState(437);
				match(COMPUTE);
				setState(438);
				match(STATISTICS);
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(439);
					identifier();
					}
					break;
				case 2:
					{
					setState(440);
					match(FOR);
					setState(441);
					match(COLUMNS);
					setState(442);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(443);
					match(FOR);
					setState(444);
					match(ALL);
					setState(445);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(448);
				match(ANALYZE);
				setState(449);
				match(TABLES);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(450);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(451);
					multipartIdentifier();
					}
				}

				setState(454);
				match(COMPUTE);
				setState(455);
				match(STATISTICS);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(456);
					identifier();
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(459);
				match(ALTER);
				setState(460);
				match(TABLE);
				setState(461);
				multipartIdentifier();
				setState(462);
				match(ADD);
				setState(463);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(464);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(466);
				match(ALTER);
				setState(467);
				match(TABLE);
				setState(468);
				multipartIdentifier();
				setState(469);
				match(ADD);
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				match(T__1);
				setState(472);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(473);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(475);
				match(ALTER);
				setState(476);
				match(TABLE);
				setState(477);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(478);
				match(RENAME);
				setState(479);
				match(COLUMN);
				setState(480);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(481);
				match(TO);
				setState(482);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(484);
				match(ALTER);
				setState(485);
				match(TABLE);
				setState(486);
				multipartIdentifier();
				setState(487);
				match(DROP);
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				match(T__1);
				setState(490);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(491);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(493);
				match(ALTER);
				setState(494);
				match(TABLE);
				setState(495);
				multipartIdentifier();
				setState(496);
				match(DROP);
				setState(497);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(498);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 20:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(500);
				match(ALTER);
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(502);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(503);
				match(RENAME);
				setState(504);
				match(TO);
				setState(505);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 21:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(507);
				match(ALTER);
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(509);
				multipartIdentifier();
				setState(510);
				match(SET);
				setState(511);
				match(TBLPROPERTIES);
				setState(512);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(514);
				match(ALTER);
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				multipartIdentifier();
				setState(517);
				match(UNSET);
				setState(518);
				match(TBLPROPERTIES);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(519);
					match(IF);
					setState(520);
					match(EXISTS);
					}
				}

				setState(523);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(525);
				match(ALTER);
				setState(526);
				match(TABLE);
				setState(527);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(528);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(529);
					match(COLUMN);
					}
					break;
				}
				setState(532);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(533);
					alterColumnAction();
					}
				}

				}
				break;
			case 24:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(536);
				match(ALTER);
				setState(537);
				match(TABLE);
				setState(538);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(539);
					partitionSpec();
					}
				}

				setState(542);
				match(CHANGE);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(543);
					match(COLUMN);
					}
					break;
				}
				setState(546);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(547);
				colType();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(548);
					colPosition();
					}
				}

				}
				break;
			case 25:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(551);
				match(ALTER);
				setState(552);
				match(TABLE);
				setState(553);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(554);
					partitionSpec();
					}
				}

				setState(557);
				match(REPLACE);
				setState(558);
				match(COLUMNS);
				setState(559);
				match(T__1);
				setState(560);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(561);
				match(T__2);
				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(563);
				match(ALTER);
				setState(564);
				match(TABLE);
				setState(565);
				multipartIdentifier();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(566);
					partitionSpec();
					}
				}

				setState(569);
				match(SET);
				setState(570);
				match(SERDE);
				setState(571);
				match(STRING);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(572);
					match(WITH);
					setState(573);
					match(SERDEPROPERTIES);
					setState(574);
					tablePropertyList();
					}
				}

				}
				break;
			case 27:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(577);
				match(ALTER);
				setState(578);
				match(TABLE);
				setState(579);
				multipartIdentifier();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(580);
					partitionSpec();
					}
				}

				setState(583);
				match(SET);
				setState(584);
				match(SERDEPROPERTIES);
				setState(585);
				tablePropertyList();
				}
				break;
			case 28:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(587);
				match(ALTER);
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				multipartIdentifier();
				setState(590);
				match(ADD);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(591);
					match(IF);
					setState(592);
					match(NOT);
					setState(593);
					match(EXISTS);
					}
				}

				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(596);
					partitionSpecLocation();
					}
					}
					setState(599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 29:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(601);
				match(ALTER);
				setState(602);
				match(TABLE);
				setState(603);
				multipartIdentifier();
				setState(604);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(605);
				match(RENAME);
				setState(606);
				match(TO);
				setState(607);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 30:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(609);
				match(ALTER);
				setState(610);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(611);
				multipartIdentifier();
				setState(612);
				match(DROP);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(613);
					match(IF);
					setState(614);
					match(EXISTS);
					}
				}

				setState(617);
				partitionSpec();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(618);
					match(T__3);
					setState(619);
					partitionSpec();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(625);
					match(PURGE);
					}
				}

				}
				break;
			case 31:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(628);
				match(ALTER);
				setState(629);
				match(TABLE);
				setState(630);
				multipartIdentifier();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(631);
					partitionSpec();
					}
				}

				setState(634);
				match(SET);
				setState(635);
				locationSpec();
				}
				break;
			case 32:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(637);
				match(ALTER);
				setState(638);
				match(TABLE);
				setState(639);
				multipartIdentifier();
				setState(640);
				match(RECOVER);
				setState(641);
				match(PARTITIONS);
				}
				break;
			case 33:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(643);
				match(DROP);
				setState(644);
				match(TABLE);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(645);
					match(IF);
					setState(646);
					match(EXISTS);
					}
					break;
				}
				setState(649);
				multipartIdentifier();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(650);
					match(PURGE);
					}
				}

				}
				break;
			case 34:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(653);
				match(DROP);
				setState(654);
				match(VIEW);
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(655);
					match(IF);
					setState(656);
					match(EXISTS);
					}
					break;
				}
				setState(659);
				multipartIdentifier();
				}
				break;
			case 35:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(660);
				match(CREATE);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(661);
					match(OR);
					setState(662);
					match(REPLACE);
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(665);
						match(GLOBAL);
						}
					}

					setState(668);
					match(TEMPORARY);
					}
				}

				setState(671);
				match(VIEW);
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(672);
					match(IF);
					setState(673);
					match(NOT);
					setState(674);
					match(EXISTS);
					}
					break;
				}
				setState(677);
				multipartIdentifier();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(678);
					identifierCommentList();
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(687);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(681);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(682);
						match(PARTITIONED);
						setState(683);
						match(ON);
						setState(684);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(685);
						match(TBLPROPERTIES);
						setState(686);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(AS);
				setState(693);
				query();
				}
				break;
			case 36:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(695);
				match(CREATE);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(696);
					match(OR);
					setState(697);
					match(REPLACE);
					}
				}

				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(700);
					match(GLOBAL);
					}
				}

				setState(703);
				match(TEMPORARY);
				setState(704);
				match(VIEW);
				setState(705);
				tableIdentifier();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(706);
					match(T__1);
					setState(707);
					colTypeList();
					setState(708);
					match(T__2);
					}
				}

				setState(712);
				tableProvider();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(713);
					match(OPTIONS);
					setState(714);
					tablePropertyList();
					}
				}

				}
				break;
			case 37:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(717);
				match(ALTER);
				setState(718);
				match(VIEW);
				setState(719);
				multipartIdentifier();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(720);
					match(AS);
					}
				}

				setState(723);
				query();
				}
				break;
			case 38:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(725);
				match(CREATE);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(726);
					match(OR);
					setState(727);
					match(REPLACE);
					}
				}

				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(730);
					match(TEMPORARY);
					}
				}

				setState(733);
				match(FUNCTION);
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(734);
					match(IF);
					setState(735);
					match(NOT);
					setState(736);
					match(EXISTS);
					}
					break;
				}
				setState(739);
				multipartIdentifier();
				setState(740);
				match(AS);
				setState(741);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(742);
					match(USING);
					setState(743);
					resource();
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(744);
						match(T__3);
						setState(745);
						resource();
						}
						}
						setState(750);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(753);
				match(DROP);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(754);
					match(TEMPORARY);
					}
				}

				setState(757);
				match(FUNCTION);
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(758);
					match(IF);
					setState(759);
					match(EXISTS);
					}
					break;
				}
				setState(762);
				multipartIdentifier();
				}
				break;
			case 40:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(763);
				match(EXPLAIN);
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(764);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EXTENDED - 86)) | (1L << (FORMATTED - 86)) | (1L << (LOGICAL - 86)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(767);
				statement();
				}
				break;
			case 41:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(768);
				match(SHOW);
				setState(769);
				match(TABLES);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(770);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(771);
					multipartIdentifier();
					}
				}

				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(774);
						match(LIKE);
						}
					}

					setState(777);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(780);
				match(SHOW);
				setState(781);
				match(TABLE);
				setState(782);
				match(EXTENDED);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(783);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(784);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(787);
				match(LIKE);
				setState(788);
				((ShowTableExtendedContext)_localctx).pattern = match(STRING);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(789);
					partitionSpec();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(792);
				match(SHOW);
				setState(793);
				match(TBLPROPERTIES);
				setState(794);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(795);
					match(T__1);
					setState(796);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(797);
					match(T__2);
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(COLUMNS);
				setState(803);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(804);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(805);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(806);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(809);
				match(SHOW);
				setState(810);
				match(VIEWS);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(811);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(812);
					multipartIdentifier();
					}
				}

				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(815);
						match(LIKE);
						}
					}

					setState(818);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(821);
				match(SHOW);
				setState(822);
				match(PARTITIONS);
				setState(823);
				multipartIdentifier();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(824);
					partitionSpec();
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(827);
				match(SHOW);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(828);
					identifier();
					}
					break;
				}
				setState(831);
				match(FUNCTIONS);
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(832);
						match(LIKE);
						}
						break;
					}
					setState(837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(835);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(836);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 48:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(841);
				match(SHOW);
				setState(842);
				match(CREATE);
				setState(843);
				match(TABLE);
				setState(844);
				multipartIdentifier();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(845);
					match(AS);
					setState(846);
					match(SERDE);
					}
				}

				}
				break;
			case 49:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(849);
				match(SHOW);
				setState(850);
				match(CURRENT);
				setState(851);
				match(NAMESPACE);
				}
				break;
			case 50:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(852);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(853);
				match(FUNCTION);
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(854);
					match(EXTENDED);
					}
					break;
				}
				setState(857);
				describeFuncName();
				}
				break;
			case 51:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(858);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(859);
				namespace();
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(860);
					match(EXTENDED);
					}
					break;
				}
				setState(863);
				multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(865);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(866);
					match(TABLE);
					}
					break;
				}
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(869);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(872);
				multipartIdentifier();
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(873);
					partitionSpec();
					}
					break;
				}
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(876);
					describeColName();
					}
					break;
				}
				}
				break;
			case 53:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(880);
					match(QUERY);
					}
				}

				setState(883);
				query();
				}
				break;
			case 54:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(884);
				match(COMMENT);
				setState(885);
				match(ON);
				setState(886);
				namespace();
				setState(887);
				multipartIdentifier();
				setState(888);
				match(IS);
				setState(889);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 55:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(891);
				match(COMMENT);
				setState(892);
				match(ON);
				setState(893);
				match(TABLE);
				setState(894);
				multipartIdentifier();
				setState(895);
				match(IS);
				setState(896);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 56:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(898);
				match(REFRESH);
				setState(899);
				match(TABLE);
				setState(900);
				multipartIdentifier();
				}
				break;
			case 57:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(901);
				match(REFRESH);
				setState(902);
				match(FUNCTION);
				setState(903);
				multipartIdentifier();
				}
				break;
			case 58:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(904);
				match(REFRESH);
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(905);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(909);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(906);
							matchWildcard();
							}
							} 
						}
						setState(911);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 59:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(914);
				match(CACHE);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(915);
					match(LAZY);
					}
				}

				setState(918);
				match(TABLE);
				setState(919);
				multipartIdentifier();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(920);
					match(OPTIONS);
					setState(921);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (REDUCE - 184)) | (1L << (SELECT - 184)) | (1L << (TABLE - 184)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(924);
						match(AS);
						}
					}

					setState(927);
					query();
					}
				}

				}
				break;
			case 60:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(930);
				match(UNCACHE);
				setState(931);
				match(TABLE);
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(932);
					match(IF);
					setState(933);
					match(EXISTS);
					}
					break;
				}
				setState(936);
				multipartIdentifier();
				}
				break;
			case 61:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(937);
				match(CLEAR);
				setState(938);
				match(CACHE);
				}
				break;
			case 62:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(939);
				match(LOAD);
				setState(940);
				match(DATA);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(941);
					match(LOCAL);
					}
				}

				setState(944);
				match(INPATH);
				setState(945);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(946);
					match(OVERWRITE);
					}
				}

				setState(949);
				match(INTO);
				setState(950);
				match(TABLE);
				setState(951);
				multipartIdentifier();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(952);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(955);
				match(TRUNCATE);
				setState(956);
				match(TABLE);
				setState(957);
				multipartIdentifier();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(958);
					partitionSpec();
					}
				}

				}
				break;
			case 64:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(961);
				match(MSCK);
				setState(962);
				match(REPAIR);
				setState(963);
				match(TABLE);
				setState(964);
				multipartIdentifier();
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(965);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(966);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 65:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(969);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(970);
				identifier();
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(971);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(975);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(972);
							matchWildcard();
							}
							} 
						}
						setState(977);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 66:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(980);
				match(SET);
				setState(981);
				match(ROLE);
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(982);
						matchWildcard();
						}
						} 
					}
					setState(987);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 67:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(988);
				match(SET);
				setState(989);
				match(TIME);
				setState(990);
				match(ZONE);
				setState(991);
				interval();
				}
				break;
			case 68:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(992);
				match(SET);
				setState(993);
				match(TIME);
				setState(994);
				match(ZONE);
				setState(995);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 69:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(996);
				match(SET);
				setState(997);
				match(TIME);
				setState(998);
				match(ZONE);
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(999);
						matchWildcard();
						}
						} 
					}
					setState(1004);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 70:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1005);
				match(SET);
				setState(1006);
				configKey();
				setState(1007);
				match(EQ);
				setState(1008);
				configValue();
				}
				break;
			case 71:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1010);
				match(SET);
				setState(1011);
				configKey();
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1012);
					match(EQ);
					setState(1016);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1013);
							matchWildcard();
							}
							} 
						}
						setState(1018);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					}
				}

				}
				break;
			case 72:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1021);
				match(SET);
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1022);
						matchWildcard();
						}
						} 
					}
					setState(1027);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(1028);
				match(EQ);
				setState(1029);
				configValue();
				}
				break;
			case 73:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1030);
				match(SET);
				setState(1034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1031);
						matchWildcard();
						}
						} 
					}
					setState(1036);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 74:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1037);
				match(RESET);
				setState(1038);
				configKey();
				}
				break;
			case 75:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1039);
				match(RESET);
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1040);
						matchWildcard();
						}
						} 
					}
					setState(1045);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 76:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1046);
				unsupportedHiveNativeCommands();
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1047);
						matchWildcard();
						}
						} 
					}
					setState(1052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
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

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			quotedIdentifier();
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

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			quotedIdentifier();
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(ModifiedSqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(ModifiedSqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(ModifiedSqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(ModifiedSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(ModifiedSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(ModifiedSqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(ModifiedSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(ModifiedSqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(ModifiedSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(ModifiedSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(ModifiedSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(ModifiedSqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(ModifiedSqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(ModifiedSqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(ModifiedSqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(ModifiedSqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(ModifiedSqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(ModifiedSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(ModifiedSqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(ModifiedSqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(ModifiedSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(ModifiedSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ModifiedSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(ModifiedSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(ModifiedSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(ModifiedSqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(ModifiedSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(ModifiedSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(ModifiedSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(ModifiedSqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(ModifiedSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(ModifiedSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(ModifiedSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(ModifiedSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(ModifiedSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(ModifiedSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(ModifiedSqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1060);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1062);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1064);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1068);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1075);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1099);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1122);
				tableIdentifier();
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1124);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1128);
				tableIdentifier();
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1133);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1134);
				tableIdentifier();
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1140);
				tableIdentifier();
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1145);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1146);
				tableIdentifier();
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1148);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1152);
				tableIdentifier();
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1160);
				tableIdentifier();
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1167);
				tableIdentifier();
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1173);
				tableIdentifier();
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1179);
				tableIdentifier();
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1185);
				tableIdentifier();
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1190);
				tableIdentifier();
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1191);
					partitionSpec();
					}
				}

				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1198);
				tableIdentifier();
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1199);
					partitionSpec();
					}
				}

				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1205);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1206);
				tableIdentifier();
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1207);
					partitionSpec();
					}
				}

				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1215);
				tableIdentifier();
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1216);
					partitionSpec();
					}
				}

				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1226);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(ModifiedSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(CREATE);
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1230);
				match(TEMPORARY);
				}
			}

			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1233);
				match(EXTERNAL);
				}
			}

			setState(1236);
			match(TABLE);
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1237);
				match(IF);
				setState(1238);
				match(NOT);
				setState(1239);
				match(EXISTS);
				}
				break;
			}
			setState(1242);
			multipartIdentifier();
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

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1244);
				match(CREATE);
				setState(1245);
				match(OR);
				}
			}

			setState(1248);
			match(REPLACE);
			setState(1249);
			match(TABLE);
			setState(1250);
			multipartIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(ModifiedSqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(ModifiedSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ModifiedSqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ModifiedSqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(ModifiedSqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(ModifiedSqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(CLUSTERED);
			setState(1253);
			match(BY);
			setState(1254);
			identifierList();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1255);
				match(SORTED);
				setState(1256);
				match(BY);
				setState(1257);
				orderedIdentifierList();
				}
			}

			setState(1260);
			match(INTO);
			setState(1261);
			match(INTEGER_VALUE);
			setState(1262);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(ModifiedSqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(ModifiedSqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(ModifiedSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ModifiedSqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(SKEWED);
			setState(1265);
			match(BY);
			setState(1266);
			identifierList();
			setState(1267);
			match(ON);
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1268);
				constantList();
				}
				break;
			case 2:
				{
				setState(1269);
				nestedConstantList();
				}
				break;
			}
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1272);
				match(STORED);
				setState(1273);
				match(AS);
				setState(1274);
				match(DIRECTORIES);
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(ModifiedSqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(LOCATION);
			setState(1278);
			match(STRING);
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

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ModifiedSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(COMMENT);
			setState(1281);
			match(STRING);
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

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1283);
				ctes();
				}
			}

			setState(1286);
			queryTerm(0);
			setState(1287);
			queryOrganization();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(ModifiedSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(ModifiedSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(ModifiedSqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(ModifiedSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(ModifiedSqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(ModifiedSqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(ModifiedSqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(ModifiedSqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ModifiedSqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertInto);
		int _la;
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				match(INSERT);
				setState(1290);
				match(OVERWRITE);
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1291);
					match(TABLE);
					}
					break;
				}
				setState(1294);
				multipartIdentifier();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1295);
					partitionSpec();
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1296);
						match(IF);
						setState(1297);
						match(NOT);
						setState(1298);
						match(EXISTS);
						}
					}

					}
				}

				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1303);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(INSERT);
				setState(1307);
				match(INTO);
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1308);
					match(TABLE);
					}
					break;
				}
				setState(1311);
				multipartIdentifier();
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1312);
					partitionSpec();
					}
				}

				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1315);
					match(IF);
					setState(1316);
					match(NOT);
					setState(1317);
					match(EXISTS);
					}
				}

				setState(1321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1320);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				match(INSERT);
				setState(1324);
				match(OVERWRITE);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1325);
					match(LOCAL);
					}
				}

				setState(1328);
				match(DIRECTORY);
				setState(1329);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1330);
					rowFormat();
					}
				}

				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1333);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1336);
				match(INSERT);
				setState(1337);
				match(OVERWRITE);
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1338);
					match(LOCAL);
					}
				}

				setState(1341);
				match(DIRECTORY);
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1342);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1345);
				tableProvider();
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1346);
					match(OPTIONS);
					setState(1347);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			partitionSpec();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1353);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ModifiedSqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(PARTITION);
			setState(1357);
			match(T__1);
			setState(1358);
			partitionVal();
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1359);
				match(T__3);
				setState(1360);
				partitionVal();
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1366);
			match(T__2);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ModifiedSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			identifier();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1369);
				match(EQ);
				setState(1370);
				constant();
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(ModifiedSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(ModifiedSqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(ModifiedSqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeFuncName);
		try {
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1377);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1378);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1379);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1383);
				match(T__4);
				setState(1384);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1389);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ModifiedSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(WITH);
			setState(1391);
			namedQuery();
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1392);
				match(T__3);
				setState(1393);
				namedQuery();
				}
				}
				setState(1398);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1400);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1403);
				match(AS);
				}
			}

			setState(1406);
			match(T__1);
			setState(1407);
			query();
			setState(1408);
			match(T__2);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ModifiedSqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(USING);
			setState(1411);
			multipartIdentifier();
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

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(ModifiedSqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(ModifiedSqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(ModifiedSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(ModifiedSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(ModifiedSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ModifiedSqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(ModifiedSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (LOCATION - 137)) | (1L << (OPTIONS - 137)) | (1L << (PARTITIONED - 137)) | (1L << (ROW - 137)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (SKEWED - 213)) | (1L << (STORED - 213)) | (1L << (TBLPROPERTIES - 213)))) != 0)) {
				{
				setState(1426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1413);
					match(OPTIONS);
					setState(1414);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1415);
					match(PARTITIONED);
					setState(1416);
					match(BY);
					setState(1417);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1418);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1419);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1420);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1421);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1422);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1423);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1424);
					match(TBLPROPERTIES);
					setState(1425);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1430);
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(T__1);
			setState(1432);
			tableProperty();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1433);
				match(T__3);
				setState(1434);
				tableProperty();
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1440);
			match(T__2);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ModifiedSqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (TRUE - 240)) | (1L << (EQ - 240)) | (1L << (STRING - 240)) | (1L << (INTEGER_VALUE - 240)) | (1L << (DECIMAL_VALUE - 240)))) != 0)) {
				{
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1443);
					match(EQ);
					}
				}

				setState(1446);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				identifier();
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1450);
					match(T__4);
					setState(1451);
					identifier();
					}
					}
					setState(1456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(ModifiedSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tablePropertyValue);
		try {
			setState(1464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1463);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(T__1);
			setState(1467);
			constant();
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1468);
				match(T__3);
				setState(1469);
				constant();
				}
				}
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1475);
			match(T__2);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(T__1);
			setState(1478);
			constantList();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1479);
				match(T__3);
				setState(1480);
				constantList();
				}
				}
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1486);
			match(T__2);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(ModifiedSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(ModifiedSqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createFileFormat);
		try {
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				match(STORED);
				setState(1489);
				match(AS);
				setState(1490);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				match(STORED);
				setState(1492);
				match(BY);
				setState(1493);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(ModifiedSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(ModifiedSqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(ModifiedSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ModifiedSqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fileFormat);
		try {
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(INPUTFORMAT);
				setState(1497);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1498);
				match(OUTPUTFORMAT);
				setState(1499);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				identifier();
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(ModifiedSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ModifiedSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(STRING);
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1504);
				match(WITH);
				setState(1505);
				match(SERDEPROPERTIES);
				setState(1506);
				tablePropertyList();
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			identifier();
			setState(1510);
			match(STRING);
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

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(ModifiedSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(ModifiedSqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(ModifiedSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(ModifiedSqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(ModifiedSqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				insertInto();
				setState(1513);
				queryTerm(0);
				setState(1514);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1516);
				fromClause();
				setState(1518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1517);
					multiInsertQueryBody();
					}
					}
					setState(1520); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1522);
				match(DELETE);
				setState(1523);
				match(FROM);
				setState(1524);
				multipartIdentifier();
				setState(1525);
				tableAlias();
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1526);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1529);
				match(UPDATE);
				setState(1530);
				multipartIdentifier();
				setState(1531);
				tableAlias();
				setState(1532);
				setClause();
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1533);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1536);
				match(MERGE);
				setState(1537);
				match(INTO);
				setState(1538);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1539);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1540);
				match(USING);
				setState(1546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1541);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1542);
					match(T__1);
					setState(1543);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1544);
					match(T__2);
					}
					break;
				}
				setState(1548);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1549);
				match(ON);
				setState(1550);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1551);
						matchedClause();
						}
						} 
					}
					setState(1556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1557);
					notMatchedClause();
					}
					}
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(ModifiedSqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(ModifiedSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ModifiedSqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(ModifiedSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ModifiedSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(ModifiedSqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(ModifiedSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(ModifiedSqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1565);
				match(ORDER);
				setState(1566);
				match(BY);
				setState(1567);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1568);
						match(T__3);
						setState(1569);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1577);
				match(CLUSTER);
				setState(1578);
				match(BY);
				setState(1579);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1580);
						match(T__3);
						setState(1581);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1589);
				match(DISTRIBUTE);
				setState(1590);
				match(BY);
				setState(1591);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1592);
						match(T__3);
						setState(1593);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1601);
				match(SORT);
				setState(1602);
				match(BY);
				setState(1603);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1604);
						match(T__3);
						setState(1605);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1610);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				}
				break;
			}
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1613);
				windowClause();
				}
				break;
			}
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1616);
				match(LIMIT);
				setState(1619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1617);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1618);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			insertInto();
			setState(1624);
			fromStatementBody();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(ModifiedSqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(ModifiedSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(ModifiedSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(ModifiedSqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1627);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1650);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1629);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1630);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1631);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1633);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1632);
							setQuantifier();
							}
						}

						setState(1635);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1636);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1637);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1638);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1640);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1639);
							setQuantifier();
							}
						}

						setState(1642);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1643);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1644);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1645);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1647);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1646);
							setQuantifier();
							}
						}

						setState(1649);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queryPrimary);
		try {
			setState(1664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1657);
				match(TABLE);
				setState(1658);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1659);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1660);
				match(T__1);
				setState(1661);
				query();
				setState(1662);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ModifiedSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(ModifiedSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(ModifiedSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(ModifiedSqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			expression();
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1667);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1670);
				match(NULLS);
				setState(1671);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			fromClause();
			setState(1676); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1675);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1678); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				transformClause();
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1681);
					whereClause();
					}
					break;
				}
				setState(1684);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1686);
				selectClause();
				setState(1690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1687);
						lateralView();
						}
						} 
					}
					setState(1692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(1694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1693);
					whereClause();
					}
					break;
				}
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1696);
					aggregationClause();
					}
					break;
				}
				setState(1700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1699);
					havingClause();
					}
					break;
				}
				setState(1703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1702);
					windowClause();
					}
					break;
				}
				setState(1705);
				queryOrganization();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_querySpecification);
		try {
			int _alt;
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				transformClause();
				setState(1711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1710);
					fromClause();
					}
					break;
				}
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1713);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
				selectClause();
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1717);
					fromClause();
					}
					break;
				}
				setState(1723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1720);
						lateralView();
						}
						} 
					}
					setState(1725);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				}
				setState(1727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1726);
					whereClause();
					}
					break;
				}
				setState(1730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1729);
					aggregationClause();
					}
					break;
				}
				setState(1733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1732);
					havingClause();
					}
					break;
				}
				setState(1736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1735);
					windowClause();
					}
					break;
				}
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

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(ModifiedSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(ModifiedSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ModifiedSqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(ModifiedSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(ModifiedSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(ModifiedSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(ModifiedSqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(ModifiedSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(ModifiedSqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1740);
				match(SELECT);
				setState(1741);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1742);
				match(T__1);
				setState(1743);
				namedExpressionSeq();
				setState(1744);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1746);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1747);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1748);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1749);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1752);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1755);
				match(RECORDWRITER);
				setState(1756);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1759);
			match(USING);
			setState(1760);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1761);
				match(AS);
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1762);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1763);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1764);
					match(T__1);
					setState(1767);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						setState(1765);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1766);
						colTypeList();
						}
						break;
					}
					setState(1769);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1775);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1778);
				match(RECORDREADER);
				setState(1779);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(ModifiedSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(SELECT);
			setState(1786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1783);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			setState(1790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1789);
				setQuantifier();
				}
				break;
			}
			setState(1792);
			namedExpressionSeq();
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(SET);
			setState(1795);
			assignmentList();
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

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(ModifiedSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(ModifiedSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(ModifiedSqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			match(WHEN);
			setState(1798);
			match(MATCHED);
			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1799);
				match(AND);
				setState(1800);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1803);
			match(THEN);
			setState(1804);
			matchedAction();
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(ModifiedSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(ModifiedSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(ModifiedSqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(WHEN);
			setState(1807);
			match(NOT);
			setState(1808);
			match(MATCHED);
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1809);
				match(AND);
				setState(1810);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1813);
			match(THEN);
			setState(1814);
			notMatchedAction();
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

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ModifiedSqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(ModifiedSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(ModifiedSqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedAction);
		try {
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1816);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1817);
				match(UPDATE);
				setState(1818);
				match(SET);
				setState(1819);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1820);
				match(UPDATE);
				setState(1821);
				match(SET);
				setState(1822);
				assignmentList();
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

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(ModifiedSqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(ModifiedSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedAction);
		int _la;
		try {
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				match(INSERT);
				setState(1826);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1827);
				match(INSERT);
				setState(1828);
				match(T__1);
				setState(1829);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1830);
				match(T__2);
				setState(1831);
				match(VALUES);
				setState(1832);
				match(T__1);
				setState(1833);
				expression();
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1834);
					match(T__3);
					setState(1835);
					expression();
					}
					}
					setState(1840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1841);
				match(T__2);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			assignment();
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1846);
				match(T__3);
				setState(1847);
				assignment();
				}
				}
				setState(1852);
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

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(ModifiedSqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1854);
			match(EQ);
			setState(1855);
			((AssignmentContext)_localctx).value = expression();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ModifiedSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			match(WHERE);
			setState(1858);
			booleanExpression(0);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ModifiedSqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			match(HAVING);
			setState(1861);
			booleanExpression(0);
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(T__5);
			setState(1864);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1866);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1865);
						match(T__3);
						}
						break;
					}
					setState(1868);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			setState(1874);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hintStatement);
		int _la;
		try {
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1876);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1878);
				match(T__1);
				setState(1879);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1880);
					match(T__3);
					setState(1881);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1887);
				match(T__2);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(FROM);
			setState(1892);
			relation();
			setState(1897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1893);
					match(T__3);
					setState(1894);
					relation();
					}
					} 
				}
				setState(1899);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1900);
					lateralView();
					}
					} 
				}
				setState(1905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			setState(1907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1906);
				pivotClause();
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(ModifiedSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ModifiedSqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(ModifiedSqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(ModifiedSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(ModifiedSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(ModifiedSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(ModifiedSqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1909);
				match(GROUP);
				setState(1910);
				match(BY);
				setState(1911);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(1916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1912);
						match(T__3);
						setState(1913);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(1918);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				match(GROUP);
				setState(1920);
				match(BY);
				setState(1921);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1922);
						match(T__3);
						setState(1923);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1928);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				}
				setState(1946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1929);
					match(WITH);
					setState(1930);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1931);
					match(WITH);
					setState(1932);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1933);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1934);
					match(SETS);
					setState(1935);
					match(T__1);
					setState(1936);
					groupingSet();
					setState(1941);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1937);
						match(T__3);
						setState(1938);
						groupingSet();
						}
						}
						setState(1943);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1944);
					match(T__2);
					}
					break;
				}
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_groupByClause);
		try {
			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1951);
				expression();
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

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(ModifiedSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(ModifiedSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(ModifiedSqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(ModifiedSqlBaseParser.SETS, 0); }
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_groupingAnalytics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROLLUP:
				{
				setState(1954);
				match(ROLLUP);
				}
				break;
			case CUBE:
				{
				setState(1955);
				match(CUBE);
				}
				break;
			case GROUPING:
				{
				setState(1956);
				match(GROUPING);
				setState(1957);
				match(SETS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1960);
			match(T__1);
			setState(1961);
			groupingSet();
			setState(1966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1962);
				match(T__3);
				setState(1963);
				groupingSet();
				}
				}
				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1969);
			match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_groupingSet);
		int _la;
		try {
			setState(1984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1971);
				match(T__1);
				setState(1980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1972);
					expression();
					setState(1977);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1973);
						match(T__3);
						setState(1974);
						expression();
						}
						}
						setState(1979);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1982);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1983);
				expression();
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(ModifiedSqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(ModifiedSqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(PIVOT);
			setState(1987);
			match(T__1);
			setState(1988);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1989);
			match(FOR);
			setState(1990);
			pivotColumn();
			setState(1991);
			match(IN);
			setState(1992);
			match(T__1);
			setState(1993);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1994);
				match(T__3);
				setState(1995);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2001);
			match(T__2);
			setState(2002);
			match(T__2);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pivotColumn);
		int _la;
		try {
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005);
				match(T__1);
				setState(2006);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2007);
					match(T__3);
					setState(2008);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2013);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2014);
				match(T__2);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			expression();
			setState(2023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2019);
					match(AS);
					}
					break;
				}
				setState(2022);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(ModifiedSqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(ModifiedSqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			match(LATERAL);
			setState(2026);
			match(VIEW);
			setState(2028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2027);
				match(OUTER);
				}
				break;
			}
			setState(2030);
			qualifiedName();
			setState(2031);
			match(T__1);
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2032);
				expression();
				setState(2037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2033);
					match(T__3);
					setState(2034);
					expression();
					}
					}
					setState(2039);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2042);
			match(T__2);
			setState(2043);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2044);
					match(AS);
					}
					break;
				}
				setState(2047);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2048);
						match(T__3);
						setState(2049);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2054);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				}
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(ModifiedSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(ModifiedSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			relationPrimary();
			setState(2063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2060);
					joinRelation();
					}
					} 
				}
				setState(2065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(ModifiedSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(ModifiedSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_joinRelation);
		try {
			setState(2077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2066);
				joinType();
				}
				setState(2067);
				match(JOIN);
				setState(2068);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2069);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2072);
				match(NATURAL);
				setState(2073);
				joinType();
				setState(2074);
				match(JOIN);
				setState(2075);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(ModifiedSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(ModifiedSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(ModifiedSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(ModifiedSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ModifiedSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(ModifiedSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(ModifiedSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(ModifiedSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_joinType);
		int _la;
		try {
			setState(2103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2079);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2083);
				match(LEFT);
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2084);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2087);
					match(LEFT);
					}
				}

				setState(2090);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2091);
				match(RIGHT);
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2092);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2095);
				match(FULL);
				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2096);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2099);
					match(LEFT);
					}
				}

				setState(2102);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(ModifiedSqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_joinCriteria);
		try {
			setState(2109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2105);
				match(ON);
				setState(2106);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2107);
				match(USING);
				setState(2108);
				identifierList();
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(ModifiedSqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			match(TABLESAMPLE);
			setState(2112);
			match(T__1);
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2113);
				sampleMethod();
				}
				break;
			}
			setState(2116);
			match(T__2);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(ModifiedSqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(ModifiedSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(ModifiedSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(ModifiedSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(ModifiedSqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(ModifiedSqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(ModifiedSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sampleMethod);
		int _la;
		try {
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2118);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2121);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2122);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2123);
				expression();
				setState(2124);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2126);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2127);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2128);
				match(OUT);
				setState(2129);
				match(OF);
				setState(2130);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2131);
					match(ON);
					setState(2137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						setState(2132);
						identifier();
						}
						break;
					case 2:
						{
						setState(2133);
						qualifiedName();
						setState(2134);
						match(T__1);
						setState(2135);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2141);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(T__1);
			setState(2145);
			identifierSeq();
			setState(2146);
			match(T__2);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2149);
					match(T__3);
					setState(2150);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			match(T__1);
			setState(2157);
			orderedIdentifier();
			setState(2162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2158);
				match(T__3);
				setState(2159);
				orderedIdentifier();
				}
				}
				setState(2164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2165);
			match(T__2);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(ModifiedSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2168);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			match(T__1);
			setState(2172);
			identifierComment();
			setState(2177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2173);
				match(T__3);
				setState(2174);
				identifierComment();
				}
				}
				setState(2179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2180);
			match(T__2);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			identifier();
			setState(2184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2183);
				commentSpec();
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_relationPrimary);
		try {
			setState(2210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				multipartIdentifier();
				setState(2188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2187);
					sample();
					}
					break;
				}
				setState(2190);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2192);
				match(T__1);
				setState(2193);
				query();
				setState(2194);
				match(T__2);
				setState(2196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2195);
					sample();
					}
					break;
				}
				setState(2198);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2200);
				match(T__1);
				setState(2201);
				relation();
				setState(2202);
				match(T__2);
				setState(2204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2203);
					sample();
					}
					break;
				}
				setState(2206);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2208);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2209);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(ModifiedSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(VALUES);
			setState(2213);
			expression();
			setState(2218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2214);
					match(T__3);
					setState(2215);
					expression();
					}
					} 
				}
				setState(2220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(2221);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2224);
			match(T__1);
			setState(2233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2225);
				expression();
				setState(2230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2226);
					match(T__3);
					setState(2227);
					expression();
					}
					}
					setState(2232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2235);
			match(T__2);
			setState(2236);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2238);
					match(AS);
					}
					break;
				}
				setState(2241);
				strictIdentifier();
				setState(2243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2242);
					identifierList();
					}
					break;
				}
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(ModifiedSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(ModifiedSqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(ModifiedSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(ModifiedSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ModifiedSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(ModifiedSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(ModifiedSqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(ModifiedSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(ModifiedSqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(ModifiedSqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(ModifiedSqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(ModifiedSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ModifiedSqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(ModifiedSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(ModifiedSqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(ModifiedSqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(ModifiedSqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(ModifiedSqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(ModifiedSqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(ModifiedSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ModifiedSqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(ModifiedSqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_rowFormat);
		try {
			setState(2296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2247);
				match(ROW);
				setState(2248);
				match(FORMAT);
				setState(2249);
				match(SERDE);
				setState(2250);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2251);
					match(WITH);
					setState(2252);
					match(SERDEPROPERTIES);
					setState(2253);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2256);
				match(ROW);
				setState(2257);
				match(FORMAT);
				setState(2258);
				match(DELIMITED);
				setState(2268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2259);
					match(FIELDS);
					setState(2260);
					match(TERMINATED);
					setState(2261);
					match(BY);
					setState(2262);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
					case 1:
						{
						setState(2263);
						match(ESCAPED);
						setState(2264);
						match(BY);
						setState(2265);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2270);
					match(COLLECTION);
					setState(2271);
					match(ITEMS);
					setState(2272);
					match(TERMINATED);
					setState(2273);
					match(BY);
					setState(2274);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2277);
					match(MAP);
					setState(2278);
					match(KEYS);
					setState(2279);
					match(TERMINATED);
					setState(2280);
					match(BY);
					setState(2281);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2284);
					match(LINES);
					setState(2285);
					match(TERMINATED);
					setState(2286);
					match(BY);
					setState(2287);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2290);
					match(NULL);
					setState(2291);
					match(DEFINED);
					setState(2292);
					match(AS);
					setState(2293);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
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

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			multipartIdentifier();
			setState(2303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2299);
				match(T__3);
				setState(2300);
				multipartIdentifier();
				}
				}
				setState(2305);
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2307);
					match(T__4);
					setState(2308);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2314);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2315);
				match(T__4);
				}
				break;
			}
			setState(2319);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2321);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2322);
				match(T__4);
				}
				break;
			}
			setState(2326);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			expression();
			setState(2336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2329);
					match(AS);
					}
					break;
				}
				setState(2334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2332);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2333);
					identifierList();
					}
					break;
				}
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			namedExpression();
			setState(2343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2339);
					match(T__3);
					setState(2340);
					namedExpression();
					}
					} 
				}
				setState(2345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
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

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			match(T__1);
			setState(2347);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2348);
				match(T__3);
				setState(2349);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2355);
			match(T__2);
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

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_partitionField);
		try {
			setState(2359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2357);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2358);
				colType();
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

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_transform);
		int _la;
		try {
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2361);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2362);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2363);
				match(T__1);
				setState(2364);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2365);
					match(T__3);
					setState(2366);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2372);
				match(T__2);
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

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_transformArgument);
		try {
			setState(2378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2376);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2377);
				constant();
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2383);
				match(NOT);
				setState(2384);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2385);
				match(EXISTS);
				setState(2386);
				match(T__1);
				setState(2387);
				query();
				setState(2388);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2390);
				valueExpression(0);
				setState(2392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2391);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2396);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2397);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2398);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2399);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2400);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2401);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(ModifiedSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(ModifiedSqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(ModifiedSqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(ModifiedSqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(ModifiedSqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(ModifiedSqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(ModifiedSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(ModifiedSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ModifiedSqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(ModifiedSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(ModifiedSqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_predicate);
		int _la;
		try {
			setState(2489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2407);
					match(NOT);
					}
				}

				setState(2410);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2411);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2412);
				match(AND);
				setState(2413);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2415);
					match(NOT);
					}
				}

				setState(2418);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2419);
				match(T__1);
				setState(2420);
				expression();
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2421);
					match(T__3);
					setState(2422);
					expression();
					}
					}
					setState(2427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2428);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2430);
					match(NOT);
					}
				}

				setState(2433);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2434);
				match(T__1);
				setState(2435);
				query();
				setState(2436);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2438);
					match(NOT);
					}
				}

				setState(2441);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2442);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2443);
					match(NOT);
					}
				}

				setState(2446);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2447);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2448);
					match(T__1);
					setState(2449);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(2450);
					match(T__1);
					setState(2451);
					expression();
					setState(2456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2452);
						match(T__3);
						setState(2453);
						expression();
						}
						}
						setState(2458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2459);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2463);
					match(NOT);
					}
				}

				setState(2466);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2467);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2468);
					match(ESCAPE);
					setState(2469);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2472);
				match(IS);
				setState(2474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2473);
					match(NOT);
					}
				}

				setState(2476);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2477);
				match(IS);
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2478);
					match(NOT);
					}
				}

				setState(2481);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2482);
				match(IS);
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2483);
					match(NOT);
					}
				}

				setState(2486);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2487);
				match(FROM);
				setState(2488);
				((PredicateContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ModifiedSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ModifiedSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ModifiedSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(ModifiedSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ModifiedSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(ModifiedSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(ModifiedSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(ModifiedSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(ModifiedSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ModifiedSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(ModifiedSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2492);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2493);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (PLUS - 271)) | (1L << (MINUS - 271)) | (1L << (TILDE - 271)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2494);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2497);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2498);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & ((1L << (ASTERISK - 273)) | (1L << (SLASH - 273)) | (1L << (PERCENT - 273)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2499);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2500);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2501);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (PLUS - 271)) | (1L << (MINUS - 271)) | (1L << (CONCAT_PIPE - 271)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2502);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2503);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2504);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2505);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2506);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2507);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2508);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2509);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2510);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2511);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2512);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2513);
						comparisonOperator();
						setState(2514);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(ModifiedSqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(ModifiedSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ModifiedSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ModifiedSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(ModifiedSqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(ModifiedSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(ModifiedSqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(ModifiedSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(ModifiedSqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(ModifiedSqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(ModifiedSqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(ModifiedSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(ModifiedSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(ModifiedSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(ModifiedSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(ModifiedSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(ModifiedSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(ModifiedSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(ModifiedSqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(ModifiedSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ModifiedSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ModifiedSqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(ModifiedSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(ModifiedSqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(ModifiedSqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(ModifiedSqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(ModifiedSqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(ModifiedSqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(ModifiedSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ModifiedSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ModifiedSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(ModifiedSqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(ModifiedSqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(ModifiedSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(ModifiedSqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2522);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2523);
				match(CASE);
				setState(2525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2524);
					whenClause();
					}
					}
					setState(2527); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2529);
					match(ELSE);
					setState(2530);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2533);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2535);
				match(CASE);
				setState(2536);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2537);
					whenClause();
					}
					}
					setState(2540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2542);
					match(ELSE);
					setState(2543);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2546);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2548);
				match(CAST);
				setState(2549);
				match(T__1);
				setState(2550);
				expression();
				setState(2551);
				match(AS);
				setState(2552);
				dataType();
				setState(2553);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2555);
				match(STRUCT);
				setState(2556);
				match(T__1);
				setState(2565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2557);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2558);
						match(T__3);
						setState(2559);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2567);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2568);
				match(FIRST);
				setState(2569);
				match(T__1);
				setState(2570);
				expression();
				setState(2573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2571);
					match(IGNORE);
					setState(2572);
					match(NULLS);
					}
				}

				setState(2575);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2577);
				match(LAST);
				setState(2578);
				match(T__1);
				setState(2579);
				expression();
				setState(2582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2580);
					match(IGNORE);
					setState(2581);
					match(NULLS);
					}
				}

				setState(2584);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2586);
				match(POSITION);
				setState(2587);
				match(T__1);
				setState(2588);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2589);
				match(IN);
				setState(2590);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2591);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2593);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2594);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2595);
				qualifiedName();
				setState(2596);
				match(T__4);
				setState(2597);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2599);
				match(T__1);
				setState(2600);
				namedExpression();
				setState(2603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2601);
					match(T__3);
					setState(2602);
					namedExpression();
					}
					}
					setState(2605); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2607);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2609);
				match(T__1);
				setState(2610);
				query();
				setState(2611);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2613);
				functionName();
				setState(2614);
				match(T__1);
				setState(2626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
					case 1:
						{
						setState(2615);
						setQuantifier();
						}
						break;
					}
					setState(2618);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2623);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2619);
						match(T__3);
						setState(2620);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2625);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2628);
				match(T__2);
				setState(2635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2629);
					match(FILTER);
					setState(2630);
					match(T__1);
					setState(2631);
					match(WHERE);
					setState(2632);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2633);
					match(T__2);
					}
					break;
				}
				setState(2639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2637);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2638);
					match(NULLS);
					}
					break;
				}
				setState(2643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2641);
					match(OVER);
					setState(2642);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2645);
				identifier();
				setState(2646);
				match(T__7);
				setState(2647);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2649);
				match(T__1);
				setState(2650);
				identifier();
				setState(2653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2651);
					match(T__3);
					setState(2652);
					identifier();
					}
					}
					setState(2655); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2657);
				match(T__2);
				setState(2658);
				match(T__7);
				setState(2659);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2661);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2662);
				match(T__1);
				setState(2663);
				expression();
				setState(2664);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2666);
				match(EXTRACT);
				setState(2667);
				match(T__1);
				setState(2668);
				((ExtractContext)_localctx).field = identifier();
				setState(2669);
				match(FROM);
				setState(2670);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2671);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2673);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2674);
				match(T__1);
				setState(2675);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2676);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2677);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2678);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2679);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2682);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2684);
				match(TRIM);
				setState(2685);
				match(T__1);
				setState(2687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2686);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2689);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2692);
				match(FROM);
				setState(2693);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2694);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2696);
				match(OVERLAY);
				setState(2697);
				match(T__1);
				setState(2698);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2699);
				match(PLACING);
				setState(2700);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2701);
				match(FROM);
				setState(2702);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2703);
					match(FOR);
					setState(2704);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2707);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2711);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2712);
						match(T__8);
						setState(2713);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2714);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2716);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2717);
						match(T__4);
						setState(2718);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(ModifiedSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ModifiedSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constant);
		try {
			int _alt;
			setState(2736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2724);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2725);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2726);
				identifier();
				setState(2727);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2729);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2730);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2732); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2731);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2734); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ModifiedSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ModifiedSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(ModifiedSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(ModifiedSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ModifiedSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(ModifiedSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ModifiedSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(ModifiedSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2738);
			_la = _input.LA(1);
			if ( !(((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (EQ - 263)) | (1L << (NSEQ - 263)) | (1L << (NEQ - 263)) | (1L << (NEQJ - 263)) | (1L << (LT - 263)) | (1L << (LTE - 263)) | (1L << (GT - 263)) | (1L << (GTE - 263)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ModifiedSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(ModifiedSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ModifiedSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ModifiedSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(ModifiedSqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(ModifiedSqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(ModifiedSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(ModifiedSqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(ModifiedSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(ModifiedSqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2740);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (PLUS - 271)) | (1L << (MINUS - 271)) | (1L << (ASTERISK - 271)) | (1L << (SLASH - 271)) | (1L << (PERCENT - 271)) | (1L << (TILDE - 271)) | (1L << (AMPERSAND - 271)) | (1L << (PIPE - 271)) | (1L << (CONCAT_PIPE - 271)) | (1L << (HAT - 271)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2742);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (IN - 112)) | (1L << (NOT - 112)) | (1L << (OR - 112)))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ModifiedSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ModifiedSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2744);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(ModifiedSqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2746);
			match(INTERVAL);
			setState(2749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				setState(2747);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2748);
				errorCapturingUnitToUnitInterval();
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

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
			multiUnitsInterval();
			setState(2753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				{
				setState(2752);
				unitToUnitInterval();
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

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2758); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2755);
					intervalValue();
					setState(2756);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2760); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2762);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2763);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2764);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
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

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(ModifiedSqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2767);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2768);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2769);
			match(TO);
			setState(2770);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(ModifiedSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(ModifiedSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(ModifiedSqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_intervalValue);
		int _la;
		try {
			setState(2777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2772);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2775);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2776);
				match(STRING);
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

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(ModifiedSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(ModifiedSqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_colPosition);
		try {
			setState(2782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2779);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2780);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2781);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(ModifiedSqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(ModifiedSqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(ModifiedSqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(ModifiedSqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(ModifiedSqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(ModifiedSqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(ModifiedSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_dataType);
		int _la;
		try {
			setState(2818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2784);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2785);
				match(LT);
				setState(2786);
				dataType();
				setState(2787);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2789);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2790);
				match(LT);
				setState(2791);
				dataType();
				setState(2792);
				match(T__3);
				setState(2793);
				dataType();
				setState(2794);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2796);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2803);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2797);
					match(LT);
					setState(2799);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						setState(2798);
						complexColTypeList();
						}
						break;
					}
					setState(2801);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2802);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2805);
				identifier();
				setState(2816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
				case 1:
					{
					setState(2806);
					match(T__1);
					setState(2807);
					match(INTEGER_VALUE);
					setState(2812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2808);
						match(T__3);
						setState(2809);
						match(INTEGER_VALUE);
						}
						}
						setState(2814);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2815);
					match(T__2);
					}
					break;
				}
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

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			qualifiedColTypeWithPosition();
			setState(2825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2821);
				match(T__3);
				setState(2822);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2827);
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

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2828);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2829);
			dataType();
			setState(2832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2830);
				match(NOT);
				setState(2831);
				match(NULL);
				}
			}

			setState(2835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2834);
				commentSpec();
				}
			}

			setState(2838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2837);
				colPosition();
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
			colType();
			setState(2845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2841);
					match(T__3);
					setState(2842);
					colType();
					}
					} 
				}
				setState(2847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2849);
			dataType();
			setState(2852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				{
				setState(2850);
				match(NOT);
				setState(2851);
				match(NULL);
				}
				break;
			}
			setState(2855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2854);
				commentSpec();
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2857);
			complexColType();
			setState(2862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2858);
				match(T__3);
				setState(2859);
				complexColType();
				}
				}
				setState(2864);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2865);
			identifier();
			setState(2866);
			match(T__10);
			setState(2867);
			dataType();
			setState(2870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2868);
				match(NOT);
				setState(2869);
				match(NULL);
				}
			}

			setState(2873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2872);
				commentSpec();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(ModifiedSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(ModifiedSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2875);
			match(WHEN);
			setState(2876);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2877);
			match(THEN);
			setState(2878);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(ModifiedSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2880);
			match(WINDOW);
			setState(2881);
			namedWindow();
			setState(2886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2882);
					match(T__3);
					setState(2883);
					namedWindow();
					}
					} 
				}
				setState(2888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2889);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2890);
			match(AS);
			setState(2891);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(ModifiedSqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(ModifiedSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ModifiedSqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(ModifiedSqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ModifiedSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(ModifiedSqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(ModifiedSqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_windowSpec);
		int _la;
		try {
			setState(2939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2893);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2894);
				match(T__1);
				setState(2895);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2896);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2898);
				match(T__1);
				setState(2933);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2899);
					match(CLUSTER);
					setState(2900);
					match(BY);
					setState(2901);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2906);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2902);
						match(T__3);
						setState(2903);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2908);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2919);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2909);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2910);
						match(BY);
						setState(2911);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2916);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2912);
							match(T__3);
							setState(2913);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2918);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2921);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2922);
						match(BY);
						setState(2923);
						sortItem();
						setState(2928);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2924);
							match(T__3);
							setState(2925);
							sortItem();
							}
							}
							setState(2930);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2935);
					windowFrame();
					}
				}

				setState(2938);
				match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(ModifiedSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(ModifiedSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(ModifiedSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_windowFrame);
		try {
			setState(2957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2941);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2942);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2943);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2944);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2945);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2946);
				match(BETWEEN);
				setState(2947);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2948);
				match(AND);
				setState(2949);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2951);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2952);
				match(BETWEEN);
				setState(2953);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2954);
				match(AND);
				setState(2955);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(ModifiedSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(ModifiedSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(ModifiedSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(ModifiedSqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(ModifiedSqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_frameBound);
		int _la;
		try {
			setState(2966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2959);
				match(UNBOUNDED);
				setState(2960);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2961);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2962);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2963);
				expression();
				setState(2964);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2968);
			qualifiedName();
			setState(2973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2969);
				match(T__3);
				setState(2970);
				qualifiedName();
				}
				}
				setState(2975);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(ModifiedSqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(ModifiedSqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ModifiedSqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_functionName);
		try {
			setState(2980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2976);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2977);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2978);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2979);
				match(RIGHT);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2982);
			identifier();
			setState(2987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2983);
					match(T__4);
					setState(2984);
					identifier();
					}
					} 
				}
				setState(2989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2990);
			identifier();
			setState(2991);
			errorCapturingIdentifierExtra();
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

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(ModifiedSqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ModifiedSqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2995); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2993);
						match(MINUS);
						setState(2994);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2997); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_identifier);
		try {
			setState(3005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3002);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3003);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3004);
				strictNonReserved();
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(ModifiedSqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_strictIdentifier);
		try {
			setState(3013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3007);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3008);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3009);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3010);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3011);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3012);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(ModifiedSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3015);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(ModifiedSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(ModifiedSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(ModifiedSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(ModifiedSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(ModifiedSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(ModifiedSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(ModifiedSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(ModifiedSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ModifiedSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(ModifiedSqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(ModifiedSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ModifiedSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_number);
		int _la;
		try {
			setState(3060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3017);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3018);
					match(MINUS);
					}
				}

				setState(3021);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3022);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3023);
					match(MINUS);
					}
				}

				setState(3026);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3027);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3028);
					match(MINUS);
					}
				}

				setState(3031);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3032);
					match(MINUS);
					}
				}

				setState(3035);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3036);
					match(MINUS);
					}
				}

				setState(3039);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3040);
					match(MINUS);
					}
				}

				setState(3043);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3044);
					match(MINUS);
					}
				}

				setState(3047);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3048);
					match(MINUS);
					}
				}

				setState(3051);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3052);
					match(MINUS);
					}
				}

				setState(3055);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3056);
					match(MINUS);
					}
				}

				setState(3059);
				match(BIGDECIMAL_LITERAL);
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

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(ModifiedSqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_alterColumnAction);
		int _la;
		try {
			setState(3069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3062);
				match(TYPE);
				setState(3063);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3064);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3065);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3066);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3067);
				match(NOT);
				setState(3068);
				match(NULL);
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

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ModifiedSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(ModifiedSqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(ModifiedSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(ModifiedSqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(ModifiedSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(ModifiedSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(ModifiedSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(ModifiedSqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(ModifiedSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(ModifiedSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(ModifiedSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(ModifiedSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(ModifiedSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(ModifiedSqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(ModifiedSqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(ModifiedSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ModifiedSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(ModifiedSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(ModifiedSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(ModifiedSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(ModifiedSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(ModifiedSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(ModifiedSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(ModifiedSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(ModifiedSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(ModifiedSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(ModifiedSqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(ModifiedSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(ModifiedSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(ModifiedSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(ModifiedSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ModifiedSqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(ModifiedSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(ModifiedSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(ModifiedSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(ModifiedSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ModifiedSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(ModifiedSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ModifiedSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(ModifiedSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ModifiedSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(ModifiedSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(ModifiedSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(ModifiedSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ModifiedSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(ModifiedSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(ModifiedSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(ModifiedSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(ModifiedSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(ModifiedSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(ModifiedSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(ModifiedSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(ModifiedSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(ModifiedSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(ModifiedSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(ModifiedSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(ModifiedSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(ModifiedSqlBaseParser.GROUPING, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(ModifiedSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(ModifiedSqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(ModifiedSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(ModifiedSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(ModifiedSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(ModifiedSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ModifiedSqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(ModifiedSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(ModifiedSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(ModifiedSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(ModifiedSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(ModifiedSqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ModifiedSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(ModifiedSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(ModifiedSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(ModifiedSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(ModifiedSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(ModifiedSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(ModifiedSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(ModifiedSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(ModifiedSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(ModifiedSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(ModifiedSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(ModifiedSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(ModifiedSqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(ModifiedSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModifiedSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(ModifiedSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(ModifiedSqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(ModifiedSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(ModifiedSqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(ModifiedSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(ModifiedSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(ModifiedSqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(ModifiedSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(ModifiedSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(ModifiedSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(ModifiedSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(ModifiedSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(ModifiedSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(ModifiedSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(ModifiedSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(ModifiedSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(ModifiedSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(ModifiedSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(ModifiedSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(ModifiedSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(ModifiedSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(ModifiedSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(ModifiedSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(ModifiedSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(ModifiedSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(ModifiedSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(ModifiedSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(ModifiedSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(ModifiedSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(ModifiedSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(ModifiedSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(ModifiedSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(ModifiedSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(ModifiedSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(ModifiedSqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(ModifiedSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(ModifiedSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(ModifiedSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(ModifiedSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(ModifiedSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(ModifiedSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(ModifiedSqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(ModifiedSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SEMI() { return getToken(ModifiedSqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(ModifiedSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(ModifiedSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ModifiedSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(ModifiedSqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(ModifiedSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(ModifiedSqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(ModifiedSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(ModifiedSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(ModifiedSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(ModifiedSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(ModifiedSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(ModifiedSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(ModifiedSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(ModifiedSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(ModifiedSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ModifiedSqlBaseParser.SYNC, 0); }
		public TerminalNode TABLES() { return getToken(ModifiedSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(ModifiedSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(ModifiedSqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(ModifiedSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(ModifiedSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(ModifiedSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(ModifiedSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(ModifiedSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(ModifiedSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(ModifiedSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(ModifiedSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(ModifiedSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ModifiedSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(ModifiedSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(ModifiedSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(ModifiedSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(ModifiedSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ModifiedSqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(ModifiedSqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(ModifiedSqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(ModifiedSqlBaseParser.WINDOW, 0); }
		public TerminalNode ZONE() { return getToken(ModifiedSqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3071);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ADD - 12)) | (1L << (AFTER - 12)) | (1L << (ALTER - 12)) | (1L << (ANALYZE - 12)) | (1L << (ANTI - 12)) | (1L << (ARCHIVE - 12)) | (1L << (ARRAY - 12)) | (1L << (ASC - 12)) | (1L << (AT - 12)) | (1L << (BETWEEN - 12)) | (1L << (BUCKET - 12)) | (1L << (BUCKETS - 12)) | (1L << (BY - 12)) | (1L << (CACHE - 12)) | (1L << (CASCADE - 12)) | (1L << (CHANGE - 12)) | (1L << (CLEAR - 12)) | (1L << (CLUSTER - 12)) | (1L << (CLUSTERED - 12)) | (1L << (CODEGEN - 12)) | (1L << (COLLECTION - 12)) | (1L << (COLUMNS - 12)) | (1L << (COMMENT - 12)) | (1L << (COMMIT - 12)) | (1L << (COMPACT - 12)) | (1L << (COMPACTIONS - 12)) | (1L << (COMPUTE - 12)) | (1L << (CONCATENATE - 12)) | (1L << (COST - 12)) | (1L << (CUBE - 12)) | (1L << (CURRENT - 12)) | (1L << (DATA - 12)) | (1L << (DATABASE - 12)) | (1L << (DATABASES - 12)) | (1L << (DBPROPERTIES - 12)) | (1L << (DEFINED - 12)) | (1L << (DELETE - 12)) | (1L << (DELIMITED - 12)) | (1L << (DESC - 12)) | (1L << (DESCRIBE - 12)) | (1L << (DFS - 12)) | (1L << (DIRECTORIES - 12)) | (1L << (DIRECTORY - 12)) | (1L << (DISTRIBUTE - 12)) | (1L << (DIV - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DROP - 76)) | (1L << (ESCAPED - 76)) | (1L << (EXCHANGE - 76)) | (1L << (EXISTS - 76)) | (1L << (EXPLAIN - 76)) | (1L << (EXPORT - 76)) | (1L << (EXTENDED - 76)) | (1L << (EXTERNAL - 76)) | (1L << (EXTRACT - 76)) | (1L << (FIELDS - 76)) | (1L << (FILEFORMAT - 76)) | (1L << (FIRST - 76)) | (1L << (FOLLOWING - 76)) | (1L << (FORMAT - 76)) | (1L << (FORMATTED - 76)) | (1L << (FUNCTION - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (GLOBAL - 76)) | (1L << (GROUPING - 76)) | (1L << (IF - 76)) | (1L << (IGNORE - 76)) | (1L << (IMPORT - 76)) | (1L << (INDEX - 76)) | (1L << (INDEXES - 76)) | (1L << (INPATH - 76)) | (1L << (INPUTFORMAT - 76)) | (1L << (INSERT - 76)) | (1L << (INTERVAL - 76)) | (1L << (ITEMS - 76)) | (1L << (KEYS - 76)) | (1L << (LAST - 76)) | (1L << (LATERAL - 76)) | (1L << (LAZY - 76)) | (1L << (LIKE - 76)) | (1L << (LIMIT - 76)) | (1L << (LINES - 76)) | (1L << (LIST - 76)) | (1L << (LOAD - 76)) | (1L << (LOCAL - 76)) | (1L << (LOCATION - 76)) | (1L << (LOCK - 76)) | (1L << (LOCKS - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOGICAL - 140)) | (1L << (MACRO - 140)) | (1L << (MAP - 140)) | (1L << (MATCHED - 140)) | (1L << (MERGE - 140)) | (1L << (MSCK - 140)) | (1L << (NAMESPACE - 140)) | (1L << (NAMESPACES - 140)) | (1L << (NO - 140)) | (1L << (NULLS - 140)) | (1L << (OF - 140)) | (1L << (OPTION - 140)) | (1L << (OPTIONS - 140)) | (1L << (OUT - 140)) | (1L << (OUTPUTFORMAT - 140)) | (1L << (OVER - 140)) | (1L << (OVERLAY - 140)) | (1L << (OVERWRITE - 140)) | (1L << (PARTITION - 140)) | (1L << (PARTITIONED - 140)) | (1L << (PARTITIONS - 140)) | (1L << (PERCENTLIT - 140)) | (1L << (PIVOT - 140)) | (1L << (PLACING - 140)) | (1L << (POSITION - 140)) | (1L << (PRECEDING - 140)) | (1L << (PRINCIPALS - 140)) | (1L << (PROPERTIES - 140)) | (1L << (PURGE - 140)) | (1L << (QUERY - 140)) | (1L << (RANGE - 140)) | (1L << (RECORDREADER - 140)) | (1L << (RECORDWRITER - 140)) | (1L << (RECOVER - 140)) | (1L << (REDUCE - 140)) | (1L << (REFRESH - 140)) | (1L << (RENAME - 140)) | (1L << (REPAIR - 140)) | (1L << (REPLACE - 140)) | (1L << (RESET - 140)) | (1L << (RESPECT - 140)) | (1L << (RESTRICT - 140)) | (1L << (REVOKE - 140)) | (1L << (RLIKE - 140)) | (1L << (ROLE - 140)) | (1L << (ROLES - 140)) | (1L << (ROLLBACK - 140)) | (1L << (ROLLUP - 140)) | (1L << (ROW - 140)) | (1L << (ROWS - 140)) | (1L << (SCHEMA - 140)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (SEMI - 204)) | (1L << (SEPARATED - 204)) | (1L << (SERDE - 204)) | (1L << (SERDEPROPERTIES - 204)) | (1L << (SET - 204)) | (1L << (SETMINUS - 204)) | (1L << (SETS - 204)) | (1L << (SHOW - 204)) | (1L << (SKEWED - 204)) | (1L << (SORT - 204)) | (1L << (SORTED - 204)) | (1L << (START - 204)) | (1L << (STATISTICS - 204)) | (1L << (STORED - 204)) | (1L << (STRATIFY - 204)) | (1L << (STRUCT - 204)) | (1L << (SUBSTR - 204)) | (1L << (SUBSTRING - 204)) | (1L << (SYNC - 204)) | (1L << (TABLES - 204)) | (1L << (TABLESAMPLE - 204)) | (1L << (TBLPROPERTIES - 204)) | (1L << (TEMPORARY - 204)) | (1L << (TERMINATED - 204)) | (1L << (TOUCH - 204)) | (1L << (TRANSACTION - 204)) | (1L << (TRANSACTIONS - 204)) | (1L << (TRANSFORM - 204)) | (1L << (TRIM - 204)) | (1L << (TRUE - 204)) | (1L << (TRUNCATE - 204)) | (1L << (TYPE - 204)) | (1L << (UNARCHIVE - 204)) | (1L << (UNBOUNDED - 204)) | (1L << (UNCACHE - 204)) | (1L << (UNLOCK - 204)) | (1L << (UNSET - 204)) | (1L << (UPDATE - 204)) | (1L << (USE - 204)) | (1L << (VALUES - 204)) | (1L << (VIEW - 204)) | (1L << (VIEWS - 204)) | (1L << (WINDOW - 204)) | (1L << (ZONE - 204)))) != 0)) ) {
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

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(ModifiedSqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(ModifiedSqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(ModifiedSqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(ModifiedSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(ModifiedSqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(ModifiedSqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(ModifiedSqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(ModifiedSqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(ModifiedSqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(ModifiedSqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(ModifiedSqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(ModifiedSqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(ModifiedSqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(ModifiedSqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(ModifiedSqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3073);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (ANTI - 18)) | (1L << (CROSS - 18)) | (1L << (EXCEPT - 18)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (FULL - 101)) | (1L << (INNER - 101)) | (1L << (INTERSECT - 101)) | (1L << (JOIN - 101)) | (1L << (LEFT - 101)) | (1L << (NATURAL - 101)) | (1L << (ON - 101)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (RIGHT - 194)) | (1L << (SEMI - 194)) | (1L << (SETMINUS - 194)) | (1L << (UNION - 194)) | (1L << (USING - 194)))) != 0)) ) {
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ModifiedSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(ModifiedSqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(ModifiedSqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ModifiedSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(ModifiedSqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(ModifiedSqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(ModifiedSqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(ModifiedSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(ModifiedSqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ModifiedSqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(ModifiedSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(ModifiedSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(ModifiedSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(ModifiedSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ModifiedSqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(ModifiedSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(ModifiedSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(ModifiedSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(ModifiedSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(ModifiedSqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(ModifiedSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ModifiedSqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(ModifiedSqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(ModifiedSqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ModifiedSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ModifiedSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(ModifiedSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(ModifiedSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(ModifiedSqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(ModifiedSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(ModifiedSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(ModifiedSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(ModifiedSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(ModifiedSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(ModifiedSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(ModifiedSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(ModifiedSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(ModifiedSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ModifiedSqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(ModifiedSqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(ModifiedSqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(ModifiedSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(ModifiedSqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(ModifiedSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(ModifiedSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(ModifiedSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(ModifiedSqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(ModifiedSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(ModifiedSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ModifiedSqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(ModifiedSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(ModifiedSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(ModifiedSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(ModifiedSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(ModifiedSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ModifiedSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(ModifiedSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ModifiedSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(ModifiedSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(ModifiedSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ModifiedSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(ModifiedSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(ModifiedSqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ModifiedSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ModifiedSqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(ModifiedSqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(ModifiedSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(ModifiedSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(ModifiedSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ModifiedSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(ModifiedSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(ModifiedSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(ModifiedSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(ModifiedSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(ModifiedSqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(ModifiedSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(ModifiedSqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(ModifiedSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(ModifiedSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(ModifiedSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(ModifiedSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(ModifiedSqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(ModifiedSqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(ModifiedSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(ModifiedSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(ModifiedSqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(ModifiedSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(ModifiedSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(ModifiedSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(ModifiedSqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(ModifiedSqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(ModifiedSqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(ModifiedSqlBaseParser.HAVING, 0); }
		public TerminalNode IF() { return getToken(ModifiedSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(ModifiedSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(ModifiedSqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(ModifiedSqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ModifiedSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(ModifiedSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(ModifiedSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(ModifiedSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(ModifiedSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ModifiedSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ModifiedSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ModifiedSqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(ModifiedSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(ModifiedSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(ModifiedSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(ModifiedSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(ModifiedSqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(ModifiedSqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(ModifiedSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ModifiedSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(ModifiedSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(ModifiedSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(ModifiedSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(ModifiedSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(ModifiedSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(ModifiedSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(ModifiedSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(ModifiedSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(ModifiedSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(ModifiedSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(ModifiedSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(ModifiedSqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(ModifiedSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModifiedSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(ModifiedSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(ModifiedSqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ModifiedSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ModifiedSqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(ModifiedSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(ModifiedSqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(ModifiedSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(ModifiedSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(ModifiedSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(ModifiedSqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ModifiedSqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(ModifiedSqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(ModifiedSqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(ModifiedSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(ModifiedSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(ModifiedSqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(ModifiedSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(ModifiedSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(ModifiedSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(ModifiedSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(ModifiedSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(ModifiedSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(ModifiedSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(ModifiedSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(ModifiedSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(ModifiedSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(ModifiedSqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(ModifiedSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(ModifiedSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(ModifiedSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(ModifiedSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(ModifiedSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(ModifiedSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(ModifiedSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(ModifiedSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(ModifiedSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(ModifiedSqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(ModifiedSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(ModifiedSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(ModifiedSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(ModifiedSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(ModifiedSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(ModifiedSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(ModifiedSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(ModifiedSqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(ModifiedSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(ModifiedSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(ModifiedSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(ModifiedSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(ModifiedSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(ModifiedSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(ModifiedSqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(ModifiedSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SELECT() { return getToken(ModifiedSqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(ModifiedSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(ModifiedSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ModifiedSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(ModifiedSqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(ModifiedSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(ModifiedSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(ModifiedSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(ModifiedSqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(ModifiedSqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(ModifiedSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(ModifiedSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(ModifiedSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(ModifiedSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(ModifiedSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(ModifiedSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(ModifiedSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(ModifiedSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(ModifiedSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ModifiedSqlBaseParser.SYNC, 0); }
		public TerminalNode TABLE() { return getToken(ModifiedSqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ModifiedSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(ModifiedSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ModifiedSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ModifiedSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(ModifiedSqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(ModifiedSqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(ModifiedSqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(ModifiedSqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(ModifiedSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(ModifiedSqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(ModifiedSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(ModifiedSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(ModifiedSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(ModifiedSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(ModifiedSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(ModifiedSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(ModifiedSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(ModifiedSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ModifiedSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(ModifiedSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(ModifiedSqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(ModifiedSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(ModifiedSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(ModifiedSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(ModifiedSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ModifiedSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(ModifiedSqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(ModifiedSqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ModifiedSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(ModifiedSqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(ModifiedSqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ModifiedSqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(ModifiedSqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(ModifiedSqlBaseParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(ModifiedSqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedSqlBaseListener ) ((ModifiedSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModifiedSqlBaseVisitor ) return ((ModifiedSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3075);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ADD - 12)) | (1L << (AFTER - 12)) | (1L << (ALL - 12)) | (1L << (ALTER - 12)) | (1L << (ANALYZE - 12)) | (1L << (AND - 12)) | (1L << (ANY - 12)) | (1L << (ARCHIVE - 12)) | (1L << (ARRAY - 12)) | (1L << (AS - 12)) | (1L << (ASC - 12)) | (1L << (AT - 12)) | (1L << (AUTHORIZATION - 12)) | (1L << (BETWEEN - 12)) | (1L << (BOTH - 12)) | (1L << (BUCKET - 12)) | (1L << (BUCKETS - 12)) | (1L << (BY - 12)) | (1L << (CACHE - 12)) | (1L << (CASCADE - 12)) | (1L << (CASE - 12)) | (1L << (CAST - 12)) | (1L << (CHANGE - 12)) | (1L << (CHECK - 12)) | (1L << (CLEAR - 12)) | (1L << (CLUSTER - 12)) | (1L << (CLUSTERED - 12)) | (1L << (CODEGEN - 12)) | (1L << (COLLATE - 12)) | (1L << (COLLECTION - 12)) | (1L << (COLUMN - 12)) | (1L << (COLUMNS - 12)) | (1L << (COMMENT - 12)) | (1L << (COMMIT - 12)) | (1L << (COMPACT - 12)) | (1L << (COMPACTIONS - 12)) | (1L << (COMPUTE - 12)) | (1L << (CONCATENATE - 12)) | (1L << (CONSTRAINT - 12)) | (1L << (COST - 12)) | (1L << (CREATE - 12)) | (1L << (CUBE - 12)) | (1L << (CURRENT - 12)) | (1L << (CURRENT_DATE - 12)) | (1L << (CURRENT_TIME - 12)) | (1L << (CURRENT_TIMESTAMP - 12)) | (1L << (CURRENT_USER - 12)) | (1L << (DATA - 12)) | (1L << (DATABASE - 12)) | (1L << (DATABASES - 12)) | (1L << (DBPROPERTIES - 12)) | (1L << (DEFINED - 12)) | (1L << (DELETE - 12)) | (1L << (DELIMITED - 12)) | (1L << (DESC - 12)) | (1L << (DESCRIBE - 12)) | (1L << (DFS - 12)) | (1L << (DIRECTORIES - 12)) | (1L << (DIRECTORY - 12)) | (1L << (DISTINCT - 12)) | (1L << (DISTRIBUTE - 12)) | (1L << (DIV - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DROP - 76)) | (1L << (ELSE - 76)) | (1L << (END - 76)) | (1L << (ESCAPE - 76)) | (1L << (ESCAPED - 76)) | (1L << (EXCHANGE - 76)) | (1L << (EXISTS - 76)) | (1L << (EXPLAIN - 76)) | (1L << (EXPORT - 76)) | (1L << (EXTENDED - 76)) | (1L << (EXTERNAL - 76)) | (1L << (EXTRACT - 76)) | (1L << (FALSE - 76)) | (1L << (FETCH - 76)) | (1L << (FIELDS - 76)) | (1L << (FILTER - 76)) | (1L << (FILEFORMAT - 76)) | (1L << (FIRST - 76)) | (1L << (FOLLOWING - 76)) | (1L << (FOR - 76)) | (1L << (FOREIGN - 76)) | (1L << (FORMAT - 76)) | (1L << (FORMATTED - 76)) | (1L << (FROM - 76)) | (1L << (FUNCTION - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (GLOBAL - 76)) | (1L << (GRANT - 76)) | (1L << (GROUP - 76)) | (1L << (GROUPING - 76)) | (1L << (HAVING - 76)) | (1L << (IF - 76)) | (1L << (IGNORE - 76)) | (1L << (IMPORT - 76)) | (1L << (IN - 76)) | (1L << (INDEX - 76)) | (1L << (INDEXES - 76)) | (1L << (INPATH - 76)) | (1L << (INPUTFORMAT - 76)) | (1L << (INSERT - 76)) | (1L << (INTERVAL - 76)) | (1L << (INTO - 76)) | (1L << (IS - 76)) | (1L << (ITEMS - 76)) | (1L << (KEYS - 76)) | (1L << (LAST - 76)) | (1L << (LATERAL - 76)) | (1L << (LAZY - 76)) | (1L << (LEADING - 76)) | (1L << (LIKE - 76)) | (1L << (LIMIT - 76)) | (1L << (LINES - 76)) | (1L << (LIST - 76)) | (1L << (LOAD - 76)) | (1L << (LOCAL - 76)) | (1L << (LOCATION - 76)) | (1L << (LOCK - 76)) | (1L << (LOCKS - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOGICAL - 140)) | (1L << (MACRO - 140)) | (1L << (MAP - 140)) | (1L << (MATCHED - 140)) | (1L << (MERGE - 140)) | (1L << (MSCK - 140)) | (1L << (NAMESPACE - 140)) | (1L << (NAMESPACES - 140)) | (1L << (NO - 140)) | (1L << (NOT - 140)) | (1L << (NULL - 140)) | (1L << (NULLS - 140)) | (1L << (OF - 140)) | (1L << (ONLY - 140)) | (1L << (OPTION - 140)) | (1L << (OPTIONS - 140)) | (1L << (OR - 140)) | (1L << (ORDER - 140)) | (1L << (OUT - 140)) | (1L << (OUTER - 140)) | (1L << (OUTPUTFORMAT - 140)) | (1L << (OVER - 140)) | (1L << (OVERLAPS - 140)) | (1L << (OVERLAY - 140)) | (1L << (OVERWRITE - 140)) | (1L << (PARTITION - 140)) | (1L << (PARTITIONED - 140)) | (1L << (PARTITIONS - 140)) | (1L << (PERCENTLIT - 140)) | (1L << (PIVOT - 140)) | (1L << (PLACING - 140)) | (1L << (POSITION - 140)) | (1L << (PRECEDING - 140)) | (1L << (PRIMARY - 140)) | (1L << (PRINCIPALS - 140)) | (1L << (PROPERTIES - 140)) | (1L << (PURGE - 140)) | (1L << (QUERY - 140)) | (1L << (RANGE - 140)) | (1L << (RECORDREADER - 140)) | (1L << (RECORDWRITER - 140)) | (1L << (RECOVER - 140)) | (1L << (REDUCE - 140)) | (1L << (REFERENCES - 140)) | (1L << (REFRESH - 140)) | (1L << (RENAME - 140)) | (1L << (REPAIR - 140)) | (1L << (REPLACE - 140)) | (1L << (RESET - 140)) | (1L << (RESPECT - 140)) | (1L << (RESTRICT - 140)) | (1L << (REVOKE - 140)) | (1L << (RLIKE - 140)) | (1L << (ROLE - 140)) | (1L << (ROLES - 140)) | (1L << (ROLLBACK - 140)) | (1L << (ROLLUP - 140)) | (1L << (ROW - 140)) | (1L << (ROWS - 140)) | (1L << (SCHEMA - 140)) | (1L << (SELECT - 140)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (SEPARATED - 205)) | (1L << (SERDE - 205)) | (1L << (SERDEPROPERTIES - 205)) | (1L << (SESSION_USER - 205)) | (1L << (SET - 205)) | (1L << (SETS - 205)) | (1L << (SHOW - 205)) | (1L << (SKEWED - 205)) | (1L << (SOME - 205)) | (1L << (SORT - 205)) | (1L << (SORTED - 205)) | (1L << (START - 205)) | (1L << (STATISTICS - 205)) | (1L << (STORED - 205)) | (1L << (STRATIFY - 205)) | (1L << (STRUCT - 205)) | (1L << (SUBSTR - 205)) | (1L << (SUBSTRING - 205)) | (1L << (SYNC - 205)) | (1L << (TABLE - 205)) | (1L << (TABLES - 205)) | (1L << (TABLESAMPLE - 205)) | (1L << (TBLPROPERTIES - 205)) | (1L << (TEMPORARY - 205)) | (1L << (TERMINATED - 205)) | (1L << (THEN - 205)) | (1L << (TIME - 205)) | (1L << (TO - 205)) | (1L << (TOUCH - 205)) | (1L << (TRAILING - 205)) | (1L << (TRANSACTION - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (TRANSFORM - 205)) | (1L << (TRIM - 205)) | (1L << (TRUE - 205)) | (1L << (TRUNCATE - 205)) | (1L << (TYPE - 205)) | (1L << (UNARCHIVE - 205)) | (1L << (UNBOUNDED - 205)) | (1L << (UNCACHE - 205)) | (1L << (UNIQUE - 205)) | (1L << (UNKNOWN - 205)) | (1L << (UNLOCK - 205)) | (1L << (UNSET - 205)) | (1L << (UPDATE - 205)) | (1L << (USE - 205)) | (1L << (USER - 205)) | (1L << (VALUES - 205)) | (1L << (VIEW - 205)) | (1L << (VIEWS - 205)) | (1L << (WHEN - 205)) | (1L << (WHERE - 205)) | (1L << (WINDOW - 205)) | (1L << (WITH - 205)) | (1L << (ZONE - 205)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 99:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 101:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 102:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 133:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 134:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 136:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u012b\u0c08\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\3\2\3\2\7\2\u011f\n\2\f\2\16\2\u0122\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5"+
		"\t\u013a\n\t\3\t\3\t\5\t\u013e\n\t\3\t\3\t\3\t\5\t\u0143\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u014b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0153\n\t\f\t"+
		"\16\t\u0156\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0169\n\t\3\t\3\t\5\t\u016d\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0173\n\t\3\t\5\t\u0176\n\t\3\t\5\t\u0179\n\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0180\n\t\3\t\5\t\u0183\n\t\3\t\3\t\5\t\u0187\n\t\3\t\5\t\u018a\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0191\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u019c\n\t\f\t\16\t\u019f\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u01a6\n\t\3\t"+
		"\5\t\u01a9\n\t\3\t\3\t\5\t\u01ad\n\t\3\t\5\t\u01b0\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u01b6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01c1\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u01c7\n\t\3\t\3\t\3\t\5\t\u01cc\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u020c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0215"+
		"\n\t\3\t\3\t\5\t\u0219\n\t\3\t\3\t\3\t\3\t\5\t\u021f\n\t\3\t\3\t\5\t\u0223"+
		"\n\t\3\t\3\t\3\t\5\t\u0228\n\t\3\t\3\t\3\t\3\t\5\t\u022e\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u023a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0242\n\t\3\t\3\t\3\t\3\t\5\t\u0248\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0255\n\t\3\t\6\t\u0258\n\t\r\t\16\t\u0259\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u026a\n\t\3\t\3"+
		"\t\3\t\7\t\u026f\n\t\f\t\16\t\u0272\13\t\3\t\5\t\u0275\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u027b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u028a\n\t\3\t\3\t\5\t\u028e\n\t\3\t\3\t\3\t\3\t\5\t\u0294\n\t\3\t"+
		"\3\t\3\t\3\t\5\t\u029a\n\t\3\t\5\t\u029d\n\t\3\t\5\t\u02a0\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u02a6\n\t\3\t\3\t\5\t\u02aa\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u02b2\n\t\f\t\16\t\u02b5\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02bd\n\t"+
		"\3\t\5\t\u02c0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02c9\n\t\3\t\3\t\3"+
		"\t\5\t\u02ce\n\t\3\t\3\t\3\t\3\t\5\t\u02d4\n\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u02db\n\t\3\t\5\t\u02de\n\t\3\t\3\t\3\t\3\t\5\t\u02e4\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u02ed\n\t\f\t\16\t\u02f0\13\t\5\t\u02f2\n\t\3\t\3"+
		"\t\5\t\u02f6\n\t\3\t\3\t\3\t\5\t\u02fb\n\t\3\t\3\t\3\t\5\t\u0300\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0307\n\t\3\t\5\t\u030a\n\t\3\t\5\t\u030d\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0314\n\t\3\t\3\t\3\t\5\t\u0319\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0322\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u032a\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0330\n\t\3\t\5\t\u0333\n\t\3\t\5\t\u0336\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u033c\n\t\3\t\3\t\5\t\u0340\n\t\3\t\3\t\5\t\u0344\n\t\3"+
		"\t\3\t\5\t\u0348\n\t\5\t\u034a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0352\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u035a\n\t\3\t\3\t\3\t\3\t\5\t\u0360\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0366\n\t\3\t\5\t\u0369\n\t\3\t\3\t\5\t\u036d\n\t"+
		"\3\t\5\t\u0370\n\t\3\t\3\t\5\t\u0374\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u038e\n\t\f\t\16\t\u0391\13\t\5\t\u0393\n\t\3\t\3\t\5\t\u0397\n\t\3\t"+
		"\3\t\3\t\3\t\5\t\u039d\n\t\3\t\5\t\u03a0\n\t\3\t\5\t\u03a3\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u03a9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03b1\n\t\3\t\3\t\3"+
		"\t\5\t\u03b6\n\t\3\t\3\t\3\t\3\t\5\t\u03bc\n\t\3\t\3\t\3\t\3\t\5\t\u03c2"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03ca\n\t\3\t\3\t\3\t\3\t\7\t\u03d0\n"+
		"\t\f\t\16\t\u03d3\13\t\5\t\u03d5\n\t\3\t\3\t\3\t\7\t\u03da\n\t\f\t\16"+
		"\t\u03dd\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03eb"+
		"\n\t\f\t\16\t\u03ee\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03f9"+
		"\n\t\f\t\16\t\u03fc\13\t\5\t\u03fe\n\t\3\t\3\t\7\t\u0402\n\t\f\t\16\t"+
		"\u0405\13\t\3\t\3\t\3\t\3\t\7\t\u040b\n\t\f\t\16\t\u040e\13\t\3\t\3\t"+
		"\3\t\3\t\7\t\u0414\n\t\f\t\16\t\u0417\13\t\3\t\3\t\7\t\u041b\n\t\f\t\16"+
		"\t\u041e\13\t\5\t\u0420\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u042c\n\f\3\f\3\f\5\f\u0430\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0437\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04ab\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u04b3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04bb\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u04c4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04ce"+
		"\n\f\3\r\3\r\5\r\u04d2\n\r\3\r\5\r\u04d5\n\r\3\r\3\r\3\r\3\r\5\r\u04db"+
		"\n\r\3\r\3\r\3\16\3\16\5\16\u04e1\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u04ed\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u04f9\n\20\3\20\3\20\3\20\5\20\u04fe\n\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\5\23\u0507\n\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u050f\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0516\n\24\5\24\u0518"+
		"\n\24\3\24\5\24\u051b\n\24\3\24\3\24\3\24\5\24\u0520\n\24\3\24\3\24\5"+
		"\24\u0524\n\24\3\24\3\24\3\24\5\24\u0529\n\24\3\24\5\24\u052c\n\24\3\24"+
		"\3\24\3\24\5\24\u0531\n\24\3\24\3\24\3\24\5\24\u0536\n\24\3\24\5\24\u0539"+
		"\n\24\3\24\3\24\3\24\5\24\u053e\n\24\3\24\3\24\5\24\u0542\n\24\3\24\3"+
		"\24\3\24\5\24\u0547\n\24\5\24\u0549\n\24\3\25\3\25\5\25\u054d\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u0554\n\26\f\26\16\26\u0557\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u055e\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0567\n\31\3\32\3\32\3\32\7\32\u056c\n\32\f\32\16\32\u056f\13\32\3\33"+
		"\3\33\3\33\3\33\7\33\u0575\n\33\f\33\16\33\u0578\13\33\3\34\3\34\5\34"+
		"\u057c\n\34\3\34\5\34\u057f\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0595"+
		"\n\36\f\36\16\36\u0598\13\36\3\37\3\37\3\37\3\37\7\37\u059e\n\37\f\37"+
		"\16\37\u05a1\13\37\3\37\3\37\3 \3 \5 \u05a7\n \3 \5 \u05aa\n \3!\3!\3"+
		"!\7!\u05af\n!\f!\16!\u05b2\13!\3!\5!\u05b5\n!\3\"\3\"\3\"\3\"\5\"\u05bb"+
		"\n\"\3#\3#\3#\3#\7#\u05c1\n#\f#\16#\u05c4\13#\3#\3#\3$\3$\3$\3$\7$\u05cc"+
		"\n$\f$\16$\u05cf\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u05d9\n%\3&\3&\3&\3&\3"+
		"&\5&\u05e0\n&\3\'\3\'\3\'\3\'\5\'\u05e6\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\6)\u05f1\n)\r)\16)\u05f2\3)\3)\3)\3)\3)\5)\u05fa\n)\3)\3)\3)\3)\3)\5"+
		")\u0601\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u060d\n)\3)\3)\3)\3)\7)\u0613"+
		"\n)\f)\16)\u0616\13)\3)\7)\u0619\n)\f)\16)\u061c\13)\5)\u061e\n)\3*\3"+
		"*\3*\3*\3*\7*\u0625\n*\f*\16*\u0628\13*\5*\u062a\n*\3*\3*\3*\3*\3*\7*"+
		"\u0631\n*\f*\16*\u0634\13*\5*\u0636\n*\3*\3*\3*\3*\3*\7*\u063d\n*\f*\16"+
		"*\u0640\13*\5*\u0642\n*\3*\3*\3*\3*\3*\7*\u0649\n*\f*\16*\u064c\13*\5"+
		"*\u064e\n*\3*\5*\u0651\n*\3*\3*\3*\5*\u0656\n*\5*\u0658\n*\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u0664\n,\3,\3,\3,\3,\3,\5,\u066b\n,\3,\3,\3,\3"+
		",\3,\5,\u0672\n,\3,\7,\u0675\n,\f,\16,\u0678\13,\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u0683\n-\3.\3.\5.\u0687\n.\3.\3.\5.\u068b\n.\3/\3/\6/\u068f"+
		"\n/\r/\16/\u0690\3\60\3\60\5\60\u0695\n\60\3\60\3\60\3\60\3\60\7\60\u069b"+
		"\n\60\f\60\16\60\u069e\13\60\3\60\5\60\u06a1\n\60\3\60\5\60\u06a4\n\60"+
		"\3\60\5\60\u06a7\n\60\3\60\5\60\u06aa\n\60\3\60\3\60\5\60\u06ae\n\60\3"+
		"\61\3\61\5\61\u06b2\n\61\3\61\5\61\u06b5\n\61\3\61\3\61\5\61\u06b9\n\61"+
		"\3\61\7\61\u06bc\n\61\f\61\16\61\u06bf\13\61\3\61\5\61\u06c2\n\61\3\61"+
		"\5\61\u06c5\n\61\3\61\5\61\u06c8\n\61\3\61\5\61\u06cb\n\61\5\61\u06cd"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u06d9\n\62"+
		"\3\62\5\62\u06dc\n\62\3\62\3\62\5\62\u06e0\n\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u06ea\n\62\3\62\3\62\5\62\u06ee\n\62\5\62\u06f0"+
		"\n\62\3\62\5\62\u06f3\n\62\3\62\3\62\5\62\u06f7\n\62\3\63\3\63\7\63\u06fb"+
		"\n\63\f\63\16\63\u06fe\13\63\3\63\5\63\u0701\n\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\5\65\u070c\n\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0716\n\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u0722\n\67\38\38\38\38\38\38\38\38\38\38\38\78\u072f\n8\f8"+
		"\168\u0732\138\38\38\58\u0736\n8\39\39\39\79\u073b\n9\f9\169\u073e\13"+
		"9\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\5=\u074d\n=\3=\7=\u0750\n=\f"+
		"=\16=\u0753\13=\3=\3=\3>\3>\3>\3>\3>\3>\7>\u075d\n>\f>\16>\u0760\13>\3"+
		">\3>\5>\u0764\n>\3?\3?\3?\3?\7?\u076a\n?\f?\16?\u076d\13?\3?\7?\u0770"+
		"\n?\f?\16?\u0773\13?\3?\5?\u0776\n?\3@\3@\3@\3@\3@\7@\u077d\n@\f@\16@"+
		"\u0780\13@\3@\3@\3@\3@\3@\7@\u0787\n@\f@\16@\u078a\13@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\7@\u0796\n@\f@\16@\u0799\13@\3@\3@\5@\u079d\n@\5@\u079f"+
		"\n@\3A\3A\5A\u07a3\nA\3B\3B\3B\3B\5B\u07a9\nB\3B\3B\3B\3B\7B\u07af\nB"+
		"\fB\16B\u07b2\13B\3B\3B\3C\3C\3C\3C\7C\u07ba\nC\fC\16C\u07bd\13C\5C\u07bf"+
		"\nC\3C\3C\5C\u07c3\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u07cf\nD\fD\16"+
		"D\u07d2\13D\3D\3D\3D\3E\3E\3E\3E\3E\7E\u07dc\nE\fE\16E\u07df\13E\3E\3"+
		"E\5E\u07e3\nE\3F\3F\5F\u07e7\nF\3F\5F\u07ea\nF\3G\3G\3G\5G\u07ef\nG\3"+
		"G\3G\3G\3G\3G\7G\u07f6\nG\fG\16G\u07f9\13G\5G\u07fb\nG\3G\3G\3G\5G\u0800"+
		"\nG\3G\3G\3G\7G\u0805\nG\fG\16G\u0808\13G\5G\u080a\nG\3H\3H\3I\3I\7I\u0810"+
		"\nI\fI\16I\u0813\13I\3J\3J\3J\3J\5J\u0819\nJ\3J\3J\3J\3J\3J\5J\u0820\n"+
		"J\3K\5K\u0823\nK\3K\3K\3K\5K\u0828\nK\3K\5K\u082b\nK\3K\3K\3K\5K\u0830"+
		"\nK\3K\3K\5K\u0834\nK\3K\5K\u0837\nK\3K\5K\u083a\nK\3L\3L\3L\3L\5L\u0840"+
		"\nL\3M\3M\3M\5M\u0845\nM\3M\3M\3N\5N\u084a\nN\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\5N\u085c\nN\5N\u085e\nN\3N\5N\u0861\nN\3O\3O"+
		"\3O\3O\3P\3P\3P\7P\u086a\nP\fP\16P\u086d\13P\3Q\3Q\3Q\3Q\7Q\u0873\nQ\f"+
		"Q\16Q\u0876\13Q\3Q\3Q\3R\3R\5R\u087c\nR\3S\3S\3S\3S\7S\u0882\nS\fS\16"+
		"S\u0885\13S\3S\3S\3T\3T\5T\u088b\nT\3U\3U\5U\u088f\nU\3U\3U\3U\3U\3U\3"+
		"U\5U\u0897\nU\3U\3U\3U\3U\3U\3U\5U\u089f\nU\3U\3U\3U\3U\5U\u08a5\nU\3"+
		"V\3V\3V\3V\7V\u08ab\nV\fV\16V\u08ae\13V\3V\3V\3W\3W\3W\3W\3W\7W\u08b7"+
		"\nW\fW\16W\u08ba\13W\5W\u08bc\nW\3W\3W\3W\3X\5X\u08c2\nX\3X\3X\5X\u08c6"+
		"\nX\5X\u08c8\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u08d1\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\5Y\u08dd\nY\5Y\u08df\nY\3Y\3Y\3Y\3Y\3Y\5Y\u08e6\nY\3Y\3Y\3Y"+
		"\3Y\3Y\5Y\u08ed\nY\3Y\3Y\3Y\3Y\5Y\u08f3\nY\3Y\3Y\3Y\3Y\5Y\u08f9\nY\5Y"+
		"\u08fb\nY\3Z\3Z\3Z\7Z\u0900\nZ\fZ\16Z\u0903\13Z\3[\3[\3[\7[\u0908\n[\f"+
		"[\16[\u090b\13[\3\\\3\\\3\\\5\\\u0910\n\\\3\\\3\\\3]\3]\3]\5]\u0917\n"+
		"]\3]\3]\3^\3^\5^\u091d\n^\3^\3^\5^\u0921\n^\5^\u0923\n^\3_\3_\3_\7_\u0928"+
		"\n_\f_\16_\u092b\13_\3`\3`\3`\3`\7`\u0931\n`\f`\16`\u0934\13`\3`\3`\3"+
		"a\3a\5a\u093a\na\3b\3b\3b\3b\3b\3b\7b\u0942\nb\fb\16b\u0945\13b\3b\3b"+
		"\5b\u0949\nb\3c\3c\5c\u094d\nc\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e"+
		"\u095b\ne\5e\u095d\ne\3e\3e\3e\3e\3e\3e\7e\u0965\ne\fe\16e\u0968\13e\3"+
		"f\5f\u096b\nf\3f\3f\3f\3f\3f\3f\5f\u0973\nf\3f\3f\3f\3f\3f\7f\u097a\n"+
		"f\ff\16f\u097d\13f\3f\3f\3f\5f\u0982\nf\3f\3f\3f\3f\3f\3f\5f\u098a\nf"+
		"\3f\3f\3f\5f\u098f\nf\3f\3f\3f\3f\3f\3f\3f\3f\7f\u0999\nf\ff\16f\u099c"+
		"\13f\3f\3f\5f\u09a0\nf\3f\5f\u09a3\nf\3f\3f\3f\3f\5f\u09a9\nf\3f\3f\5"+
		"f\u09ad\nf\3f\3f\3f\5f\u09b2\nf\3f\3f\3f\5f\u09b7\nf\3f\3f\3f\5f\u09bc"+
		"\nf\3g\3g\3g\3g\5g\u09c2\ng\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\7g\u09d7\ng\fg\16g\u09da\13g\3h\3h\3h\3h\6h\u09e0\nh\r"+
		"h\16h\u09e1\3h\3h\5h\u09e6\nh\3h\3h\3h\3h\3h\6h\u09ed\nh\rh\16h\u09ee"+
		"\3h\3h\5h\u09f3\nh\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\7h\u0a03"+
		"\nh\fh\16h\u0a06\13h\5h\u0a08\nh\3h\3h\3h\3h\3h\3h\5h\u0a10\nh\3h\3h\3"+
		"h\3h\3h\3h\3h\5h\u0a19\nh\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\6h\u0a2e\nh\rh\16h\u0a2f\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0a3b"+
		"\nh\3h\3h\3h\7h\u0a40\nh\fh\16h\u0a43\13h\5h\u0a45\nh\3h\3h\3h\3h\3h\3"+
		"h\3h\5h\u0a4e\nh\3h\3h\5h\u0a52\nh\3h\3h\5h\u0a56\nh\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\6h\u0a60\nh\rh\16h\u0a61\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0a7b\nh\3h\3h\3h\3h\3h\5h\u0a82\n"+
		"h\3h\5h\u0a85\nh\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0a94\nh\3"+
		"h\3h\5h\u0a98\nh\3h\3h\3h\3h\3h\3h\3h\3h\7h\u0aa2\nh\fh\16h\u0aa5\13h"+
		"\3i\3i\3i\3i\3i\3i\3i\3i\6i\u0aaf\ni\ri\16i\u0ab0\5i\u0ab3\ni\3j\3j\3"+
		"k\3k\3l\3l\3m\3m\3n\3n\3n\5n\u0ac0\nn\3o\3o\5o\u0ac4\no\3p\3p\3p\6p\u0ac9"+
		"\np\rp\16p\u0aca\3q\3q\3q\5q\u0ad0\nq\3r\3r\3r\3r\3r\3s\5s\u0ad8\ns\3"+
		"s\3s\5s\u0adc\ns\3t\3t\3t\5t\u0ae1\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\3u\3u\5u\u0af2\nu\3u\3u\5u\u0af6\nu\3u\3u\3u\3u\3u\7u\u0afd\n"+
		"u\fu\16u\u0b00\13u\3u\5u\u0b03\nu\5u\u0b05\nu\3v\3v\3v\7v\u0b0a\nv\fv"+
		"\16v\u0b0d\13v\3w\3w\3w\3w\5w\u0b13\nw\3w\5w\u0b16\nw\3w\5w\u0b19\nw\3"+
		"x\3x\3x\7x\u0b1e\nx\fx\16x\u0b21\13x\3y\3y\3y\3y\5y\u0b27\ny\3y\5y\u0b2a"+
		"\ny\3z\3z\3z\7z\u0b2f\nz\fz\16z\u0b32\13z\3{\3{\3{\3{\3{\5{\u0b39\n{\3"+
		"{\5{\u0b3c\n{\3|\3|\3|\3|\3|\3}\3}\3}\3}\7}\u0b47\n}\f}\16}\u0b4a\13}"+
		"\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\7\177\u0b5b\n\177\f\177\16\177\u0b5e\13\177\3\177\3\177\3\177\3"+
		"\177\3\177\7\177\u0b65\n\177\f\177\16\177\u0b68\13\177\5\177\u0b6a\n\177"+
		"\3\177\3\177\3\177\3\177\3\177\7\177\u0b71\n\177\f\177\16\177\u0b74\13"+
		"\177\5\177\u0b76\n\177\5\177\u0b78\n\177\3\177\5\177\u0b7b\n\177\3\177"+
		"\5\177\u0b7e\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u0b90\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0b99\n\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u0b9e\n"+
		"\u0082\f\u0082\16\u0082\u0ba1\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0ba7\n\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0bac\n\u0084\f"+
		"\u0084\16\u0084\u0baf\13\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\6\u0086\u0bb6\n\u0086\r\u0086\16\u0086\u0bb7\3\u0086\5\u0086\u0bbb\n"+
		"\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u0bc0\n\u0087\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0bc8\n\u0088\3\u0089\3\u0089\3"+
		"\u008a\3\u008a\5\u008a\u0bce\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0bd3"+
		"\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0bd8\n\u008a\3\u008a\3\u008a"+
		"\5\u008a\u0bdc\n\u008a\3\u008a\3\u008a\5\u008a\u0be0\n\u008a\3\u008a\3"+
		"\u008a\5\u008a\u0be4\n\u008a\3\u008a\3\u008a\5\u008a\u0be8\n\u008a\3\u008a"+
		"\3\u008a\5\u008a\u0bec\n\u008a\3\u008a\3\u008a\5\u008a\u0bf0\n\u008a\3"+
		"\u008a\3\u008a\5\u008a\u0bf4\n\u008a\3\u008a\5\u008a\u0bf7\n\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0c00\n\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\13\u038f\u03d1"+
		"\u03db\u03ec\u03fa\u0403\u040c\u0415\u041c\6V\u00c8\u00cc\u00ce\u008f"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\2/"+
		"\4\2BB\u00b3\u00b3\4\2\"\"\u00c2\u00c2\4\2AA\u0095\u0095\4\2ffrr\3\2-"+
		".\4\2\u00e3\u00e3\u0102\u0102\4\2\21\21%%\7\2**\66\66XXee\u008e\u008e"+
		"\3\2FG\4\2XXee\4\2\u0099\u0099\u011b\u011b\5\2\16\16NN\u00e2\u00e2\4\2"+
		"\16\16\u0088\u0088\4\2\u008a\u008a\u011b\u011b\5\2@@\u0094\u0094\u00cc"+
		"\u00cc\6\2SSyy\u00d4\u00d4\u00f8\u00f8\5\2SS\u00d4\u00d4\u00f8\u00f8\4"+
		"\2\31\31FF\4\2``\u0080\u0080\4\2\20\20KK\4\2\u011f\u011f\u0121\u0121\5"+
		"\2\20\20\25\25\u00d8\u00d8\5\2[[\u00f2\u00f2\u00fa\u00fa\4\2\u0111\u0112"+
		"\u0116\u0116\4\2MM\u0113\u0115\4\2\u0111\u0112\u0119\u0119\4\2;;==\4\2"+
		"pp\u00c1\u00c1\3\2\u00e0\u00e1\4\2\6\6ff\4\2\6\6bb\5\2\35\35\u0083\u0083"+
		"\u00ed\u00ed\3\2\u0109\u0110\4\2MM\u0111\u011a\6\2\23\23rr\u0098\u0098"+
		"\u00a0\u00a0\4\2[[\u00f2\u00f2\3\2\u0111\u0112\4\2LL\u00a9\u00a9\4\2\u00a1"+
		"\u00a1\u00d9\u00d9\4\2aa\u00b0\u00b0\3\2\u0120\u0121\4\2NN\u00d3\u00d3"+
		"\62\2\16\17\21\22\24\24\26\27\31\32\34\34\36\"%%\'*,,.\64\66\669:?JLN"+
		"RRTZ]]_adehjmmoqstvxzz}}\177\u0082\u0085\u0095\u0097\u0097\u009a\u009b"+
		"\u009e\u009f\u00a2\u00a2\u00a4\u00a5\u00a7\u00b0\u00b2\u00ba\u00bc\u00c3"+
		"\u00c5\u00cc\u00ce\u00d1\u00d3\u00d7\u00d9\u00e2\u00e4\u00e8\u00ec\u00ec"+
		"\u00ee\u00f7\u00fb\u00fe\u0101\u0103\u0106\u0106\u0108\u0108\21\2\24\24"+
		"88SSgguuyy~~\u0084\u0084\u0096\u0096\u009c\u009c\u00c4\u00c4\u00ce\u00ce"+
		"\u00d4\u00d4\u00f8\u00f8\u0100\u0100\22\2\16\23\25\679RTfhtvxz}\177\u0083"+
		"\u0085\u0095\u0097\u009b\u009d\u00c3\u00c5\u00cd\u00cf\u00d3\u00d5\u00f7"+
		"\u00f9\u00ff\u0101\u0108\2\u0de6\2\u011c\3\2\2\2\4\u0125\3\2\2\2\6\u0128"+
		"\3\2\2\2\b\u012b\3\2\2\2\n\u012e\3\2\2\2\f\u0131\3\2\2\2\16\u0134\3\2"+
		"\2\2\20\u041f\3\2\2\2\22\u0421\3\2\2\2\24\u0423\3\2\2\2\26\u04cd\3\2\2"+
		"\2\30\u04cf\3\2\2\2\32\u04e0\3\2\2\2\34\u04e6\3\2\2\2\36\u04f2\3\2\2\2"+
		" \u04ff\3\2\2\2\"\u0502\3\2\2\2$\u0506\3\2\2\2&\u0548\3\2\2\2(\u054a\3"+
		"\2\2\2*\u054e\3\2\2\2,\u055a\3\2\2\2.\u055f\3\2\2\2\60\u0566\3\2\2\2\62"+
		"\u0568\3\2\2\2\64\u0570\3\2\2\2\66\u0579\3\2\2\28\u0584\3\2\2\2:\u0596"+
		"\3\2\2\2<\u0599\3\2\2\2>\u05a4\3\2\2\2@\u05b4\3\2\2\2B\u05ba\3\2\2\2D"+
		"\u05bc\3\2\2\2F\u05c7\3\2\2\2H\u05d8\3\2\2\2J\u05df\3\2\2\2L\u05e1\3\2"+
		"\2\2N\u05e7\3\2\2\2P\u061d\3\2\2\2R\u0629\3\2\2\2T\u0659\3\2\2\2V\u065c"+
		"\3\2\2\2X\u0682\3\2\2\2Z\u0684\3\2\2\2\\\u068c\3\2\2\2^\u06ad\3\2\2\2"+
		"`\u06cc\3\2\2\2b\u06d8\3\2\2\2d\u06f8\3\2\2\2f\u0704\3\2\2\2h\u0707\3"+
		"\2\2\2j\u0710\3\2\2\2l\u0721\3\2\2\2n\u0735\3\2\2\2p\u0737\3\2\2\2r\u073f"+
		"\3\2\2\2t\u0743\3\2\2\2v\u0746\3\2\2\2x\u0749\3\2\2\2z\u0763\3\2\2\2|"+
		"\u0765\3\2\2\2~\u079e\3\2\2\2\u0080\u07a2\3\2\2\2\u0082\u07a8\3\2\2\2"+
		"\u0084\u07c2\3\2\2\2\u0086\u07c4\3\2\2\2\u0088\u07e2\3\2\2\2\u008a\u07e4"+
		"\3\2\2\2\u008c\u07eb\3\2\2\2\u008e\u080b\3\2\2\2\u0090\u080d\3\2\2\2\u0092"+
		"\u081f\3\2\2\2\u0094\u0839\3\2\2\2\u0096\u083f\3\2\2\2\u0098\u0841\3\2"+
		"\2\2\u009a\u0860\3\2\2\2\u009c\u0862\3\2\2\2\u009e\u0866\3\2\2\2\u00a0"+
		"\u086e\3\2\2\2\u00a2\u0879\3\2\2\2\u00a4\u087d\3\2\2\2\u00a6\u0888\3\2"+
		"\2\2\u00a8\u08a4\3\2\2\2\u00aa\u08a6\3\2\2\2\u00ac\u08b1\3\2\2\2\u00ae"+
		"\u08c7\3\2\2\2\u00b0\u08fa\3\2\2\2\u00b2\u08fc\3\2\2\2\u00b4\u0904\3\2"+
		"\2\2\u00b6\u090f\3\2\2\2\u00b8\u0916\3\2\2\2\u00ba\u091a\3\2\2\2\u00bc"+
		"\u0924\3\2\2\2\u00be\u092c\3\2\2\2\u00c0\u0939\3\2\2\2\u00c2\u0948\3\2"+
		"\2\2\u00c4\u094c\3\2\2\2\u00c6\u094e\3\2\2\2\u00c8\u095c\3\2\2\2\u00ca"+
		"\u09bb\3\2\2\2\u00cc\u09c1\3\2\2\2\u00ce\u0a97\3\2\2\2\u00d0\u0ab2\3\2"+
		"\2\2\u00d2\u0ab4\3\2\2\2\u00d4\u0ab6\3\2\2\2\u00d6\u0ab8\3\2\2\2\u00d8"+
		"\u0aba\3\2\2\2\u00da\u0abc\3\2\2\2\u00dc\u0ac1\3\2\2\2\u00de\u0ac8\3\2"+
		"\2\2\u00e0\u0acc\3\2\2\2\u00e2\u0ad1\3\2\2\2\u00e4\u0adb\3\2\2\2\u00e6"+
		"\u0ae0\3\2\2\2\u00e8\u0b04\3\2\2\2\u00ea\u0b06\3\2\2\2\u00ec\u0b0e\3\2"+
		"\2\2\u00ee\u0b1a\3\2\2\2\u00f0\u0b22\3\2\2\2\u00f2\u0b2b\3\2\2\2\u00f4"+
		"\u0b33\3\2\2\2\u00f6\u0b3d\3\2\2\2\u00f8\u0b42\3\2\2\2\u00fa\u0b4b\3\2"+
		"\2\2\u00fc\u0b7d\3\2\2\2\u00fe\u0b8f\3\2\2\2\u0100\u0b98\3\2\2\2\u0102"+
		"\u0b9a\3\2\2\2\u0104\u0ba6\3\2\2\2\u0106\u0ba8\3\2\2\2\u0108\u0bb0\3\2"+
		"\2\2\u010a\u0bba\3\2\2\2\u010c\u0bbf\3\2\2\2\u010e\u0bc7\3\2\2\2\u0110"+
		"\u0bc9\3\2\2\2\u0112\u0bf6\3\2\2\2\u0114\u0bff\3\2\2\2\u0116\u0c01\3\2"+
		"\2\2\u0118\u0c03\3\2\2\2\u011a\u0c05\3\2\2\2\u011c\u0120\5\20\t\2\u011d"+
		"\u011f\7\3\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\2\2\3\u0124\3\3\2\2\2\u0125\u0126\5\u00ba^\2\u0126\u0127\7\2"+
		"\2\3\u0127\5\3\2\2\2\u0128\u0129\5\u00b6\\\2\u0129\u012a\7\2\2\3\u012a"+
		"\7\3\2\2\2\u012b\u012c\5\u00b4[\2\u012c\u012d\7\2\2\3\u012d\t\3\2\2\2"+
		"\u012e\u012f\5\u00b8]\2\u012f\u0130\7\2\2\3\u0130\13\3\2\2\2\u0131\u0132"+
		"\5\u00e8u\2\u0132\u0133\7\2\2\3\u0133\r\3\2\2\2\u0134\u0135\5\u00eex\2"+
		"\u0135\u0136\7\2\2\3\u0136\17\3\2\2\2\u0137\u0420\5$\23\2\u0138\u013a"+
		"\7\u012b\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2"+
		"\2\u013b\u0420\5\u00b4[\2\u013c\u013e\5\64\33\2\u013d\u013c\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0420\5P)\2\u0140\u0142\7\u00fe"+
		"\2\2\u0141\u0143\7\u0094\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0420\5\u00b4[\2\u0145\u0146\7\67\2\2\u0146\u014a"+
		"\5.\30\2\u0147\u0148\7o\2\2\u0148\u0149\7\u0098\2\2\u0149\u014b\7U\2\2"+
		"\u014a\u0147\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0154"+
		"\5\u00b4[\2\u014d\u0153\5\"\22\2\u014e\u0153\5 \21\2\u014f\u0150\7\u0107"+
		"\2\2\u0150\u0151\t\2\2\2\u0151\u0153\5<\37\2\u0152\u014d\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0420\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\7\21\2\2\u0158\u0159\5.\30\2\u0159\u015a\5\u00b4[\2\u015a\u015b"+
		"\7\u00d3\2\2\u015b\u015c\t\2\2\2\u015c\u015d\5<\37\2\u015d\u0420\3\2\2"+
		"\2\u015e\u015f\7\21\2\2\u015f\u0160\5.\30\2\u0160\u0161\5\u00b4[\2\u0161"+
		"\u0162\7\u00d3\2\2\u0162\u0163\5 \21\2\u0163\u0420\3\2\2\2\u0164\u0165"+
		"\7N\2\2\u0165\u0168\5.\30\2\u0166\u0167\7o\2\2\u0167\u0169\7U\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\5\u00b4"+
		"[\2\u016b\u016d\t\3\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0420\3\2\2\2\u016e\u016f\7\u00d6\2\2\u016f\u0172\t\4\2\2\u0170\u0171"+
		"\t\5\2\2\u0171\u0173\5\u00b4[\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0178\3\2\2\2\u0174\u0176\7\u0085\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\u011b\2\2\u0178\u0175"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0420\3\2\2\2\u017a\u017f\5\30\r\2"+
		"\u017b\u017c\7\4\2\2\u017c\u017d\5\u00eex\2\u017d\u017e\7\5\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2"+
		"\2\2\u0181\u0183\58\35\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0189\5:\36\2\u0185\u0187\7\30\2\2\u0186\u0185\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\5$\23\2\u0189"+
		"\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0420\3\2\2\2\u018b\u018c\7\67"+
		"\2\2\u018c\u0190\7\u00e3\2\2\u018d\u018e\7o\2\2\u018e\u018f\7\u0098\2"+
		"\2\u018f\u0191\7U\2\2\u0190\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0193\5\u00b6\\\2\u0193\u0194\7\u0085\2\2\u0194\u019d\5"+
		"\u00b6\\\2\u0195\u019c\58\35\2\u0196\u019c\5\u00b0Y\2\u0197\u019c\5H%"+
		"\2\u0198\u019c\5 \21\2\u0199\u019a\7\u00e6\2\2\u019a\u019c\5<\37\2\u019b"+
		"\u0195\3\2\2\2\u019b\u0196\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u0420\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a5\5\32"+
		"\16\2\u01a1\u01a2\7\4\2\2\u01a2\u01a3\5\u00eex\2\u01a3\u01a4\7\5\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a9\58\35\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01af\5:\36\2\u01ab\u01ad\7\30\2\2\u01ac\u01ab\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\5$\23\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u0420\3\2\2\2\u01b1\u01b2\7\22"+
		"\2\2\u01b2\u01b3\7\u00e3\2\2\u01b3\u01b5\5\u00b4[\2\u01b4\u01b6\5*\26"+
		"\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\7\63\2\2\u01b8\u01c0\7\u00dc\2\2\u01b9\u01c1\5\u010c\u0087\2\u01ba\u01bb"+
		"\7b\2\2\u01bb\u01bc\7.\2\2\u01bc\u01c1\5\u009eP\2\u01bd\u01be\7b\2\2\u01be"+
		"\u01bf\7\20\2\2\u01bf\u01c1\7.\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01ba\3\2"+
		"\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u0420\3\2\2\2\u01c2"+
		"\u01c3\7\22\2\2\u01c3\u01c6\7\u00e4\2\2\u01c4\u01c5\t\5\2\2\u01c5\u01c7"+
		"\5\u00b4[\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2"+
		"\2\u01c8\u01c9\7\63\2\2\u01c9\u01cb\7\u00dc\2\2\u01ca\u01cc\5\u010c\u0087"+
		"\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0420\3\2\2\2\u01cd\u01ce"+
		"\7\21\2\2\u01ce\u01cf\7\u00e3\2\2\u01cf\u01d0\5\u00b4[\2\u01d0\u01d1\7"+
		"\16\2\2\u01d1\u01d2\t\6\2\2\u01d2\u01d3\5\u00eav\2\u01d3\u0420\3\2\2\2"+
		"\u01d4\u01d5\7\21\2\2\u01d5\u01d6\7\u00e3\2\2\u01d6\u01d7\5\u00b4[\2\u01d7"+
		"\u01d8\7\16\2\2\u01d8\u01d9\t\6\2\2\u01d9\u01da\7\4\2\2\u01da\u01db\5"+
		"\u00eav\2\u01db\u01dc\7\5\2\2\u01dc\u0420\3\2\2\2\u01dd\u01de\7\21\2\2"+
		"\u01de\u01df\7\u00e3\2\2\u01df\u01e0\5\u00b4[\2\u01e0\u01e1\7\u00bd\2"+
		"\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\5\u00b4[\2\u01e3\u01e4\7\u00eb\2\2\u01e4"+
		"\u01e5\5\u0108\u0085\2\u01e5\u0420\3\2\2\2\u01e6\u01e7\7\21\2\2\u01e7"+
		"\u01e8\7\u00e3\2\2\u01e8\u01e9\5\u00b4[\2\u01e9\u01ea\7N\2\2\u01ea\u01eb"+
		"\t\6\2\2\u01eb\u01ec\7\4\2\2\u01ec\u01ed\5\u00b2Z\2\u01ed\u01ee\7\5\2"+
		"\2\u01ee\u0420\3\2\2\2\u01ef\u01f0\7\21\2\2\u01f0\u01f1\7\u00e3\2\2\u01f1"+
		"\u01f2\5\u00b4[\2\u01f2\u01f3\7N\2\2\u01f3\u01f4\t\6\2\2\u01f4\u01f5\5"+
		"\u00b2Z\2\u01f5\u0420\3\2\2\2\u01f6\u01f7\7\21\2\2\u01f7\u01f8\t\7\2\2"+
		"\u01f8\u01f9\5\u00b4[\2\u01f9\u01fa\7\u00bd\2\2\u01fa\u01fb\7\u00eb\2"+
		"\2\u01fb\u01fc\5\u00b4[\2\u01fc\u0420\3\2\2\2\u01fd\u01fe\7\21\2\2\u01fe"+
		"\u01ff\t\7\2\2\u01ff\u0200\5\u00b4[\2\u0200\u0201\7\u00d3\2\2\u0201\u0202"+
		"\7\u00e6\2\2\u0202\u0203\5<\37\2\u0203\u0420\3\2\2\2\u0204\u0205\7\21"+
		"\2\2\u0205\u0206\t\7\2\2\u0206\u0207\5\u00b4[\2\u0207\u0208\7\u00fc\2"+
		"\2\u0208\u020b\7\u00e6\2\2\u0209\u020a\7o\2\2\u020a\u020c\7U\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\5<"+
		"\37\2\u020e\u0420\3\2\2\2\u020f\u0210\7\21\2\2\u0210\u0211\7\u00e3\2\2"+
		"\u0211\u0212\5\u00b4[\2\u0212\u0214\t\b\2\2\u0213\u0215\7-\2\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\5\u00b4["+
		"\2\u0217\u0219\5\u0114\u008b\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2"+
		"\u0219\u0420\3\2\2\2\u021a\u021b\7\21\2\2\u021b\u021c\7\u00e3\2\2\u021c"+
		"\u021e\5\u00b4[\2\u021d\u021f\5*\26\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\7%\2\2\u0221\u0223\7-\2\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5\u00b4"+
		"[\2\u0225\u0227\5\u00f0y\2\u0226\u0228\5\u00e6t\2\u0227\u0226\3\2\2\2"+
		"\u0227\u0228\3\2\2\2\u0228\u0420\3\2\2\2\u0229\u022a\7\21\2\2\u022a\u022b"+
		"\7\u00e3\2\2\u022b\u022d\5\u00b4[\2\u022c\u022e\5*\26\2\u022d\u022c\3"+
		"\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7\u00bf\2\2"+
		"\u0230\u0231\7.\2\2\u0231\u0232\7\4\2\2\u0232\u0233\5\u00eav\2\u0233\u0234"+
		"\7\5\2\2\u0234\u0420\3\2\2\2\u0235\u0236\7\21\2\2\u0236\u0237\7\u00e3"+
		"\2\2\u0237\u0239\5\u00b4[\2\u0238\u023a\5*\26\2\u0239\u0238\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\u00d3\2\2\u023c\u023d"+
		"\7\u00d0\2\2\u023d\u0241\7\u011b\2\2\u023e\u023f\7\u0107\2\2\u023f\u0240"+
		"\7\u00d1\2\2\u0240\u0242\5<\37\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2"+
		"\2\u0242\u0420\3\2\2\2\u0243\u0244\7\21\2\2\u0244\u0245\7\u00e3\2\2\u0245"+
		"\u0247\5\u00b4[\2\u0246\u0248\5*\26\2\u0247\u0246\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\u00d3\2\2\u024a\u024b\7\u00d1"+
		"\2\2\u024b\u024c\5<\37\2\u024c\u0420\3\2\2\2\u024d\u024e\7\21\2\2\u024e"+
		"\u024f\t\7\2\2\u024f\u0250\5\u00b4[\2\u0250\u0254\7\16\2\2\u0251\u0252"+
		"\7o\2\2\u0252\u0253\7\u0098\2\2\u0253\u0255\7U\2\2\u0254\u0251\3\2\2\2"+
		"\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0258\5(\25\2\u0257\u0256"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u0420\3\2\2\2\u025b\u025c\7\21\2\2\u025c\u025d\7\u00e3\2\2\u025d\u025e"+
		"\5\u00b4[\2\u025e\u025f\5*\26\2\u025f\u0260\7\u00bd\2\2\u0260\u0261\7"+
		"\u00eb\2\2\u0261\u0262\5*\26\2\u0262\u0420\3\2\2\2\u0263\u0264\7\21\2"+
		"\2\u0264\u0265\t\7\2\2\u0265\u0266\5\u00b4[\2\u0266\u0269\7N\2\2\u0267"+
		"\u0268\7o\2\2\u0268\u026a\7U\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u0270\5*\26\2\u026c\u026d\7\6\2\2\u026d\u026f"+
		"\5*\26\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\7\u00b4"+
		"\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0420\3\2\2\2\u0276"+
		"\u0277\7\21\2\2\u0277\u0278\7\u00e3\2\2\u0278\u027a\5\u00b4[\2\u0279\u027b"+
		"\5*\26\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027d\7\u00d3\2\2\u027d\u027e\5 \21\2\u027e\u0420\3\2\2\2\u027f\u0280"+
		"\7\21\2\2\u0280\u0281\7\u00e3\2\2\u0281\u0282\5\u00b4[\2\u0282\u0283\7"+
		"\u00b9\2\2\u0283\u0284\7\u00ab\2\2\u0284\u0420\3\2\2\2\u0285\u0286\7N"+
		"\2\2\u0286\u0289\7\u00e3\2\2\u0287\u0288\7o\2\2\u0288\u028a\7U\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\5\u00b4"+
		"[\2\u028c\u028e\7\u00b4\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0420\3\2\2\2\u028f\u0290\7N\2\2\u0290\u0293\7\u0102\2\2\u0291\u0292"+
		"\7o\2\2\u0292\u0294\7U\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0420\5\u00b4[\2\u0296\u0299\7\67\2\2\u0297\u0298"+
		"\7\u00a0\2\2\u0298\u029a\7\u00bf\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3"+
		"\2\2\2\u029a\u029f\3\2\2\2\u029b\u029d\7j\2\2\u029c\u029b\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\u00e7\2\2\u029f\u029c"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a5\7\u0102\2"+
		"\2\u02a2\u02a3\7o\2\2\u02a3\u02a4\7\u0098\2\2\u02a4\u02a6\7U\2\2\u02a5"+
		"\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\5\u00b4"+
		"[\2\u02a8\u02aa\5\u00a4S\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02b3\3\2\2\2\u02ab\u02b2\5\"\22\2\u02ac\u02ad\7\u00aa\2\2\u02ad\u02ae"+
		"\7\u009c\2\2\u02ae\u02b2\5\u009cO\2\u02af\u02b0\7\u00e6\2\2\u02b0\u02b2"+
		"\5<\37\2\u02b1\u02ab\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7\30\2\2\u02b7\u02b8\5$\23\2\u02b8"+
		"\u0420\3\2\2\2\u02b9\u02bc\7\67\2\2\u02ba\u02bb\7\u00a0\2\2\u02bb\u02bd"+
		"\7\u00bf\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2"+
		"\2\u02be\u02c0\7j\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c2\7\u00e7\2\2\u02c2\u02c3\7\u0102\2\2\u02c3\u02c8\5"+
		"\u00b6\\\2\u02c4\u02c5\7\4\2\2\u02c5\u02c6\5\u00eex\2\u02c6\u02c7\7\5"+
		"\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cd\58\35\2\u02cb\u02cc\7\u009f\2\2\u02cc\u02ce"+
		"\5<\37\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u0420\3\2\2\2\u02cf"+
		"\u02d0\7\21\2\2\u02d0\u02d1\7\u0102\2\2\u02d1\u02d3\5\u00b4[\2\u02d2\u02d4"+
		"\7\30\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2"+
		"\u02d5\u02d6\5$\23\2\u02d6\u0420\3\2\2\2\u02d7\u02da\7\67\2\2\u02d8\u02d9"+
		"\7\u00a0\2\2\u02d9\u02db\7\u00bf\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3"+
		"\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02de\7\u00e7\2\2\u02dd\u02dc\3\2\2\2"+
		"\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e3\7h\2\2\u02e0\u02e1"+
		"\7o\2\2\u02e1\u02e2\7\u0098\2\2\u02e2\u02e4\7U\2\2\u02e3\u02e0\3\2\2\2"+
		"\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\5\u00b4[\2\u02e6"+
		"\u02e7\7\30\2\2\u02e7\u02f1\7\u011b\2\2\u02e8\u02e9\7\u0100\2\2\u02e9"+
		"\u02ee\5N(\2\u02ea\u02eb\7\6\2\2\u02eb\u02ed\5N(\2\u02ec\u02ea\3\2\2\2"+
		"\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f2"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02e8\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u0420\3\2\2\2\u02f3\u02f5\7N\2\2\u02f4\u02f6\7\u00e7\2\2\u02f5\u02f4"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fa\7h\2\2\u02f8"+
		"\u02f9\7o\2\2\u02f9\u02fb\7U\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2"+
		"\2\u02fb\u02fc\3\2\2\2\u02fc\u0420\5\u00b4[\2\u02fd\u02ff\7V\2\2\u02fe"+
		"\u0300\t\t\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0420\5\20\t\2\u0302\u0303\7\u00d6\2\2\u0303\u0306\7\u00e4"+
		"\2\2\u0304\u0305\t\5\2\2\u0305\u0307\5\u00b4[\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u030c\3\2\2\2\u0308\u030a\7\u0085\2\2\u0309\u0308"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\7\u011b\2"+
		"\2\u030c\u0309\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0420\3\2\2\2\u030e\u030f"+
		"\7\u00d6\2\2\u030f\u0310\7\u00e3\2\2\u0310\u0313\7X\2\2\u0311\u0312\t"+
		"\5\2\2\u0312\u0314\5\u00b4[\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2"+
		"\u0314\u0315\3\2\2\2\u0315\u0316\7\u0085\2\2\u0316\u0318\7\u011b\2\2\u0317"+
		"\u0319\5*\26\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0420\3\2"+
		"\2\2\u031a\u031b\7\u00d6\2\2\u031b\u031c\7\u00e6\2\2\u031c\u0321\5\u00b4"+
		"[\2\u031d\u031e\7\4\2\2\u031e\u031f\5@!\2\u031f\u0320\7\5\2\2\u0320\u0322"+
		"\3\2\2\2\u0321\u031d\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0420\3\2\2\2\u0323"+
		"\u0324\7\u00d6\2\2\u0324\u0325\7.\2\2\u0325\u0326\t\5\2\2\u0326\u0329"+
		"\5\u00b4[\2\u0327\u0328\t\5\2\2\u0328\u032a\5\u00b4[\2\u0329\u0327\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u0420\3\2\2\2\u032b\u032c\7\u00d6\2\2\u032c"+
		"\u032f\7\u0103\2\2\u032d\u032e\t\5\2\2\u032e\u0330\5\u00b4[\2\u032f\u032d"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0335\3\2\2\2\u0331\u0333\7\u0085\2"+
		"\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336"+
		"\7\u011b\2\2\u0335\u0332\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0420\3\2\2"+
		"\2\u0337\u0338\7\u00d6\2\2\u0338\u0339\7\u00ab\2\2\u0339\u033b\5\u00b4"+
		"[\2\u033a\u033c\5*\26\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u0420\3\2\2\2\u033d\u033f\7\u00d6\2\2\u033e\u0340\5\u010c\u0087\2\u033f"+
		"\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0349\7i"+
		"\2\2\u0342\u0344\7\u0085\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0347\3\2\2\2\u0345\u0348\5\u00b4[\2\u0346\u0348\7\u011b\2\2\u0347\u0345"+
		"\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0343\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u0420\3\2\2\2\u034b\u034c\7\u00d6\2\2\u034c\u034d"+
		"\7\67\2\2\u034d\u034e\7\u00e3\2\2\u034e\u0351\5\u00b4[\2\u034f\u0350\7"+
		"\30\2\2\u0350\u0352\7\u00d0\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2"+
		"\2\u0352\u0420\3\2\2\2\u0353\u0354\7\u00d6\2\2\u0354\u0355\7:\2\2\u0355"+
		"\u0420\7\u0094\2\2\u0356\u0357\t\n\2\2\u0357\u0359\7h\2\2\u0358\u035a"+
		"\7X\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u0420\5\60\31\2\u035c\u035d\t\n\2\2\u035d\u035f\5.\30\2\u035e\u0360\7"+
		"X\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0362\5\u00b4[\2\u0362\u0420\3\2\2\2\u0363\u0365\t\n\2\2\u0364\u0366"+
		"\7\u00e3\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2"+
		"\2\u0367\u0369\t\13\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036c\5\u00b4[\2\u036b\u036d\5*\26\2\u036c\u036b"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\5\62\32\2"+
		"\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0420\3\2\2\2\u0371\u0373"+
		"\t\n\2\2\u0372\u0374\7\u00b5\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u0420\5$\23\2\u0376\u0377\7/\2\2\u0377\u0378"+
		"\7\u009c\2\2\u0378\u0379\5.\30\2\u0379\u037a\5\u00b4[\2\u037a\u037b\7"+
		"|\2\2\u037b\u037c\t\f\2\2\u037c\u0420\3\2\2\2\u037d\u037e\7/\2\2\u037e"+
		"\u037f\7\u009c\2\2\u037f\u0380\7\u00e3\2\2\u0380\u0381\5\u00b4[\2\u0381"+
		"\u0382\7|\2\2\u0382\u0383\t\f\2\2\u0383\u0420\3\2\2\2\u0384\u0385\7\u00bc"+
		"\2\2\u0385\u0386\7\u00e3\2\2\u0386\u0420\5\u00b4[\2\u0387\u0388\7\u00bc"+
		"\2\2\u0388\u0389\7h\2\2\u0389\u0420\5\u00b4[\2\u038a\u0392\7\u00bc\2\2"+
		"\u038b\u0393\7\u011b\2\2\u038c\u038e\13\2\2\2\u038d\u038c\3\2\2\2\u038e"+
		"\u0391\3\2\2\2\u038f\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0392\u038b\3\2\2\2\u0392\u038f\3\2\2\2\u0393"+
		"\u0420\3\2\2\2\u0394\u0396\7!\2\2\u0395\u0397\7\u0082\2\2\u0396\u0395"+
		"\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\7\u00e3\2"+
		"\2\u0399\u039c\5\u00b4[\2\u039a\u039b\7\u009f\2\2\u039b\u039d\5<\37\2"+
		"\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a2\3\2\2\2\u039e\u03a0"+
		"\7\30\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2"+
		"\u03a1\u03a3\5$\23\2\u03a2\u039f\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u0420"+
		"\3\2\2\2\u03a4\u03a5\7\u00f7\2\2\u03a5\u03a8\7\u00e3\2\2\u03a6\u03a7\7"+
		"o\2\2\u03a7\u03a9\7U\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u0420\5\u00b4[\2\u03ab\u03ac\7\'\2\2\u03ac\u0420"+
		"\7!\2\2\u03ad\u03ae\7\u0089\2\2\u03ae\u03b0\7?\2\2\u03af\u03b1\7\u008a"+
		"\2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b3\7v\2\2\u03b3\u03b5\7\u011b\2\2\u03b4\u03b6\7\u00a8\2\2\u03b5\u03b4"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7{\2\2\u03b8"+
		"\u03b9\7\u00e3\2\2\u03b9\u03bb\5\u00b4[\2\u03ba\u03bc\5*\26\2\u03bb\u03ba"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u0420\3\2\2\2\u03bd\u03be\7\u00f3\2"+
		"\2\u03be\u03bf\7\u00e3\2\2\u03bf\u03c1\5\u00b4[\2\u03c0\u03c2\5*\26\2"+
		"\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u0420\3\2\2\2\u03c3\u03c4"+
		"\7\u0093\2\2\u03c4\u03c5\7\u00be\2\2\u03c5\u03c6\7\u00e3\2\2\u03c6\u03c9"+
		"\5\u00b4[\2\u03c7\u03c8\t\r\2\2\u03c8\u03ca\7\u00ab\2\2\u03c9\u03c7\3"+
		"\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u0420\3\2\2\2\u03cb\u03cc\t\16\2\2\u03cc"+
		"\u03d4\5\u010c\u0087\2\u03cd\u03d5\7\u011b\2\2\u03ce\u03d0\13\2\2\2\u03cf"+
		"\u03ce\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d1\u03cf\3\2"+
		"\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03cd\3\2\2\2\u03d4"+
		"\u03d1\3\2\2\2\u03d5\u0420\3\2\2\2\u03d6\u03d7\7\u00d3\2\2\u03d7\u03db"+
		"\7\u00c6\2\2\u03d8\u03da\13\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u03dd\3\2"+
		"\2\2\u03db\u03dc\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u0420\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03de\u03df\7\u00d3\2\2\u03df\u03e0\7\u00ea\2\2\u03e0\u03e1"+
		"\7\u0108\2\2\u03e1\u0420\5\u00dan\2\u03e2\u03e3\7\u00d3\2\2\u03e3\u03e4"+
		"\7\u00ea\2\2\u03e4\u03e5\7\u0108\2\2\u03e5\u0420\t\17\2\2\u03e6\u03e7"+
		"\7\u00d3\2\2\u03e7\u03e8\7\u00ea\2\2\u03e8\u03ec\7\u0108\2\2\u03e9\u03eb"+
		"\13\2\2\2\u03ea\u03e9\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ed\3\2\2\2"+
		"\u03ec\u03ea\3\2\2\2\u03ed\u0420\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0"+
		"\7\u00d3\2\2\u03f0\u03f1\5\22\n\2\u03f1\u03f2\7\u0109\2\2\u03f2\u03f3"+
		"\5\24\13\2\u03f3\u0420\3\2\2\2\u03f4\u03f5\7\u00d3\2\2\u03f5\u03fd\5\22"+
		"\n\2\u03f6\u03fa\7\u0109\2\2\u03f7\u03f9\13\2\2\2\u03f8\u03f7\3\2\2\2"+
		"\u03f9\u03fc\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03fe"+
		"\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03f6\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0420\3\2\2\2\u03ff\u0403\7\u00d3\2\2\u0400\u0402\13\2\2\2\u0401\u0400"+
		"\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0404\3\2\2\2\u0403\u0401\3\2\2\2\u0404"+
		"\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0407\7\u0109\2\2\u0407\u0420"+
		"\5\24\13\2\u0408\u040c\7\u00d3\2\2\u0409\u040b\13\2\2\2\u040a\u0409\3"+
		"\2\2\2\u040b\u040e\3\2\2\2\u040c\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d"+
		"\u0420\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0410\7\u00c0\2\2\u0410\u0420"+
		"\5\22\n\2\u0411\u0415\7\u00c0\2\2\u0412\u0414\13\2\2\2\u0413\u0412\3\2"+
		"\2\2\u0414\u0417\3\2\2\2\u0415\u0416\3\2\2\2\u0415\u0413\3\2\2\2\u0416"+
		"\u0420\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u041c\5\26\f\2\u0419\u041b\13"+
		"\2\2\2\u041a\u0419\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041d\3\2\2\2\u041c"+
		"\u041a\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0137\3\2"+
		"\2\2\u041f\u0139\3\2\2\2\u041f\u013d\3\2\2\2\u041f\u0140\3\2\2\2\u041f"+
		"\u0145\3\2\2\2\u041f\u0157\3\2\2\2\u041f\u015e\3\2\2\2\u041f\u0164\3\2"+
		"\2\2\u041f\u016e\3\2\2\2\u041f\u017a\3\2\2\2\u041f\u018b\3\2\2\2\u041f"+
		"\u01a0\3\2\2\2\u041f\u01b1\3\2\2\2\u041f\u01c2\3\2\2\2\u041f\u01cd\3\2"+
		"\2\2\u041f\u01d4\3\2\2\2\u041f\u01dd\3\2\2\2\u041f\u01e6\3\2\2\2\u041f"+
		"\u01ef\3\2\2\2\u041f\u01f6\3\2\2\2\u041f\u01fd\3\2\2\2\u041f\u0204\3\2"+
		"\2\2\u041f\u020f\3\2\2\2\u041f\u021a\3\2\2\2\u041f\u0229\3\2\2\2\u041f"+
		"\u0235\3\2\2\2\u041f\u0243\3\2\2\2\u041f\u024d\3\2\2\2\u041f\u025b\3\2"+
		"\2\2\u041f\u0263\3\2\2\2\u041f\u0276\3\2\2\2\u041f\u027f\3\2\2\2\u041f"+
		"\u0285\3\2\2\2\u041f\u028f\3\2\2\2\u041f\u0296\3\2\2\2\u041f\u02b9\3\2"+
		"\2\2\u041f\u02cf\3\2\2\2\u041f\u02d7\3\2\2\2\u041f\u02f3\3\2\2\2\u041f"+
		"\u02fd\3\2\2\2\u041f\u0302\3\2\2\2\u041f\u030e\3\2\2\2\u041f\u031a\3\2"+
		"\2\2\u041f\u0323\3\2\2\2\u041f\u032b\3\2\2\2\u041f\u0337\3\2\2\2\u041f"+
		"\u033d\3\2\2\2\u041f\u034b\3\2\2\2\u041f\u0353\3\2\2\2\u041f\u0356\3\2"+
		"\2\2\u041f\u035c\3\2\2\2\u041f\u0363\3\2\2\2\u041f\u0371\3\2\2\2\u041f"+
		"\u0376\3\2\2\2\u041f\u037d\3\2\2\2\u041f\u0384\3\2\2\2\u041f\u0387\3\2"+
		"\2\2\u041f\u038a\3\2\2\2\u041f\u0394\3\2\2\2\u041f\u03a4\3\2\2\2\u041f"+
		"\u03ab\3\2\2\2\u041f\u03ad\3\2\2\2\u041f\u03bd\3\2\2\2\u041f\u03c3\3\2"+
		"\2\2\u041f\u03cb\3\2\2\2\u041f\u03d6\3\2\2\2\u041f\u03de\3\2\2\2\u041f"+
		"\u03e2\3\2\2\2\u041f\u03e6\3\2\2\2\u041f\u03ef\3\2\2\2\u041f\u03f4\3\2"+
		"\2\2\u041f\u03ff\3\2\2\2\u041f\u0408\3\2\2\2\u041f\u040f\3\2\2\2\u041f"+
		"\u0411\3\2\2\2\u041f\u0418\3\2\2\2\u0420\21\3\2\2\2\u0421\u0422\5\u0110"+
		"\u0089\2\u0422\23\3\2\2\2\u0423\u0424\5\u0110\u0089\2\u0424\25\3\2\2\2"+
		"\u0425\u0426\7\67\2\2\u0426\u04ce\7\u00c6\2\2\u0427\u0428\7N\2\2\u0428"+
		"\u04ce\7\u00c6\2\2\u0429\u042b\7k\2\2\u042a\u042c\7\u00c6\2\2\u042b\u042a"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u04ce\3\2\2\2\u042d\u042f\7\u00c3\2"+
		"\2\u042e\u0430\7\u00c6\2\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u04ce\3\2\2\2\u0431\u0432\7\u00d6\2\2\u0432\u04ce\7k\2\2\u0433\u0434"+
		"\7\u00d6\2\2\u0434\u0436\7\u00c6\2\2\u0435\u0437\7k\2\2\u0436\u0435\3"+
		"\2\2\2\u0436\u0437\3\2\2\2\u0437\u04ce\3\2\2\2\u0438\u0439\7\u00d6\2\2"+
		"\u0439\u04ce\7\u00b2\2\2\u043a\u043b\7\u00d6\2\2\u043b\u04ce\7\u00c7\2"+
		"\2\u043c\u043d\7\u00d6\2\2\u043d\u043e\7:\2\2\u043e\u04ce\7\u00c7\2\2"+
		"\u043f\u0440\7W\2\2\u0440\u04ce\7\u00e3\2\2\u0441\u0442\7q\2\2\u0442\u04ce"+
		"\7\u00e3\2\2\u0443\u0444\7\u00d6\2\2\u0444\u04ce\7\62\2\2\u0445\u0446"+
		"\7\u00d6\2\2\u0446\u0447\7\67\2\2\u0447\u04ce\7\u00e3\2\2\u0448\u0449"+
		"\7\u00d6\2\2\u0449\u04ce\7\u00ef\2\2\u044a\u044b\7\u00d6\2\2\u044b\u04ce"+
		"\7t\2\2\u044c\u044d\7\u00d6\2\2\u044d\u04ce\7\u008d\2\2\u044e\u044f\7"+
		"\67\2\2\u044f\u04ce\7s\2\2\u0450\u0451\7N\2\2\u0451\u04ce\7s\2\2\u0452"+
		"\u0453\7\21\2\2\u0453\u04ce\7s\2\2\u0454\u0455\7\u008c\2\2\u0455\u04ce"+
		"\7\u00e3\2\2\u0456\u0457\7\u008c\2\2\u0457\u04ce\7@\2\2\u0458\u0459\7"+
		"\u00fb\2\2\u0459\u04ce\7\u00e3\2\2\u045a\u045b\7\u00fb\2\2\u045b\u04ce"+
		"\7@\2\2\u045c\u045d\7\67\2\2\u045d\u045e\7\u00e7\2\2\u045e\u04ce\7\u008f"+
		"\2\2\u045f\u0460\7N\2\2\u0460\u0461\7\u00e7\2\2\u0461\u04ce\7\u008f\2"+
		"\2\u0462\u0463\7\21\2\2\u0463\u0464\7\u00e3\2\2\u0464\u0465\5\u00b6\\"+
		"\2\u0465\u0466\7\u0098\2\2\u0466\u0467\7)\2\2\u0467\u04ce\3\2\2\2\u0468"+
		"\u0469\7\21\2\2\u0469\u046a\7\u00e3\2\2\u046a\u046b\5\u00b6\\\2\u046b"+
		"\u046c\7)\2\2\u046c\u046d\7 \2\2\u046d\u04ce\3\2\2\2\u046e\u046f\7\21"+
		"\2\2\u046f\u0470\7\u00e3\2\2\u0470\u0471\5\u00b6\\\2\u0471\u0472\7\u0098"+
		"\2\2\u0472\u0473\7\u00da\2\2\u0473\u04ce\3\2\2\2\u0474\u0475\7\21\2\2"+
		"\u0475\u0476\7\u00e3\2\2\u0476\u0477\5\u00b6\\\2\u0477\u0478\7\u00d7\2"+
		"\2\u0478\u0479\7 \2\2\u0479\u04ce\3\2\2\2\u047a\u047b\7\21\2\2\u047b\u047c"+
		"\7\u00e3\2\2\u047c\u047d\5\u00b6\\\2\u047d\u047e\7\u0098\2\2\u047e\u047f"+
		"\7\u00d7\2\2\u047f\u04ce\3\2\2\2\u0480\u0481\7\21\2\2\u0481\u0482\7\u00e3"+
		"\2\2\u0482\u0483\5\u00b6\\\2\u0483\u0484\7\u0098\2\2\u0484\u0485\7\u00dd"+
		"\2\2\u0485\u0486\7\30\2\2\u0486\u0487\7I\2\2\u0487\u04ce\3\2\2\2\u0488"+
		"\u0489\7\21\2\2\u0489\u048a\7\u00e3\2\2\u048a\u048b\5\u00b6\\\2\u048b"+
		"\u048c\7\u00d3\2\2\u048c\u048d\7\u00d7\2\2\u048d\u048e\7\u008b\2\2\u048e"+
		"\u04ce\3\2\2\2\u048f\u0490\7\21\2\2\u0490\u0491\7\u00e3\2\2\u0491\u0492"+
		"\5\u00b6\\\2\u0492\u0493\7T\2\2\u0493\u0494\7\u00a9\2\2\u0494\u04ce\3"+
		"\2\2\2\u0495\u0496\7\21\2\2\u0496\u0497\7\u00e3\2\2\u0497\u0498\5\u00b6"+
		"\\\2\u0498\u0499\7\26\2\2\u0499\u049a\7\u00a9\2\2\u049a\u04ce\3\2\2\2"+
		"\u049b\u049c\7\21\2\2\u049c\u049d\7\u00e3\2\2\u049d\u049e\5\u00b6\\\2"+
		"\u049e\u049f\7\u00f5\2\2\u049f\u04a0\7\u00a9\2\2\u04a0\u04ce\3\2\2\2\u04a1"+
		"\u04a2\7\21\2\2\u04a2\u04a3\7\u00e3\2\2\u04a3\u04a4\5\u00b6\\\2\u04a4"+
		"\u04a5\7\u00ec\2\2\u04a5\u04ce\3\2\2\2\u04a6\u04a7\7\21\2\2\u04a7\u04a8"+
		"\7\u00e3\2\2\u04a8\u04aa\5\u00b6\\\2\u04a9\u04ab\5*\26\2\u04aa\u04a9\3"+
		"\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\7\61\2\2\u04ad"+
		"\u04ce\3\2\2\2\u04ae\u04af\7\21\2\2\u04af\u04b0\7\u00e3\2\2\u04b0\u04b2"+
		"\5\u00b6\\\2\u04b1\u04b3\5*\26\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2"+
		"\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7\64\2\2\u04b5\u04ce\3\2\2\2\u04b6"+
		"\u04b7\7\21\2\2\u04b7\u04b8\7\u00e3\2\2\u04b8\u04ba\5\u00b6\\\2\u04b9"+
		"\u04bb\5*\26\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2"+
		"\2\2\u04bc\u04bd\7\u00d3\2\2\u04bd\u04be\7_\2\2\u04be\u04ce\3\2\2\2\u04bf"+
		"\u04c0\7\21\2\2\u04c0\u04c1\7\u00e3\2\2\u04c1\u04c3\5\u00b6\\\2\u04c2"+
		"\u04c4\5*\26\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2"+
		"\2\2\u04c5\u04c6\7\u00bf\2\2\u04c6\u04c7\7.\2\2\u04c7\u04ce\3\2\2\2\u04c8"+
		"\u04c9\7\u00db\2\2\u04c9\u04ce\7\u00ee\2\2\u04ca\u04ce\7\60\2\2\u04cb"+
		"\u04ce\7\u00c8\2\2\u04cc\u04ce\7H\2\2\u04cd\u0425\3\2\2\2\u04cd\u0427"+
		"\3\2\2\2\u04cd\u0429\3\2\2\2\u04cd\u042d\3\2\2\2\u04cd\u0431\3\2\2\2\u04cd"+
		"\u0433\3\2\2\2\u04cd\u0438\3\2\2\2\u04cd\u043a\3\2\2\2\u04cd\u043c\3\2"+
		"\2\2\u04cd\u043f\3\2\2\2\u04cd\u0441\3\2\2\2\u04cd\u0443\3\2\2\2\u04cd"+
		"\u0445\3\2\2\2\u04cd\u0448\3\2\2\2\u04cd\u044a\3\2\2\2\u04cd\u044c\3\2"+
		"\2\2\u04cd\u044e\3\2\2\2\u04cd\u0450\3\2\2\2\u04cd\u0452\3\2\2\2\u04cd"+
		"\u0454\3\2\2\2\u04cd\u0456\3\2\2\2\u04cd\u0458\3\2\2\2\u04cd\u045a\3\2"+
		"\2\2\u04cd\u045c\3\2\2\2\u04cd\u045f\3\2\2\2\u04cd\u0462\3\2\2\2\u04cd"+
		"\u0468\3\2\2\2\u04cd\u046e\3\2\2\2\u04cd\u0474\3\2\2\2\u04cd\u047a\3\2"+
		"\2\2\u04cd\u0480\3\2\2\2\u04cd\u0488\3\2\2\2\u04cd\u048f\3\2\2\2\u04cd"+
		"\u0495\3\2\2\2\u04cd\u049b\3\2\2\2\u04cd\u04a1\3\2\2\2\u04cd\u04a6\3\2"+
		"\2\2\u04cd\u04ae\3\2\2\2\u04cd\u04b6\3\2\2\2\u04cd\u04bf\3\2\2\2\u04cd"+
		"\u04c8\3\2\2\2\u04cd\u04ca\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2"+
		"\2\2\u04ce\27\3\2\2\2\u04cf\u04d1\7\67\2\2\u04d0\u04d2\7\u00e7\2\2\u04d1"+
		"\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d5\7Y"+
		"\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u04da\7\u00e3\2\2\u04d7\u04d8\7o\2\2\u04d8\u04d9\7\u0098\2\2\u04d9\u04db"+
		"\7U\2\2\u04da\u04d7\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04dd\5\u00b4[\2\u04dd\31\3\2\2\2\u04de\u04df\7\67\2\2\u04df\u04e1\7"+
		"\u00a0\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2"+
		"\u04e2\u04e3\7\u00bf\2\2\u04e3\u04e4\7\u00e3\2\2\u04e4\u04e5\5\u00b4["+
		"\2\u04e5\33\3\2\2\2\u04e6\u04e7\7)\2\2\u04e7\u04e8\7 \2\2\u04e8\u04ec"+
		"\5\u009cO\2\u04e9\u04ea\7\u00da\2\2\u04ea\u04eb\7 \2\2\u04eb\u04ed\5\u00a0"+
		"Q\2\u04ec\u04e9\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04ef\7{\2\2\u04ef\u04f0\7\u011f\2\2\u04f0\u04f1\7\37\2\2\u04f1\35\3"+
		"\2\2\2\u04f2\u04f3\7\u00d7\2\2\u04f3\u04f4\7 \2\2\u04f4\u04f5\5\u009c"+
		"O\2\u04f5\u04f8\7\u009c\2\2\u04f6\u04f9\5D#\2\u04f7\u04f9\5F$\2\u04f8"+
		"\u04f6\3\2\2\2\u04f8\u04f7\3\2\2\2\u04f9\u04fd\3\2\2\2\u04fa\u04fb\7\u00dd"+
		"\2\2\u04fb\u04fc\7\30\2\2\u04fc\u04fe\7I\2\2\u04fd\u04fa\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\37\3\2\2\2\u04ff\u0500\7\u008b\2\2\u0500\u0501\7"+
		"\u011b\2\2\u0501!\3\2\2\2\u0502\u0503\7/\2\2\u0503\u0504\7\u011b\2\2\u0504"+
		"#\3\2\2\2\u0505\u0507\5\64\33\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2"+
		"\2\u0507\u0508\3\2\2\2\u0508\u0509\5V,\2\u0509\u050a\5R*\2\u050a%\3\2"+
		"\2\2\u050b\u050c\7x\2\2\u050c\u050e\7\u00a8\2\2\u050d\u050f\7\u00e3\2"+
		"\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0517"+
		"\5\u00b4[\2\u0511\u0515\5*\26\2\u0512\u0513\7o\2\2\u0513\u0514\7\u0098"+
		"\2\2\u0514\u0516\7U\2\2\u0515\u0512\3\2\2\2\u0515\u0516\3\2\2\2\u0516"+
		"\u0518\3\2\2\2\u0517\u0511\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2"+
		"\2\2\u0519\u051b\5\u009cO\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u0549\3\2\2\2\u051c\u051d\7x\2\2\u051d\u051f\7{\2\2\u051e\u0520\7\u00e3"+
		"\2\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0523\5\u00b4[\2\u0522\u0524\5*\26\2\u0523\u0522\3\2\2\2\u0523\u0524"+
		"\3\2\2\2\u0524\u0528\3\2\2\2\u0525\u0526\7o\2\2\u0526\u0527\7\u0098\2"+
		"\2\u0527\u0529\7U\2\2\u0528\u0525\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b"+
		"\3\2\2\2\u052a\u052c\5\u009cO\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2"+
		"\2\u052c\u0549\3\2\2\2\u052d\u052e\7x\2\2\u052e\u0530\7\u00a8\2\2\u052f"+
		"\u0531\7\u008a\2\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0533\7J\2\2\u0533\u0535\7\u011b\2\2\u0534\u0536\5\u00b0"+
		"Y\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537"+
		"\u0539\5H%\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u0549\3\2\2"+
		"\2\u053a\u053b\7x\2\2\u053b\u053d\7\u00a8\2\2\u053c\u053e\7\u008a\2\2"+
		"\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541"+
		"\7J\2\2\u0540\u0542\7\u011b\2\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2"+
		"\2\u0542\u0543\3\2\2\2\u0543\u0546\58\35\2\u0544\u0545\7\u009f\2\2\u0545"+
		"\u0547\5<\37\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2"+
		"\2\2\u0548\u050b\3\2\2\2\u0548\u051c\3\2\2\2\u0548\u052d\3\2\2\2\u0548"+
		"\u053a\3\2\2\2\u0549\'\3\2\2\2\u054a\u054c\5*\26\2\u054b\u054d\5 \21\2"+
		"\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d)\3\2\2\2\u054e\u054f\7"+
		"\u00a9\2\2\u054f\u0550\7\4\2\2\u0550\u0555\5,\27\2\u0551\u0552\7\6\2\2"+
		"\u0552\u0554\5,\27\2\u0553\u0551\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553"+
		"\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0555\3\2\2\2\u0558"+
		"\u0559\7\5\2\2\u0559+\3\2\2\2\u055a\u055d\5\u010c\u0087\2\u055b\u055c"+
		"\7\u0109\2\2\u055c\u055e\5\u00d0i\2\u055d\u055b\3\2\2\2\u055d\u055e\3"+
		"\2\2\2\u055e-\3\2\2\2\u055f\u0560\t\20\2\2\u0560/\3\2\2\2\u0561\u0567"+
		"\5\u0106\u0084\2\u0562\u0567\7\u011b\2\2\u0563\u0567\5\u00d2j\2\u0564"+
		"\u0567\5\u00d4k\2\u0565\u0567\5\u00d6l\2\u0566\u0561\3\2\2\2\u0566\u0562"+
		"\3\2\2\2\u0566\u0563\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0565\3\2\2\2\u0567"+
		"\61\3\2\2\2\u0568\u056d\5\u010c\u0087\2\u0569\u056a\7\7\2\2\u056a\u056c"+
		"\5\u010c\u0087\2\u056b\u0569\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b\3"+
		"\2\2\2\u056d\u056e\3\2\2\2\u056e\63\3\2\2\2\u056f\u056d\3\2\2\2\u0570"+
		"\u0571\7\u0107\2\2\u0571\u0576\5\66\34\2\u0572\u0573\7\6\2\2\u0573\u0575"+
		"\5\66\34\2\u0574\u0572\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2"+
		"\u0576\u0577\3\2\2\2\u0577\65\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057b"+
		"\5\u0108\u0085\2\u057a\u057c\5\u009cO\2\u057b\u057a\3\2\2\2\u057b\u057c"+
		"\3\2\2\2\u057c\u057e\3\2\2\2\u057d\u057f\7\30\2\2\u057e\u057d\3\2\2\2"+
		"\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\7\4\2\2\u0581\u0582"+
		"\5$\23\2\u0582\u0583\7\5\2\2\u0583\67\3\2\2\2\u0584\u0585\7\u0100\2\2"+
		"\u0585\u0586\5\u00b4[\2\u05869\3\2\2\2\u0587\u0588\7\u009f\2\2\u0588\u0595"+
		"\5<\37\2\u0589\u058a\7\u00aa\2\2\u058a\u058b\7 \2\2\u058b\u0595\5\u00be"+
		"`\2\u058c\u0595\5\36\20\2\u058d\u0595\5\34\17\2\u058e\u0595\5\u00b0Y\2"+
		"\u058f\u0595\5H%\2\u0590\u0595\5 \21\2\u0591\u0595\5\"\22\2\u0592\u0593"+
		"\7\u00e6\2\2\u0593\u0595\5<\37\2\u0594\u0587\3\2\2\2\u0594\u0589\3\2\2"+
		"\2\u0594\u058c\3\2\2\2\u0594\u058d\3\2\2\2\u0594\u058e\3\2\2\2\u0594\u058f"+
		"\3\2\2\2\u0594\u0590\3\2\2\2\u0594\u0591\3\2\2\2\u0594\u0592\3\2\2\2\u0595"+
		"\u0598\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597;\3\2\2\2"+
		"\u0598\u0596\3\2\2\2\u0599\u059a\7\4\2\2\u059a\u059f\5> \2\u059b\u059c"+
		"\7\6\2\2\u059c\u059e\5> \2\u059d\u059b\3\2\2\2\u059e\u05a1\3\2\2\2\u059f"+
		"\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2"+
		"\2\2\u05a2\u05a3\7\5\2\2\u05a3=\3\2\2\2\u05a4\u05a9\5@!\2\u05a5\u05a7"+
		"\7\u0109\2\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3\2\2"+
		"\2\u05a8\u05aa\5B\"\2\u05a9\u05a6\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa?\3"+
		"\2\2\2\u05ab\u05b0\5\u010c\u0087\2\u05ac\u05ad\7\7\2\2\u05ad\u05af\5\u010c"+
		"\u0087\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0"+
		"\u05b1\3\2\2\2\u05b1\u05b5\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b5\7\u011b"+
		"\2\2\u05b4\u05ab\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5A\3\2\2\2\u05b6\u05bb"+
		"\7\u011f\2\2\u05b7\u05bb\7\u0121\2\2\u05b8\u05bb\5\u00d8m\2\u05b9\u05bb"+
		"\7\u011b\2\2\u05ba\u05b6\3\2\2\2\u05ba\u05b7\3\2\2\2\u05ba\u05b8\3\2\2"+
		"\2\u05ba\u05b9\3\2\2\2\u05bbC\3\2\2\2\u05bc\u05bd\7\4\2\2\u05bd\u05c2"+
		"\5\u00d0i\2\u05be\u05bf\7\6\2\2\u05bf\u05c1\5\u00d0i\2\u05c0\u05be\3\2"+
		"\2\2\u05c1\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3"+
		"\u05c5\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c5\u05c6\7\5\2\2\u05c6E\3\2\2\2"+
		"\u05c7\u05c8\7\4\2\2\u05c8\u05cd\5D#\2\u05c9\u05ca\7\6\2\2\u05ca\u05cc"+
		"\5D#\2\u05cb\u05c9\3\2\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd"+
		"\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7\5"+
		"\2\2\u05d1G\3\2\2\2\u05d2\u05d3\7\u00dd\2\2\u05d3\u05d4\7\30\2\2\u05d4"+
		"\u05d9\5J&\2\u05d5\u05d6\7\u00dd\2\2\u05d6\u05d7\7 \2\2\u05d7\u05d9\5"+
		"L\'\2\u05d8\u05d2\3\2\2\2\u05d8\u05d5\3\2\2\2\u05d9I\3\2\2\2\u05da\u05db"+
		"\7w\2\2\u05db\u05dc\7\u011b\2\2\u05dc\u05dd\7\u00a4\2\2\u05dd\u05e0\7"+
		"\u011b\2\2\u05de\u05e0\5\u010c\u0087\2\u05df\u05da\3\2\2\2\u05df\u05de"+
		"\3\2\2\2\u05e0K\3\2\2\2\u05e1\u05e5\7\u011b\2\2\u05e2\u05e3\7\u0107\2"+
		"\2\u05e3\u05e4\7\u00d1\2\2\u05e4\u05e6\5<\37\2\u05e5\u05e2\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6M\3\2\2\2\u05e7\u05e8\5\u010c\u0087\2\u05e8\u05e9"+
		"\7\u011b\2\2\u05e9O\3\2\2\2\u05ea\u05eb\5&\24\2\u05eb\u05ec\5V,\2\u05ec"+
		"\u05ed\5R*\2\u05ed\u061e\3\2\2\2\u05ee\u05f0\5|?\2\u05ef\u05f1\5T+\2\u05f0"+
		"\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2"+
		"\2\2\u05f3\u061e\3\2\2\2\u05f4\u05f5\7D\2\2\u05f5\u05f6\7f\2\2\u05f6\u05f7"+
		"\5\u00b4[\2\u05f7\u05f9\5\u00aeX\2\u05f8\u05fa\5t;\2\u05f9\u05f8\3\2\2"+
		"\2\u05f9\u05fa\3\2\2\2\u05fa\u061e\3\2\2\2\u05fb\u05fc\7\u00fd\2\2\u05fc"+
		"\u05fd\5\u00b4[\2\u05fd\u05fe\5\u00aeX\2\u05fe\u0600\5f\64\2\u05ff\u0601"+
		"\5t;\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u061e\3\2\2\2\u0602"+
		"\u0603\7\u0092\2\2\u0603\u0604\7{\2\2\u0604\u0605\5\u00b4[\2\u0605\u0606"+
		"\5\u00aeX\2\u0606\u060c\7\u0100\2\2\u0607\u060d\5\u00b4[\2\u0608\u0609"+
		"\7\4\2\2\u0609\u060a\5$\23\2\u060a\u060b\7\5\2\2\u060b\u060d\3\2\2\2\u060c"+
		"\u0607\3\2\2\2\u060c\u0608\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\5\u00ae"+
		"X\2\u060f\u0610\7\u009c\2\2\u0610\u0614\5\u00c8e\2\u0611\u0613\5h\65\2"+
		"\u0612\u0611\3\2\2\2\u0613\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615"+
		"\3\2\2\2\u0615\u061a\3\2\2\2\u0616\u0614\3\2\2\2\u0617\u0619\5j\66\2\u0618"+
		"\u0617\3\2\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2"+
		"\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u05ea\3\2\2\2\u061d"+
		"\u05ee\3\2\2\2\u061d\u05f4\3\2\2\2\u061d\u05fb\3\2\2\2\u061d\u0602\3\2"+
		"\2\2\u061eQ\3\2\2\2\u061f\u0620\7\u00a1\2\2\u0620\u0621\7 \2\2\u0621\u0626"+
		"\5Z.\2\u0622\u0623\7\6\2\2\u0623\u0625\5Z.\2\u0624\u0622\3\2\2\2\u0625"+
		"\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u062a\3\2"+
		"\2\2\u0628\u0626\3\2\2\2\u0629\u061f\3\2\2\2\u0629\u062a\3\2\2\2\u062a"+
		"\u0635\3\2\2\2\u062b\u062c\7(\2\2\u062c\u062d\7 \2\2\u062d\u0632\5\u00c6"+
		"d\2\u062e\u062f\7\6\2\2\u062f\u0631\5\u00c6d\2\u0630\u062e\3\2\2\2\u0631"+
		"\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0636\3\2"+
		"\2\2\u0634\u0632\3\2\2\2\u0635\u062b\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0641\3\2\2\2\u0637\u0638\7L\2\2\u0638\u0639\7 \2\2\u0639\u063e\5\u00c6"+
		"d\2\u063a\u063b\7\6\2\2\u063b\u063d\5\u00c6d\2\u063c\u063a\3\2\2\2\u063d"+
		"\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0642\3\2"+
		"\2\2\u0640\u063e\3\2\2\2\u0641\u0637\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u064d\3\2\2\2\u0643\u0644\7\u00d9\2\2\u0644\u0645\7 \2\2\u0645\u064a"+
		"\5Z.\2\u0646\u0647\7\6\2\2\u0647\u0649\5Z.\2\u0648\u0646\3\2\2\2\u0649"+
		"\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064e\3\2"+
		"\2\2\u064c\u064a\3\2\2\2\u064d\u0643\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u0650\3\2\2\2\u064f\u0651\5\u00f8}\2\u0650\u064f\3\2\2\2\u0650\u0651"+
		"\3\2\2\2\u0651\u0657\3\2\2\2\u0652\u0655\7\u0086\2\2\u0653\u0656\7\20"+
		"\2\2\u0654\u0656\5\u00c6d\2\u0655\u0653\3\2\2\2\u0655\u0654\3\2\2\2\u0656"+
		"\u0658\3\2\2\2\u0657\u0652\3\2\2\2\u0657\u0658\3\2\2\2\u0658S\3\2\2\2"+
		"\u0659\u065a\5&\24\2\u065a\u065b\5^\60\2\u065bU\3\2\2\2\u065c\u065d\b"+
		",\1\2\u065d\u065e\5X-\2\u065e\u0676\3\2\2\2\u065f\u0660\f\5\2\2\u0660"+
		"\u0661\6,\3\2\u0661\u0663\t\21\2\2\u0662\u0664\5\u008eH\2\u0663\u0662"+
		"\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0675\5V,\6\u0666"+
		"\u0667\f\4\2\2\u0667\u0668\6,\5\2\u0668\u066a\7y\2\2\u0669\u066b\5\u008e"+
		"H\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u0675\5V,\5\u066d\u066e\f\3\2\2\u066e\u066f\6,\7\2\u066f\u0671\t\22\2"+
		"\2\u0670\u0672\5\u008eH\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672"+
		"\u0673\3\2\2\2\u0673\u0675\5V,\4\u0674\u065f\3\2\2\2\u0674\u0666\3\2\2"+
		"\2\u0674\u066d\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677"+
		"\3\2\2\2\u0677W\3\2\2\2\u0678\u0676\3\2\2\2\u0679\u0683\5`\61\2\u067a"+
		"\u0683\5\\/\2\u067b\u067c\7\u00e3\2\2\u067c\u0683\5\u00b4[\2\u067d\u0683"+
		"\5\u00aaV\2\u067e\u067f\7\4\2\2\u067f\u0680\5$\23\2\u0680\u0681\7\5\2"+
		"\2\u0681\u0683\3\2\2\2\u0682\u0679\3\2\2\2\u0682\u067a\3\2\2\2\u0682\u067b"+
		"\3\2\2\2\u0682\u067d\3\2\2\2\u0682\u067e\3\2\2\2\u0683Y\3\2\2\2\u0684"+
		"\u0686\5\u00c6d\2\u0685\u0687\t\23\2\2\u0686\u0685\3\2\2\2\u0686\u0687"+
		"\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0689\7\u009a\2\2\u0689\u068b\t\24"+
		"\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b[\3\2\2\2\u068c\u068e"+
		"\5|?\2\u068d\u068f\5^\60\2\u068e\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690"+
		"\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691]\3\2\2\2\u0692\u0694\5b\62\2"+
		"\u0693\u0695\5t;\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696"+
		"\3\2\2\2\u0696\u0697\5R*\2\u0697\u06ae\3\2\2\2\u0698\u069c\5d\63\2\u0699"+
		"\u069b\5\u008cG\2\u069a\u0699\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a"+
		"\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a0\3\2\2\2\u069e\u069c\3\2\2\2\u069f"+
		"\u06a1\5t;\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\3\2\2"+
		"\2\u06a2\u06a4\5~@\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6"+
		"\3\2\2\2\u06a5\u06a7\5v<\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7"+
		"\u06a9\3\2\2\2\u06a8\u06aa\5\u00f8}\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\5R*\2\u06ac\u06ae\3\2\2\2\u06ad"+
		"\u0692\3\2\2\2\u06ad\u0698\3\2\2\2\u06ae_\3\2\2\2\u06af\u06b1\5b\62\2"+
		"\u06b0\u06b2\5|?\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4"+
		"\3\2\2\2\u06b3\u06b5\5t;\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06cd\3\2\2\2\u06b6\u06b8\5d\63\2\u06b7\u06b9\5|?\2\u06b8\u06b7\3\2\2"+
		"\2\u06b8\u06b9\3\2\2\2\u06b9\u06bd\3\2\2\2\u06ba\u06bc\5\u008cG\2\u06bb"+
		"\u06ba\3\2\2\2\u06bc\u06bf\3\2\2\2\u06bd\u06bb\3\2\2\2\u06bd\u06be\3\2"+
		"\2\2\u06be\u06c1\3\2\2\2\u06bf\u06bd\3\2\2\2\u06c0\u06c2\5t;\2\u06c1\u06c0"+
		"\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c4\3\2\2\2\u06c3\u06c5\5~@\2\u06c4"+
		"\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c8\5v"+
		"<\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca\3\2\2\2\u06c9"+
		"\u06cb\5\u00f8}\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd"+
		"\3\2\2\2\u06cc\u06af\3\2\2\2\u06cc\u06b6\3\2\2\2\u06cda\3\2\2\2\u06ce"+
		"\u06cf\7\u00cd\2\2\u06cf\u06d0\7\u00f0\2\2\u06d0\u06d1\7\4\2\2\u06d1\u06d2"+
		"\5\u00bc_\2\u06d2\u06d3\7\5\2\2\u06d3\u06d9\3\2\2\2\u06d4\u06d5\7\u0090"+
		"\2\2\u06d5\u06d9\5\u00bc_\2\u06d6\u06d7\7\u00ba\2\2\u06d7\u06d9\5\u00bc"+
		"_\2\u06d8\u06ce\3\2\2\2\u06d8\u06d4\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9"+
		"\u06db\3\2\2\2\u06da\u06dc\5\u00b0Y\2\u06db\u06da\3\2\2\2\u06db\u06dc"+
		"\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06de\7\u00b8\2\2\u06de\u06e0\7\u011b"+
		"\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1"+
		"\u06e2\7\u0100\2\2\u06e2\u06ef\7\u011b\2\2\u06e3\u06ed\7\30\2\2\u06e4"+
		"\u06ee\5\u009eP\2\u06e5\u06ee\5\u00eex\2\u06e6\u06e9\7\4\2\2\u06e7\u06ea"+
		"\5\u009eP\2\u06e8\u06ea\5\u00eex\2\u06e9\u06e7\3\2\2\2\u06e9\u06e8\3\2"+
		"\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\7\5\2\2\u06ec\u06ee\3\2\2\2\u06ed"+
		"\u06e4\3\2\2\2\u06ed\u06e5\3\2\2\2\u06ed\u06e6\3\2\2\2\u06ee\u06f0\3\2"+
		"\2\2\u06ef\u06e3\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1"+
		"\u06f3\5\u00b0Y\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f6"+
		"\3\2\2\2\u06f4\u06f5\7\u00b7\2\2\u06f5\u06f7\7\u011b\2\2\u06f6\u06f4\3"+
		"\2\2\2\u06f6\u06f7\3\2\2\2\u06f7c\3\2\2\2\u06f8\u06fc\7\u00cd\2\2\u06f9"+
		"\u06fb\5x=\2\u06fa\u06f9\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2"+
		"\2\u06fc\u06fd\3\2\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0701"+
		"\5\u008eH\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2"+
		"\2\u0702\u0703\5\u00bc_\2\u0703e\3\2\2\2\u0704\u0705\7\u00d3\2\2\u0705"+
		"\u0706\5p9\2\u0706g\3\2\2\2\u0707\u0708\7\u0104\2\2\u0708\u070b\7\u0091"+
		"\2\2\u0709\u070a\7\23\2\2\u070a\u070c\5\u00c8e\2\u070b\u0709\3\2\2\2\u070b"+
		"\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\7\u00e9\2\2\u070e\u070f"+
		"\5l\67\2\u070fi\3\2\2\2\u0710\u0711\7\u0104\2\2\u0711\u0712\7\u0098\2"+
		"\2\u0712\u0715\7\u0091\2\2\u0713\u0714\7\23\2\2\u0714\u0716\5\u00c8e\2"+
		"\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0718"+
		"\7\u00e9\2\2\u0718\u0719\5n8\2\u0719k\3\2\2\2\u071a\u0722\7D\2\2\u071b"+
		"\u071c\7\u00fd\2\2\u071c\u071d\7\u00d3\2\2\u071d\u0722\7\u0113\2\2\u071e"+
		"\u071f\7\u00fd\2\2\u071f\u0720\7\u00d3\2\2\u0720\u0722\5p9\2\u0721\u071a"+
		"\3\2\2\2\u0721\u071b\3\2\2\2\u0721\u071e\3\2\2\2\u0722m\3\2\2\2\u0723"+
		"\u0724\7x\2\2\u0724\u0736\7\u0113\2\2\u0725\u0726\7x\2\2\u0726\u0727\7"+
		"\4\2\2\u0727\u0728\5\u00b2Z\2\u0728\u0729\7\5\2\2\u0729\u072a\7\u0101"+
		"\2\2\u072a\u072b\7\4\2\2\u072b\u0730\5\u00c6d\2\u072c\u072d\7\6\2\2\u072d"+
		"\u072f\5\u00c6d\2\u072e\u072c\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e"+
		"\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0733\3\2\2\2\u0732\u0730\3\2\2\2\u0733"+
		"\u0734\7\5\2\2\u0734\u0736\3\2\2\2\u0735\u0723\3\2\2\2\u0735\u0725\3\2"+
		"\2\2\u0736o\3\2\2\2\u0737\u073c\5r:\2\u0738\u0739\7\6\2\2\u0739\u073b"+
		"\5r:\2\u073a\u0738\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c"+
		"\u073d\3\2\2\2\u073dq\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0740\5\u00b4"+
		"[\2\u0740\u0741\7\u0109\2\2\u0741\u0742\5\u00c6d\2\u0742s\3\2\2\2\u0743"+
		"\u0744\7\u0105\2\2\u0744\u0745\5\u00c8e\2\u0745u\3\2\2\2\u0746\u0747\7"+
		"n\2\2\u0747\u0748\5\u00c8e\2\u0748w\3\2\2\2\u0749\u074a\7\b\2\2\u074a"+
		"\u0751\5z>\2\u074b\u074d\7\6\2\2\u074c\u074b\3\2\2\2\u074c\u074d\3\2\2"+
		"\2\u074d\u074e\3\2\2\2\u074e\u0750\5z>\2\u074f\u074c\3\2\2\2\u0750\u0753"+
		"\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0754\3\2\2\2\u0753"+
		"\u0751\3\2\2\2\u0754\u0755\7\t\2\2\u0755y\3\2\2\2\u0756\u0764\5\u010c"+
		"\u0087\2\u0757\u0758\5\u010c\u0087\2\u0758\u0759\7\4\2\2\u0759\u075e\5"+
		"\u00ceh\2\u075a\u075b\7\6\2\2\u075b\u075d\5\u00ceh\2\u075c\u075a\3\2\2"+
		"\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761"+
		"\3\2\2\2\u0760\u075e\3\2\2\2\u0761\u0762\7\5\2\2\u0762\u0764\3\2\2\2\u0763"+
		"\u0756\3\2\2\2\u0763\u0757\3\2\2\2\u0764{\3\2\2\2\u0765\u0766\7f\2\2\u0766"+
		"\u076b\5\u0090I\2\u0767\u0768\7\6\2\2\u0768\u076a\5\u0090I\2\u0769\u0767"+
		"\3\2\2\2\u076a\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c"+
		"\u0771\3\2\2\2\u076d\u076b\3\2\2\2\u076e\u0770\5\u008cG\2\u076f\u076e"+
		"\3\2\2\2\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0774\u0776\5\u0086D\2\u0775\u0774"+
		"\3\2\2\2\u0775\u0776\3\2\2\2\u0776}\3\2\2\2\u0777\u0778\7l\2\2\u0778\u0779"+
		"\7 \2\2\u0779\u077e\5\u0080A\2\u077a\u077b\7\6\2\2\u077b\u077d\5\u0080"+
		"A\2\u077c\u077a\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e"+
		"\u077f\3\2\2\2\u077f\u079f\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0782\7l"+
		"\2\2\u0782\u0783\7 \2\2\u0783\u0788\5\u00c6d\2\u0784\u0785\7\6\2\2\u0785"+
		"\u0787\5\u00c6d\2\u0786\u0784\3\2\2\2\u0787\u078a\3\2\2\2\u0788\u0786"+
		"\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u079c\3\2\2\2\u078a\u0788\3\2\2\2\u078b"+
		"\u078c\7\u0107\2\2\u078c\u079d\7\u00c9\2\2\u078d\u078e\7\u0107\2\2\u078e"+
		"\u079d\79\2\2\u078f\u0790\7m\2\2\u0790\u0791\7\u00d5\2\2\u0791\u0792\7"+
		"\4\2\2\u0792\u0797\5\u0084C\2\u0793\u0794\7\6\2\2\u0794\u0796\5\u0084"+
		"C\2\u0795\u0793\3\2\2\2\u0796\u0799\3\2\2\2\u0797\u0795\3\2\2\2\u0797"+
		"\u0798\3\2\2\2\u0798\u079a\3\2\2\2\u0799\u0797\3\2\2\2\u079a\u079b\7\5"+
		"\2\2\u079b\u079d\3\2\2\2\u079c\u078b\3\2\2\2\u079c\u078d\3\2\2\2\u079c"+
		"\u078f\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079f\3\2\2\2\u079e\u0777\3\2"+
		"\2\2\u079e\u0781\3\2\2\2\u079f\177\3\2\2\2\u07a0\u07a3\5\u0082B\2\u07a1"+
		"\u07a3\5\u00c6d\2\u07a2\u07a0\3\2\2\2\u07a2\u07a1\3\2\2\2\u07a3\u0081"+
		"\3\2\2\2\u07a4\u07a9\7\u00c9\2\2\u07a5\u07a9\79\2\2\u07a6\u07a7\7m\2\2"+
		"\u07a7\u07a9\7\u00d5\2\2\u07a8\u07a4\3\2\2\2\u07a8\u07a5\3\2\2\2\u07a8"+
		"\u07a6\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\7\4\2\2\u07ab\u07b0\5\u0084"+
		"C\2\u07ac\u07ad\7\6\2\2\u07ad\u07af\5\u0084C\2\u07ae\u07ac\3\2\2\2\u07af"+
		"\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\3\2"+
		"\2\2\u07b2\u07b0\3\2\2\2\u07b3\u07b4\7\5\2\2\u07b4\u0083\3\2\2\2\u07b5"+
		"\u07be\7\4\2\2\u07b6\u07bb\5\u00c6d\2\u07b7\u07b8\7\6\2\2\u07b8\u07ba"+
		"\5\u00c6d\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2"+
		"\2\u07bb\u07bc\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07b6"+
		"\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c3\7\5\2\2\u07c1"+
		"\u07c3\5\u00c6d\2\u07c2\u07b5\3\2\2\2\u07c2\u07c1\3\2\2\2\u07c3\u0085"+
		"\3\2\2\2\u07c4\u07c5\7\u00ad\2\2\u07c5\u07c6\7\4\2\2\u07c6\u07c7\5\u00bc"+
		"_\2\u07c7\u07c8\7b\2\2\u07c8\u07c9\5\u0088E\2\u07c9\u07ca\7r\2\2\u07ca"+
		"\u07cb\7\4\2\2\u07cb\u07d0\5\u008aF\2\u07cc\u07cd\7\6\2\2\u07cd\u07cf"+
		"\5\u008aF\2\u07ce\u07cc\3\2\2\2\u07cf\u07d2\3\2\2\2\u07d0\u07ce\3\2\2"+
		"\2\u07d0\u07d1\3\2\2\2\u07d1\u07d3\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d3\u07d4"+
		"\7\5\2\2\u07d4\u07d5\7\5\2\2\u07d5\u0087\3\2\2\2\u07d6\u07e3\5\u010c\u0087"+
		"\2\u07d7\u07d8\7\4\2\2\u07d8\u07dd\5\u010c\u0087\2\u07d9\u07da\7\6\2\2"+
		"\u07da\u07dc\5\u010c\u0087\2\u07db\u07d9\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd"+
		"\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df\u07dd\3\2"+
		"\2\2\u07e0\u07e1\7\5\2\2\u07e1\u07e3\3\2\2\2\u07e2\u07d6\3\2\2\2\u07e2"+
		"\u07d7\3\2\2\2\u07e3\u0089\3\2\2\2\u07e4\u07e9\5\u00c6d\2\u07e5\u07e7"+
		"\7\30\2\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\3\2\2\2"+
		"\u07e8\u07ea\5\u010c\u0087\2\u07e9\u07e6\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u008b\3\2\2\2\u07eb\u07ec\7\u0081\2\2\u07ec\u07ee\7\u0102\2\2\u07ed\u07ef"+
		"\7\u00a3\2\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\3\2\2"+
		"\2\u07f0\u07f1\5\u0106\u0084\2\u07f1\u07fa\7\4\2\2\u07f2\u07f7\5\u00c6"+
		"d\2\u07f3\u07f4\7\6\2\2\u07f4\u07f6\5\u00c6d\2\u07f5\u07f3\3\2\2\2\u07f6"+
		"\u07f9\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fb\3\2"+
		"\2\2\u07f9\u07f7\3\2\2\2\u07fa\u07f2\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb"+
		"\u07fc\3\2\2\2\u07fc\u07fd\7\5\2\2\u07fd\u0809\5\u010c\u0087\2\u07fe\u0800"+
		"\7\30\2\2\u07ff\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\3\2\2\2"+
		"\u0801\u0806\5\u010c\u0087\2\u0802\u0803\7\6\2\2\u0803\u0805\5\u010c\u0087"+
		"\2\u0804\u0802\3\2\2\2\u0805\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807"+
		"\3\2\2\2\u0807\u080a\3\2\2\2\u0808\u0806\3\2\2\2\u0809\u07ff\3\2\2\2\u0809"+
		"\u080a\3\2\2\2\u080a\u008d\3\2\2\2\u080b\u080c\t\25\2\2\u080c\u008f\3"+
		"\2\2\2\u080d\u0811\5\u00a8U\2\u080e\u0810\5\u0092J\2\u080f\u080e\3\2\2"+
		"\2\u0810\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0091"+
		"\3\2\2\2\u0813\u0811\3\2\2\2\u0814\u0815\5\u0094K\2\u0815\u0816\7~\2\2"+
		"\u0816\u0818\5\u00a8U\2\u0817\u0819\5\u0096L\2\u0818\u0817\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u0820\3\2\2\2\u081a\u081b\7\u0096\2\2\u081b\u081c"+
		"\5\u0094K\2\u081c\u081d\7~\2\2\u081d\u081e\5\u00a8U\2\u081e\u0820\3\2"+
		"\2\2\u081f\u0814\3\2\2\2\u081f\u081a\3\2\2\2\u0820\u0093\3\2\2\2\u0821"+
		"\u0823\7u\2\2\u0822\u0821\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u083a\3\2"+
		"\2\2\u0824\u083a\78\2\2\u0825\u0827\7\u0084\2\2\u0826\u0828\7\u00a3\2"+
		"\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u083a\3\2\2\2\u0829\u082b"+
		"\7\u0084\2\2\u082a\u0829\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c\3\2\2"+
		"\2\u082c\u083a\7\u00ce\2\2\u082d\u082f\7\u00c4\2\2\u082e\u0830\7\u00a3"+
		"\2\2\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u083a\3\2\2\2\u0831"+
		"\u0833\7g\2\2\u0832\u0834\7\u00a3\2\2\u0833\u0832\3\2\2\2\u0833\u0834"+
		"\3\2\2\2\u0834\u083a\3\2\2\2\u0835\u0837\7\u0084\2\2\u0836\u0835\3\2\2"+
		"\2\u0836\u0837\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a\7\24\2\2\u0839"+
		"\u0822\3\2\2\2\u0839\u0824\3\2\2\2\u0839\u0825\3\2\2\2\u0839\u082a\3\2"+
		"\2\2\u0839\u082d\3\2\2\2\u0839\u0831\3\2\2\2\u0839\u0836\3\2\2\2\u083a"+
		"\u0095\3\2\2\2\u083b\u083c\7\u009c\2\2\u083c\u0840\5\u00c8e\2\u083d\u083e"+
		"\7\u0100\2\2\u083e\u0840\5\u009cO\2\u083f\u083b\3\2\2\2\u083f\u083d\3"+
		"\2\2\2\u0840\u0097\3\2\2\2\u0841\u0842\7\u00e5\2\2\u0842\u0844\7\4\2\2"+
		"\u0843\u0845\5\u009aN\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845"+
		"\u0846\3\2\2\2\u0846\u0847\7\5\2\2\u0847\u0099\3\2\2\2\u0848\u084a\7\u0112"+
		"\2\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b"+
		"\u084c\t\26\2\2\u084c\u0861\7\u00ac\2\2\u084d\u084e\5\u00c6d\2\u084e\u084f"+
		"\7\u00cb\2\2\u084f\u0861\3\2\2\2\u0850\u0851\7\36\2\2\u0851\u0852\7\u011f"+
		"\2\2\u0852\u0853\7\u00a2\2\2\u0853\u0854\7\u009b\2\2\u0854\u085d\7\u011f"+
		"\2\2\u0855\u085b\7\u009c\2\2\u0856\u085c\5\u010c\u0087\2\u0857\u0858\5"+
		"\u0106\u0084\2\u0858\u0859\7\4\2\2\u0859\u085a\7\5\2\2\u085a\u085c\3\2"+
		"\2\2\u085b\u0856\3\2\2\2\u085b\u0857\3\2\2\2\u085c\u085e\3\2\2\2\u085d"+
		"\u0855\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0861\3\2\2\2\u085f\u0861\5\u00c6"+
		"d\2\u0860\u0849\3\2\2\2\u0860\u084d\3\2\2\2\u0860\u0850\3\2\2\2\u0860"+
		"\u085f\3\2\2\2\u0861\u009b\3\2\2\2\u0862\u0863\7\4\2\2\u0863\u0864\5\u009e"+
		"P\2\u0864\u0865\7\5\2\2\u0865\u009d\3\2\2\2\u0866\u086b\5\u0108\u0085"+
		"\2\u0867\u0868\7\6\2\2\u0868\u086a";
	private static final String _serializedATNSegment1 =
		"\5\u0108\u0085\2\u0869\u0867\3\2\2\2\u086a\u086d\3\2\2\2\u086b\u0869\3"+
		"\2\2\2\u086b\u086c\3\2\2\2\u086c\u009f\3\2\2\2\u086d\u086b\3\2\2\2\u086e"+
		"\u086f\7\4\2\2\u086f\u0874\5\u00a2R\2\u0870\u0871\7\6\2\2\u0871\u0873"+
		"\5\u00a2R\2\u0872\u0870\3\2\2\2\u0873\u0876\3\2\2\2\u0874\u0872\3\2\2"+
		"\2\u0874\u0875\3\2\2\2\u0875\u0877\3\2\2\2\u0876\u0874\3\2\2\2\u0877\u0878"+
		"\7\5\2\2\u0878\u00a1\3\2\2\2\u0879\u087b\5\u0108\u0085\2\u087a\u087c\t"+
		"\23\2\2\u087b\u087a\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u00a3\3\2\2\2\u087d"+
		"\u087e\7\4\2\2\u087e\u0883\5\u00a6T\2\u087f\u0880\7\6\2\2\u0880\u0882"+
		"\5\u00a6T\2\u0881\u087f\3\2\2\2\u0882\u0885\3\2\2\2\u0883\u0881\3\2\2"+
		"\2\u0883\u0884\3\2\2\2\u0884\u0886\3\2\2\2\u0885\u0883\3\2\2\2\u0886\u0887"+
		"\7\5\2\2\u0887\u00a5\3\2\2\2\u0888\u088a\5\u010c\u0087\2\u0889\u088b\5"+
		"\"\22\2\u088a\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u00a7\3\2\2\2\u088c"+
		"\u088e\5\u00b4[\2\u088d\u088f\5\u0098M\2\u088e\u088d\3\2\2\2\u088e\u088f"+
		"\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\5\u00aeX\2\u0891\u08a5\3\2\2"+
		"\2\u0892\u0893\7\4\2\2\u0893\u0894\5$\23\2\u0894\u0896\7\5\2\2\u0895\u0897"+
		"\5\u0098M\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0898\3\2\2"+
		"\2\u0898\u0899\5\u00aeX\2\u0899\u08a5\3\2\2\2\u089a\u089b\7\4\2\2\u089b"+
		"\u089c\5\u0090I\2\u089c\u089e\7\5\2\2\u089d\u089f\5\u0098M\2\u089e\u089d"+
		"\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a1\5\u00aeX"+
		"\2\u08a1\u08a5\3\2\2\2\u08a2\u08a5\5\u00aaV\2\u08a3\u08a5\5\u00acW\2\u08a4"+
		"\u088c\3\2\2\2\u08a4\u0892\3\2\2\2\u08a4\u089a\3\2\2\2\u08a4\u08a2\3\2"+
		"\2\2\u08a4\u08a3\3\2\2\2\u08a5\u00a9\3\2\2\2\u08a6\u08a7\7\u0101\2\2\u08a7"+
		"\u08ac\5\u00c6d\2\u08a8\u08a9\7\6\2\2\u08a9\u08ab\5\u00c6d\2\u08aa\u08a8"+
		"\3\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad"+
		"\u08af\3\2\2\2\u08ae\u08ac\3\2\2\2\u08af\u08b0\5\u00aeX\2\u08b0\u00ab"+
		"\3\2\2\2\u08b1\u08b2\5\u0104\u0083\2\u08b2\u08bb\7\4\2\2\u08b3\u08b8\5"+
		"\u00c6d\2\u08b4\u08b5\7\6\2\2\u08b5\u08b7\5\u00c6d\2\u08b6\u08b4\3\2\2"+
		"\2\u08b7\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bc"+
		"\3\2\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08b3\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc"+
		"\u08bd\3\2\2\2\u08bd\u08be\7\5\2\2\u08be\u08bf\5\u00aeX\2\u08bf\u00ad"+
		"\3\2\2\2\u08c0\u08c2\7\30\2\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3\2\2\2"+
		"\u08c2\u08c3\3\2\2\2\u08c3\u08c5\5\u010e\u0088\2\u08c4\u08c6\5\u009cO"+
		"\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c8\3\2\2\2\u08c7\u08c1"+
		"\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u00af\3\2\2\2\u08c9\u08ca\7\u00ca\2"+
		"\2\u08ca\u08cb\7d\2\2\u08cb\u08cc\7\u00d0\2\2\u08cc\u08d0\7\u011b\2\2"+
		"\u08cd\u08ce\7\u0107\2\2\u08ce\u08cf\7\u00d1\2\2\u08cf\u08d1\5<\37\2\u08d0"+
		"\u08cd\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08fb\3\2\2\2\u08d2\u08d3\7\u00ca"+
		"\2\2\u08d3\u08d4\7d\2\2\u08d4\u08de\7E\2\2\u08d5\u08d6\7]\2\2\u08d6\u08d7"+
		"\7\u00e8\2\2\u08d7\u08d8\7 \2\2\u08d8\u08dc\7\u011b\2\2\u08d9\u08da\7"+
		"R\2\2\u08da\u08db\7 \2\2\u08db\u08dd\7\u011b\2\2\u08dc\u08d9\3\2\2\2\u08dc"+
		"\u08dd\3\2\2\2\u08dd\u08df\3\2\2\2\u08de\u08d5\3\2\2\2\u08de\u08df\3\2"+
		"\2\2\u08df\u08e5\3\2\2\2\u08e0\u08e1\7,\2\2\u08e1\u08e2\7}\2\2\u08e2\u08e3"+
		"\7\u00e8\2\2\u08e3\u08e4\7 \2\2\u08e4\u08e6\7\u011b\2\2\u08e5\u08e0\3"+
		"\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08ec\3\2\2\2\u08e7\u08e8\7\u0090\2\2"+
		"\u08e8\u08e9\7\177\2\2\u08e9\u08ea\7\u00e8\2\2\u08ea\u08eb\7 \2\2\u08eb"+
		"\u08ed\7\u011b\2\2\u08ec\u08e7\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08f2"+
		"\3\2\2\2\u08ee\u08ef\7\u0087\2\2\u08ef\u08f0\7\u00e8\2\2\u08f0\u08f1\7"+
		" \2\2\u08f1\u08f3\7\u011b\2\2\u08f2\u08ee\3\2\2\2\u08f2\u08f3\3\2\2\2"+
		"\u08f3\u08f8\3\2\2\2\u08f4\u08f5\7\u0099\2\2\u08f5\u08f6\7C\2\2\u08f6"+
		"\u08f7\7\30\2\2\u08f7\u08f9\7\u011b\2\2\u08f8\u08f4\3\2\2\2\u08f8\u08f9"+
		"\3\2\2\2\u08f9\u08fb\3\2\2\2\u08fa\u08c9\3\2\2\2\u08fa\u08d2\3\2\2\2\u08fb"+
		"\u00b1\3\2\2\2\u08fc\u0901\5\u00b4[\2\u08fd\u08fe\7\6\2\2\u08fe\u0900"+
		"\5\u00b4[\2\u08ff\u08fd\3\2\2\2\u0900\u0903\3\2\2\2\u0901\u08ff\3\2\2"+
		"\2\u0901\u0902\3\2\2\2\u0902\u00b3\3\2\2\2\u0903\u0901\3\2\2\2\u0904\u0909"+
		"\5\u0108\u0085\2\u0905\u0906\7\7\2\2\u0906\u0908\5\u0108\u0085\2\u0907"+
		"\u0905\3\2\2\2\u0908\u090b\3\2\2\2\u0909\u0907\3\2\2\2\u0909\u090a\3\2"+
		"\2\2\u090a\u00b5\3\2\2\2\u090b\u0909\3\2\2\2\u090c\u090d\5\u0108\u0085"+
		"\2\u090d\u090e\7\7\2\2\u090e\u0910\3\2\2\2\u090f\u090c\3\2\2\2\u090f\u0910"+
		"\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\5\u0108\u0085\2\u0912\u00b7\3"+
		"\2\2\2\u0913\u0914\5\u0108\u0085\2\u0914\u0915\7\7\2\2\u0915\u0917\3\2"+
		"\2\2\u0916\u0913\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0918\3\2\2\2\u0918"+
		"\u0919\5\u0108\u0085\2\u0919\u00b9\3\2\2\2\u091a\u0922\5\u00c6d\2\u091b"+
		"\u091d\7\30\2\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u0920\3"+
		"\2\2\2\u091e\u0921\5\u0108\u0085\2\u091f\u0921\5\u009cO\2\u0920\u091e"+
		"\3\2\2\2\u0920\u091f\3\2\2\2\u0921\u0923\3\2\2\2\u0922\u091c\3\2\2\2\u0922"+
		"\u0923\3\2\2\2\u0923\u00bb\3\2\2\2\u0924\u0929\5\u00ba^\2\u0925\u0926"+
		"\7\6\2\2\u0926\u0928\5\u00ba^\2\u0927\u0925\3\2\2\2\u0928\u092b\3\2\2"+
		"\2\u0929\u0927\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u00bd\3\2\2\2\u092b\u0929"+
		"\3\2\2\2\u092c\u092d\7\4\2\2\u092d\u0932\5\u00c0a\2\u092e\u092f\7\6\2"+
		"\2\u092f\u0931\5\u00c0a\2\u0930\u092e\3\2\2\2\u0931\u0934\3\2\2\2\u0932"+
		"\u0930\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0935\3\2\2\2\u0934\u0932\3\2"+
		"\2\2\u0935\u0936\7\5\2\2\u0936\u00bf\3\2\2\2\u0937\u093a\5\u00c2b\2\u0938"+
		"\u093a\5\u00f0y\2\u0939\u0937\3\2\2\2\u0939\u0938\3\2\2\2\u093a\u00c1"+
		"\3\2\2\2\u093b\u0949\5\u0106\u0084\2\u093c\u093d\5\u010c\u0087\2\u093d"+
		"\u093e\7\4\2\2\u093e\u0943\5\u00c4c\2\u093f\u0940\7\6\2\2\u0940\u0942"+
		"\5\u00c4c\2\u0941\u093f\3\2\2\2\u0942\u0945\3\2\2\2\u0943\u0941\3\2\2"+
		"\2\u0943\u0944\3\2\2\2\u0944\u0946\3\2\2\2\u0945\u0943\3\2\2\2\u0946\u0947"+
		"\7\5\2\2\u0947\u0949\3\2\2\2\u0948\u093b\3\2\2\2\u0948\u093c\3\2\2\2\u0949"+
		"\u00c3\3\2\2\2\u094a\u094d\5\u0106\u0084\2\u094b\u094d\5\u00d0i\2\u094c"+
		"\u094a\3\2\2\2\u094c\u094b\3\2\2\2\u094d\u00c5\3\2\2\2\u094e\u094f\5\u00c8"+
		"e\2\u094f\u00c7\3\2\2\2\u0950\u0951\be\1\2\u0951\u0952\7\u0098\2\2\u0952"+
		"\u095d\5\u00c8e\7\u0953\u0954\7U\2\2\u0954\u0955\7\4\2\2\u0955\u0956\5"+
		"$\23\2\u0956\u0957\7\5\2\2\u0957\u095d\3\2\2\2\u0958\u095a\5\u00ccg\2"+
		"\u0959\u095b\5\u00caf\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b"+
		"\u095d\3\2\2\2\u095c\u0950\3\2\2\2\u095c\u0953\3\2\2\2\u095c\u0958\3\2"+
		"\2\2\u095d\u0966\3\2\2\2\u095e\u095f\f\4\2\2\u095f\u0960\7\23\2\2\u0960"+
		"\u0965\5\u00c8e\5\u0961\u0962\f\3\2\2\u0962\u0963\7\u00a0\2\2\u0963\u0965"+
		"\5\u00c8e\4\u0964\u095e\3\2\2\2\u0964\u0961\3\2\2\2\u0965\u0968\3\2\2"+
		"\2\u0966\u0964\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u00c9\3\2\2\2\u0968\u0966"+
		"\3\2\2\2\u0969\u096b\7\u0098\2\2\u096a\u0969\3\2\2\2\u096a\u096b\3\2\2"+
		"\2\u096b\u096c\3\2\2\2\u096c\u096d\7\34\2\2\u096d\u096e\5\u00ccg\2\u096e"+
		"\u096f\7\23\2\2\u096f\u0970\5\u00ccg\2\u0970\u09bc\3\2\2\2\u0971\u0973"+
		"\7\u0098\2\2\u0972\u0971\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\3\2\2"+
		"\2\u0974\u0975\7r\2\2\u0975\u0976\7\4\2\2\u0976\u097b\5\u00c6d\2\u0977"+
		"\u0978\7\6\2\2\u0978\u097a\5\u00c6d\2\u0979\u0977\3\2\2\2\u097a\u097d"+
		"\3\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097e\3\2\2\2\u097d"+
		"\u097b\3\2\2\2\u097e\u097f\7\5\2\2\u097f\u09bc\3\2\2\2\u0980\u0982\7\u0098"+
		"\2\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u0984\7r\2\2\u0984\u0985\7\4\2\2\u0985\u0986\5$\23\2\u0986\u0987\7\5"+
		"\2\2\u0987\u09bc\3\2\2\2\u0988\u098a\7\u0098\2\2\u0989\u0988\3\2\2\2\u0989"+
		"\u098a\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098c\7\u00c5\2\2\u098c\u09bc"+
		"\5\u00ccg\2\u098d\u098f\7\u0098\2\2\u098e\u098d\3\2\2\2\u098e\u098f\3"+
		"\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\7\u0085\2\2\u0991\u099f\t\27\2"+
		"\2\u0992\u0993\7\4\2\2\u0993\u09a0\7\5\2\2\u0994\u0995\7\4\2\2\u0995\u099a"+
		"\5\u00c6d\2\u0996\u0997\7\6\2\2\u0997\u0999\5\u00c6d\2\u0998\u0996\3\2"+
		"\2\2\u0999\u099c\3\2\2\2\u099a\u0998\3\2\2\2\u099a\u099b\3\2\2\2\u099b"+
		"\u099d\3\2\2\2\u099c\u099a\3\2\2\2\u099d\u099e\7\5\2\2\u099e\u09a0\3\2"+
		"\2\2\u099f\u0992\3\2\2\2\u099f\u0994\3\2\2\2\u09a0\u09bc\3\2\2\2\u09a1"+
		"\u09a3\7\u0098\2\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4"+
		"\3\2\2\2\u09a4\u09a5\7\u0085\2\2\u09a5\u09a8\5\u00ccg\2\u09a6\u09a7\7"+
		"Q\2\2\u09a7\u09a9\7\u011b\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2"+
		"\u09a9\u09bc\3\2\2\2\u09aa\u09ac\7|\2\2\u09ab\u09ad\7\u0098\2\2\u09ac"+
		"\u09ab\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09bc\7\u0099"+
		"\2\2\u09af\u09b1\7|\2\2\u09b0\u09b2\7\u0098\2\2\u09b1\u09b0\3\2\2\2\u09b1"+
		"\u09b2\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09bc\t\30\2\2\u09b4\u09b6\7"+
		"|\2\2\u09b5\u09b7\7\u0098\2\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2"+
		"\u09b7\u09b8\3\2\2\2\u09b8\u09b9\7K\2\2\u09b9\u09ba\7f\2\2\u09ba\u09bc"+
		"\5\u00ccg\2\u09bb\u096a\3\2\2\2\u09bb\u0972\3\2\2\2\u09bb\u0981\3\2\2"+
		"\2\u09bb\u0989\3\2\2\2\u09bb\u098e\3\2\2\2\u09bb\u09a2\3\2\2\2\u09bb\u09aa"+
		"\3\2\2\2\u09bb\u09af\3\2\2\2\u09bb\u09b4\3\2\2\2\u09bc\u00cb\3\2\2\2\u09bd"+
		"\u09be\bg\1\2\u09be\u09c2\5\u00ceh\2\u09bf\u09c0\t\31\2\2\u09c0\u09c2"+
		"\5\u00ccg\t\u09c1\u09bd\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c2\u09d8\3\2\2"+
		"\2\u09c3\u09c4\f\b\2\2\u09c4\u09c5\t\32\2\2\u09c5\u09d7\5\u00ccg\t\u09c6"+
		"\u09c7\f\7\2\2\u09c7\u09c8\t\33\2\2\u09c8\u09d7\5\u00ccg\b\u09c9\u09ca"+
		"\f\6\2\2\u09ca\u09cb\7\u0117\2\2\u09cb\u09d7\5\u00ccg\7\u09cc\u09cd\f"+
		"\5\2\2\u09cd\u09ce\7\u011a\2\2\u09ce\u09d7\5\u00ccg\6\u09cf\u09d0\f\4"+
		"\2\2\u09d0\u09d1\7\u0118\2\2\u09d1\u09d7\5\u00ccg\5\u09d2\u09d3\f\3\2"+
		"\2\u09d3\u09d4\5\u00d2j\2\u09d4\u09d5\5\u00ccg\4\u09d5\u09d7\3\2\2\2\u09d6"+
		"\u09c3\3\2\2\2\u09d6\u09c6\3\2\2\2\u09d6\u09c9\3\2\2\2\u09d6\u09cc\3\2"+
		"\2\2\u09d6\u09cf\3\2\2\2\u09d6\u09d2\3\2\2\2\u09d7\u09da\3\2\2\2\u09d8"+
		"\u09d6\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u00cd\3\2\2\2\u09da\u09d8\3\2"+
		"\2\2\u09db\u09dc\bh\1\2\u09dc\u0a98\t\34\2\2\u09dd\u09df\7#\2\2\u09de"+
		"\u09e0\5\u00f6|\2\u09df\u09de\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09df"+
		"\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e5\3\2\2\2\u09e3\u09e4\7O\2\2\u09e4"+
		"\u09e6\5\u00c6d\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7"+
		"\3\2\2\2\u09e7\u09e8\7P\2\2\u09e8\u0a98\3\2\2\2\u09e9\u09ea\7#\2\2\u09ea"+
		"\u09ec\5\u00c6d\2\u09eb\u09ed\5\u00f6|\2\u09ec\u09eb\3\2\2\2\u09ed\u09ee"+
		"\3\2\2\2\u09ee\u09ec\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f2\3\2\2\2\u09f0"+
		"\u09f1\7O\2\2\u09f1\u09f3\5\u00c6d\2\u09f2\u09f0\3\2\2\2\u09f2\u09f3\3"+
		"\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5\7P\2\2\u09f5\u0a98\3\2\2\2\u09f6"+
		"\u09f7\7$\2\2\u09f7\u09f8\7\4\2\2\u09f8\u09f9\5\u00c6d\2\u09f9\u09fa\7"+
		"\30\2\2\u09fa\u09fb\5\u00e8u\2\u09fb\u09fc\7\5\2\2\u09fc\u0a98\3\2\2\2"+
		"\u09fd\u09fe\7\u00df\2\2\u09fe\u0a07\7\4\2\2\u09ff\u0a04\5\u00ba^\2\u0a00"+
		"\u0a01\7\6\2\2\u0a01\u0a03\5\u00ba^\2\u0a02\u0a00\3\2\2\2\u0a03\u0a06"+
		"\3\2\2\2\u0a04\u0a02\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a08\3\2\2\2\u0a06"+
		"\u0a04\3\2\2\2\u0a07\u09ff\3\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a09\3\2"+
		"\2\2\u0a09\u0a98\7\5\2\2\u0a0a\u0a0b\7`\2\2\u0a0b\u0a0c\7\4\2\2\u0a0c"+
		"\u0a0f\5\u00c6d\2\u0a0d\u0a0e\7p\2\2\u0a0e\u0a10\7\u009a\2\2\u0a0f\u0a0d"+
		"\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a12\7\5\2\2\u0a12"+
		"\u0a98\3\2\2\2\u0a13\u0a14\7\u0080\2\2\u0a14\u0a15\7\4\2\2\u0a15\u0a18"+
		"\5\u00c6d\2\u0a16\u0a17\7p\2\2\u0a17\u0a19\7\u009a\2\2\u0a18\u0a16\3\2"+
		"\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\7\5\2\2\u0a1b"+
		"\u0a98\3\2\2\2\u0a1c\u0a1d\7\u00af\2\2\u0a1d\u0a1e\7\4\2\2\u0a1e\u0a1f"+
		"\5\u00ccg\2\u0a1f\u0a20\7r\2\2\u0a20\u0a21\5\u00ccg\2\u0a21\u0a22\7\5"+
		"\2\2\u0a22\u0a98\3\2\2\2\u0a23\u0a98\5\u00d0i\2\u0a24\u0a98\7\u0113\2"+
		"\2\u0a25\u0a26\5\u0106\u0084\2\u0a26\u0a27\7\7\2\2\u0a27\u0a28\7\u0113"+
		"\2\2\u0a28\u0a98\3\2\2\2\u0a29\u0a2a\7\4\2\2\u0a2a\u0a2d\5\u00ba^\2\u0a2b"+
		"\u0a2c\7\6\2\2\u0a2c\u0a2e\5\u00ba^\2\u0a2d\u0a2b\3\2\2\2\u0a2e\u0a2f"+
		"\3\2\2\2\u0a2f\u0a2d\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31"+
		"\u0a32\7\5\2\2\u0a32\u0a98\3\2\2\2\u0a33\u0a34\7\4\2\2\u0a34\u0a35\5$"+
		"\23\2\u0a35\u0a36\7\5\2\2\u0a36\u0a98\3\2\2\2\u0a37\u0a38\5\u0104\u0083"+
		"\2\u0a38\u0a44\7\4\2\2\u0a39\u0a3b\5\u008eH\2\u0a3a\u0a39\3\2\2\2\u0a3a"+
		"\u0a3b\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a41\5\u00c6d\2\u0a3d\u0a3e"+
		"\7\6\2\2\u0a3e\u0a40\5\u00c6d\2\u0a3f\u0a3d\3\2\2\2\u0a40\u0a43\3\2\2"+
		"\2\u0a41\u0a3f\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a45\3\2\2\2\u0a43\u0a41"+
		"\3\2\2\2\u0a44\u0a3a\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46"+
		"\u0a4d\7\5\2\2\u0a47\u0a48\7^\2\2\u0a48\u0a49\7\4\2\2\u0a49\u0a4a\7\u0105"+
		"\2\2\u0a4a\u0a4b\5\u00c8e\2\u0a4b\u0a4c\7\5\2\2\u0a4c\u0a4e\3\2\2\2\u0a4d"+
		"\u0a47\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a51\3\2\2\2\u0a4f\u0a50\t\35"+
		"\2\2\u0a50\u0a52\7\u009a\2\2\u0a51\u0a4f\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52"+
		"\u0a55\3\2\2\2\u0a53\u0a54\7\u00a5\2\2\u0a54\u0a56\5\u00fc\177\2\u0a55"+
		"\u0a53\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a98\3\2\2\2\u0a57\u0a58\5\u010c"+
		"\u0087\2\u0a58\u0a59\7\n\2\2\u0a59\u0a5a\5\u00c6d\2\u0a5a\u0a98\3\2\2"+
		"\2\u0a5b\u0a5c\7\4\2\2\u0a5c\u0a5f\5\u010c\u0087\2\u0a5d\u0a5e\7\6\2\2"+
		"\u0a5e\u0a60\5\u010c\u0087\2\u0a5f\u0a5d\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61"+
		"\u0a5f\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a64\7\5"+
		"\2\2\u0a64\u0a65\7\n\2\2\u0a65\u0a66\5\u00c6d\2\u0a66\u0a98\3\2\2\2\u0a67"+
		"\u0a98\5\u010c\u0087\2\u0a68\u0a69\7\4\2\2\u0a69\u0a6a\5\u00c6d\2\u0a6a"+
		"\u0a6b\7\5\2\2\u0a6b\u0a98\3\2\2\2\u0a6c\u0a6d\7Z\2\2\u0a6d\u0a6e\7\4"+
		"\2\2\u0a6e\u0a6f\5\u010c\u0087\2\u0a6f\u0a70\7f\2\2\u0a70\u0a71\5\u00cc"+
		"g\2\u0a71\u0a72\7\5\2\2\u0a72\u0a98\3\2\2\2\u0a73\u0a74\t\36\2\2\u0a74"+
		"\u0a75\7\4\2\2\u0a75\u0a76\5\u00ccg\2\u0a76\u0a77\t\37\2\2\u0a77\u0a7a"+
		"\5\u00ccg\2\u0a78\u0a79\t \2\2\u0a79\u0a7b\5\u00ccg\2\u0a7a\u0a78\3\2"+
		"\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a7d\7\5\2\2\u0a7d"+
		"\u0a98\3\2\2\2\u0a7e\u0a7f\7\u00f1\2\2\u0a7f\u0a81\7\4\2\2\u0a80\u0a82"+
		"\t!\2\2\u0a81\u0a80\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82\u0a84\3\2\2\2\u0a83"+
		"\u0a85\5\u00ccg\2\u0a84\u0a83\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u0a86"+
		"\3\2\2\2\u0a86\u0a87\7f\2\2\u0a87\u0a88\5\u00ccg\2\u0a88\u0a89\7\5\2\2"+
		"\u0a89\u0a98\3\2\2\2\u0a8a\u0a8b\7\u00a7\2\2\u0a8b\u0a8c\7\4\2\2\u0a8c"+
		"\u0a8d\5\u00ccg\2\u0a8d\u0a8e\7\u00ae\2\2\u0a8e\u0a8f\5\u00ccg\2\u0a8f"+
		"\u0a90\7f\2\2\u0a90\u0a93\5\u00ccg\2\u0a91\u0a92\7b\2\2\u0a92\u0a94\5"+
		"\u00ccg\2\u0a93\u0a91\3\2\2\2\u0a93\u0a94\3\2\2\2\u0a94\u0a95\3\2\2\2"+
		"\u0a95\u0a96\7\5\2\2\u0a96\u0a98\3\2\2\2\u0a97\u09db\3\2\2\2\u0a97\u09dd"+
		"\3\2\2\2\u0a97\u09e9\3\2\2\2\u0a97\u09f6\3\2\2\2\u0a97\u09fd\3\2\2\2\u0a97"+
		"\u0a0a\3\2\2\2\u0a97\u0a13\3\2\2\2\u0a97\u0a1c\3\2\2\2\u0a97\u0a23\3\2"+
		"\2\2\u0a97\u0a24\3\2\2\2\u0a97\u0a25\3\2\2\2\u0a97\u0a29\3\2\2\2\u0a97"+
		"\u0a33\3\2\2\2\u0a97\u0a37\3\2\2\2\u0a97\u0a57\3\2\2\2\u0a97\u0a5b\3\2"+
		"\2\2\u0a97\u0a67\3\2\2\2\u0a97\u0a68\3\2\2\2\u0a97\u0a6c\3\2\2\2\u0a97"+
		"\u0a73\3\2\2\2\u0a97\u0a7e\3\2\2\2\u0a97\u0a8a\3\2\2\2\u0a98\u0aa3\3\2"+
		"\2\2\u0a99\u0a9a\f\n\2\2\u0a9a\u0a9b\7\13\2\2\u0a9b\u0a9c\5\u00ccg\2\u0a9c"+
		"\u0a9d\7\f\2\2\u0a9d\u0aa2\3\2\2\2\u0a9e\u0a9f\f\b\2\2\u0a9f\u0aa0\7\7"+
		"\2\2\u0aa0\u0aa2\5\u010c\u0087\2\u0aa1\u0a99\3\2\2\2\u0aa1\u0a9e\3\2\2"+
		"\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u00cf"+
		"\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6\u0ab3\7\u0099\2\2\u0aa7\u0ab3\5\u00da"+
		"n\2\u0aa8\u0aa9\5\u010c\u0087\2\u0aa9\u0aaa\7\u011b\2\2\u0aaa\u0ab3\3"+
		"\2\2\2\u0aab\u0ab3\5\u0112\u008a\2\u0aac\u0ab3\5\u00d8m\2\u0aad\u0aaf"+
		"\7\u011b\2\2\u0aae\u0aad\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0aae\3\2\2"+
		"\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ab3\3\2\2\2\u0ab2\u0aa6\3\2\2\2\u0ab2\u0aa7"+
		"\3\2\2\2\u0ab2\u0aa8\3\2\2\2\u0ab2\u0aab\3\2\2\2\u0ab2\u0aac\3\2\2\2\u0ab2"+
		"\u0aae\3\2\2\2\u0ab3\u00d1\3\2\2\2\u0ab4\u0ab5\t\"\2\2\u0ab5\u00d3\3\2"+
		"\2\2\u0ab6\u0ab7\t#\2\2\u0ab7\u00d5\3\2\2\2\u0ab8\u0ab9\t$\2\2\u0ab9\u00d7"+
		"\3\2\2\2\u0aba\u0abb\t%\2\2\u0abb\u00d9\3\2\2\2\u0abc\u0abf\7z\2\2\u0abd"+
		"\u0ac0\5\u00dco\2\u0abe\u0ac0\5\u00e0q\2\u0abf\u0abd\3\2\2\2\u0abf\u0abe"+
		"\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u00db\3\2\2\2\u0ac1\u0ac3\5\u00dep"+
		"\2\u0ac2\u0ac4\5\u00e2r\2\u0ac3\u0ac2\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4"+
		"\u00dd\3\2\2\2\u0ac5\u0ac6\5\u00e4s\2\u0ac6\u0ac7\5\u010c\u0087\2\u0ac7"+
		"\u0ac9\3\2\2\2\u0ac8\u0ac5\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0ac8\3\2"+
		"\2\2\u0aca\u0acb\3\2\2\2\u0acb\u00df\3\2\2\2\u0acc\u0acf\5\u00e2r\2\u0acd"+
		"\u0ad0\5\u00dep\2\u0ace\u0ad0\5\u00e2r\2\u0acf\u0acd\3\2\2\2\u0acf\u0ace"+
		"\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u00e1\3\2\2\2\u0ad1\u0ad2\5\u00e4s"+
		"\2\u0ad2\u0ad3\5\u010c\u0087\2\u0ad3\u0ad4\7\u00eb\2\2\u0ad4\u0ad5\5\u010c"+
		"\u0087\2\u0ad5\u00e3\3\2\2\2\u0ad6\u0ad8\t&\2\2\u0ad7\u0ad6\3\2\2\2\u0ad7"+
		"\u0ad8\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0adc\t\26\2\2\u0ada\u0adc\7"+
		"\u011b\2\2\u0adb\u0ad7\3\2\2\2\u0adb\u0ada\3\2\2\2\u0adc\u00e5\3\2\2\2"+
		"\u0add\u0ae1\7`\2\2\u0ade\u0adf\7\17\2\2\u0adf\u0ae1\5\u0108\u0085\2\u0ae0"+
		"\u0add\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae1\u00e7\3\2\2\2\u0ae2\u0ae3\7\27"+
		"\2\2\u0ae3\u0ae4\7\u010d\2\2\u0ae4\u0ae5\5\u00e8u\2\u0ae5\u0ae6\7\u010f"+
		"\2\2\u0ae6\u0b05\3\2\2\2\u0ae7\u0ae8\7\u0090\2\2\u0ae8\u0ae9\7\u010d\2"+
		"\2\u0ae9\u0aea\5\u00e8u\2\u0aea\u0aeb\7\6\2\2\u0aeb\u0aec\5\u00e8u\2\u0aec"+
		"\u0aed\7\u010f\2\2\u0aed\u0b05\3\2\2\2\u0aee\u0af5\7\u00df\2\2\u0aef\u0af1"+
		"\7\u010d\2\2\u0af0\u0af2\5\u00f2z\2\u0af1\u0af0\3\2\2\2\u0af1\u0af2\3"+
		"\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af6\7\u010f\2\2\u0af4\u0af6\7\u010b"+
		"\2\2\u0af5\u0aef\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6\u0b05\3\2\2\2\u0af7"+
		"\u0b02\5\u010c\u0087\2\u0af8\u0af9\7\4\2\2\u0af9\u0afe\7\u011f\2\2\u0afa"+
		"\u0afb\7\6\2\2\u0afb\u0afd\7\u011f\2\2\u0afc\u0afa\3\2\2\2\u0afd\u0b00"+
		"\3\2\2\2\u0afe\u0afc\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff\u0b01\3\2\2\2\u0b00"+
		"\u0afe\3\2\2\2\u0b01\u0b03\7\5\2\2\u0b02\u0af8\3\2\2\2\u0b02\u0b03\3\2"+
		"\2\2\u0b03\u0b05\3\2\2\2\u0b04\u0ae2\3\2\2\2\u0b04\u0ae7\3\2\2\2\u0b04"+
		"\u0aee\3\2\2\2\u0b04\u0af7\3\2\2\2\u0b05\u00e9\3\2\2\2\u0b06\u0b0b\5\u00ec"+
		"w\2\u0b07\u0b08\7\6\2\2\u0b08\u0b0a\5\u00ecw\2\u0b09\u0b07\3\2\2\2\u0b0a"+
		"\u0b0d\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u00eb\3\2"+
		"\2\2\u0b0d\u0b0b\3\2\2\2\u0b0e\u0b0f\5\u00b4[\2\u0b0f\u0b12\5\u00e8u\2"+
		"\u0b10\u0b11\7\u0098\2\2\u0b11\u0b13\7\u0099\2\2\u0b12\u0b10\3\2\2\2\u0b12"+
		"\u0b13\3\2\2\2\u0b13\u0b15\3\2\2\2\u0b14\u0b16\5\"\22\2\u0b15\u0b14\3"+
		"\2\2\2\u0b15\u0b16\3\2\2\2\u0b16\u0b18\3\2\2\2\u0b17\u0b19\5\u00e6t\2"+
		"\u0b18\u0b17\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u00ed\3\2\2\2\u0b1a\u0b1f"+
		"\5\u00f0y\2\u0b1b\u0b1c\7\6\2\2\u0b1c\u0b1e\5\u00f0y\2\u0b1d\u0b1b\3\2"+
		"\2\2\u0b1e\u0b21\3\2\2\2\u0b1f\u0b1d\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20"+
		"\u00ef\3\2\2\2\u0b21\u0b1f\3\2\2\2\u0b22\u0b23\5\u0108\u0085\2\u0b23\u0b26"+
		"\5\u00e8u\2\u0b24\u0b25\7\u0098\2\2\u0b25\u0b27\7\u0099\2\2\u0b26\u0b24"+
		"\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b29\3\2\2\2\u0b28\u0b2a\5\"\22\2"+
		"\u0b29\u0b28\3\2\2\2\u0b29\u0b2a\3\2\2\2\u0b2a\u00f1\3\2\2\2\u0b2b\u0b30"+
		"\5\u00f4{\2\u0b2c\u0b2d\7\6\2\2\u0b2d\u0b2f\5\u00f4{\2\u0b2e\u0b2c\3\2"+
		"\2\2\u0b2f\u0b32\3\2\2\2\u0b30\u0b2e\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31"+
		"\u00f3\3\2\2\2\u0b32\u0b30\3\2\2\2\u0b33\u0b34\5\u010c\u0087\2\u0b34\u0b35"+
		"\7\r\2\2\u0b35\u0b38\5\u00e8u\2\u0b36\u0b37\7\u0098\2\2\u0b37\u0b39\7"+
		"\u0099\2\2\u0b38\u0b36\3\2\2\2\u0b38\u0b39\3\2\2\2\u0b39\u0b3b\3\2\2\2"+
		"\u0b3a\u0b3c\5\"\22\2\u0b3b\u0b3a\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u00f5"+
		"\3\2\2\2\u0b3d\u0b3e\7\u0104\2\2\u0b3e\u0b3f\5\u00c6d\2\u0b3f\u0b40\7"+
		"\u00e9\2\2\u0b40\u0b41\5\u00c6d\2\u0b41\u00f7\3\2\2\2\u0b42\u0b43\7\u0106"+
		"\2\2\u0b43\u0b48\5\u00fa~\2\u0b44\u0b45\7\6\2\2\u0b45\u0b47\5\u00fa~\2"+
		"\u0b46\u0b44\3\2\2\2\u0b47\u0b4a\3\2\2\2\u0b48\u0b46\3\2\2\2\u0b48\u0b49"+
		"\3\2\2\2\u0b49\u00f9\3\2\2\2\u0b4a\u0b48\3\2\2\2\u0b4b\u0b4c\5\u0108\u0085"+
		"\2\u0b4c\u0b4d\7\30\2\2\u0b4d\u0b4e\5\u00fc\177\2\u0b4e\u00fb\3\2\2\2"+
		"\u0b4f\u0b7e\5\u0108\u0085\2\u0b50\u0b51\7\4\2\2\u0b51\u0b52\5\u0108\u0085"+
		"\2\u0b52\u0b53\7\5\2\2\u0b53\u0b7e\3\2\2\2\u0b54\u0b77\7\4\2\2\u0b55\u0b56"+
		"\7(\2\2\u0b56\u0b57\7 \2\2\u0b57\u0b5c\5\u00c6d\2\u0b58\u0b59\7\6\2\2"+
		"\u0b59\u0b5b\5\u00c6d\2\u0b5a\u0b58\3\2\2\2\u0b5b\u0b5e\3\2\2\2\u0b5c"+
		"\u0b5a\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u0b78\3\2\2\2\u0b5e\u0b5c\3\2"+
		"\2\2\u0b5f\u0b60\t\'\2\2\u0b60\u0b61\7 \2\2\u0b61\u0b66\5\u00c6d\2\u0b62"+
		"\u0b63\7\6\2\2\u0b63\u0b65\5\u00c6d\2\u0b64\u0b62\3\2\2\2\u0b65\u0b68"+
		"\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u0b6a\3\2\2\2\u0b68"+
		"\u0b66\3\2\2\2\u0b69\u0b5f\3\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u0b75\3\2"+
		"\2\2\u0b6b\u0b6c\t(\2\2\u0b6c\u0b6d\7 \2\2\u0b6d\u0b72\5Z.\2\u0b6e\u0b6f"+
		"\7\6\2\2\u0b6f\u0b71\5Z.\2\u0b70\u0b6e\3\2\2\2\u0b71\u0b74\3\2\2\2\u0b72"+
		"\u0b70\3\2\2\2\u0b72\u0b73\3\2\2\2\u0b73\u0b76\3\2\2\2\u0b74\u0b72\3\2"+
		"\2\2\u0b75\u0b6b\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b78\3\2\2\2\u0b77"+
		"\u0b55\3\2\2\2\u0b77\u0b69\3\2\2\2\u0b78\u0b7a\3\2\2\2\u0b79\u0b7b\5\u00fe"+
		"\u0080\2\u0b7a\u0b79\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c"+
		"\u0b7e\7\5\2\2\u0b7d\u0b4f\3\2\2\2\u0b7d\u0b50\3\2\2\2\u0b7d\u0b54\3\2"+
		"\2\2\u0b7e\u00fd\3\2\2\2\u0b7f\u0b80\7\u00b6\2\2\u0b80\u0b90\5\u0100\u0081"+
		"\2\u0b81\u0b82\7\u00cb\2\2\u0b82\u0b90\5\u0100\u0081\2\u0b83\u0b84\7\u00b6"+
		"\2\2\u0b84\u0b85\7\34\2\2\u0b85\u0b86\5\u0100\u0081\2\u0b86\u0b87\7\23"+
		"\2\2\u0b87\u0b88\5\u0100\u0081\2\u0b88\u0b90\3\2\2\2\u0b89\u0b8a\7\u00cb"+
		"\2\2\u0b8a\u0b8b\7\34\2\2\u0b8b\u0b8c\5\u0100\u0081\2\u0b8c\u0b8d\7\23"+
		"\2\2\u0b8d\u0b8e\5\u0100\u0081\2\u0b8e\u0b90\3\2\2\2\u0b8f\u0b7f\3\2\2"+
		"\2\u0b8f\u0b81\3\2\2\2\u0b8f\u0b83\3\2\2\2\u0b8f\u0b89\3\2\2\2\u0b90\u00ff"+
		"\3\2\2\2\u0b91\u0b92\7\u00f6\2\2\u0b92\u0b99\t)\2\2\u0b93\u0b94\7:\2\2"+
		"\u0b94\u0b99\7\u00ca\2\2\u0b95\u0b96\5\u00c6d\2\u0b96\u0b97\t)\2\2\u0b97"+
		"\u0b99\3\2\2\2\u0b98\u0b91\3\2\2\2\u0b98\u0b93\3\2\2\2\u0b98\u0b95\3\2"+
		"\2\2\u0b99\u0101\3\2\2\2\u0b9a\u0b9f\5\u0106\u0084\2\u0b9b\u0b9c\7\6\2"+
		"\2\u0b9c\u0b9e\5\u0106\u0084\2\u0b9d\u0b9b\3\2\2\2\u0b9e\u0ba1\3\2\2\2"+
		"\u0b9f\u0b9d\3\2\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u0103\3\2\2\2\u0ba1\u0b9f"+
		"\3\2\2\2\u0ba2\u0ba7\5\u0106\u0084\2\u0ba3\u0ba7\7^\2\2\u0ba4\u0ba7\7"+
		"\u0084\2\2\u0ba5\u0ba7\7\u00c4\2\2\u0ba6\u0ba2\3\2\2\2\u0ba6\u0ba3\3\2"+
		"\2\2\u0ba6\u0ba4\3\2\2\2\u0ba6\u0ba5\3\2\2\2\u0ba7\u0105\3\2\2\2\u0ba8"+
		"\u0bad\5\u010c\u0087\2\u0ba9\u0baa\7\7\2\2\u0baa\u0bac\5\u010c\u0087\2"+
		"\u0bab\u0ba9\3\2\2\2\u0bac\u0baf\3\2\2\2\u0bad\u0bab\3\2\2\2\u0bad\u0bae"+
		"\3\2\2\2\u0bae\u0107\3\2\2\2\u0baf\u0bad\3\2\2\2\u0bb0\u0bb1\5\u010c\u0087"+
		"\2\u0bb1\u0bb2\5\u010a\u0086\2\u0bb2\u0109\3\2\2\2\u0bb3\u0bb4\7\u0112"+
		"\2\2\u0bb4\u0bb6\5\u010c\u0087\2\u0bb5\u0bb3\3\2\2\2\u0bb6\u0bb7\3\2\2"+
		"\2\u0bb7\u0bb5\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bbb\3\2\2\2\u0bb9\u0bbb"+
		"\3\2\2\2\u0bba\u0bb5\3\2\2\2\u0bba\u0bb9\3\2\2\2\u0bbb\u010b\3\2\2\2\u0bbc"+
		"\u0bc0\5\u010e\u0088\2\u0bbd\u0bbe\6\u0087\22\2\u0bbe\u0bc0\5\u0118\u008d"+
		"\2\u0bbf\u0bbc\3\2\2\2\u0bbf\u0bbd\3\2\2\2\u0bc0\u010d\3\2\2\2\u0bc1\u0bc8"+
		"\7\u0125\2\2\u0bc2\u0bc8\5\u0110\u0089\2\u0bc3\u0bc4\6\u0088\23\2\u0bc4"+
		"\u0bc8\5\u0116\u008c\2\u0bc5\u0bc6\6\u0088\24\2\u0bc6\u0bc8\5\u011a\u008e"+
		"\2\u0bc7\u0bc1\3\2\2\2\u0bc7\u0bc2\3\2\2\2\u0bc7\u0bc3\3\2\2\2\u0bc7\u0bc5"+
		"\3\2\2\2\u0bc8\u010f\3\2\2\2\u0bc9\u0bca\7\u0126\2\2\u0bca\u0111\3\2\2"+
		"\2\u0bcb\u0bcd\6\u008a\25\2\u0bcc\u0bce\7\u0112\2\2\u0bcd\u0bcc\3\2\2"+
		"\2\u0bcd\u0bce\3\2\2\2\u0bce\u0bcf\3\2\2\2\u0bcf\u0bf7\7\u0120\2\2\u0bd0"+
		"\u0bd2\6\u008a\26\2\u0bd1\u0bd3\7\u0112\2\2\u0bd2\u0bd1\3\2\2\2\u0bd2"+
		"\u0bd3\3\2\2\2\u0bd3\u0bd4\3\2\2\2\u0bd4\u0bf7\7\u0121\2\2\u0bd5\u0bd7"+
		"\6\u008a\27\2\u0bd6\u0bd8\7\u0112\2\2\u0bd7\u0bd6\3\2\2\2\u0bd7\u0bd8"+
		"\3\2\2\2\u0bd8\u0bd9\3\2\2\2\u0bd9\u0bf7\t*\2\2\u0bda\u0bdc\7\u0112\2"+
		"\2\u0bdb\u0bda\3\2\2\2\u0bdb\u0bdc\3\2\2\2\u0bdc\u0bdd\3\2\2\2\u0bdd\u0bf7"+
		"\7\u011f\2\2\u0bde\u0be0\7\u0112\2\2\u0bdf\u0bde\3\2\2\2\u0bdf\u0be0\3"+
		"\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0bf7\7\u011c\2\2\u0be2\u0be4\7\u0112"+
		"\2\2\u0be3\u0be2\3\2\2\2\u0be3\u0be4\3\2\2\2\u0be4\u0be5\3\2\2\2\u0be5"+
		"\u0bf7\7\u011d\2\2\u0be6\u0be8\7\u0112\2\2\u0be7\u0be6\3\2\2\2\u0be7\u0be8"+
		"\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bf7\7\u011e\2\2\u0bea\u0bec\7\u0112"+
		"\2\2\u0beb\u0bea\3\2\2\2\u0beb\u0bec\3\2\2\2\u0bec\u0bed\3\2\2\2\u0bed"+
		"\u0bf7\7\u0123\2\2\u0bee\u0bf0\7\u0112\2\2\u0bef\u0bee\3\2\2\2\u0bef\u0bf0"+
		"\3\2\2\2\u0bf0\u0bf1\3\2\2\2\u0bf1\u0bf7\7\u0122\2\2\u0bf2\u0bf4\7\u0112"+
		"\2\2\u0bf3\u0bf2\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5"+
		"\u0bf7\7\u0124\2\2\u0bf6\u0bcb\3\2\2\2\u0bf6\u0bd0\3\2\2\2\u0bf6\u0bd5"+
		"\3\2\2\2\u0bf6\u0bdb\3\2\2\2\u0bf6\u0bdf\3\2\2\2\u0bf6\u0be3\3\2\2\2\u0bf6"+
		"\u0be7\3\2\2\2\u0bf6\u0beb\3\2\2\2\u0bf6\u0bef\3\2\2\2\u0bf6\u0bf3\3\2"+
		"\2\2\u0bf7\u0113\3\2\2\2\u0bf8\u0bf9\7\u00f4\2\2\u0bf9\u0c00\5\u00e8u"+
		"\2\u0bfa\u0c00\5\"\22\2\u0bfb\u0c00\5\u00e6t\2\u0bfc\u0bfd\t+\2\2\u0bfd"+
		"\u0bfe\7\u0098\2\2\u0bfe\u0c00\7\u0099\2\2\u0bff\u0bf8\3\2\2\2\u0bff\u0bfa"+
		"\3\2\2\2\u0bff\u0bfb\3\2\2\2\u0bff\u0bfc\3\2\2\2\u0c00\u0115\3\2\2\2\u0c01"+
		"\u0c02\t,\2\2\u0c02\u0117\3\2\2\2\u0c03\u0c04\t-\2\2\u0c04\u0119\3\2\2"+
		"\2\u0c05\u0c06\t.\2\2\u0c06\u011b\3\2\2\2\u0194\u0120\u0139\u013d\u0142"+
		"\u014a\u0152\u0154\u0168\u016c\u0172\u0175\u0178\u017f\u0182\u0186\u0189"+
		"\u0190\u019b\u019d\u01a5\u01a8\u01ac\u01af\u01b5\u01c0\u01c6\u01cb\u020b"+
		"\u0214\u0218\u021e\u0222\u0227\u022d\u0239\u0241\u0247\u0254\u0259\u0269"+
		"\u0270\u0274\u027a\u0289\u028d\u0293\u0299\u029c\u029f\u02a5\u02a9\u02b1"+
		"\u02b3\u02bc\u02bf\u02c8\u02cd\u02d3\u02da\u02dd\u02e3\u02ee\u02f1\u02f5"+
		"\u02fa\u02ff\u0306\u0309\u030c\u0313\u0318\u0321\u0329\u032f\u0332\u0335"+
		"\u033b\u033f\u0343\u0347\u0349\u0351\u0359\u035f\u0365\u0368\u036c\u036f"+
		"\u0373\u038f\u0392\u0396\u039c\u039f\u03a2\u03a8\u03b0\u03b5\u03bb\u03c1"+
		"\u03c9\u03d1\u03d4\u03db\u03ec\u03fa\u03fd\u0403\u040c\u0415\u041c\u041f"+
		"\u042b\u042f\u0436\u04aa\u04b2\u04ba\u04c3\u04cd\u04d1\u04d4\u04da\u04e0"+
		"\u04ec\u04f8\u04fd\u0506\u050e\u0515\u0517\u051a\u051f\u0523\u0528\u052b"+
		"\u0530\u0535\u0538\u053d\u0541\u0546\u0548\u054c\u0555\u055d\u0566\u056d"+
		"\u0576\u057b\u057e\u0594\u0596\u059f\u05a6\u05a9\u05b0\u05b4\u05ba\u05c2"+
		"\u05cd\u05d8\u05df\u05e5\u05f2\u05f9\u0600\u060c\u0614\u061a\u061d\u0626"+
		"\u0629\u0632\u0635\u063e\u0641\u064a\u064d\u0650\u0655\u0657\u0663\u066a"+
		"\u0671\u0674\u0676\u0682\u0686\u068a\u0690\u0694\u069c\u06a0\u06a3\u06a6"+
		"\u06a9\u06ad\u06b1\u06b4\u06b8\u06bd\u06c1\u06c4\u06c7\u06ca\u06cc\u06d8"+
		"\u06db\u06df\u06e9\u06ed\u06ef\u06f2\u06f6\u06fc\u0700\u070b\u0715\u0721"+
		"\u0730\u0735\u073c\u074c\u0751\u075e\u0763\u076b\u0771\u0775\u077e\u0788"+
		"\u0797\u079c\u079e\u07a2\u07a8\u07b0\u07bb\u07be\u07c2\u07d0\u07dd\u07e2"+
		"\u07e6\u07e9\u07ee\u07f7\u07fa\u07ff\u0806\u0809\u0811\u0818\u081f\u0822"+
		"\u0827\u082a\u082f\u0833\u0836\u0839\u083f\u0844\u0849\u085b\u085d\u0860"+
		"\u086b\u0874\u087b\u0883\u088a\u088e\u0896\u089e\u08a4\u08ac\u08b8\u08bb"+
		"\u08c1\u08c5\u08c7\u08d0\u08dc\u08de\u08e5\u08ec\u08f2\u08f8\u08fa\u0901"+
		"\u0909\u090f\u0916\u091c\u0920\u0922\u0929\u0932\u0939\u0943\u0948\u094c"+
		"\u095a\u095c\u0964\u0966\u096a\u0972\u097b\u0981\u0989\u098e\u099a\u099f"+
		"\u09a2\u09a8\u09ac\u09b1\u09b6\u09bb\u09c1\u09d6\u09d8\u09e1\u09e5\u09ee"+
		"\u09f2\u0a04\u0a07\u0a0f\u0a18\u0a2f\u0a3a\u0a41\u0a44\u0a4d\u0a51\u0a55"+
		"\u0a61\u0a7a\u0a81\u0a84\u0a93\u0a97\u0aa1\u0aa3\u0ab0\u0ab2\u0abf\u0ac3"+
		"\u0aca\u0acf\u0ad7\u0adb\u0ae0\u0af1\u0af5\u0afe\u0b02\u0b04\u0b0b\u0b12"+
		"\u0b15\u0b18\u0b1f\u0b26\u0b29\u0b30\u0b38\u0b3b\u0b48\u0b5c\u0b66\u0b69"+
		"\u0b72\u0b75\u0b77\u0b7a\u0b7d\u0b8f\u0b98\u0b9f\u0ba6\u0bad\u0bb7\u0bba"+
		"\u0bbf\u0bc7\u0bcd\u0bd2\u0bd7\u0bdb\u0bdf\u0be3\u0be7\u0beb\u0bef\u0bf3"+
		"\u0bf6\u0bff";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}