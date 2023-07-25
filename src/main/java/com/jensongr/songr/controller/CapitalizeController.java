package com.jensongr.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller public class CapitalizeController {
    @GetMapping("/capitalize/{words}")
    public String capitalize(@PathVariable String words, Model model) {
        model.addAttribute("capitalizedWords", words.toUpperCase());
        return "capitalize";
    }
}

