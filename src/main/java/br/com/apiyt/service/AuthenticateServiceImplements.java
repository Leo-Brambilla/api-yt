package br.com.apiyt.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class AuthenticateServiceImplements  implements AuthenticateService{

    private static final String SECRET_KEY = "secret_key";

    @Override
    public String generateToken(String user, String password) {
        return Jwts.builder()
                .setSubject(user)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    @Override
    public boolean validateToken(String token) {
        try {
            Claims claims = Jwts
                    .parser()
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(token)
                    .getBody();
            return true;
        } catch (Exception e) {
                System.out.println("Token inválido!" + e.getMessage());
            return false;
        }

    }
}
