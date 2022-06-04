package com.lk.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
    @GetMapping("/Schedule")
    public String ScheduleOnline (Model model){
        return "Schedule";
    }
}
