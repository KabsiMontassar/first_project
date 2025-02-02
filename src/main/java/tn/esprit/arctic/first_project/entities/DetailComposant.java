package tn.esprit.arctic.first_project.entities;

import jakarta.persistence.*;

@Entity
class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;
    private Float imc;
    private String typeComposant;

    @ManyToOne
    @JoinColumn(name = "idComposant")
    private Composant composant;
}
