package com.time.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User implements Serializable{

		
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String login, String password, String name, String lastName) {
		super(login, password, name, lastName);
		// TODO Auto-generated constructor stub
	}

	 

	
}
