package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {

    private final String secretKey;
    private final long expirationMillis;

    public JwtTokenProvider(
            @Value("${jwt.secret}") String secretKey,
            @Value("${jwt.expiration}") long expirationMillis) {
        this.secretKey = secretKey;
        this.expirationMillis = expirationMillis;
    }

    /**
     * Generate JWT token with customerId, email, role
     */
    public String generateToken(Long customerId, String email, String role) {

        return Jwts.builder()
                .setSubject(email)
                .claim("customerId", customerId)
                .claim("email", email)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationMillis))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    /**
     * Validate token and return claims
     */
    public Claims validateToken(String token)
            throws JwtException, ExpiredJwtException {

        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * Extract email from token
     */
    public String getEmailFromToken(String token) {
        return validateToken(token).get("email", String.class);
    }

    /**
     * Extract customerId from token
     */
    public Long getCustomerIdFromToken(String token) {
        return validateToken(token).get("customerId", Long.class);
    }

    /**
     * Extract role from token
     */
    public String getRoleFromToken(String token) {
        return validateToken(token).get("role", String.class);
    }
}
