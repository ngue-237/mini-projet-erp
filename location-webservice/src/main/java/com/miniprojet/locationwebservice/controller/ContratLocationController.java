package com.miniprojet.locationwebservice.controller;

import com.miniprojet.locationwebservice.entity.ContratLocation;
import com.miniprojet.locationwebservice.service.contrat_location.ContratLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car-location-service/contrat-loctation")
public class ContratLocationController {
    @Autowired
    ContratLocationService contratLocationService;

    @GetMapping("/{ref}")
    public ContratLocation getContratLoc(@PathVariable(name = "ref") String ref){
        return contratLocationService.getContratLocByRef(ref);
    }

    @GetMapping
    public List<ContratLocation>getAllContratLoc(){
        return contratLocationService.getAllContratLoc();
    }


    @PostMapping
    public ContratLocation addNewContract(@RequestBody ContratLocation contractLoc){
        return contratLocationService.saveContratLocation(contractLoc);
    }

    @DeleteMapping("/{ref}")
    public String deleteContratLoc(@PathVariable(name = "ref") String ref){
        contratLocationService.deleteContractByRef(ref);
        return "contract deleted successfully";
    }

    @PutMapping("/{ref}")
    public ContratLocation updateContractLoc(@PathVariable(name = "ref") String ref, @RequestBody ContratLocation contratLoc){
        return contratLocationService.updateContratLoc(ref, contratLoc);
    }
}
