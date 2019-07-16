package br.com.mosdev.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mosdev.tarefas.models.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
	Usuario findByEmail(String email);
}
