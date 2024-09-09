package com.backend.sping.backend_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.sping.backend_spring.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/rest")
    public Map<String, Object> details() {
        User user = new User("armando", "Salazar");
        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hola mundo spring boot");
        response.put("user", user);

        return response;
    }
}
