package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExpressionNode extends ASTNode{
    String id = "expression";
    ASTNode left;
    ASTNode right;
    String op;

    public ExpressionNode(ASTNode left, ASTNode right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

}
