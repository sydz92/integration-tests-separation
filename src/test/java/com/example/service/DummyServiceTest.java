package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DummyServiceTest {

    @Test
    void blankName_returnsStrangerGreeting() {
        DummyService service = new DummyService();

        String greeting = service.buildGreeting(" ");

        assertEquals("Hello, stranger", greeting);
    }
}