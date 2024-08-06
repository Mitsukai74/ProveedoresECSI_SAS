package com.proveedores.repositories;

import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.proveedores.models.ProvReembolsos;

@Repository
public interface ProvreembolsosRepository extends CrudRepository<ProvReembolsos, Integer> {
	
	

}
