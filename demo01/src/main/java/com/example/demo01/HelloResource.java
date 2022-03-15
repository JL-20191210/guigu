package com.example.demo01;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        System.out.printf("hello");
        return "Hello, World!";
    }

}