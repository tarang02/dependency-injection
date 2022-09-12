package tarang.springframework.dependencyinjection.controlllers;

import org.springframework.stereotype.Controller;
import tarang.springframework.dependencyinjection.services.PetService;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
