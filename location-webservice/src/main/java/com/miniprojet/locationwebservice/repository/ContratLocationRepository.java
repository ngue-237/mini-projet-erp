package com.miniprojet.locationwebservice.repository;

import com.miniprojet.locationwebservice.entity.ContratLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratLocationRepository extends JpaRepository<ContratLocation,Long> {
    public ContratLocation findByRefIgnoreCase(String ref);
}
