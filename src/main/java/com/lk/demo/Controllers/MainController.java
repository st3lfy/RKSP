package com.lk.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/index")
    public String greeting(Model model) {
        model.addAttribute("name", "Главная страница");
        return "index";
    }
}
