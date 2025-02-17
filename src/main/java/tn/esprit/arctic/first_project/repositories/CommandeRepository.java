package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.first_project.entities.Commande;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    List<Commande> findByClientId(Long id);
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long id, LocalDate date1, LocalDate date2);

    List<Commande> findByDateCommandeBetweenOrderByTotalCommandeAndNoteAsc(LocalDate date1, LocalDate date2);

}