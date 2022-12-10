package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.assurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class assuranceService {

	
	@Autowired
	private com.example.demo.repository.assuranceRepository assuranceRepository;

	
	
				//Ajouter une voiture
	public assurance addassurance(assurance assurance) {
		return assuranceRepository.save(assurance);
	}
		
	
	
			//Mettre a jour les informations d'un assurance
	
	public assurance updateassurance(int id, assurance newassurance) {
		if(assuranceRepository.findById(id).isPresent()) {
			assurance existingassurance = assuranceRepository.findById(id).get();
			existingassurance.setMatricule_v(newassurance.getMatricule_v());
			existingassurance.setAssureur(newassurance.getAssureur());
			existingassurance.setDate_debut(newassurance.getDate_debut());
			existingassurance.setDate_fin(newassurance.getDate_fin());
			existingassurance.setNum_assurence(newassurance.getNum_assurence());
			
			
			return assuranceRepository.save(existingassurance);
		}
		else {
			return null;
		}
	}
	
		
	
	
						//Supprimer un assurance
	
	public String deleteassurance(int id) {
		if(assuranceRepository.findById(id).isPresent()) {
			assuranceRepository.deleteById(id);
			return "Le assurance avec l'id " + id + " a été supprime";
		}
		else {
			return "Le assurance avec l'id " + id + " n'a pas ete supprime";
		}
	}

	
	
	//afficher tous les assurance
	
	public  List<assurance> getassurances() {
		return assuranceRepository.findAll();
	}
	

	
	
	//Chercher un assurance
	
	public assurance findvassurance(int id) {
		if(assuranceRepository.findById(id).isPresent()) {
			assurance existingvassurance = assuranceRepository.findById(id).get();
			return existingvassurance;
		}
		else {
			return null;
		}
		
		
	}


			
	
	
}



