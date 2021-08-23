package com.example.ordemi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EventoController {


    @GetMapping("/reservarAula")
    public String reservarAula(Model model) {
        model.addAttribute("users", "[]ss");
        return "reservarAula";
    }

    @GetMapping("/cadastrarAula")
    public String cadastrarAulla(Model model) {
        model.addAttribute("users", "[]ss");
        return "cadastrarAula";
    }

    @GetMapping("/reservasCliente")
    public String reservasCliente(Model model) {
        model.addAttribute("users", "[]ss");
        return "reservasCliente";
    }
}