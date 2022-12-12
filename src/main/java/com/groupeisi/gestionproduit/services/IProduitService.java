package com.groupeisi.gestionproduit.services;

import com.groupeisi.gestionproduit.entities.Produit;

import java.util.List;

public interface IProduitService {
    Produit save(Produit produit);
    Produit update(Produit produit, int id);
    List<Produit> findAll();
    Produit getProduit(int id);
    void delete(int id);
}
