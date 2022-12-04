package com.miniprojet.locationwebservice.service.contrat_location;

import com.miniprojet.locationwebservice.entity.ContratLocation;

import java.util.List;

public interface ContratLocationService {
    public ContratLocation saveContratLocation(ContratLocation contratLoc);
    public ContratLocation getContratLocByRef(String ref);
    public List<ContratLocation> getAllContratLoc();
    public void deleteContractByRef(String ref);

    public ContratLocation updateContratLoc(String ref, ContratLocation contratLoc);
}
