package com.fredgyoung.lambda;

public class HelloWorldJava {

    public static void main(String[] args) {
        HelloWorldInterface hwi = () -> "Hello, World";

        System.out.println(hwi.sayHelloWorld());
    }
}
