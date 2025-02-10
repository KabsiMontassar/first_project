package tn.esprit.arctic.first_project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;
import tn.esprit.arctic.first_project.repositories.ChefCuisinierRepository;
import tn.esprit.arctic.first_project.services.ChefCuisinierService;

import java.util.List;

@Service
public class ChefCuisinierServiceImpl implements ChefCuisinierService {

    @Autowired
    private ChefCuisinierRepository chefCuisinierRepository;

    @Override
    public ChefCuisinier save(ChefCuisinier chefCuisinier) {
        return chefCuisinierRepository.save(chefCuisinier);
    }

    @Override
    public ChefCuisinier update(ChefCuisinier chefCuisinier) {
        return chefCuisinierRepository.save(chefCuisinier);
    }

    @Override
    public void delete(Long id) {
        chefCuisinierRepository.deleteById(id);
    }

    @Override
    public ChefCuisinier findById(Long id) {
        return chefCuisinierRepository.findById(id).orElse(null);
    }

    @Override
    public List<ChefCuisinier> findAll() {
        return chefCuisinierRepository.findAll();
    }
}