package com.certificado.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  

import com.certificado.beans.TemplateAula;
import com.certificado.dao.TemplateAulaDAO;

@Controller
public class TemplateAulaController {

    @Autowired  
    TemplateAulaDAO daoTemplateAula;//will inject dao from xml file  
    
   
    @RequestMapping("/templateAula") 
    public String codigoPromocional(HttpSession session){  
    	return "codigoPromocional"; 
    }  
 	
}
