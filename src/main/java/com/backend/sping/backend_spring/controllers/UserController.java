package com.backend.sping.backend_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.backend.sping.backend_spring.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Jose", "Salazar");
        model.addAttribute("title", "Hola mundo spring boot");
        model.addAttribute("user", user);

        return "details";
    }
}
