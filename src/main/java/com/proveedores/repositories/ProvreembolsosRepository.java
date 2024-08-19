package com.proveedores.repositories;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.proveedores.models.ProvReembolsos;

@Repository
public interface ProvreembolsosRepository extends CrudRepository<ProvReembolsos, Integer> {
	Page<ProvReembolsos> findByRazonContaining(String razon, Pageable pageable);	

}
