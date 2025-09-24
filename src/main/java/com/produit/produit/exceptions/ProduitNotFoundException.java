package com.produit.produit.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProduitNotFoundException extends RuntimeException{
    public ProduitNotFoundException(String message) {
        super(message);
    }
}
