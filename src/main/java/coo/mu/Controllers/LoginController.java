package coo.mu.Controllers;

import coo.mu.Models.Usuario;
import coo.mu.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        String response = authService.login(usuario);
        return ResponseEntity.ok(response);
    }


    @PostMapping("/register")
    public String Register(@RequestParam Usuario usuario){
        return null;
    }
}
