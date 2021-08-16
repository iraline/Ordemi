package com.example.ordemi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {


    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", "[]ss");
        return "users";
    }
}