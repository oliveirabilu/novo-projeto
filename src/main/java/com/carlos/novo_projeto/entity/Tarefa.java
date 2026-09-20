package com.carlos.novo_projeto.entity;

import com.carlos.novo_projeto.dto.TarefaUpdateRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Tarefa(String titulo, String descricao, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public void atualizarTarefa(TarefaUpdateRequest request) {
        if (request.titulo() != null) {
            this.titulo = request.titulo();
        }
        if (request.descricao() != null) {
            this.descricao = request.descricao();
        }
        if (request.status() != null) {
            this.status = request.status();
        }
    }
}