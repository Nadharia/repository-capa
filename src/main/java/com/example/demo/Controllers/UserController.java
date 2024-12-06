package com.example.demo.Controllers;

import com.example.demo.Models.Usuario;
import com.example.demo.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/obtener-contraseña/{id}")
    public String obtenerPasswordUser(@PathVariable Long id){
        return usuarioService.obtenerPasswordUser(id);
    }

    @PostMapping("/obtener-Usuario/{id}")
    public String obtenerUser(@PathVariable Long id){
        return usuarioService.obtenerUserAtributo(id);
    }

    @PostMapping("/obtener-usuarios")
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.findAllUsers();
    }
}
