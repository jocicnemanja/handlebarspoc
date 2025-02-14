package com.example.handlebarspoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NemanjaController {

    @GetMapping("/nemanja")
    public String nemanja(Model model) {
        model.addAttribute("message", "Hello, Handlebars!");
        return "nemanja2"; // Don't add .hbs extension
    }
}