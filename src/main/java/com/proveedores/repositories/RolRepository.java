package com.proveedores.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proveedores.enums.Roles;
import com.proveedores.models.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long>{
	boolean existsByRolNombre(Roles rolNombre);
    Optional<Rol> findByRolNombre(Roles rolNombre);
}
