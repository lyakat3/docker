package com.accenture.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
    public String hello() {
    return "hello";
    }

    @PostMapping("/user")
    public String helloSomeone(@RequestParam String user, Model model) {
    model.addAttribute("user", user);
    return "hello";
    } 


}
