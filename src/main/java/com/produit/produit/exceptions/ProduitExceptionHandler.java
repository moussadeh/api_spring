package com.produit.produit.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.produit.produit.model.ErrorResponse;

@RestControllerAdvice
public class ProduitExceptionHandler {
    
    @ExceptionHandler(ProduitNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProduitNotFoundException(ProduitNotFoundException pex) {
        ErrorResponse errorResponse = new ErrorResponse(pex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}
