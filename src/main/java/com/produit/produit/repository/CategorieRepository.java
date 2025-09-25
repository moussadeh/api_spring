package com.produit.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.produit.produit.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
