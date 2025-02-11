package tn.esprit.arctic.first_project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.Commande;
import tn.esprit.arctic.first_project.repositories.CommandeRepository;
import tn.esprit.arctic.first_project.services.CommandeService;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande update(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void delete(Long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public Commande findById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }
}