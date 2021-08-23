package com.certificado.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.certificado.dao.AulaDAO;
import com.certificado.beans.*;


@Controller
public class AulaController {

    @Autowired  
    AulaDAO daoAula;//will inject dao from xml file  
    
 
    @RequestMapping("/criarAula") 
    public String criarAula(HttpSession session){  
    	return "criarAula"; 
    }  
    
    @RequestMapping(value="/deletaAula/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        daoAula.delete(id);  
        return "redirect:/perfil";  
    } 
    
    @RequestMapping("/verAulas") 
    public String verAula(Model m,HttpSession session){  
    	List<Aula> list= daoAula.getTodasAulas();  
        m.addAttribute("list",list); 
    	return "verAulas"; 
    }  
    
    /*
    // Mostra formulario para a insercao de dados
    //@RequestMapping("/empform")  
    @RequestMapping("/codigoform") 
    public String showform(Model m){  
    	m.addAttribute("command", new CodigoPromocional());
    	return "codigoform"; 
    }  
    
    // Salva o objeto na base de dados  
    @RequestMapping(value="/savecodigo",method = RequestMethod.POST)  
    public String save(@ModelAttribute("codigo") CodigoPromocional codigo){  
        dao.save(codigo);  
        return "redirect:/viewcodigo";//Assim que salva, vai para a listagem de codigos
    }  
    
    //Mostra uma lista com todos os codigos 
    @RequestMapping("/viewcodigo")  
    public String viewemp(Model m){  
        List<CodigoPromocional> list=dao.getCodigo();  
        m.addAttribute("list",list);
        return "viewcodigo";  
    }
    
    //Edita um codigo. PathVariable coloca a URL
    @RequestMapping(value="/editcodigo/{id}")  
    public String edit(@PathVariable int id, Model m){  
        CodigoPromocional codigo = dao.getCodigoById(id);  
        m.addAttribute("command",codigo);
        return "codigoeditform";  
    }  
    
    //Atualiza um codigo
    @RequestMapping(value="/editsavecodigo",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("codigo") CodigoPromocional codigo){  
        dao.update(codigo);  
        return "redirect:/viewcodigo";  
    }  
    
    //Deleta o id que foi informado na URL
    @RequestMapping(value="/deletecodigo/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        dao.delete(id);  
        return "redirect:/viewcodigo";  
    }   
    */
	
}
