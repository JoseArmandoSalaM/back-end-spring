package com.backend.sping.backend_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.sping.backend_spring.models.dto.ParamDto;
import com.backend.sping.backend_spring.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "No hay mensajes") String message) {

        ParamDto param = new ParamDto();

        param.setMessage(message);
        return param;

    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {

        ParamMixDto params = new ParamMixDto();

        params.setCode(code);
        params.setMessage(text);

        return params;
    }

    @GetMapping("/request")
    public ParamMixDto reques(HttpServletRequest request) {
        Integer code = 0;

        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception

        }

        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));

        return params;
    }

}
