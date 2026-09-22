package com.carlos.novo_projeto.service;

import com.carlos.novo_projeto.dto.UsuarioRequest;
import com.carlos.novo_projeto.entity.Usuario;
import com.carlos.novo_projeto.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void criarUsuario(UsuarioRequest request) {
        var usuario = new Usuario(request.login(),
                passwordEncoder.encode(request.senha()));
                usuarioRepository.save(usuario);
    }
}
