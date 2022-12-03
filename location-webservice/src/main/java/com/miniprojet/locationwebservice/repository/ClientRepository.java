package com.miniprojet.locationwebservice.repository;

import com.miniprojet.locationwebservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client,Long> {
}
