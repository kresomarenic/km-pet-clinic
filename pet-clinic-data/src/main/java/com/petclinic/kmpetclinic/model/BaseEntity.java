package com.petclinic.kmpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
		
	private static final long serialVersionUID = 8228013859472847903L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
