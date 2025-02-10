package tn.esprit.arctic.first_project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.DetailComposant;
import tn.esprit.arctic.first_project.repositories.DetailComposantRepository;
import tn.esprit.arctic.first_project.services.DetailComposantService;

import java.util.List;

@Service
public class DetailComposantServiceImpl implements DetailComposantService {

    @Autowired
    private DetailComposantRepository detailComposantRepository;

    @Override
    public DetailComposant save(DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    @Override
    public DetailComposant update(DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    @Override
    public void delete(Long id) {
        detailComposantRepository.deleteById(id);
    }

    @Override
    public DetailComposant findById(Long id) {
        return detailComposantRepository.findById(id).orElse(null);
    }

    @Override
    public List<DetailComposant> findAll() {
        return detailComposantRepository.findAll();
    }
}