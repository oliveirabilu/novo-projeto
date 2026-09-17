package com.carlos.novo_projeto.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> tratarErroValidacao(MethodArgumentNotValidException ex){
        var erros = ex.getBindingResult().getFieldErrors();

        var errosTratados = new HashMap<String, String>();

        for (var erro : erros) {
            errosTratados.put(erro.getField(), erro.getDefaultMessage());
        }
        return ResponseEntity.badRequest().body(errosTratados);
    }
}
