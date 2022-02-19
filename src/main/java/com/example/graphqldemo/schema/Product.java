package com.example.graphqldemo.schema;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLID;

public class Product {

    private String id;
    private String name;
    private String description;

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @GraphQLID
    public String id() {
        return id;
    }

    @GraphQLField
    public String name() {
        return name;
    }

    @GraphQLField
    public String description() {
        return description;
    }
}
