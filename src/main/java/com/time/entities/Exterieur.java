package com.time.entities;
 
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("exterieur")
public class Exterieur extends Formation  {

	private String emplacement;
	private double prix;
	
	public Exterieur(String titre, String description, int nbrParticipant, String lieu, String responsable,
			Date dateDebut, Date dateFin, Collection<Formateur> formateurs, Collection<Collaborateur> collaborateurs,
			String emplacement, double prix) {
		super(titre, description, nbrParticipant, lieu, responsable, dateDebut, dateFin, formateurs, collaborateurs);
		this.emplacement = emplacement;
		this.prix = prix;
	}
	public Exterieur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exterieur(String titre, String description, int nbrParticipant, String lieu, String responsable,
			Date dateDebut, Date dateFin, Collection<Formateur> formateurs, Collection<Collaborateur> collaborateurs) {
		super(titre, description, nbrParticipant, lieu, responsable, dateDebut, dateFin, formateurs, collaborateurs);
		// TODO Auto-generated constructor stub
	}
	 
	
	
	
	
}
