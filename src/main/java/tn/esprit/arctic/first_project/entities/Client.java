package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Date;
import java.util.Set;

@Entity
class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String identifiant;
    private LocalDate datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private Set<Commande> commandes;
}