package com.lk.demo.Controllers;

import com.lk.demo.Repo.TeachersRepository;
import com.lk.demo.models.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeachersController {

    @Autowired
    private TeachersRepository teachersRepository;

    @GetMapping("/Teachers")
    public String Teachers (Model model) {
        Iterable<Teachers> teachers = teachersRepository.findAll();
        model.addAttribute("teachers", teachers);
        return "Teachers";
    }
}
