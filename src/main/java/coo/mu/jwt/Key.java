package coo.mu.jwt;

import java.security.Signature;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.SignatureAlgorithm;

public class Key {

	@Value("${jwt.secret}")
	private String secret;
	
	
	public Key getSigningKey() {
		return new SecretKeySpec(secret.getBytes(), SignatureAlgorithm.HS256.getJcaName());
				
		
	}
	
}
