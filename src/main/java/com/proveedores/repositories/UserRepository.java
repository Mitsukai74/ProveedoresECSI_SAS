package com.proveedores.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proveedores.models.Usuarios;

@Repository
public interface UserRepository extends CrudRepository<Usuarios,Long> {
	Usuarios findByEmail(String email);
	

}
	