package com.example.ordemi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("users", "[]ss");
        return "login";
    }
    
    @GetMapping("/menuCliente")
    public String menuCliente(Model model) {
        model.addAttribute("users", "[]ss");
        return "menuCliente";
    }

    @GetMapping("/menuAdm")
    public String menuAdm(Model model) {
        model.addAttribute("users", "[]ss");
        return "menuAdm";
    }

    @GetMapping("/detalhesCliente")
    public String editarDados(Model model) {
        model.addAttribute("users", "[]ss");
        return "detalhesCliente";
    }

    @GetMapping("/cadastrarCliente")
    public String cadastrarCliente(Model model) {
        model.addAttribute("users", "[]ss");
        return "cadastrarCliente";
    }

    @GetMapping("/verAlunos")
    public String verAlunos(Model model) {
        model.addAttribute("users", "[]ss");
        return "verAlunos";
    }
}