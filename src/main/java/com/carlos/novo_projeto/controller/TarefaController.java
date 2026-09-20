package com.carlos.novo_projeto.controller;

import com.carlos.novo_projeto.dto.TarefaRequest;
import com.carlos.novo_projeto.dto.TarefaResponse;
import com.carlos.novo_projeto.dto.TarefaUpdateRequest;
import com.carlos.novo_projeto.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<TarefaResponse> listarTodas(){
        return tarefaService.listarTodas();

    }
    @GetMapping("/{id}")
    public TarefaResponse buscarPorId(@PathVariable Long id){
        return tarefaService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public void atualizarTarefa(@PathVariable Long id, @RequestBody TarefaUpdateRequest request ){
        tarefaService.atualizarTarefa(id, request);
    }
 }
