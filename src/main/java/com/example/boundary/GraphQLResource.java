package com.example.boundary;

import com.example.entity.MyObject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class GraphQLResource {

    @Query
    public MyObject getMyObject() {
        return new MyObject("Test");
    }

}