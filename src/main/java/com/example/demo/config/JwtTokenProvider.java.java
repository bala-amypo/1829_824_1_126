package com.example.demo.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String createToken(String username) {
        return "dummy-jwt-token-for-" + username;
    }

    public String resolveToken(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer ")) {
            return header.substring(7);
        }
        return null;
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("dummy-jwt-token");
    }

    public String getUsername(String token) {
        return "admin";
    }
}
