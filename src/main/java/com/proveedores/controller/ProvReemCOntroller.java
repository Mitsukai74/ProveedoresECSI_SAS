package com.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proveedores.models.ProvReembolsos;
import com.proveedores.services.IProvreembolsosService;
import com.proveedores.services.IUsuarioService;

@Controller
@RequestMapping("/provReembolsos")
public class ProvReemCOntroller {
	
	@Autowired
	private IProvreembolsosService iprovreembolsoService;
	
	@GetMapping("/")
	public String listarprovReembolsos(Model model) {
		List<ProvReembolsos> listadoprovReem = iprovreembolsoService.listarTodosProvReem();
		
		model.addAttribute("titulo", "Lista de proveedores de reembolsos");
		model.addAttribute("provreemb", listadoprovReem);
		
		return "/provReembolsos/listarProvReembolsos";
	}

}
