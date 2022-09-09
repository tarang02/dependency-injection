package tarang.springframework.dependencyinjection.controlllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tarang.springframework.dependencyinjection.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}