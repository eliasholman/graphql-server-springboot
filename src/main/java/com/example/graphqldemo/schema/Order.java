package com.example.graphqldemo.schema;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLID;

public class Order {

    private String id;
    private Product[] products;
    private Customer buyer;

    public Order(String id, Product[] products, Customer buyer) {
        this.id = id;
        this.products = products;
        this.buyer = buyer;
    }

    @GraphQLID
    public String id() {
        return id;
    }

    @GraphQLField
    public Product[] products() {
        return products;
    }

    @GraphQLField
    public Customer buyer() {
        return buyer;
    }

}
