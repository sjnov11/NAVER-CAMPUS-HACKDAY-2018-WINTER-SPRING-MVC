package com.sjnov11.springmavenweb.web;

import com.sjnov11.springmavenweb.domain.User;
import com.sjnov11.springmavenweb.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // userRepo가 spring에서 인스턴스화, 우리는 그걸 가져다 쓰기만
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public String create(User user) {
        System.out.println(user);
        userRepository.save(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "list";
    }
}
