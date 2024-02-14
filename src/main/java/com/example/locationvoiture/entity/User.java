package com.example.locationvoiture.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;
    String nom;
    String prenom;
    String email;
    @JsonFormat(pattern="yyyy-MM-dd")
    Date dateDeNaissance;
    @Enumerated(EnumType.STRING)
    Role role;
    String password;


}
