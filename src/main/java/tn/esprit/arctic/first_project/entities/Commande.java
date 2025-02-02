package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "CommandeMenu",
            joinColumns = @JoinColumn(name = "idCommande"),
            inverseJoinColumns = @JoinColumn(name = "idMenu")
    )
    private Set<Menu> menus;
}
