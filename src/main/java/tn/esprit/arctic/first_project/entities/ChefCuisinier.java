package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

@Entity
class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    private TypeChef typeChef;
}
