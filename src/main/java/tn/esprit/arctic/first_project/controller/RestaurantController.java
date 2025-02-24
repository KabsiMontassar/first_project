package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.first_project.services.IRestaurantService;

@Controller
@AllArgsConstructor
public class RestaurantController {
IRestaurantService iRestaurantService;
}
