package com.example.graphqldemo.schema.directives;

import graphql.annotations.annotationTypes.GraphQLDescription;
import graphql.annotations.annotationTypes.GraphQLName;
import graphql.annotations.annotationTypes.directives.definition.DirectiveLocations;
import graphql.annotations.annotationTypes.directives.definition.GraphQLDirectiveDefinition;
import graphql.introspection.Introspection;

@GraphQLName("redact")
@GraphQLDescription("Redacts any value to asterisks")
@GraphQLDirectiveDefinition(wiring= RedactDirectiveWiring.class)
@DirectiveLocations({Introspection.DirectiveLocation.FIELD_DEFINITION })
public class RedactDirective {
}
