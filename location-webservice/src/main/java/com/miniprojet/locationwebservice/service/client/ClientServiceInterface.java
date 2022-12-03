package com.miniprojet.locationwebservice.service.client;

import com.miniprojet.locationwebservice.entity.Client;

public interface ClientServiceInterface {
    public Client getClientById(Long clientId);
    public Client saveClient(Client clientSaved);
}
