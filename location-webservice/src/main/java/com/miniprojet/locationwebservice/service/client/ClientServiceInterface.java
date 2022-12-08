package com.miniprojet.locationwebservice.service.client;

import com.miniprojet.locationwebservice.entity.Client;

import java.util.List;

public interface ClientServiceInterface {
    public Client getClientById(Long clientId);
    public Client saveClient(Client clientSaved);
    public Client getClientByEmail(String email);

    Client updateClientByEmail(String email, Client clientModified);

    void deleteClientById(Long clientId);

    List<Client> getAllClient();
}
