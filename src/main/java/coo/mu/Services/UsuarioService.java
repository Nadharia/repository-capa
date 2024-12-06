package coo.mu.Services;

import java.util.List;

import coo.mu.Models.Usuario;

public interface UsuarioService {
    String obtenerPasswordUser(Long id);
    String obtenerUserAtributo(Long id);
    List<Usuario> findAllUsers();
}
