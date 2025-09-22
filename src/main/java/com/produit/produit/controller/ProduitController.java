package com.produit.produit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produit.produit.model.Produit;
import com.produit.produit.service.ProduitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/vi/produits")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }

    @GetMapping("/all")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @PostMapping("/add")
    public Produit addProduit(@RequestBody Produit produit) {
        return produitService.addProduit(produit);
    }

    @PostMapping("/update")
    public Produit updateProduit(@RequestBody Produit produit) {
        return produitService.addProduit(produit);
    }

    @DeleteMapping("/delete")
    public void deleteProduit(@RequestBody Produit produit) {
        produitService.deleteProduit(produit);
    }
}
