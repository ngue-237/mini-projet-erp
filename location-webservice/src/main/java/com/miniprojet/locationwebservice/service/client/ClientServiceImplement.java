package com.miniprojet.locationwebservice.service.client;

import com.miniprojet.locationwebservice.entity.Client;
import com.miniprojet.locationwebservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Client getClientByEmail(String email) {
        return clientRepo.findByEmailIgnoreCase(email);
    }

    @Override
    public Client updateClientByEmail(String email, Client clientModified) {
        //System.out.println(clientModified);
        Client clientDb = clientRepo.findByEmailIgnoreCase(email);
        if(Objects.nonNull(clientModified.getNom()) && !"".equalsIgnoreCase(clientModified.getNom())){
            clientDb.setNom(clientModified.getNom());
        }
        if(Objects.nonNull(clientModified.getPrenom()) && !"".equalsIgnoreCase(clientModified.getPrenom())){
            clientDb.setPrenom(clientModified.getPrenom());
        }
        if(Objects.nonNull(clientModified.getCni()) && !"".equalsIgnoreCase(clientModified.getCni())){
            clientDb.setCni(clientModified.getCni());
        }
        if(Objects.nonNull(clientModified.getEmail()) && !"".equalsIgnoreCase(clientModified.getEmail())){
            clientDb.setEmail(clientModified.getEmail());
        }

        return clientRepo.save(clientDb);
    }

    @Override
    public void deleteClientById(Long clientId) {
        clientRepo.deleteById(clientId);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepo.findAll();
    }
}
