package coo.mu.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import coo.mu.Models.Usuario;
import coo.mu.Services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UserController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/obtener-password/{id}")
    public String obtenerPasswordUser(@PathVariable Long id){
        return usuarioService.obtenerPasswordUser(id);
    }

    @PostMapping("/obtener-usuario/{id}")
    public String obtenerUser(@PathVariable Long id){
        return usuarioService.obtenerUserAtributo(id);
    }

    @PostMapping("/obtener-usuarios")
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.findAllUsers();
    }
}
