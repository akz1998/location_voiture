package com.example.locationvoiture.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "voiture")
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long IdVoiture;
    String model;
    long numérodeserie;
    String description;
    String pickupreturn;
    String diffreturn ;
    Date PickupDate;
    Date ReturnDate ;
    long price;
}
