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
            e.printStackTrace();
            System.out.println("Error occured creating pets: " + e);
        }
    }

    private void saveCreatedPets() {
        Pet pet1 = new Pet("Penny", "Chihuahua", 2, "John Doe");
        Pet pet2 = new Pet("Jesse", "Labrador", 3, "Jane Smith");
        Pet pet3 = new Pet("Davey", "Mastiff", 3, "Mike Adams");

        try {
            if (!petRepository.existsById(1L)) {
                petRepository.save(pet1);
                System.out.println("Pet 1 saved to database.");
            }
            if (!petRepository.existsById(2L)) {
                petRepository.save(pet2);
                System.out.println("Pet 2 saved to database.");
            }
            if (!petRepository.existsById(3L)) {
                petRepository.save(pet3);
                System.out.println("Pet 3 saved to database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred saving pets: " + e);
        }
    }
    
}
