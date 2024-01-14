package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
