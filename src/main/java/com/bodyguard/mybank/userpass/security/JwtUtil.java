package com.bodyguard.mybank.userpass.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secretKey;

    public Optional<String> extractUsername(String token) {
        if(!isTokenExpired(token)){
            return Optional.of(extractAllClaims(token).getSubject());
        }
        return Optional.empty();
    }

    public List<GrantedAuthority> validateToken(String token) {
        if (!isTokenExpired(token)) {
            final Claims claims = extractAllClaims(token);
            String scopes = (String) claims.get("scopes");
            String[] scopeArray = scopes.split(",");
            List<GrantedAuthority> authorities = new ArrayList<>();
            for (String scope : scopeArray) {
                authorities.add(() -> scope.trim());
            }
            return authorities;
        }
        return new ArrayList<>();
    }

    Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
    }

    public Boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }
}

