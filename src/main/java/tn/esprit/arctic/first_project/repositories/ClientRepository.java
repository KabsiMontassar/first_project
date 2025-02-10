package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.first_project.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}