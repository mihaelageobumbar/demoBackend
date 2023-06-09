package com.example.demo.service;

import com.example.demo.model.Token;
import com.example.demo.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {
    @Autowired
    private TokenRepository tokenRepository;

    public List<Token> findAllTokens() {
        return tokenRepository.findAll();
    }

    public Token findTokenById(Long id) {
        return tokenRepository.findById(id).orElse(null);
    }

    public Token saveToken(Token token) {
        return tokenRepository.save(token);
    }

    public void deleteTokenById(Long id) {
        tokenRepository.deleteById(id);
    }
}
