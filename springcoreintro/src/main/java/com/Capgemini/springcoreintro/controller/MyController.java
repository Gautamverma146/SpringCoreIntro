package com.Capgemini.springcoreintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String sayhello(){
        return "hello from Bridgelabz";
    }
    @GetMapping("/hello1")
    public String sayhello1 (Model model){
        model.addAttribute("message","Hello From Bridgelabz");
        return "hello2";
    }
}
