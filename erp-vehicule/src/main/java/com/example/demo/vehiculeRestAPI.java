package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/vehicules")
public class vehiculeRestAPI {
	
	private String title = "Hello; I'm the vehicule Microservice ";
	
	@Autowired
	private vehiculeService vehiculeService;
	
	//http://localhost:8181/hello
	//Resultat -> Message: Hello; I'm the vehicule Microservice for Week 3
	//Execution URL: http://localhost:8282/api/vehicules/hello
	@RequestMapping("/hello")
	public String sayHello(){
		System.out.println(title);
		return title;
	}
	
	//Configuration de la methode POST
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<vehicule> createvehicule(@RequestBody vehicule vehicule){
		return new ResponseEntity<>(vehiculeService.addVehicule(vehicule), HttpStatus.OK);
	}
	
	
	
	//Configuration de la methode PUT
	//Execution URL: http://localhost:8282/api/vehicules/search
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<vehicule> updatevehicule(@PathVariable(value = "id") int id,
			@RequestBody vehicule vehicule){
		return new ResponseEntity<>(vehiculeService.updatevehicule(id, vehicule), HttpStatus.OK);
	}
	
	//Configuation de la methode Delete
	//Execution URL: http://localhost:8282/api/vehicules/{id}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<vehicule> deletevehicule(@PathVariable(value = "id") int id){
		vehiculeService.deletevehicule(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	
	//Additional (Optionnel) - N'existe pas dans l'atelier
	//Configuration de la methode GET All
	//Execution URL: http://localhost:8282/api/vehicules/
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<vehicule> getAllveVehicules(){
		return vehiculeService.getVehicules();
	}
	
	
	//Additional (Optionnel) - N'existe pas dans l'atelier
	//Configuration de la methode de recherche GET specifique avec PathParam
	//il faut que les noms des methodes ici vehicule Resst API) et celles dans vehiculeservice n'aient pas le meme nom, sinon ca degere une erreue de mapping
	//Execution URL: http://localhost:8282/api/vehicules
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<vehicule> searchvehicule(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(vehiculeService.findvVehicule(id) , HttpStatus.OK);
	}
	
	
	

}
