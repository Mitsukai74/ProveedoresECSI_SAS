package com.proveedores.services;

import java.util.List;

import org.hibernate.query.Page;

import com.proveedores.models.ProvReembolsos;

public interface IProvreembolsosService {
	
	public List<ProvReembolsos> listarTodosProvReem();
	public void guardar(ProvReembolsos provReem);
	public ProvReembolsos buscarPorId(Integer id_provreem);
	

}
