package com.proveedores.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proveedores.models.ProvReembolsos;

@Repository
public interface ProvreembolsosRepository extends CrudRepository<ProvReembolsos, Integer> {

}
