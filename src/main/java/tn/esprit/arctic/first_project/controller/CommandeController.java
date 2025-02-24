package tn.esprit.arctic.first_project.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.first_project.services.ICommandeService;

@Controller
@AllArgsConstructor
public class CommandeController {
ICommandeService iCommandeService;
}
