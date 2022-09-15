package tarang.springframework.dependencyinjection.services;

public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World ----- PRIMARY Bean";
    }
}
