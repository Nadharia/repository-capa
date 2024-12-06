package com.example.demo.Services;

import com.example.demo.Dao.UsuarioRepository;
import com.example.demo.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UsuarioServiceImp implements UsuarioService{


    @Autowired
    private UsuarioRepository userRepository;
    @Override
    public String obtenerPasswordUser(Long id) {
        Optional<Usuario> usuario = userRepository.findById(id);
        return usuario.map(Usuario::getPassword).orElse("Usuario no encontrado");
    }
}
