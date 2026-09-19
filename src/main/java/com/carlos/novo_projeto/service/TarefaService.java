package com.carlos.novo_projeto.service;

import com.carlos.novo_projeto.dto.TarefaRequest;
import com.carlos.novo_projeto.dto.TarefaResponse;
import com.carlos.novo_projeto.entity.Tarefa;
import com.carlos.novo_projeto.exception.TarefaNaoEncontradaException;
import com.carlos.novo_projeto.exception.ValidationExceptionHandler;
import com.carlos.novo_projeto.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {

        this.tarefaRepository = tarefaRepository;
    }

    public TarefaResponse cadastrar(TarefaRequest tarefaRequest) {
        var tarefa = new Tarefa(tarefaRequest.titulo(), tarefaRequest.descricao(), tarefaRequest.status());
        tarefa.setDataCriacao(LocalDateTime.now());
        var tarefaSalva = tarefaRepository.save(tarefa);
        return new TarefaResponse(tarefaSalva);
    }
    public TarefaResponse buscarPorId(Long id) {
        var tarefa = tarefaRepository.findById(id)
                .orElseThrow(TarefaNaoEncontradaException::new);

        return new TarefaResponse(tarefa);
    }
}
