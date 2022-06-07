package com.lk.demo.Controllers;

import com.lk.demo.Repo.SubjectRepository;
import com.lk.demo.models.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/Subject")
    public String Subject (Model model) {
        Iterable<Subject> subject = subjectRepository.findAll();
        model.addAttribute("subject", subject);
        return "Subject";
    }
}
