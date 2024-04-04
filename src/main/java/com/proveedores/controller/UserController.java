package com.proveedores.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proveedores.models.Usuarios;
import com.proveedores.services.IUsuarioService;



@Controller
@RequestMapping("usuarios/listar")
public class UserController {
	
	private IUsuarioService usuarioServicio;
	
	@GetMapping("/")
	public String listarUsuarios(Model model){
		List<Usuarios> listadoUsers = usuarioServicio.listarTodos();
		
		model.addAttribute("titulo", "Lista de clientes");
		model.addAttribute("usuarios", listadoUsers);
		return "usuarios/listar";
	}
	

}
