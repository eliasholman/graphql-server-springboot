package com.example.graphqldemo.schema.directives;

import graphql.annotations.directives.AnnotationsDirectiveWiring;
import graphql.annotations.directives.AnnotationsWiringEnvironment;
import graphql.annotations.processor.util.CodeRegistryUtil;
import graphql.schema.GraphQLFieldDefinition;

public class RedactDirectiveWiring implements AnnotationsDirectiveWiring {

    @Override
    public GraphQLFieldDefinition onField(AnnotationsWiringEnvironment environment) {
        GraphQLFieldDefinition field = (GraphQLFieldDefinition) environment.getElement();
        CodeRegistryUtil.wrapDataFetcher(field, environment, (((dataFetchingEnvironment, value) -> {
            if (value instanceof String) {
                return ((String) value).replaceAll(".", "*");
            }
            return value;
        })));
        return field;
    }

}
