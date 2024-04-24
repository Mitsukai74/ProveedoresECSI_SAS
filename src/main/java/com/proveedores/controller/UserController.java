package com.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proveedores.models.Usuarios;
import com.proveedores.services.IUsuarioService;



@Controller
@RequestMapping("/usuarios")
public class UserController {
	
	@Autowired
	private IUsuarioService usuarioServicio;
	
	@GetMapping("/")
	public String listarUsuarios(Model model){
		List<Usuarios> listadoUsers = usuarioServicio.listarTodos();
		
		model.addAttribute("titulo", "Lista de usuarios");
		model.addAttribute("usuarios", listadoUsers);
		return "/usuarios/listar";
	}
	
	@GetMapping("/create")
	public String crearUser(Model model){
		
		Usuarios usuario = new Usuarios();
		
		model.addAttribute("titulo","Formulario: Nuevo usuario");
		model.addAttribute("usuario",usuario);
		
		
		return "/usuarios/formCrearUser";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Usuarios usuario){
		
		usuarioServicio.guardar(usuario);		
		System.out.println("Cliente guardado");
		
		return "redirect:/usuarios/";
	}
	

}
