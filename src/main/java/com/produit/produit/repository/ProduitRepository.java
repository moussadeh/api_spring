package com.produit.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.produit.produit.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
