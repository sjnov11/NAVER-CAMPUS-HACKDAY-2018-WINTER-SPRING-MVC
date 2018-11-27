package com.sjnov11.springmavenweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/")
    public String root(String name) {
        return "index";
    }

    @GetMapping("/helloworld")
    public String welcome(String name, int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "welcome";
    }

}
