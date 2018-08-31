package com.petclinic.kmpetclinic.service.map;

import java.util.Set;

import com.petclinic.kmpetclinic.model.Owner;
import com.petclinic.kmpetclinic.service.CrudService;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
		
	@Override
	public Owner save(Owner owner) {		
		return super.save(owner.getId(), owner);
	}
	
	@Override
	public void delete (Owner owner) {
		super.delete(owner);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	

}
