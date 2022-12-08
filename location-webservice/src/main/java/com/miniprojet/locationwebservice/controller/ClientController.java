package com.miniprojet.locationwebservice.controller;

import com.miniprojet.locationwebservice.entity.Client;
import com.miniprojet.locationwebservice.service.client.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car-location-service/client")
public class ClientController {
    @Autowired
    private ClientServiceInterface clientService;

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable(name = "id") Long clientId){
        return clientService.getClientById(clientId);
    }

    @GetMapping("/all-clients")
    public List<Client> getAllClient(){
        return clientService.getAllClient();
    }

    @PostMapping
    public Client saveClient(@RequestBody Client clientToSave){
        return clientService.saveClient(clientToSave);
    }

    @GetMapping("/email/{email}")
    public Client getClientByEmail(@PathVariable(name = "email") String email){
        return clientService.getClientByEmail(email);
    }

    @PutMapping("/update/{email}")
    public Client updateClientByEmail(@PathVariable("email") String email, @RequestBody Client clientModified){
        return clientService.updateClientByEmail(email, clientModified);
    }

    @DeleteMapping("/{id}")
    public String deleteClientById(@PathVariable(name = "id") Long clientId){
        clientService.deleteClientById(clientId);
        return "client deleted successfully";
    }

}
