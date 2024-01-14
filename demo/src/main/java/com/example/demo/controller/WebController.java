package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.PetRepository;
import com.example.demo.Entities.Pet;

@RestController
@RequestMapping("/api/pets")
public class WebController {

    private final PetRepository petRepository;

    public WebController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("login")
    public String getLogin() {
        return "login";
    }

    // Send pet data to home.html
    @GetMapping("/home")
    public String getHome(Model model) {

        List<Pet> pets = petRepository.findAll();
        model.addAttribute("pets", pets);
        return "home";
    }

    // Send pets json to the url in the @RestController annotation
    @GetMapping
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
}