package com.backend.sping.backend_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.sping.backend_spring.models.User;
import com.backend.sping.backend_spring.models.dto.ParamIdDto;

@RestController
@RequestMapping("/api")
public class PathVariableController {

    @Value("${server.port}")
    private String code;

    @GetMapping("/baz/{id}")
    public ParamIdDto baz(@PathVariable Integer id) {
        ParamIdDto param = new ParamIdDto();
        param.setId(id);
        return param;
    }

    @GetMapping("/baz/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable Integer id, @PathVariable String product) {

        Map<String, Object> json = new HashMap<>();
        json.put("id", id);
        json.put("product", product);

        return json;
    }

    @PostMapping("/tasks")
    public User create(@RequestBody User user) {

        return user;
    }

    @GetMapping("/codeport")
    public Map<String, Object> codePort() {
        Map<String, Object> json = new HashMap<>();
        json.put("code", code);

        return json;
    }

}
