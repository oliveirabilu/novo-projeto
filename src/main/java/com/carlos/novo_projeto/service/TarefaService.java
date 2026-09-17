package com.carlos.novo_projeto.service;

import com.carlos.novo_projeto.dto.TarefaRequest;
import com.carlos.novo_projeto.dto.TarefaResponse;
import com.carlos.novo_projeto.entity.Tarefa;
import com.carlos.novo_projeto.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {

        this.tarefaRepository = tarefaRepository;
    }

    public TarefaResponse cadastrar(TarefaRequest tarefaRequest){
       var tarefa = new Tarefa(tarefaRequest.titulo(), tarefaRequest.descricao(), tarefaRequest.status());
       tarefa.setDataCriacao(LocalDateTime.now());
       var tarefaSalva=tarefaRepository.save(tarefa);
       return new TarefaResponse(tarefaSalva);
    }
}
