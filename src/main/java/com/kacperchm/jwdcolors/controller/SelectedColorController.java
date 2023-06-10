package com.kacperchm.jwdcolors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectedColorController {

    @GetMapping("/select")
    public String selectedColorPage() {
        return "select";
    }
}
