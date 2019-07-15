package com.projects.Sierra.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class homeController {

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Sierra McNeel-Moore MSOT/S");
        return "Home/home";
    }




}
