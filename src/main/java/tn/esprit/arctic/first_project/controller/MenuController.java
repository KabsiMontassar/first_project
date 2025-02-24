package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.first_project.services.IMenuService;

@Controller
@AllArgsConstructor
public class MenuController {
IMenuService iMenuService;
}
