package com.miniprojet.locationwebservice.service.contrat_location;

import com.miniprojet.locationwebservice.entity.ContratLocation;
import com.miniprojet.locationwebservice.repository.ContratLocationRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ContratLocationServiceImplement implements ContratLocationService{
    @Autowired
    private ContratLocationRepository contractRepo;


    @Override
    public ContratLocation saveContratLocation(ContratLocation contratLoc) {
        return contractRepo.save(contratLoc);
    }

    @Override
    public ContratLocation getContratLocByRef(String ref) {
        return contractRepo.findByRefIgnoreCase(ref);
    }

    @Override
    public List<ContratLocation> getAllContratLoc() {
        return contractRepo.findAll();
    }

    @Override
    public void deleteContractByRef(String ref) {
    contractRepo.delete(contractRepo.findByRefIgnoreCase(ref));
    }

    @Override
    public ContratLocation updateContratLoc(String ref, @NotNull ContratLocation contratLoc) {
        ContratLocation contraLocDb = contractRepo.findByRefIgnoreCase(ref);
        System.out.println(contratLoc);
        if(Objects.nonNull(contratLoc.getRef())&& !"".equalsIgnoreCase(contratLoc.getRef())){
            contraLocDb.setRef(contratLoc.getRef());
        }
        if(Objects.nonNull(contratLoc.getDate_fin_location()) && !contraLocDb.getDate_fin_location().equals(contratLoc.getDate_fin_location())){
            contraLocDb.setDate_fin_location(contratLoc.getDate_fin_location());
        }
        if(Objects.nonNull(contratLoc.getRef())&& !contraLocDb.getDate_deb_location().equals(contratLoc.getDate_deb_location())){
            contraLocDb.setDate_deb_location(contratLoc.getDate_deb_location());
        }
        if(Objects.nonNull(contratLoc.isEtatVehicule())&& !Boolean.valueOf(contratLoc.isEtatVehicule()).equals(contraLocDb.isEtatVehicule())){
            contraLocDb.setEtatVehicule(contratLoc.isEtatVehicule());
        }
        contractRepo.save(contraLocDb);
        return null;
    }
}
