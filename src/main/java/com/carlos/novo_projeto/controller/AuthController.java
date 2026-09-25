package com.carlos.novo_projeto.controller;

import com.carlos.novo_projeto.dto.LoginRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthenticationManager authenticationManager;
    public AuthController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest request){
        var authenticationToken = new UsernamePasswordAuthenticationToken(
                request.login(),
                request.senha());
        authenticationManager.authenticate(authenticationToken);
    }
}
