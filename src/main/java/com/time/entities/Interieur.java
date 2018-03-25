package com.time.entities;
 
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("interieur")
public class Interieur extends Formation  {
	
	private Boolean publique;

	 
}
