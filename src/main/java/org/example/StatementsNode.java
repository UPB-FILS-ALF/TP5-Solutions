package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class StatementsNode extends ASTNode{
    String id = "statements";
    ArrayList<ASTNode> statements;
    StatementsNode(ArrayList<ASTNode> statements) {
        super();
        this.statements = statements;
    }
}
