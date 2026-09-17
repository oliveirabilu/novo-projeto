package com.carlos.novo_projeto.dto;

import com.carlos.novo_projeto.entity.Status;
import jakarta.validation.constraints.NotBlank;

public record TarefaRequest(
        @NotBlank
        String titulo,
        @NotBlank
        String descricao,
        Status status){
}
