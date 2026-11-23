package com.example;

import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/Hello", new HelloService());
        System.out.println("WSDL: http://localhost:8080/Hello?wsdl");
    }
}