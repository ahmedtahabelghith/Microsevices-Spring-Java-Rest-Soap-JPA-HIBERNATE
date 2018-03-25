package com.time.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Formateur implements Serializable {

  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFormateur;
	private String nom;
	private String prenom;
	private String CIN ;
	private String tel;
	private String profil;
	private String grade ;
	
	@ManyToMany(mappedBy="formateurs")
	private Collection<Formation> formations;

	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Collection<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Collection<Formation> formations) {
		this.formations = formations;
	}

	public Formateur(String nom, String prenom, String cIN, String tel, String profil, String grade,
			Collection<Formation> formations) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		CIN = cIN;
		this.tel = tel;
		this.profil = profil;
		this.grade = grade;
		this.formations = formations;
	}
	
	
	
	
}
