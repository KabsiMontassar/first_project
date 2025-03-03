package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.arctic.first_project.services.IChaineRestaurationService;

@Controller
@AllArgsConstructor
public class ChaineRestaurationController    {
    IChaineRestaurationService iChaineRestaurationService;
}
