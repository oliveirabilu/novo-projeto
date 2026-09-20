package com.carlos.novo_projeto.dto;

import com.carlos.novo_projeto.entity.Status;

public record TarefaUpdateRequest(
        String titulo,
        String descricao,
        Status status
) {
}
