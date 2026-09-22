package com.carlos.novo_projeto.controller;

import com.carlos.novo_projeto.dto.UsuarioRequest;
import com.carlos.novo_projeto.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public void criarUsuario(@RequestBody UsuarioRequest request) {
        usuarioService.criarUsuario(request);
    }
}
