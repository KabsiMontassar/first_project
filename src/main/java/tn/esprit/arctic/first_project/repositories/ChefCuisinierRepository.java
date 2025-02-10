package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;

public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier, Long> {
}