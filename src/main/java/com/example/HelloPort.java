package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "HelloService", targetNamespace = "http://example.com/")
public interface HelloPort {
    @WebMethod
    String sayHello(String name);
}