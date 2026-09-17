package com.carlos.novo_projeto.dto;

import com.carlos.novo_projeto.entity.Status;
import com.carlos.novo_projeto.entity.Tarefa;

import java.time.LocalDateTime;

public record TarefaResponse(
        Long id,
        String titulo,
        String descricao,
        Status status,
        LocalDateTime dataCriacao
) {
    public TarefaResponse(Tarefa tarefa){
        this(tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.getDescricao(),
                tarefa.getStatus(),
                tarefa.getDataCriacao());
    }
}
