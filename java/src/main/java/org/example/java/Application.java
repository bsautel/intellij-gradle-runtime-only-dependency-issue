package org.example.java;

import org.example.api.NameProvider;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        NameProvider nameProvider = ServiceLoader.load(NameProvider.class).findFirst().orElseThrow();
        String name = nameProvider.getName();
        System.out.println("Hello " + name);
    }
}
