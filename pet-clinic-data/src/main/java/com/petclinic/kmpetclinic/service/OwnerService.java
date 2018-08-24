package com.petclinic.kmpetclinic.service;

import java.util.Set;

import com.petclinic.kmpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save (Owner owner);
	
	Set<Owner> findAll();

}
