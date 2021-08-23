package com.certificado.controllers;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.certificado.beans.Usuario;
import com.certificado.dao.UsuarioDAO;


@Controller
public class UsuarioController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	UsuarioDAO daoUser;// will inject dao from xml file
	
	// Cadastro de usuário
	@RequestMapping("/cadastro")
	public String showform(Model m) {
		m.addAttribute("command", new Usuario());
		return "cadastro";
	}

	// Perfil do usuário
	@RequestMapping({"/perfil", "/"})
	public String showform(HttpSession session, Model model) {
		
		Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
			
		return "perfil";
	}
	
	// Salva usuário cadastrado
	@RequestMapping(value = "/salvausuario", method = RequestMethod.POST)
	public String save(@ModelAttribute("usuario") Usuario usuario,HttpServletRequest request, Model model) {
		try {
		
			// Verifica se já existe um usuário com o email, cujo formato é válido
			Usuario temp = daoUser.getUsuarioByEmail(usuario.getEmail());
			return "perfil";

		} catch (EmptyResultDataAccessException e) {
			
			daoUser.save(usuario);
			return "redirect:/validaCadastro";
		}	
	}

	@RequestMapping(value = "/editarCadastro")
	public String edit(Model m, HttpSession session) {
		Usuario usuarioLog = (Usuario) session.getAttribute("usuarioLogado");
	
		Usuario usuario = daoUser.getUsuarioByid(usuarioLog.getId());
		
		m.addAttribute("command", usuario);
		return "editarInfo";
	}

	@RequestMapping("/login")
	public String login(Usuario usuario, HttpSession session, Model model) {
		
		// dao.checkLogin(request.getParameter("email"),request.getParameter("password"));
		boolean entrou = daoUser.checkLogin(usuario);
		
		
		
		if (entrou) {
		
			Usuario atual = daoUser.getUsuarioByEmail(usuario.getEmail());
			// Cookie cookie = new Cookie("id", usuario.getNumeroFiscal());
			// response.addCookie()
			
			session.setAttribute("usuarioLogado", atual);
			return "redirect:/perfil";
		} else {
			
			return "login";
		}
		
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}



}
