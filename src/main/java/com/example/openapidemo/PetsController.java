package com.example.openapidemo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class PetsController {

    private List<PetResource> petsList;

    @GetMapping(value = "/")
    public List<PetResource> listPets() {
        return petsList;
    }

    @PostMapping(value = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public PetResource createPet(@RequestBody PetResource pet) {
        if (petsList == null){
            petsList = new ArrayList<>();
        }
        petsList.add(pet);
        return pet;
    }

    @GetMapping(value = "/{petId}")
    public PetResource findPet(@PathVariable("petId") int petId) {
        PetResource pet = new PetResource();
        pet.setId(petId);
        pet.setName("test");
        pet.setTag("tag-pet");

        return pet;
    }
}
