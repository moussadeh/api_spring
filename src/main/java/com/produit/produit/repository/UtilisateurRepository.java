package com.produit.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.produit.produit.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
