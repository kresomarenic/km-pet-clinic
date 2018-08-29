package com.petclinic.kmpetclinic.service;

import com.petclinic.kmpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);



}
