package com.produit.produit.controller;

import org.springframework.web.bind.annotation.RestController;
import com.produit.produit.service.UtilisateurService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UtilisateurController {
    
    private final UtilisateurService utilisateurService;
}
