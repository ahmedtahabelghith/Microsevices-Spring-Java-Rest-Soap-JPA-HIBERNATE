package com.time.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Collaborateur")
public class Collaborateur extends User  implements Serializable{

	@ManyToMany
	@JoinTable(name="Note")
	private Collection<Formation> formations;
	
	public Collaborateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collaborateur(String login, String password, String name, String lastName) {
		super(login, password, name, lastName);
		// TODO Auto-generated constructor stub
	}

	
	
}
