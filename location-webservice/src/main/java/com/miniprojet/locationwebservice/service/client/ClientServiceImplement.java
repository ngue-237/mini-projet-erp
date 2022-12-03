package com.miniprojet.locationwebservice.service.client;

import com.miniprojet.locationwebservice.entity.Client;
import com.miniprojet.locationwebservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImplement implements ClientServiceInterface {
    @Autowired
    ClientRepository clientRepo;
    @Override
    public Client getClientById(Long clientId) {
        return clientRepo.findById(clientId).get();
    }

    @Override
    public Client saveClient(Client clientSaved) {
        return clientRepo.save(clientSaved);
    }
}
