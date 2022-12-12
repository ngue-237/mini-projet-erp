package com.miniprojet.gestionuser.Models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.Collections;

@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    @Field("cin")
    private Number cin=123546;
    @Field("nom")
    private String nom="WEM";
    @Field("mdp")
    private String mdp;
    @Field("prenom")
    private String prenom="therese";
    @Field("adresse")
    private  String adresse;
    @Field("tel")
    private Number tel;
    @Indexed(unique = true)
    @Field("email")
    private String email;
    @Field("role")    private  String role;
   /* public Collection<? extends  GrantedAuthority> getAuthorities(){
        return Collections.EMPTY_LIST;
    }*/
}
