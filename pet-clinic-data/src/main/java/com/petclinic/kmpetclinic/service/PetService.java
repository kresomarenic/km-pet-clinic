package com.petclinic.kmpetclinic.service;

import java.util.Set;

import com.petclinic.kmpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
