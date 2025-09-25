package com.produit.produit.service;

import org.springframework.stereotype.Service;
import com.produit.produit.repository.AdresseRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdresseService {

    private final AdresseRepository adresseRepository;
}
