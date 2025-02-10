package tn.esprit.arctic.first_project.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    private TypeMenu typeMenu;
    private Float prixTotal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Commande> commandes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Composant> composants;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ChefCuisinier> chefCuisiniers;
}
