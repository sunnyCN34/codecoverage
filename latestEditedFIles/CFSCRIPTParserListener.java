package codecoverage;
// Generated from CFSCRIPTParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFSCRIPTParser}.
 */
public interface CFSCRIPTParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptBlock(CFSCRIPTParser.ScriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptBlock(CFSCRIPTParser.ScriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#cfscriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterCfscriptBlock(CFSCRIPTParser.CfscriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#cfscriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitCfscriptBlock(CFSCRIPTParser.CfscriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(CFSCRIPTParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(CFSCRIPTParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(CFSCRIPTParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(CFSCRIPTParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#anonymousFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDeclaration(CFSCRIPTParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#anonymousFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDeclaration(CFSCRIPTParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#accessType}.
	 * @param ctx the parse tree
	 */
	void enterAccessType(CFSCRIPTParser.AccessTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#accessType}.
	 * @param ctx the parse tree
	 */
	void exitAccessType(CFSCRIPTParser.AccessTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(CFSCRIPTParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(CFSCRIPTParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CFSCRIPTParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CFSCRIPTParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CFSCRIPTParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CFSCRIPTParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#stringLiteralPart}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralPart(CFSCRIPTParser.StringLiteralPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#stringLiteralPart}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralPart(CFSCRIPTParser.StringLiteralPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CFSCRIPTParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CFSCRIPTParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CFSCRIPTParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CFSCRIPTParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(CFSCRIPTParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(CFSCRIPTParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#componentAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComponentAttribute(CFSCRIPTParser.ComponentAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#componentAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComponentAttribute(CFSCRIPTParser.ComponentAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#functionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAttribute(CFSCRIPTParser.FunctionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#functionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAttribute(CFSCRIPTParser.FunctionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#parameterAttribute}.
	 * @param ctx the parse tree
	 */
	void enterParameterAttribute(CFSCRIPTParser.ParameterAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#parameterAttribute}.
	 * @param ctx the parse tree
	 */
	void exitParameterAttribute(CFSCRIPTParser.ParameterAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CFSCRIPTParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CFSCRIPTParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#componentGuts}.
	 * @param ctx the parse tree
	 */
	void enterComponentGuts(CFSCRIPTParser.ComponentGutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#componentGuts}.
	 * @param ctx the parse tree
	 */
	void exitComponentGuts(CFSCRIPTParser.ComponentGutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CFSCRIPTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CFSCRIPTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(CFSCRIPTParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(CFSCRIPTParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(CFSCRIPTParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(CFSCRIPTParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CFSCRIPTParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CFSCRIPTParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CFSCRIPTParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CFSCRIPTParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CFSCRIPTParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CFSCRIPTParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CFSCRIPTParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CFSCRIPTParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(CFSCRIPTParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(CFSCRIPTParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CFSCRIPTParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CFSCRIPTParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#startExpression}.
	 * @param ctx the parse tree
	 */
	void enterStartExpression(CFSCRIPTParser.StartExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#startExpression}.
	 * @param ctx the parse tree
	 */
	void exitStartExpression(CFSCRIPTParser.StartExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#baseOrTernaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBaseOrTernaryExpression(CFSCRIPTParser.BaseOrTernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#baseOrTernaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBaseOrTernaryExpression(CFSCRIPTParser.BaseOrTernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#forInKey}.
	 * @param ctx the parse tree
	 */
	void enterForInKey(CFSCRIPTParser.ForInKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#forInKey}.
	 * @param ctx the parse tree
	 */
	void exitForInKey(CFSCRIPTParser.ForInKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(CFSCRIPTParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(CFSCRIPTParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#catchCondition}.
	 * @param ctx the parse tree
	 */
	void enterCatchCondition(CFSCRIPTParser.CatchConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#catchCondition}.
	 * @param ctx the parse tree
	 */
	void exitCatchCondition(CFSCRIPTParser.CatchConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#finallyStatement}.
	 * @param ctx the parse tree
	 */
	void enterFinallyStatement(CFSCRIPTParser.FinallyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#finallyStatement}.
	 * @param ctx the parse tree
	 */
	void exitFinallyStatement(CFSCRIPTParser.FinallyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CFSCRIPTParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CFSCRIPTParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(CFSCRIPTParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(CFSCRIPTParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(CFSCRIPTParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(CFSCRIPTParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#tagOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterTagOperatorStatement(CFSCRIPTParser.TagOperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#tagOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitTagOperatorStatement(CFSCRIPTParser.TagOperatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#rethrowStatment}.
	 * @param ctx the parse tree
	 */
	void enterRethrowStatment(CFSCRIPTParser.RethrowStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#rethrowStatment}.
	 * @param ctx the parse tree
	 */
	void exitRethrowStatment(CFSCRIPTParser.RethrowStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(CFSCRIPTParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(CFSCRIPTParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(CFSCRIPTParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(CFSCRIPTParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(CFSCRIPTParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(CFSCRIPTParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#cfmlfunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCfmlfunctionStatement(CFSCRIPTParser.CfmlfunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#cfmlfunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCfmlfunctionStatement(CFSCRIPTParser.CfmlfunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#tagFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTagFunctionStatement(CFSCRIPTParser.TagFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#tagFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTagFunctionStatement(CFSCRIPTParser.TagFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#cfmlFunction}.
	 * @param ctx the parse tree
	 */
	void enterCfmlFunction(CFSCRIPTParser.CfmlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#cfmlFunction}.
	 * @param ctx the parse tree
	 */
	void exitCfmlFunction(CFSCRIPTParser.CfmlFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLockStatement(CFSCRIPTParser.LockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLockStatement(CFSCRIPTParser.LockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#threadStatement}.
	 * @param ctx the parse tree
	 */
	void enterThreadStatement(CFSCRIPTParser.ThreadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#threadStatement}.
	 * @param ctx the parse tree
	 */
	void exitThreadStatement(CFSCRIPTParser.ThreadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#abortStatement}.
	 * @param ctx the parse tree
	 */
	void enterAbortStatement(CFSCRIPTParser.AbortStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#abortStatement}.
	 * @param ctx the parse tree
	 */
	void exitAbortStatement(CFSCRIPTParser.AbortStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(CFSCRIPTParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(CFSCRIPTParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(CFSCRIPTParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(CFSCRIPTParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#paramStatement}.
	 * @param ctx the parse tree
	 */
	void enterParamStatement(CFSCRIPTParser.ParamStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#paramStatement}.
	 * @param ctx the parse tree
	 */
	void exitParamStatement(CFSCRIPTParser.ParamStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#propertyStatement}.
	 * @param ctx the parse tree
	 */
	void enterPropertyStatement(CFSCRIPTParser.PropertyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#propertyStatement}.
	 * @param ctx the parse tree
	 */
	void exitPropertyStatement(CFSCRIPTParser.PropertyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#paramStatementAttributes}.
	 * @param ctx the parse tree
	 */
	void enterParamStatementAttributes(CFSCRIPTParser.ParamStatementAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#paramStatementAttributes}.
	 * @param ctx the parse tree
	 */
	void exitParamStatementAttributes(CFSCRIPTParser.ParamStatementAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CFSCRIPTParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CFSCRIPTParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CFSCRIPTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CFSCRIPTParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#localAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterLocalAssignmentExpression(CFSCRIPTParser.LocalAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#localAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitLocalAssignmentExpression(CFSCRIPTParser.LocalAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#otherIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterOtherIdentifiers(CFSCRIPTParser.OtherIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#otherIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitOtherIdentifiers(CFSCRIPTParser.OtherIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CFSCRIPTParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CFSCRIPTParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(CFSCRIPTParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(CFSCRIPTParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpression(CFSCRIPTParser.BaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpression(CFSCRIPTParser.BaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(CFSCRIPTParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(CFSCRIPTParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(CFSCRIPTParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(CFSCRIPTParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#compareExpressionOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpressionOperator(CFSCRIPTParser.CompareExpressionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#compareExpressionOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpressionOperator(CFSCRIPTParser.CompareExpressionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(CFSCRIPTParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(CFSCRIPTParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#notNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotNotExpression(CFSCRIPTParser.NotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#notNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotNotExpression(CFSCRIPTParser.NotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#equalityOperator1}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator1(CFSCRIPTParser.EqualityOperator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#equalityOperator1}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator1(CFSCRIPTParser.EqualityOperator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#concatenationExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationExpression(CFSCRIPTParser.ConcatenationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#concatenationExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationExpression(CFSCRIPTParser.ConcatenationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CFSCRIPTParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CFSCRIPTParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(CFSCRIPTParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(CFSCRIPTParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#intDivisionExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivisionExpression(CFSCRIPTParser.IntDivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#intDivisionExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivisionExpression(CFSCRIPTParser.IntDivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CFSCRIPTParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CFSCRIPTParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#powerOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerOfExpression(CFSCRIPTParser.PowerOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#powerOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerOfExpression(CFSCRIPTParser.PowerOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CFSCRIPTParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CFSCRIPTParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#innerExpression}.
	 * @param ctx the parse tree
	 */
	void enterInnerExpression(CFSCRIPTParser.InnerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#innerExpression}.
	 * @param ctx the parse tree
	 */
	void exitInnerExpression(CFSCRIPTParser.InnerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(CFSCRIPTParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(CFSCRIPTParser.MemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#identifierOrReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrReservedWord(CFSCRIPTParser.IdentifierOrReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#identifierOrReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrReservedWord(CFSCRIPTParser.IdentifierOrReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#arrayMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayMemberExpression(CFSCRIPTParser.ArrayMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#arrayMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayMemberExpression(CFSCRIPTParser.ArrayMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CFSCRIPTParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CFSCRIPTParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#parentheticalMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterParentheticalMemberExpression(CFSCRIPTParser.ParentheticalMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#parentheticalMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitParentheticalMemberExpression(CFSCRIPTParser.ParentheticalMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#javaCallMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterJavaCallMemberExpression(CFSCRIPTParser.JavaCallMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#javaCallMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitJavaCallMemberExpression(CFSCRIPTParser.JavaCallMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#memberExpressionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpressionSuffix(CFSCRIPTParser.MemberExpressionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#memberExpressionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpressionSuffix(CFSCRIPTParser.MemberExpressionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#propertyReferenceSuffix}.
	 * @param ctx the parse tree
	 */
	void enterPropertyReferenceSuffix(CFSCRIPTParser.PropertyReferenceSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#propertyReferenceSuffix}.
	 * @param ctx the parse tree
	 */
	void exitPropertyReferenceSuffix(CFSCRIPTParser.PropertyReferenceSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#indexSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexSuffix(CFSCRIPTParser.IndexSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#indexSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexSuffix(CFSCRIPTParser.IndexSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#primaryExpressionIRW}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionIRW(CFSCRIPTParser.PrimaryExpressionIRWContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#primaryExpressionIRW}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionIRW(CFSCRIPTParser.PrimaryExpressionIRWContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(CFSCRIPTParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(CFSCRIPTParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#floatingPointExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointExpression(CFSCRIPTParser.FloatingPointExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#floatingPointExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointExpression(CFSCRIPTParser.FloatingPointExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(CFSCRIPTParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(CFSCRIPTParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CFSCRIPTParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CFSCRIPTParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CFSCRIPTParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CFSCRIPTParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(CFSCRIPTParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(CFSCRIPTParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CFSCRIPTParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CFSCRIPTParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CFSCRIPTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CFSCRIPTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#cfscriptKeywords}.
	 * @param ctx the parse tree
	 */
	void enterCfscriptKeywords(CFSCRIPTParser.CfscriptKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#cfscriptKeywords}.
	 * @param ctx the parse tree
	 */
	void exitCfscriptKeywords(CFSCRIPTParser.CfscriptKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CFSCRIPTParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CFSCRIPTParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#parentheticalExpression}.
	 * @param ctx the parse tree
	 */
	void enterParentheticalExpression(CFSCRIPTParser.ParentheticalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#parentheticalExpression}.
	 * @param ctx the parse tree
	 */
	void exitParentheticalExpression(CFSCRIPTParser.ParentheticalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#implicitArray}.
	 * @param ctx the parse tree
	 */
	void enterImplicitArray(CFSCRIPTParser.ImplicitArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#implicitArray}.
	 * @param ctx the parse tree
	 */
	void exitImplicitArray(CFSCRIPTParser.ImplicitArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#implicitArrayElements}.
	 * @param ctx the parse tree
	 */
	void enterImplicitArrayElements(CFSCRIPTParser.ImplicitArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#implicitArrayElements}.
	 * @param ctx the parse tree
	 */
	void exitImplicitArrayElements(CFSCRIPTParser.ImplicitArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#implicitStruct}.
	 * @param ctx the parse tree
	 */
	void enterImplicitStruct(CFSCRIPTParser.ImplicitStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#implicitStruct}.
	 * @param ctx the parse tree
	 */
	void exitImplicitStruct(CFSCRIPTParser.ImplicitStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#implicitStructElements}.
	 * @param ctx the parse tree
	 */
	void enterImplicitStructElements(CFSCRIPTParser.ImplicitStructElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#implicitStructElements}.
	 * @param ctx the parse tree
	 */
	void exitImplicitStructElements(CFSCRIPTParser.ImplicitStructElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#implicitStructExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitStructExpression(CFSCRIPTParser.ImplicitStructExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#implicitStructExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitStructExpression(CFSCRIPTParser.ImplicitStructExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#implicitStructKeyExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitStructKeyExpression(CFSCRIPTParser.ImplicitStructKeyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#implicitStructKeyExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitStructKeyExpression(CFSCRIPTParser.ImplicitStructKeyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#newComponentExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewComponentExpression(CFSCRIPTParser.NewComponentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#newComponentExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewComponentExpression(CFSCRIPTParser.NewComponentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFSCRIPTParser#componentPath}.
	 * @param ctx the parse tree
	 */
	void enterComponentPath(CFSCRIPTParser.ComponentPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFSCRIPTParser#componentPath}.
	 * @param ctx the parse tree
	 */
	void exitComponentPath(CFSCRIPTParser.ComponentPathContext ctx);
}