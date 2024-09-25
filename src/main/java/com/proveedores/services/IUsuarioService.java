package com.proveedores.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.proveedores.models.Usuarios;

public interface IUsuarioService {
	
	public List<Usuarios> listarTodos();
	public void guardar(Usuarios usuario);
	public Usuarios buscarPorId(Long id_user);
	public void eliminar(Long id_user);
	UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException;

}
