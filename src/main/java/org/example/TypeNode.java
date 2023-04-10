package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TypeNode extends ASTNode{
    String id = "value";
    String typeName;
    TypeNode(String typeName) {
        super();
        this.typeName = typeName;
    }
}
