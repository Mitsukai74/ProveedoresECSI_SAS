package com.proveedores.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proveedores.models.ProvReembolsos;
import com.proveedores.repositories.ProvreembolsosRepository;
import com.proveedores.services.IProvreembolsosService;

import jakarta.validation.Valid;

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
		
		model.addAttribute("titulo","Formulario de creación de proveedores");
		model.addAttribute("proveedor",proveedor);
				
		return "/provReembolsos/CrearProv";
	}
	@PostMapping("/save")
	public String guardar(@Valid @ModelAttribute ProvReembolsos proveedor,BindingResult resultado,Model modelo){
		if (resultado.hasErrors()) {
						
			modelo.addAttribute("titulo","Formulario de creación de proveedores");
			modelo.addAttribute("proveedor",proveedor);
					
			return "/provReembolsos/CrearProv";
		}
		
		iprovreembolsoService.guardar(proveedor);		
		
		return "redirect:/provReembolsos/";
	}
	@GetMapping("/edit/{id}")
	public String editarProv(@PathVariable("id") int idProveedores, Model model){
		
		ProvReembolsos proveedor = iprovreembolsoService.buscarPorId(idProveedores);
		
		model.addAttribute("titulo","Formulario de creación de proveedores");
		model.addAttribute("proveedor",proveedor);
				
		return "/provReembolsos/CrearProv";
	}
	//metodo en el repositorio de buscar por razón social
	@GetMapping("/buscar")
	public String buscarProveedores(Pageable pageable,Model model, @RequestParam(required = false)String busqueda) {
		
		Page<ProvReembolsos> proveedorPage = null;
		if (busqueda != null && busqueda.trim().length() > 0) {
			proveedorPage = iprovreembolsoService.buscarPorRs(busqueda, pageable);
		}else {
	        proveedorPage = Page.empty(); // Página vacía si no hay búsqueda
	    }		
		model.addAttribute("proveedorPage",proveedorPage);
				
		return "provReembolsos/busquedas";
	}
	
}
