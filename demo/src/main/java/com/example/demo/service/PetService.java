package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dao.PetRepository;
import com.example.demo.Entities.Pet;

@Service
public class PetService {
    
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void savePet(String name, String breed, int age, String owner) {
        Pet pet = new Pet(name, breed, age, owner);
        petRepository.save(pet);
        System.out.println("Pet saved.");
    }
    

}
