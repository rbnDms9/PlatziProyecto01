package com.platzi.proyecto01.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hola, mundo!";
    }
}
