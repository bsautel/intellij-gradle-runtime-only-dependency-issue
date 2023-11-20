package org.example.spring;

import org.example.api.NameProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        NameProvider nameProvider = ServiceLoader.load(NameProvider.class).findFirst().orElseThrow();
        String name = nameProvider.getName();
        System.out.println("Hello " + name);
    }
}
