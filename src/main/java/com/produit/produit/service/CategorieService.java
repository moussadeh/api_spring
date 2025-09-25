package com.produit.produit.service;

import org.springframework.stereotype.Service;
import com.produit.produit.repository.CategorieRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategorieService {

    private final CategorieRepository categorieRepository;
}
