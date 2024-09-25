package com.proveedores.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="usuario")
public class Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long id_user;
	@NotNull
	private String name;
	@Column(unique=true)
	@NotNull
	@Email
	private String email;
	@NotNull
	private String password;
	
	public String getCorreo() {
		return email;
	}
	public void setCorreo(String correo) {
		this.email = correo;
	}	
	
	
	@Override
	public String toString() {
		return "Usuarios [id_user=" + id_user + ", name=" + name + ", password=" + password + "]";
	}
	public Long getid_user() {
		return id_user;
	}
	public void setid_user(Long id_user) {
		this.id_user = id_user;
	}
	public String getNombre() {
		return name;
	}
	public void setNombre(String nombre) {
		this.name = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String clave) {
		this.password = clave;
	}
		
}
