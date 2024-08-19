package com.proveedores.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proveedores.models.ProvReembolsos;

public interface IProvreembolsosService {
	
	public List<ProvReembolsos> listarTodosProvReem();
	public void guardar(ProvReembolsos provReem);
	public ProvReembolsos buscarPorId(Integer id_provreem);
	public Page<ProvReembolsos> buscarPorRs(String razon, Pageable pageable);	

}
