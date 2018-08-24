package com.petclinic.kmpetclinic.model;

public class PetType extends BaseEntity{
	
	private static final long serialVersionUID = -4369190318253493043L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
