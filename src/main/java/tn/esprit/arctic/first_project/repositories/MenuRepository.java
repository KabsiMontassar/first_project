package tn.esprit.arctic.first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.arctic.first_project.entities.Commande;
import tn.esprit.arctic.first_project.entities.Menu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByTypeMenuAndComposantPrixGreaterThan(String typeMenu, Float prix);

    @Query("select m.libelleMenu from Menu m where m.typeMenu = :typeMenu order by m.prixTotal asc")
    List <Menu> findByTypeMenuAndOrderByPrixTotal(String typeMenu);

    @Query("select m.libelleMenu from Menu m  join m.composants c where c.detailcomposant  = :typeComposant")
    List <Menu> findByTypeComposant(String typeComposant);

}