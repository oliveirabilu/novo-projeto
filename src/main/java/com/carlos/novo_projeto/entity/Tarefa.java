package com.carlos.novo_projeto.entity;

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
}
