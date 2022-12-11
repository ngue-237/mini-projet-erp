package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.assurance;
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
@RequestMapping(value = "/api/assurances")
public class assuranceRestAPI {
	
	private String title = "Hello; I'm the assurance Microservice";
	
	@Autowired
	private com.example.demo.service.assuranceService assuranceService;
	
	//http://localhost:8181/hello
	//Resultat -> Message: Hello; I'm the assurance Microservice for Week 3
	//Execution URL: http://localhost:8282/api/assurances/hello
	@RequestMapping("/hello")
	public String sayHello(){
		System.out.println(title);
		return title;
	}
	
	//Configuration de la methode POST
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<assurance> createassurance(@RequestBody assurance assurance){
		return new ResponseEntity<>(assuranceService.addassurance(assurance), HttpStatus.OK);
	}
	
	
	
	//Configuration de la methode PUT
	//Execution URL: http://localhost:8282/api/assurances/search
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<assurance> updateassurance(@PathVariable(value = "id") int id,
			@RequestBody assurance assurance){
		return new ResponseEntity<>(assuranceService.updateassurance(id, assurance), HttpStatus.OK);
	}
	
	//Configuation de la methode Delete
	//Execution URL: http://localhost:8282/api/assurances/{id}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<assurance> deleteassurance(@PathVariable(value = "id") int id){
		assuranceService.deleteassurance(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	
	//Additional (Optionnel) - N'existe pas dans l'atelier
	//Configuration de la methode GET All
	//Execution URL: http://localhost:8282/api/assurances/
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<assurance> getAllveassurances(){
		return assuranceService.getassurances();
	}
	
	
	//Additional (Optionnel) - N'existe pas dans l'atelier
	//Configuration de la methode de recherche GET specifique avec PathParam
	//il faut que les noms des methodes ici assurance Resst API) et celles dans assuranceservice n'aient pas le meme nom, sinon ca degere une erreue de mapping
	//Execution URL: http://localhost:8282/api/assurances
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<assurance> searchassurance(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(assuranceService.findvassurance(id) , HttpStatus.OK);
	}
	
	
	

}
