package coo.mu.Controllers;

import coo.mu.Models.Usuario;
import coo.mu.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/loginpost")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        String response = authService.login(usuario);
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/registerpost")
    public ResponseEntity<String> register(@RequestBody Usuario usuario){
    	String response=authService.register(usuario);
    	return ResponseEntity.ok(response);
    }

   
    @GetMapping("/login")
    public String LoginView() {
        return "login";
    }
    
    
    @GetMapping("/home")
    public String homePage() {
        return "home";  
    }
    
    @GetMapping("/register")
    public String register() {
    	return "register";
    }
}
