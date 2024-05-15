package com.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proveedores.models.ProvReembolsos;
import com.proveedores.services.IProvreembolsosService;

@Controller
@RequestMapping("/provReembolsos")
public class ProvReemCOntroller {
	
	@Autowired
	private IProvreembolsosService iprovreembolsoService;
	
	@GetMapping("/")
	public String listarprovReembolsos(Model model) {
		List<ProvReembolsos> listadoprovReem = iprovreembolsoService.listarTodosProvReem();
		
		model.addAttribute("titulo", "Lista de proveedores (No es listado definitivo)");
		model.addAttribute("provreemb", listadoprovReem);
		
		return "/provReembolsos/listarProvReembolsos";
	}
	@GetMapping("/create")
	public String crearProv(Model model){
		
		ProvReembolsos proveedor = new ProvReembolsos();
		
		model.addAttribute("titulo","Formulario de creación de proveedor");
		model.addAttribute("proveedor",proveedor);
				
		return "/provReembolsos/CrearProv";
	}
	@PostMapping("/save")
	public String guardar(@ModelAttribute ProvReembolsos provedor){
		
		iprovreembolsoService.guardar(provedor);		
		
		return "redirect:/listarProvreembolsos/";
	}

}
