package com.example;

import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws Exception {
        URL wsdl = new URL("http://localhost:8080/Hello?wsdl");
        QName qname = new QName("http://example.com/", "HelloServiceService");
        Service service = Service.create(wsdl, qname);
        HelloPort port = service.getPort(HelloPort.class);
        System.out.println(port.sayHello("Ahmed"));
    }
}