package com.miniprojet.gestionuser.Models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    @Field("name")
    private String nom="WEM";
    @Field("firstname")
    private String prenom="therese";
    @Field("address")
    private  String adresse;
    @Field("phone")
    private Number tel;
    @Field("mail")
    private String email;
    @Field("role")
    private  String role;
}
