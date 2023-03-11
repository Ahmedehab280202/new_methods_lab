package org.example.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LabController {
    @RequestMapping("/form")
    public String lab() {
        return "lab.html";
    }

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
