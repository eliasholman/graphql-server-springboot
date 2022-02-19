package com.example.graphqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"springAnno", "com.example.graphqldemo"})
public class GraphQLApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }
}
