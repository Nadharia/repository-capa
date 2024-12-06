package coo.mu.Services;

import coo.mu.Dao.UsuarioRepository;
import coo.mu.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImp implements AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public String login(Usuario usuario) {
        Optional<Usuario> busquedaUsuario = usuarioRepository.findByUser(usuario.getUser());

        if (busquedaUsuario.isPresent()) {
            Usuario usuarioEncontrado = busquedaUsuario.get();

            if (usuarioEncontrado.getPassword().equals(usuario.getPassword())) {
                return "Inicio Exitoso";
            } else {
                return "Contraseña incorrecta";
            }
        }
        return "Usuario no encontrado";
    }

}
