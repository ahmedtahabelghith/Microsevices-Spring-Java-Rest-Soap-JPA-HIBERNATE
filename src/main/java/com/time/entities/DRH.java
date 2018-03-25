package com.time.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DRH")
public class DRH extends User implements Serializable{

	public DRH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DRH(String login, String password, String name, String lastName) {
		super(login, password, name, lastName);
		// TODO Auto-generated constructor stub
	}
	

}
