package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    
    @GetMapping("/")
    public String getIndex() {
        return "index.html";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }
}