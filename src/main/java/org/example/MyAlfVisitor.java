package org.example;

import com.alf.parser.AlfParser;
import com.alf.parser.AlfVisitor;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;

public class MyAlfVisitor extends AbstractParseTreeVisitor<ASTNode> implements AlfVisitor<ASTNode> {
    public StatementsNode defaultResult() {
        ArrayList<ASTNode> astNodeEmpty = new ArrayList<>();
        return new StatementsNode(astNodeEmpty);
    }
    public StatementsNode visitMultilineProg(AlfParser.MultilineProgContext ctx){
        ArrayList<ASTNode> statements = new ArrayList<>();
        for(AlfParser.StatementContext statement : ctx.statement()){
            statements.add(this.visit(statement));
        }
        if(statements.size() != 0){
            return new StatementsNode(statements);
        }
        else {
            throw new Error();
        }
    }

    public DeclarationNode visitDeclarationRule(AlfParser.DeclarationRuleContext ctx) {
        return (DeclarationNode) this.visit(ctx.declaration());
    }

    public ExpressionNode visitExpressionRule(AlfParser.ExpressionRuleContext ctx) {
        return (ExpressionNode) this.visit(ctx.expression());
    }

    public DeclarationNode visitVariableDeclaration(AlfParser.VariableDeclarationContext ctx) {
        return new DeclarationNode(
                ((TypeNode) this.visit(ctx.type())).typeName,
                ctx.VARIABLE().getText(),
                this.visit(ctx.expression())
        );
    }
    public ValueNode visitValueInt(AlfParser.ValueIntContext ctx) {
        return new ValueNode(
                Integer.parseInt(ctx.INT_NUMBER().getText())
        );
    }
    public ValueNode visitValueFloat(AlfParser.ValueFloatContext ctx) {
        return new ValueNode(
                Float.parseFloat(ctx.FLOAT_NUMBER().getText())
        );
    }
    public ValueNode visitValueString(AlfParser.ValueStringContext ctx) {
        return new ValueNode(
                Integer.parseInt(ctx.STRING_TEXT().getText())
        );
    }

    public ValueNode visitValuaVariable(AlfParser.ValuaVariableContext ctx) {
        return new ValueNode(
                ctx.VARIABLE().getText()
        );
    }

    public TypeNode visitTypeInt(AlfParser.TypeIntContext ctx) {
        return new TypeNode(
                ctx.INT().getText()
        );
    }
    public TypeNode visitTypeFloat(AlfParser.TypeFloatContext ctx) {
        return new TypeNode(
                ctx.FLOAT().getText()
        );
    }
    public TypeNode visitTypeString(AlfParser.TypeStringContext ctx) {
        return new TypeNode(
                ctx.STRING().getText()
        );
    }
    public ExpressionNode visitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op
            );
        }
        else {
            throw new Error();
        }
    }
    public ExpressionNode visitExpressionDivision(AlfParser.ExpressionDivisionContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op
            );
        }
        else {
            throw new Error();
        }
    }

    public VariableNode visitVariable(AlfParser.VariableContext ctx) {
        return new VariableNode(
                ctx.VARIABLE().getText()
        );
    }

    public ExpressionNode visitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op
            );
        }
        else {
            throw new Error();
        }
    }

    public ExpressionNode visitExpressionRem(AlfParser.ExpressionRemContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op
            );
        }
        else {
            throw new Error();
        }
    }
    public ExpressionNode visitExpressionAddition(AlfParser.ExpressionAdditionContext ctx) {
        ASTNode left =  this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op
            );
        }
        else {
            throw new Error();
        }
    }
    public ExpressionNode visitExpressionSubstraction(AlfParser.ExpressionSubtractionContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op
            );
        }
        else {
            throw new Error();
        }
    }
    public ExpressionNode visitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx){
        return (ExpressionNode) this.visit(ctx.expression());
    }
    public ValueNode visitNumber(AlfParser.NumberContext ctx){
        int value = Integer.parseInt(ctx.INT_NUMBER().getText());
        if(ctx.INT_NUMBER().getText() != null) {
            return new ValueNode(value);
        }
        else {
            throw new Error();
        }
    }

}
