package com.example.phase0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home"; // In a full web app this would resolve to src/main/resources/templates/home.html
    }
}
