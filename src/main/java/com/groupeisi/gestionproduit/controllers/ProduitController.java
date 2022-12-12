package com.groupeisi.gestionproduit.controllers;

import com.groupeisi.gestionproduit.entities.Produit;
import com.groupeisi.gestionproduit.services.IProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "produit")
public class ProduitController {

    private IProduitService iProduitService;

    public ProduitController(IProduitService iProduitService) {
        this.iProduitService = iProduitService;
    }

    @PostMapping(path = "/save")
    public Produit save(@RequestBody Produit produit){
        return iProduitService.save(produit);
    }

    @GetMapping(path = "findAll")
    public List<Produit> produitList(){
        return iProduitService.findAll();
    }

    @PutMapping(path = "/update/{id}")
    public Produit update(@RequestBody Produit produit,@PathVariable("id") int id){
        return iProduitService.update(produit, id);
    }

    @GetMapping(path = "/getProduit/{id}")
    public Produit getProduit(@PathVariable("id") int id){
        return iProduitService.getProduit(id);
    }
    @DeleteMapping(path = "delete/{id}")
    public void delete(@PathVariable("id") int id){
        iProduitService.delete(id);
    }
}
