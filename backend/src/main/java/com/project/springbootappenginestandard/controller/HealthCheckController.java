package com.project.springbootappenginestandard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HealthCheckController {

    @GetMapping
    public String home(Model model) {
        return "forward:/index.html";
    }
}
