package com.example.demo.repository;


import com.example.demo.entity.vehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface vehiculeRepository extends JpaRepository<vehicule, Integer> {
	//Requete de recherche d'un vehicule par son matricule
	//http://localhost:8181/vehicule/search/vehiculeByNom?nom=Sarra
	@Query("select v from vehicule v where v.matricule like :matricule")
	public Page<vehicule> vehiculeByMatricule(@Param("matricule") String n, Pageable pageable);
	


	
	}


