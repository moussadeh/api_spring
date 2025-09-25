package com.produit.produit.service;

import org.springframework.stereotype.Service;
import com.produit.produit.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    
    private final UtilisateurRepository utilisateurRepository;
}
