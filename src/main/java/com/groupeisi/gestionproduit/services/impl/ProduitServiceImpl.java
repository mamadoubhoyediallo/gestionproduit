package com.groupeisi.gestionproduit.services.impl;

import com.groupeisi.gestionproduit.entities.Produit;
import com.groupeisi.gestionproduit.exception.EntityNotFoundException;
import com.groupeisi.gestionproduit.repositories.ProduitRepository;
import com.groupeisi.gestionproduit.services.IProduitService;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class ProduitServiceImpl implements IProduitService {

    private ProduitRepository produitRepository;
    private MessageSource messageSource;

    public ProduitServiceImpl(ProduitRepository produitRepository, MessageSource messageSource) {
        this.produitRepository = produitRepository;
        this.messageSource = messageSource;
    }

    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit update(Produit produit, int id) {
        Produit produit1 = produitRepository.findById(id).get();
        produit1.setLibelle(produit.getLibelle());
        produit1.setPrix(produit.getPrix());
        return produitRepository.save(produit1);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getProduit(int id) {
        return produitRepository.findById(id).
                orElseThrow(() ->
                        new EntityNotFoundException(messageSource.getMessage("produit.notfound", new Object[]{id},
                                Locale.getDefault())));
    }

    @Override
    public void delete(int id) {
        produitRepository.deleteById(id);
    }
}
