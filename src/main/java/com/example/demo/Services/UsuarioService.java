package com.example.demo.Services;

import com.example.demo.Models.Usuario;

import java.util.List;

public interface UsuarioService {
    String obtenerPasswordUser(Long id);
    String obtenerUserAtributo(Long id);
    List<Usuario> findAllUsers();
}
