package com.certificado.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  

import com.certificado.beans.Reservas;
import com.certificado.beans.Usuario;
import com.certificado.dao.ReservasDAO;
 

@Controller
public class ReservasControler {

	@Autowired 
    ReservasDAO daoReservas;//will inject dao from xml file  
    
    @RequestMapping("/reservaAula") 
    public String reservaAula(HttpSession session){  
    	Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
  
    	return "reservaAula"; 
    }  
    
    @RequestMapping("/listaReserva")  
    public String listaReserva(HttpSession session, Model m){
    	Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
    	
        List<Reservas> list= daoReservas.getReservasByAluno(usuarioLog.getId());  
        m.addAttribute("list",list);
        return "listaReserva";  
    }
    
}
