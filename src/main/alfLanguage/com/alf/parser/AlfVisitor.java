// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuaVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuaVariable(AlfParser.ValuaVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AlfParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AlfParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
}