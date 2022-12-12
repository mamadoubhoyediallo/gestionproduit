package com.groupeisi.gestionproduit.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "produit")
@Data
@NoArgsConstructor @AllArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "libelle", length = 200, nullable = false)
    private String libelle;
    @Column(name = "prix", nullable = false)
    private double prix;
}
