package com.petclinic.kmpetclinic.service;

import java.util.Set;


import com.petclinic.kmpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
