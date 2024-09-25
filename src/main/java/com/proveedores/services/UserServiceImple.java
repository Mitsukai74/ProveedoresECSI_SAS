package com.proveedores.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.proveedores.models.Usuarios;
import com.proveedores.repositories.UserRepository;

@Service
public class UserServiceImple implements IUsuarioService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public List<Usuarios> listarTodos() {		
		return (List<Usuarios>) userRepository.findAll();
	}

	@Override
	public void guardar(Usuarios usuario) {
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
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

	@Override
	public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}	

}
