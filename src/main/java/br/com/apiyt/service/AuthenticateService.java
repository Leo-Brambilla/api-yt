package br.com.apiyt.service;

public interface AuthenticateService {
    String generateToken(String user, String password);
    boolean validateToken(String token);

}
