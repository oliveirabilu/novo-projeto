package com.carlos.novo_projeto.repository;

import com.carlos.novo_projeto.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
