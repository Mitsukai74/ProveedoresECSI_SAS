package com.proveedores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proveedores.models.Usuarios;
import com.proveedores.repositories.UserRepository;
import com.proveedores.services.IUsuarioService;

@Controller
public class Principal {
	
	@Autowired
	private IUsuarioService usuarioServicio;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/login")
	public String loginForm() {		
		return "/login1";
	}	
	
	/*
	 * @PostMapping(path = "/usuarios/formCrearUser") public String
	 * signUp(@ModelAttribute("user") Usuarios user,
	 * 
	 * @RequestParam(name = "passwordRepeat") String passwordRepeat) { if
	 * (userRepository.findByEmail(user.getCorreo()) != null) { return
	 * "redirect:signup?duplicate_email"; } if
	 * (!user.getPassword().equals(passwordRepeat)) { return
	 * "redirect:signup?passwords"; } usuarioServicio.guardar(user); return
	 * "/redirect:login?registered"; }
	 */

}
