package com.example.entity;

import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.NonNull;

import java.util.Objects;

@Name("MyObject")
public class MyObject {

    @NonNull
    @MyDirective(MyEnum.ONE)
    String name;

    public MyObject(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }

}