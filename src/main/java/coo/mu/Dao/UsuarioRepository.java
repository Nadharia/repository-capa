package coo.mu.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coo.mu.Models.Usuario;

import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	Optional<Usuario> findByUser(String user);
}
