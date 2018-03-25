package com.time.entities;

 
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

 

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeFormation",discriminatorType=DiscriminatorType.STRING)
 
public   class Formation implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFormation;
	private String titre ;
	private String description;
	private int nbrParticipant;
	private String lieu;
	private String responsable;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToMany
	@JoinTable(name="Formationformateur")
	private Collection<Formateur>formateurs;

	@ManyToMany(mappedBy="formations")
	private Collection<Collaborateur> collaborateurs;
	
	
	
	
	public Formation(String titre, String description, int nbrParticipant, String lieu, String responsable,
			Date dateDebut, Date dateFin, Collection<Formateur> formateurs, Collection<Collaborateur> collaborateurs) {
		super();
		this.titre = titre;
		this.description = description;
		this.nbrParticipant = nbrParticipant;
		this.lieu = lieu;
		this.responsable = responsable;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.formateurs = formateurs;
		this.collaborateurs = collaborateurs;
	}

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbrParticipant() {
		return nbrParticipant;
	}

	public void setNbrParticipant(int nbrParticipant) {
		this.nbrParticipant = nbrParticipant;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Collection<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(Collection<Formateur> formateurs) {
		this.formateurs = formateurs;
	}
	
	
	

	
	
	
	
	
	
	
	
}
