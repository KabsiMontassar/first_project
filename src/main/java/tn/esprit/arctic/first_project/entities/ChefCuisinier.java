package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;



    @ManyToMany(mappedBy="chefCuisiniers", cascade = CascadeType.ALL)
    private Set<Menu> menus;
}
