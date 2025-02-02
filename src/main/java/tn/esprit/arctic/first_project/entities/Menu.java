package tn.esprit.arctic.first_project.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    private String typeMenu;
    private Float prixTotal;

    @ManyToOne
    @JoinColumn(name = "idRestaurant")
    private Restaurant restaurant;

    @ManyToMany
    @JoinTable(
            name = "MenuComposant",
            joinColumns = @JoinColumn(name = "idMenu"),
            inverseJoinColumns = @JoinColumn(name = "idComposant")
    )
    private Set<Composant> composants;

    @ManyToMany
    @JoinTable(
            name = "MenuChef",
            joinColumns = @JoinColumn(name = "idMenu"),
            inverseJoinColumns = @JoinColumn(name = "idChefCuisinier")
    )
    private Set<ChefCuisinier> chefs;
}
