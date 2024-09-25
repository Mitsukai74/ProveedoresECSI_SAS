package com.proveedores.models;



import com.proveedores.enums.Roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rol_id;
	
	@Enumerated(EnumType.STRING)
    @NotNull
    @Column(unique = true)
    private Roles rolNombre;
	
	public Long getRol_id() {
		return rol_id;
	}

	public void setRol_id(Long rol_id) {
		this.rol_id = rol_id;
	}

	public Roles getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(Roles rolNombre) {
		this.rolNombre = rolNombre;
	}	
	
	public Rol() {
    }
	
	public Rol(@NotNull Roles rolNombre) {
        this.rolNombre = rolNombre;
    }		
	

}
