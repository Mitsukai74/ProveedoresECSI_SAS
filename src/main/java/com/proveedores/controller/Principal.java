package com.proveedores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
	
	@GetMapping("")
	String index() {
		
		return "index";
	}

}
