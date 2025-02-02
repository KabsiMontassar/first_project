package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;


}
