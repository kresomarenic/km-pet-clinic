package com.petclinic.kmpetclinic.service.map;

import java.util.Set;

import com.petclinic.kmpetclinic.model.Owner;
import com.petclinic.kmpetclinic.model.Pet;
import com.petclinic.kmpetclinic.service.CrudService;


public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
		
	@Override
	public Pet save(Pet pet) {		
		return super.save(pet.getId(), pet);
	}
	
	@Override
	public void delete (Pet pet) {
		super.delete(pet);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	

}
