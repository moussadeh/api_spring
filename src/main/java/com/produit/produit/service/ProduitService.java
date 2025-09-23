package com.produit.produit.service;

import java.util.List;
import java.util.Optional;
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

    public Produit getProduitById(Long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        if (optionalProduit.isEmpty()) {
            throw new RuntimeException("Produit introuvable");
        }
        return optionalProduit.get();
    }

    public String deleteProduitById(Long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        if (optionalProduit.isEmpty()) {
            return "Impossible de supprimer : Produit introuvable";
        }
        produitRepository.delete(optionalProduit.get());
        return "Produit supprimé avec succès";
    }

    public Produit editProduit(Long id, Produit produit) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        if (optionalProduit.isEmpty()) {
            throw new RuntimeException("Impossible de modifier : Produit introuvable");
        }
        Produit existingProduit = optionalProduit.get();
        existingProduit.setName(produit.getName());
        existingProduit.setPrice(produit.getPrice());
        return produitRepository.save(existingProduit);
    }
}
