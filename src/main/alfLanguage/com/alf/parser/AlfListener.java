// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlfParser}.
 */
public interface AlfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void enterMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void exitMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuaVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValuaVariable(AlfParser.ValuaVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuaVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValuaVariable(AlfParser.ValuaVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AlfParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AlfParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AlfParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AlfParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
}