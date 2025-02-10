package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.first_project.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}