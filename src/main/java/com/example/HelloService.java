package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloService {

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}