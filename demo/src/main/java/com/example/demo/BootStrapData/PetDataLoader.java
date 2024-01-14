package com.example.demo.BootStrapData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.Pet;
import com.example.demo.dao.PetRepository;

@Component
public class PetDataLoader implements CommandLineRunner {

    private final PetRepository petRepository;

    public PetDataLoader(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            saveCreatedPets();
            System.out.println("Pets saved to database.");
        } catch (Exception e) {
            System.out.println("Error occured creating pets: " + e);
        }
    }

    private void saveCreatedPets() {
        Pet pet1 = new Pet("Penny", "Chihuahua", 2, "John Doe");
        Pet pet2 = new Pet("Jesse", "Labrador", 3, "Jane Smith");
        Pet pet3 = new Pet("Davey", "Mastiff", 3, "Mike Adams");

        petRepository.save(pet1);
        petRepository.save(pet2);
        petRepository.save(pet3);
    }
    
}
