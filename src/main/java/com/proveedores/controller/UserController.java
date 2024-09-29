package com.proveedores.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proveedores.models.Usuarios;
import com.proveedores.repositories.UserRepository;
import com.proveedores.services.IUsuarioService;

import jakarta.servlet.http.HttpSession;



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
		return "usuarios/listar";
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
		
		System.out.println("Usuario guardado");
		
		return "redirect:/usuarios/";
	}
	
	@GetMapping("/edit/{id_user}")
	public String editarUser(@PathVariable("id_user") Long id_user, Model model){
		
		Usuarios usuario = usuarioServicio.buscarPorId(id_user);
		
		List<Usuarios> listadoUsers = usuarioServicio.listarTodos();
		
		System.out.println("Lista de usuarios: " + listadoUsers);
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo","Formulario: Editar usuario");
		
		model.addAttribute("usuarios", listadoUsers);
		
		
		return "/usuarios/formCrearUser";
	}
	@GetMapping("/delete/{id_user}")
	public String eliminarUser(@PathVariable("id_user") Long id_user){
		
		usuarioServicio.eliminar(id_user);		
		
		return "redirect:/usuarios/";
	}
	
	@GetMapping("/cerrar")
	public String cerrarSesion(HttpSession session){
		session.removeAttribute("id_user");		
		return "redirect:/login";
	}
	
	

}
