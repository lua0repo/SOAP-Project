import javax.xml.ws.Endpoint;

public class CalculatorServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/calculator", new CalculatorServiceImpl());
        System.out.println("Service is running at http://localhost:8080/calculator");
    }
}
