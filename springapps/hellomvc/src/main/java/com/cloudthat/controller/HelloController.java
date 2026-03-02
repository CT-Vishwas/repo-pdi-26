package com.cloudthat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String greet(Model model){
        model.addAttribute("message", "Hello World Vishwas");
        return "hello";
    }
}
