package com.produit.produit.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.produit.produit.model.Produit;
import com.produit.produit.service.ProduitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    // @GetMapping("/test")
    // public String test() {
    //     return "API is working!";
    // }

    @GetMapping("/all")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @PostMapping("/add")
    public Produit addProduit(@RequestBody Produit produit) {
        return produitService.addProduit(produit);
    }

    // @PostMapping("/update")
    // public Produit updateProduit(@RequestBody Produit produit) {
    //     return produitService.addProduit(produit);
    // }

    // @DeleteMapping("/delete")
    // public void deleteProduit(@RequestBody Produit produit) {
    //     produitService.deleteProduit(produit);
    // }

    @GetMapping("{id}")
    public Produit getProduitById(@PathVariable Long id) {
        return produitService.getProduitById(id);
    }

    @DeleteMapping("{id}")
    public String deleteProduitById(@PathVariable Long id) {
        return produitService.deleteProduitById(id);
    }

    @PutMapping("{id}")
    public Produit updateProduitById(@PathVariable Long id, @RequestBody Produit produit) {
        return produitService.editProduit(id, produit);
    }
}
