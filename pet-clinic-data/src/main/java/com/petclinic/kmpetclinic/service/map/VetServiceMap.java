package com.petclinic.kmpetclinic.service.map;

import java.util.Set;

import com.petclinic.kmpetclinic.model.Owner;
import com.petclinic.kmpetclinic.model.Pet;
import com.petclinic.kmpetclinic.model.Vet;
import com.petclinic.kmpetclinic.service.CrudService;


public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
		
	@Override
	public Vet save(Vet vet) {		
		return super.save(vet.getId(), vet);
	}
	
	@Override
	public void delete (Vet vet) {
		super.delete(vet);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	

}
