package com.proveedores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proveedores.models.Usuarios;
import com.proveedores.repositories.UserRepository;

@Service
public class UserServiceImple implements IUsuarioService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Usuarios> listarTodos() {
		
		return (List<Usuarios>) userRepository.findAll();
	}

	@Override
	public void guardar(Usuarios usuario) {
		userRepository.save(usuario);

	}

	@Override
	public Usuarios buscarPorId(Long id_user) {
		return userRepository.findById(id_user).orElse(null);
	}

	@Override
	public void eliminar(Long id_user) {
		userRepository.deleteById(id_user);

	}

}
