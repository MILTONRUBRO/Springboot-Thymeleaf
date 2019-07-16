package br.com.mosdev.tarefas.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.mosdev.tarefas.models.Usuario;
import br.com.mosdev.tarefas.repository.RepositoryUsuario;

@Service
public class ServicoUsuario {
	
	@Autowired
	private RepositoryUsuario repositoryUsuario;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Usuario encontrarPorEmail(String email) {
		return repositoryUsuario.findByEmail(email);
	}
	
	public void salvar(Usuario usuario) {
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		repositoryUsuario.save(usuario);
	}
}
