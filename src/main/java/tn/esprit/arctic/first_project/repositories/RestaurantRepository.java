package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.first_project.entities.Commande;
import tn.esprit.arctic.first_project.entities.Restaurant;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findByRestaurantNbPlacesMaxGreaterThanAndRestaurantChaineDateCreationBefore(Integer capacite, LocalDate date);

}