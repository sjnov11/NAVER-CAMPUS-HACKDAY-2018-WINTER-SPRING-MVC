package com.sjnov11.springmavenweb.web;

import com.sjnov11.springmavenweb.DAO.ImgPathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScreenshotController {
    @Autowired
    private ImgPathRepository imgPathRepository;

    @GetMapping("/screenshot")
    public String index(int fk, Model model) {
        model.addAttribute("pathList", imgPathRepository.getImgPathList(fk));
        return "result";
    }
}
