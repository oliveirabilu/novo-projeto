package com.carlos.novo_projeto.controller;

import com.carlos.novo_projeto.dto.TarefaRequest;
import com.carlos.novo_projeto.dto.TarefaResponse;
import com.carlos.novo_projeto.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }
    @PostMapping
    public TarefaResponse cadastrar(@RequestBody @Valid TarefaRequest tarefaRequest){
        return tarefaService.cadastrar(tarefaRequest);
    }
}
