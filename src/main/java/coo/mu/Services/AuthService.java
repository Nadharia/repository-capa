package coo.mu.Services;



import coo.mu.Models.Usuario;

public interface AuthService {
	String login(Usuario usuario);

	String register(Usuario usuario);
}
