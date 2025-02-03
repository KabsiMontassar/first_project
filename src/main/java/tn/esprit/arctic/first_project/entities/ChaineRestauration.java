package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class ChaineRestauration {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="chainerestauration")
    private Set<Restaurant> restaurants;
}