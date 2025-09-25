package com.produit.produit.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue
    private long utilisateur_id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Adresse> adresses;
}
