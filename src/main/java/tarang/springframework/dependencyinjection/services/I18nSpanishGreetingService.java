package tarang.springframework.dependencyinjection.services;

public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
