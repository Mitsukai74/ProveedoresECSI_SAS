package com.proveedores.services;

import java.util.List;

import com.proveedores.models.ProvReembolsos;
import com.proveedores.models.Usuarios;

public interface IProvreembolsosService {
	
	public List<ProvReembolsos> listarTodosProvReem();
	public void guardar(ProvReembolsos provReem);
	public ProvReembolsos buscarPorId(Integer id_provreem);

}
