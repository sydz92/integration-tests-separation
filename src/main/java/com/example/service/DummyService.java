package com.example.service;

public class DummyService {

    public String buildGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, stranger";
        }
        return "Hello, " + name;
    }
}