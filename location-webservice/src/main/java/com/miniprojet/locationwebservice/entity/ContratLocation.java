package com.miniprojet.locationwebservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Calendar;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "contrat_location")
public class ContratLocation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ref;

//    public boolean isEtatVehicule() {
//        return etatVehicule;
//    }
//
//    public void setEtatVehicule(boolean etatVehicule) {
//        this.etatVehicule = etatVehicule;
//    }

    private boolean etatVehicule;

    @Temporal(TemporalType.DATE)
    private Calendar date_deb_location;

    @Temporal(TemporalType.DATE)
    private Calendar date_fin_location;
}
