package com.carlos.novo_projeto.dto;

import com.carlos.novo_projeto.entity.Status;

import java.time.LocalDateTime;

public record TarefaRequest(
        String titulo,
        String descricao,
        Status status

) {
}
