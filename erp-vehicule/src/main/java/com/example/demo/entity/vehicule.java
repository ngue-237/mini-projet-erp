package com.example.demo.entity;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class vehicule implements Serializable{
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;

	private String matricule,marque,model,couleur,num_assurence,carburant_motor,categorie;
	private int prix;
	private Date visit_tech;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getNum_assurence() {
		return num_assurence;
	}
	public void setNum_assurence(String num_assurence) {
		this.num_assurence = num_assurence;
	}
	public Date getVisit_tech() {
		return visit_tech;
	}	
	public void setVisit_tech(Date visit_tech) {
		this.visit_tech = visit_tech;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getCarburant_motor() {
		return carburant_motor;
	}
	public void setCarburant_motor(String carburant_motor) {
		this.carburant_motor = carburant_motor;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public vehicule() {
		super();
	}
	public vehicule(String matricule) {
		super();
		this.matricule = matricule;
	}
	public vehicule(int id, String matricule , String marque, String model,String couleur,int prix,String num_assurence,Date visit_tech,String categorie,String carburant_motor) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.prix = prix;
		this.num_assurence = num_assurence;
		this.visit_tech = visit_tech;
		this.categorie = categorie;
		this.carburant_motor = carburant_motor;
	}
	
	
	
	
	
	

	
	
	
	
	
	
}
