// package com.example.demo.config;

// import org.springframework.stereotype.Component;

// @Component
// public class JwtTokenProvider {

//     public String generateToken(String username) {
//         return "dummy-token";
//     }

//     public boolean validateToken(String token) {
//         return true;
//     }
// }


package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String generateToken(String username) {
        return "dummy-token";
    }

    public boolean validateToken(String token) {
        return true;
    }
}
