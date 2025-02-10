package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.first_project.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}