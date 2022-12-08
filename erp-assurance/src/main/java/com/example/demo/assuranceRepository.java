package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface assuranceRepository extends JpaRepository<assurance, Integer> {
	//Requete de recherche d'un assurance par son matricule
	//http://localhost:8181/assurance/search/assuranceByNom?nom=Sarra
	@Query("select v from assurance v where v.matricule_v like :matricule_v")
	public Page<assurance> assuranceByMatricule_v(@Param("matricule_v") String n, Pageable pageable);
	


	
	}


