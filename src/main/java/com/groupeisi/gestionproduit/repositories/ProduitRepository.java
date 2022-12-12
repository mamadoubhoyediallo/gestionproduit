package com.groupeisi.gestionproduit.repositories;

import com.groupeisi.gestionproduit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<Produit, Integer> {
}
