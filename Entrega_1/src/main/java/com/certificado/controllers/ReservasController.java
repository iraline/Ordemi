package com.certificado.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.certificado.beans.Reservas;
import com.certificado.beans.Usuario;
import com.certificado.dao.ReservasDAO;
 

@Controller
public class ReservasController {

	@Autowired 
    ReservasDAO daoReservas;//will inject dao from xml file  
    
	@RequestMapping(value = "/reservaAula/{id}", method = RequestMethod.GET)
	public String criaReserva(HttpSession session, @PathVariable int id) {
		Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
    	
		daoReservas.save(usuarioLog.getId(),id);
		return "redirect:/listaReserva";
	}
    
    @RequestMapping("/listaReserva")  
    public String listaReserva(HttpSession session, Model m){
    	System.out.println("entrou no reserva aula");
    	Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
    	
        List<Reservas> list= daoReservas.getReservasByAluno(usuarioLog.getId());  
        m.addAttribute("list",list);
        System.out.println("entrou no reserva aula");
        return "listaReserva";  
    }
    
    @RequestMapping("/cancelaReserva") 
    public String cancelaAula(HttpSession session){  
    	
    	Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
    	System.out.println("entrou no reserva aula");
    	return "verAulas.jsp"; 
    }  
    
    @RequestMapping(value = "/deleteReserva/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
    	System.out.println("Entrou no DELETE reserva");
		daoReservas.delete(id);
		return "redirect:/listaReserva";
	}
}
