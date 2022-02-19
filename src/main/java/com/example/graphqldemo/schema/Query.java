package com.example.graphqldemo.schema;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import org.springframework.stereotype.Component;
import springAnno.interfaces.QueryRoot;
    
@Component
public class Query implements QueryRoot {

    Product p = new Product("NE1", "Nautical Earrings", "These will be perfect for your ears at sea");
    Order o = new Order("ORDER12345", new Product[] {p}, new Customer("James", "Holden", "Capt"));

    @GraphQLField
    @GraphQLInvokeDetached
    public Product[] products() {return new Product[] {p};}

    @GraphQLField
    @GraphQLInvokeDetached
    public Order[] orders() {return new Order[] {o};}

}
