package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DummyServiceIT {

    @Test
    void validName_returnsPersonalizedGreeting() {
        DummyService service = new DummyService();

        String greeting = service.buildGreeting("integration");

        assertEquals("Hello, integration", greeting);
    }
}