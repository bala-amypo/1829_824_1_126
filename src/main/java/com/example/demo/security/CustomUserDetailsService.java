package com.example.demo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // Dummy user for exam / testing
        if (!"admin".equals(username)) {
            throw new UsernameNotFoundException("User not found");
        }

        return User.builder()
                .username("admin")
                .password("{noop}admin123")
                .roles("ADMIN")
                .build();
    }
}
