package com.example.entity;

import io.smallrye.graphql.api.Directive;
import io.smallrye.graphql.api.DirectiveLocation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.NonNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Directive(on = DirectiveLocation.FIELD_DEFINITION)
@Name("MyDirective")
public @interface MyDirective {

    @NonNull
    MyEnum value();

}