package com.proveedores.controller;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proveedores.models.ProvReembolsos;

@Controller
public class Principal {
	
	@GetMapping("")
	String index() {
		
		return "index";
	}
	
	@GetMapping("login")
	String login() {
		return "login";
	}
	/*@GetMapping("busquedas")
	String busqueda() {
		return"busquedas";
	}*/	
	

}
