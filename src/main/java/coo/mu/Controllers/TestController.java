package coo.mu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import coo.mu.jwt.JwtUtil;


@RestController
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	private JwtUtil jwtUtil;
	
	
	@GetMapping("/token")
	public String generateToken(@RequestParam String username) {
		return jwtUtil.generateToken(username);
	}
	
	
	
	
}
