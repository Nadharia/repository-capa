package com.example.demo.Services;

import com.example.demo.Dao.UsuarioRepository;
import com.example.demo.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService{


    @Autowired
    private UsuarioRepository userRepository;
    @Override
    public String obtenerPasswordUser(Long id) {
        Optional<Usuario> usuario = userRepository.findById(id);
        return usuario.map(Usuario::getPassword).orElse("Usuario no encontrado");
    }

    @Override
    public String obtenerUserAtributo(Long id) {
        Optional<Usuario> usuario = userRepository.findById(id);
        return usuario.map(Usuario::getUser).orElse("Usuario no encontrado");
    }


    @Override
    public List<Usuario> findAllUsers() {
        return userRepository.findAll();
    }




}
