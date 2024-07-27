package com.proveedores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proveedores.models.ProvReembolsos;
import com.proveedores.models.Usuarios;
import com.proveedores.repositories.ProvreembolsosRepository;

@Service
public class ProvReembServiceImple implements IProvreembolsosService {
	@Autowired
	private ProvreembolsosRepository provreemRepository;

	@Override
	public List<ProvReembolsos> listarTodosProvReem() {
		
		return (List<ProvReembolsos>) provreemRepository.findAll();
	}

	@Override
	public void guardar(ProvReembolsos provReem) {
		provreemRepository.save(provReem);
	}

	@Override
	public ProvReembolsos buscarPorId(Integer id_provreem) {
		
		return provreemRepository.findById(id_provreem).orElse(null);
	}
	
	

}
