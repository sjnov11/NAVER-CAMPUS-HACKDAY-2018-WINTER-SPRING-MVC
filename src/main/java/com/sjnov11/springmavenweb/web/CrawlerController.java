package com.sjnov11.springmavenweb.web;

import com.sjnov11.springmavenweb.DAO.ImgResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrawlerController {
    @Autowired
    private ImgResourceRepository imgResourceRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("resources", imgResourceRepository.list());
        return "index";
    }

}
