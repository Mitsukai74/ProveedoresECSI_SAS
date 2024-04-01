package com.proveedores.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuarios implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_user;
	private String nombre;
	private int clave;
	
	@Override
	public String toString() {
		return "Usuarios [Id_user=" + Id_user + ", nombre=" + nombre + ", clave=" + clave + "]";
	}
	public Long getId_user() {
		return Id_user;
	}
	public void setId_user(Long id_user) {
		Id_user = id_user;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	
}
