package tn.esprit.arctic.first_project.services;

import tn.esprit.arctic.first_project.entities.Menu;

import java.util.List;

public interface MenuService {
    Menu save(Menu menu);
    Menu update(Menu menu);
    void delete(Long id);
    Menu findById(Long id);
    List<Menu> findAll();
}