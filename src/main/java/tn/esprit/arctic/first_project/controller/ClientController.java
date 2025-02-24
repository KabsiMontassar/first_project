package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.first_project.services.IClientService;

@Controller
@AllArgsConstructor
public class ClientController {
IClientService iClientService;
}
