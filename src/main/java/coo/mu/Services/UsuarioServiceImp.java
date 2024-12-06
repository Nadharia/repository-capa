package coo.mu.Services;

import coo.mu.Dao.UsuarioRepository;
import coo.mu.Models.Usuario;

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
