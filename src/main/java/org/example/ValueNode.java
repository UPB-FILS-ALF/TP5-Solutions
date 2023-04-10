package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ValueNode extends ASTNode{
    String id = "value";
    public Object value;
    ValueNode(Object value) {
        super();
        this.value = value;
    }

}

