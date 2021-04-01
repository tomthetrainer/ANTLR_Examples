// Generated from /Users/thomas.hanlon/intellij/AntlerExamples/src/main/java/modifiedSparkSQL/ModifiedSqlBase.g4 by ANTLR 4.9.1
package modifiedSparkSQL;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModifiedSqlBaseParser}.
 */
public interface ModifiedSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(ModifiedSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(ModifiedSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(ModifiedSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(ModifiedSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(ModifiedSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(ModifiedSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultipartIdentifier(ModifiedSqlBaseParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultipartIdentifier(ModifiedSqlBaseParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(ModifiedSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(ModifiedSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(ModifiedSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(ModifiedSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(ModifiedSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(ModifiedSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(ModifiedSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(ModifiedSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code helpTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHelpTable(ModifiedSqlBaseParser.HelpTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code helpTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHelpTable(ModifiedSqlBaseParser.HelpTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(ModifiedSqlBaseParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(ModifiedSqlBaseParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(ModifiedSqlBaseParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(ModifiedSqlBaseParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(ModifiedSqlBaseParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(ModifiedSqlBaseParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(ModifiedSqlBaseParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(ModifiedSqlBaseParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(ModifiedSqlBaseParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(ModifiedSqlBaseParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(ModifiedSqlBaseParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(ModifiedSqlBaseParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(ModifiedSqlBaseParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(ModifiedSqlBaseParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(ModifiedSqlBaseParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(ModifiedSqlBaseParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(ModifiedSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(ModifiedSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTable(ModifiedSqlBaseParser.ReplaceTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTable(ModifiedSqlBaseParser.ReplaceTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(ModifiedSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(ModifiedSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTables(ModifiedSqlBaseParser.AnalyzeTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTables(ModifiedSqlBaseParser.AnalyzeTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(ModifiedSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(ModifiedSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableColumn(ModifiedSqlBaseParser.RenameTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableColumn(ModifiedSqlBaseParser.RenameTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableColumns(ModifiedSqlBaseParser.DropTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableColumns(ModifiedSqlBaseParser.DropTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(ModifiedSqlBaseParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(ModifiedSqlBaseParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(ModifiedSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(ModifiedSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(ModifiedSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(ModifiedSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAlterColumn(ModifiedSqlBaseParser.AlterTableAlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAlterColumn(ModifiedSqlBaseParser.AlterTableAlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveChangeColumn(ModifiedSqlBaseParser.HiveChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveChangeColumn(ModifiedSqlBaseParser.HiveChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveReplaceColumns(ModifiedSqlBaseParser.HiveReplaceColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveReplaceColumns(ModifiedSqlBaseParser.HiveReplaceColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(ModifiedSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(ModifiedSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(ModifiedSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(ModifiedSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(ModifiedSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(ModifiedSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(ModifiedSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(ModifiedSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(ModifiedSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(ModifiedSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(ModifiedSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(ModifiedSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(ModifiedSqlBaseParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(ModifiedSqlBaseParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(ModifiedSqlBaseParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(ModifiedSqlBaseParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(ModifiedSqlBaseParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(ModifiedSqlBaseParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(ModifiedSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(ModifiedSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(ModifiedSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(ModifiedSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(ModifiedSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(ModifiedSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(ModifiedSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(ModifiedSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(ModifiedSqlBaseParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(ModifiedSqlBaseParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(ModifiedSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(ModifiedSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTableExtended(ModifiedSqlBaseParser.ShowTableExtendedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTableExtended(ModifiedSqlBaseParser.ShowTableExtendedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(ModifiedSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(ModifiedSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(ModifiedSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(ModifiedSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowViews(ModifiedSqlBaseParser.ShowViewsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowViews(ModifiedSqlBaseParser.ShowViewsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(ModifiedSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(ModifiedSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(ModifiedSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(ModifiedSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(ModifiedSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(ModifiedSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(ModifiedSqlBaseParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(ModifiedSqlBaseParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(ModifiedSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(ModifiedSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(ModifiedSqlBaseParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(ModifiedSqlBaseParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(ModifiedSqlBaseParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(ModifiedSqlBaseParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(ModifiedSqlBaseParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(ModifiedSqlBaseParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(ModifiedSqlBaseParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(ModifiedSqlBaseParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(ModifiedSqlBaseParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(ModifiedSqlBaseParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(ModifiedSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(ModifiedSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshFunction(ModifiedSqlBaseParser.RefreshFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshFunction(ModifiedSqlBaseParser.RefreshFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(ModifiedSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(ModifiedSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(ModifiedSqlBaseParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(ModifiedSqlBaseParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(ModifiedSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(ModifiedSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(ModifiedSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(ModifiedSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(ModifiedSqlBaseParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(ModifiedSqlBaseParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(ModifiedSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(ModifiedSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(ModifiedSqlBaseParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(ModifiedSqlBaseParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(ModifiedSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(ModifiedSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(ModifiedSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(ModifiedSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTimeZone(ModifiedSqlBaseParser.SetTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTimeZone(ModifiedSqlBaseParser.SetTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetQuotedConfiguration(ModifiedSqlBaseParser.SetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetQuotedConfiguration(ModifiedSqlBaseParser.SetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(ModifiedSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(ModifiedSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetQuotedConfiguration(ModifiedSqlBaseParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetQuotedConfiguration(ModifiedSqlBaseParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(ModifiedSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ModifiedSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(ModifiedSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#configKey}.
	 * @param ctx the parse tree
	 */
	void enterConfigKey(ModifiedSqlBaseParser.ConfigKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#configKey}.
	 * @param ctx the parse tree
	 */
	void exitConfigKey(ModifiedSqlBaseParser.ConfigKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#configValue}.
	 * @param ctx the parse tree
	 */
	void enterConfigValue(ModifiedSqlBaseParser.ConfigValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#configValue}.
	 * @param ctx the parse tree
	 */
	void exitConfigValue(ModifiedSqlBaseParser.ConfigValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(ModifiedSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(ModifiedSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(ModifiedSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(ModifiedSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(ModifiedSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(ModifiedSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(ModifiedSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(ModifiedSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(ModifiedSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(ModifiedSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(ModifiedSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(ModifiedSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(ModifiedSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(ModifiedSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ModifiedSqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ModifiedSqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(ModifiedSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(ModifiedSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(ModifiedSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(ModifiedSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(ModifiedSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(ModifiedSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(ModifiedSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link ModifiedSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(ModifiedSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(ModifiedSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(ModifiedSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(ModifiedSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(ModifiedSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(ModifiedSqlBaseParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(ModifiedSqlBaseParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(ModifiedSqlBaseParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(ModifiedSqlBaseParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(ModifiedSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(ModifiedSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(ModifiedSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(ModifiedSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(ModifiedSqlBaseParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(ModifiedSqlBaseParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(ModifiedSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(ModifiedSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(ModifiedSqlBaseParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(ModifiedSqlBaseParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(ModifiedSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(ModifiedSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(ModifiedSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(ModifiedSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(ModifiedSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(ModifiedSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(ModifiedSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(ModifiedSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(ModifiedSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(ModifiedSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(ModifiedSqlBaseParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(ModifiedSqlBaseParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(ModifiedSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(ModifiedSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(ModifiedSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(ModifiedSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ModifiedSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(ModifiedSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ModifiedSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(ModifiedSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ModifiedSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(ModifiedSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ModifiedSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(ModifiedSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(ModifiedSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(ModifiedSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ModifiedSqlBaseParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ModifiedSqlBaseParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(ModifiedSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(ModifiedSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(ModifiedSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(ModifiedSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(ModifiedSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(ModifiedSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(ModifiedSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(ModifiedSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(ModifiedSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(ModifiedSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(ModifiedSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(ModifiedSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(ModifiedSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(ModifiedSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(ModifiedSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(ModifiedSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(ModifiedSqlBaseParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(ModifiedSqlBaseParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(ModifiedSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(ModifiedSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(ModifiedSqlBaseParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(ModifiedSqlBaseParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(ModifiedSqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(ModifiedSqlBaseParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(ModifiedSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(ModifiedSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ModifiedSqlBaseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ModifiedSqlBaseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(ModifiedSqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(ModifiedSqlBaseParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(ModifiedSqlBaseParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(ModifiedSqlBaseParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(ModifiedSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(ModifiedSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link ModifiedSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(ModifiedSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link ModifiedSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(ModifiedSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link ModifiedSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(ModifiedSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link ModifiedSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(ModifiedSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(ModifiedSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(ModifiedSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(ModifiedSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(ModifiedSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(ModifiedSqlBaseParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(ModifiedSqlBaseParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(ModifiedSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(ModifiedSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(ModifiedSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(ModifiedSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(ModifiedSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(ModifiedSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(ModifiedSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(ModifiedSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(ModifiedSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(ModifiedSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ModifiedSqlBaseParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ModifiedSqlBaseParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ModifiedSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ModifiedSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(ModifiedSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(ModifiedSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(ModifiedSqlBaseParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(ModifiedSqlBaseParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(ModifiedSqlBaseParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(ModifiedSqlBaseParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ModifiedSqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ModifiedSqlBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(ModifiedSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(ModifiedSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(ModifiedSqlBaseParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(ModifiedSqlBaseParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void enterGroupingAnalytics(ModifiedSqlBaseParser.GroupingAnalyticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void exitGroupingAnalytics(ModifiedSqlBaseParser.GroupingAnalyticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(ModifiedSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(ModifiedSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(ModifiedSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(ModifiedSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(ModifiedSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(ModifiedSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(ModifiedSqlBaseParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(ModifiedSqlBaseParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(ModifiedSqlBaseParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(ModifiedSqlBaseParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(ModifiedSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(ModifiedSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ModifiedSqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ModifiedSqlBaseParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(ModifiedSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(ModifiedSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(ModifiedSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(ModifiedSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(ModifiedSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(ModifiedSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(ModifiedSqlBaseParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(ModifiedSqlBaseParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(ModifiedSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(ModifiedSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(ModifiedSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(ModifiedSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(ModifiedSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(ModifiedSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(ModifiedSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link ModifiedSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(ModifiedSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(ModifiedSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(ModifiedSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(ModifiedSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(ModifiedSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(ModifiedSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(ModifiedSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(ModifiedSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(ModifiedSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(ModifiedSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(ModifiedSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(ModifiedSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(ModifiedSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ModifiedSqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ModifiedSqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(ModifiedSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(ModifiedSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(ModifiedSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(ModifiedSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(ModifiedSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(ModifiedSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(ModifiedSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ModifiedSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(ModifiedSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(ModifiedSqlBaseParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(ModifiedSqlBaseParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(ModifiedSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(ModifiedSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(ModifiedSqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(ModifiedSqlBaseParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ModifiedSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(ModifiedSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ModifiedSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(ModifiedSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ModifiedSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(ModifiedSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ModifiedSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(ModifiedSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(ModifiedSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(ModifiedSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(ModifiedSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(ModifiedSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(ModifiedSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(ModifiedSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(ModifiedSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(ModifiedSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(ModifiedSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(ModifiedSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(ModifiedSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(ModifiedSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFieldList(ModifiedSqlBaseParser.PartitionFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFieldList(ModifiedSqlBaseParser.PartitionFieldListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link ModifiedSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionTransform(ModifiedSqlBaseParser.PartitionTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link ModifiedSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionTransform(ModifiedSqlBaseParser.PartitionTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionColumn(ModifiedSqlBaseParser.PartitionColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link ModifiedSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionColumn(ModifiedSqlBaseParser.PartitionColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link ModifiedSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(ModifiedSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link ModifiedSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(ModifiedSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link ModifiedSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(ModifiedSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link ModifiedSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(ModifiedSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(ModifiedSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(ModifiedSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ModifiedSqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ModifiedSqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(ModifiedSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(ModifiedSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(ModifiedSqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(ModifiedSqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(ModifiedSqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(ModifiedSqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(ModifiedSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ModifiedSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(ModifiedSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ModifiedSqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ModifiedSqlBaseParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(ModifiedSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(ModifiedSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ModifiedSqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ModifiedSqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(ModifiedSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(ModifiedSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(ModifiedSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ModifiedSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(ModifiedSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(ModifiedSqlBaseParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(ModifiedSqlBaseParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(ModifiedSqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(ModifiedSqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(ModifiedSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(ModifiedSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(ModifiedSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(ModifiedSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(ModifiedSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(ModifiedSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(ModifiedSqlBaseParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(ModifiedSqlBaseParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(ModifiedSqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(ModifiedSqlBaseParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(ModifiedSqlBaseParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(ModifiedSqlBaseParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(ModifiedSqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(ModifiedSqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(ModifiedSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(ModifiedSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(ModifiedSqlBaseParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(ModifiedSqlBaseParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDatetime(ModifiedSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDatetime(ModifiedSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(ModifiedSqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(ModifiedSqlBaseParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(ModifiedSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(ModifiedSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(ModifiedSqlBaseParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(ModifiedSqlBaseParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ModifiedSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ModifiedSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(ModifiedSqlBaseParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(ModifiedSqlBaseParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(ModifiedSqlBaseParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(ModifiedSqlBaseParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ModifiedSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ModifiedSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(ModifiedSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(ModifiedSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(ModifiedSqlBaseParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(ModifiedSqlBaseParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(ModifiedSqlBaseParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link ModifiedSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(ModifiedSqlBaseParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ModifiedSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ModifiedSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(ModifiedSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(ModifiedSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(ModifiedSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(ModifiedSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ModifiedSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ModifiedSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ModifiedSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ModifiedSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ModifiedSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ModifiedSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ModifiedSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ModifiedSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(ModifiedSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(ModifiedSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(ModifiedSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(ModifiedSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(ModifiedSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(ModifiedSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ModifiedSqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ModifiedSqlBaseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(ModifiedSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(ModifiedSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(ModifiedSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(ModifiedSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(ModifiedSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(ModifiedSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(ModifiedSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(ModifiedSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(ModifiedSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(ModifiedSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(ModifiedSqlBaseParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(ModifiedSqlBaseParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(ModifiedSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(ModifiedSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(ModifiedSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ModifiedSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(ModifiedSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(ModifiedSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(ModifiedSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(ModifiedSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(ModifiedSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(ModifiedSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(ModifiedSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(ModifiedSqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(ModifiedSqlBaseParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(ModifiedSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(ModifiedSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(ModifiedSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(ModifiedSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(ModifiedSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(ModifiedSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(ModifiedSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(ModifiedSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(ModifiedSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(ModifiedSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ModifiedSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(ModifiedSqlBaseParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ModifiedSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(ModifiedSqlBaseParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ModifiedSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(ModifiedSqlBaseParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ModifiedSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(ModifiedSqlBaseParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(ModifiedSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(ModifiedSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(ModifiedSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(ModifiedSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(ModifiedSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(ModifiedSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(ModifiedSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(ModifiedSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ModifiedSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ModifiedSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(ModifiedSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(ModifiedSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link ModifiedSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(ModifiedSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link ModifiedSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(ModifiedSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link ModifiedSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(ModifiedSqlBaseParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link ModifiedSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(ModifiedSqlBaseParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ModifiedSqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ModifiedSqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ModifiedSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(ModifiedSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ModifiedSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(ModifiedSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ModifiedSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(ModifiedSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ModifiedSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(ModifiedSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(ModifiedSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(ModifiedSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(ModifiedSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(ModifiedSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ModifiedSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ModifiedSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(ModifiedSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(ModifiedSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ModifiedSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ModifiedSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(ModifiedSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(ModifiedSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(ModifiedSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(ModifiedSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(ModifiedSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(ModifiedSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(ModifiedSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(ModifiedSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(ModifiedSqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(ModifiedSqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(ModifiedSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ModifiedSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(ModifiedSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(ModifiedSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(ModifiedSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(ModifiedSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(ModifiedSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(ModifiedSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(ModifiedSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(ModifiedSqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(ModifiedSqlBaseParser.NonReservedContext ctx);
}