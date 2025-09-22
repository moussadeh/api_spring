package com.produit.produit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.produit.produit.model.Produit;
import com.produit.produit.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public void deleteProduit(Produit produit) {
        produitRepository.delete(produit);
    }
}
