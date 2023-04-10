package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VariableNode extends ASTNode{
    String id = "variable";
    String variableName;
    VariableNode(String variableName) {
        super();
        this.variableName = variableName;
    }
    String toJSON(ValueNode vn) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.toJson(vn);
    }
}
