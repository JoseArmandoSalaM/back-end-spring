package com.backend.sping.backend_spring.controllers;

import java.util.Arrays;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.sping.backend_spring.models.User;
import com.backend.sping.backend_spring.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/rest")
    public UserDto details() {
        User user = new User("armando", "Salazar");

        UserDto userDto = new UserDto();
        // Como relacion
        // userDto.setUser(user);

        // Por atributos
        userDto.setUser(user.getName());
        userDto.setLastname(user.getLastname());

        userDto.setTitle("Hola mundo desde spring");
        // Map<String, Object> response = new HashMap<>();

        // response.put("title", "Hola mundo spring boot");
        // response.put("user", user);

        return userDto;
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        // User user = new User("Ar", "SM");
        // User user2 = new User("Ja", "SM");
        // User user3 = new User("Aj", "SM");

        // List<User> users = Arrays.asList(user, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        model.addAttribute("Title", "Listado de usuario!");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(

                new User("Ar", "SM"),
                new User("Ja", "SM"),
                new User("Aj", "SM"));
    }

}
