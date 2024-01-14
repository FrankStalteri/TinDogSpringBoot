package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.PetRepository;
import com.example.demo.Entities.Pet;

@RestController
public class WebController {

    private final PetRepository petRepository;

    public WebController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    @GetMapping("/")
    public String getIndex() {
        return "index.html";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }

    @GetMapping
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
}