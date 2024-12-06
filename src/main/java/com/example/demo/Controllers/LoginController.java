package com.example.demo.Controllers;

import com.example.demo.Models.Usuario;
import com.example.demo.Services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String Login(@RequestParam Usuario usuario){
        return authService.login(usuario);
    }

    @PostMapping("/register")
    public String Register(@RequestParam Usuario usuario){
        return null;
    }
}
