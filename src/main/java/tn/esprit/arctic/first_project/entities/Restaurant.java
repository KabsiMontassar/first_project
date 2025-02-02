package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

import java.awt.*;
import java.util.Set;

@Entity
class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "idChaineRestauration")
    private ChaineRestauration chaineRestauration;

    @OneToMany(mappedBy = "restaurant")
    private Set<Menu> menus;
}
