package com.group2.blogplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "redirect:/auth/login";
    }

    @GetMapping("/home")
    public String home() {
        return "view/home";
    }
}