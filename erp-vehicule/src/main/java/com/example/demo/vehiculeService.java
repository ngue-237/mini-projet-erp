package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class vehiculeService {

	
	@Autowired
	private vehiculeRepository vehiculeRepository;

	
	
				//Ajouter une voiture
	public vehicule addVehicule(vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}
		
	
	
			//Mettre a jour les informations d'un véhicule
	
	public vehicule updatevehicule(int id, vehicule newVehicule) {
		if(vehiculeRepository.findById(id).isPresent()) {
			vehicule existingvehicule = vehiculeRepository.findById(id).get();
			existingvehicule.setMatricule(newVehicule.getMatricule());
			existingvehicule.setMarque(newVehicule.getMarque());
			existingvehicule.setModel(newVehicule.getModel());
			existingvehicule.setCouleur(newVehicule.getCouleur());
			existingvehicule.setPrix(newVehicule.getPrix());
			existingvehicule.setNum_assurence(newVehicule.getNum_assurence());
			existingvehicule.setVisit_tech(newVehicule.getVisit_tech());
			existingvehicule.setCategorie(newVehicule.getCategorie());
			existingvehicule.setCarburant_motor(newVehicule.getCarburant_motor());
			
			return vehiculeRepository.save(existingvehicule);
		}
		else {
			return null;
		}
	}
	
		
	
	
						//Supprimer un véhicule
	
	public String deletevehicule(int id) {
		if(vehiculeRepository.findById(id).isPresent()) {
			vehiculeRepository.deleteById(id);
			return "Le vehicule avec l'id " + id + " a été supprime";
		}
		else {
			return "Le Vehicule avec l'id " + id + " n'a pas ete supprime";
		}
	}

	
	
	//afficher tous les vehicule
	
	public  List<vehicule> getVehicules() {
		return vehiculeRepository.findAll();
	}
	

	
	
	//Chercher un véhicule
	
	public vehicule findvVehicule(int id) {
		if(vehiculeRepository.findById(id).isPresent()) {
			vehicule existingvVehicule = vehiculeRepository.findById(id).get();
			return existingvVehicule;
		}
		else {
			return null;
		}
		
		
	}


			
	
	
}



