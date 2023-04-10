package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeclarationNode extends ASTNode{
    String id = "declaration";
    String variableType;
    String variable;
    //String op;
    ASTNode value;
    DeclarationNode(String variableType, String variable, ASTNode value) {
        super();
        this.variableType = variableType;
        this.variable = variable;
        this.value = value;
    }
}
