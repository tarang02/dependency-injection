package tarang.springframework.dependencyinjection.controlllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tarang.springframework.dependencyinjection.services.ConstructorGreetingServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}