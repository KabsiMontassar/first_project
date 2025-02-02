package tn.esprit.arctic.first_project.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    private TypeMenu typeMenu;
    private Float prixTotal;


}
