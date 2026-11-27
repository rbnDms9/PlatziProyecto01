package com.platzi.proyecto01.greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    @Test
    void returnsDefaultGreeting() {
        GreetingService greetingService = new GreetingService();

        assertEquals("Hola, mundo!", greetingService.greet());
    }
}
