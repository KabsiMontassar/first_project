package tn.esprit.arctic.first_project.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.Commande;
import tn.esprit.arctic.first_project.services.ICommandeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Commande")
public class CommandeController {
ICommandeService CommandeService;


    @GetMapping("/retrieve-all-Commandes")
    public List<Commande> getCommandes() {
        return CommandeService.findAll();
    }
    @GetMapping("/retrieve-Commande/{Commande-id}")
    public Commande retrieveCommande(@PathVariable("Commande-id") Long CommandeId) {
        return CommandeService.findById(CommandeId);
    }
    @PostMapping("/add-Commande")
    public Commande addCommande(@RequestBody Commande c) {
        return CommandeService.save(c);
    }
    @DeleteMapping("/remove-Commande/{Commande-id}")
    public void removeCommande(@PathVariable("Commande-id") Long CommandeId) {
        CommandeService.delete(CommandeId);
    }
    @PutMapping("/update-Commande")
    public Commande updateCommande(@RequestBody Commande c) {
        return CommandeService.update(c);
    }
}
