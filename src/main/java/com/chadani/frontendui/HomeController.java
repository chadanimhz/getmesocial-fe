package com.chadani.frontendui;

import com.chadani.frontendui.model.Informa;
import com.chadani.frontendui.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("informa", new Informa());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("informa", homeService.getMessage());
        return "about";
    }

    @PostMapping("/info")
    public String saveInfo(Model model, @ModelAttribute Informa informa) {
        homeService.setMessage(informa);
        model.addAttribute("informa", homeService.getMessage());
        return "about";
    }
}
