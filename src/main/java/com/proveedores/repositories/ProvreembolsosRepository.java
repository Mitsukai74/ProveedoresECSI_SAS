package com.proveedores.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proveedores.models.ProvReembolsos;

@Repository
public interface ProvreembolsosRepository extends CrudRepository<ProvReembolsos, Integer> {
	
	//para realizar el query para buscar por razón social
	@Transactional(readOnly = true)
	Optional<ProvReembolsos> findByRazon(String razon);

}
