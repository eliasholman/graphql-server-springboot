package com.example.graphqldemo.schema;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;
import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;

public class Customer {

    private String firstName;
    private String lastName;
    private String title;

    public Customer(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    @GraphQLField
    @GraphQLName("firstName")
    public String getFirstName() {
        return firstName;
    }

    @GraphQLField
    @GraphQLName("lastName")
    @GraphQLDirectives(@Directive(name="redact"))
    public String getLastName() {
        return lastName;
    }

    @GraphQLField
    @GraphQLName("title")
    public String getTitle() {
        return title;
    }

}
