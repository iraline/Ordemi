package com.example.ordemi.controller;

import com.example.ordemi.model.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {

    @Autowired
    private Facade facade;

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", "[]ss");
        return "users";
    }
}