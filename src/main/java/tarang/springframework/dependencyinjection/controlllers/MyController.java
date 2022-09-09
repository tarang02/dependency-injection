package tarang.springframework.dependencyinjection.controlllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("inside sayHello");
        return("Hello");
    }
}
