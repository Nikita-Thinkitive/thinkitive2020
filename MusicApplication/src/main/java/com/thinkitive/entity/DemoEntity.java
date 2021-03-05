package com.thinkitive.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemoEntity {
	
	@Id
	private int id;
	
	private String name;
	
	private String lastName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
