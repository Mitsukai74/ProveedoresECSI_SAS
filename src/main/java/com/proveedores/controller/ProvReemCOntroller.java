package com.proveedores.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proveedores.models.ProvReembolsos;
import com.proveedores.repositories.ProvreembolsosRepository;
import com.proveedores.services.IProvreembolsosService;

@Controller
@RequestMapping("/provReembolsos")
public class ProvReemCOntroller {
	
	@Autowired
	private IProvreembolsosService iprovreembolsoService;
	private Model attribute;
	
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
	public String guardar(@ModelAttribute ProvReembolsos proveedor){
		
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
	@GetMapping
	public String buscarProveedores(Pageable pageable,Model model, @RequestParam(required = false)String busqueda) {
		
		Page<ProvReembolsos> proveedorPage = (Page<ProvReembolsos>) iprovreembolsoService.buscarPorRs(pageable);
		model.addAttribute("proveedorPage",proveedorPage);
		
		return "busquedas";
	}
	
}
