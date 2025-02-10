package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;

    @ManyToOne
    Client client;

    @ManyToOne
    Menu menu;
}
