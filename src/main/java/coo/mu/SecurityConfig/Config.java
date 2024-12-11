package coo.mu.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.authentication.logout.LogoutHandler;

@Configuration
public class Config {
	
	@Bean
    public LogoutHandler logoutHandler() {

        return (request, response, authentication) -> {
        	System.out.println("logout");
        };
    }
}
