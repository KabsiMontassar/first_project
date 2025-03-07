package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.services.IMenuService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Menu")
public class MenuController {
IMenuService MenuService;

    @GetMapping("/retrieve-all-Menus")
    public List<Menu> getMenus() {
        return MenuService.findAll();
    }
    @GetMapping("/retrieve-Menu/{Menu-id}")
    public Menu retrieveMenu(@PathVariable("Menu-id") Long MenuId) {
        return MenuService.findById(MenuId);
    }
    @PostMapping("/add-Menu")
    public Menu addCMenu(@RequestBody Menu c) {
        return MenuService.save(c);
    }
    @DeleteMapping("/remove-Menu/{Menu-id}")
    public void removeMenu(@PathVariable("Menu-id") Long MenuId) {
        MenuService.delete(MenuId);
    }
    @PutMapping("/update-Menu")
    public Menu updateMenu(@RequestBody Menu c) {
        return MenuService.update(c);
    }
}
