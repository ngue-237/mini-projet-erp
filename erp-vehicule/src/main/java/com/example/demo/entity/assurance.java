package com.example.demo.entity;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class assurance implements Serializable{
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private String matricule_v,assureur,num_assurence;
	private Date date_debut,date_fin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule_v() {
		return matricule_v;
	}
	public void setMatricule_v(String matricule_v) {
		this.matricule_v= matricule_v;
	}
	public String getAssureur() {
		return assureur;
	}
	public void setAssureur(String assureur) {
		this.assureur = assureur;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	public String getNum_assurence() {
		return num_assurence;
	}
	public void setNum_assurence(String num_assurence) {
		this.num_assurence = num_assurence;
	}
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public assurance() {
		super();
	}
	public assurance(String num_assurence) {
		super();
		this.num_assurence = num_assurence;
	}
	public assurance(int id, String matricule_v , String num_assurence, String assureur,Date date_debut,Date date_fin) {
		super();
		this.id = id;
		this.matricule_v = matricule_v;
		this.num_assurence = num_assurence;
		this.assureur= assureur;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
}
