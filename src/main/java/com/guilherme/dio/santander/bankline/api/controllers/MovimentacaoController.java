package com.guilherme.dio.santander.bankline.api.controllers;

import com.guilherme.dio.santander.bankline.api.dto.MovimentacaoDto;
import com.guilherme.dio.santander.bankline.api.model.Movimentacao;
import com.guilherme.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.guilherme.dio.santander.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody MovimentacaoDto movimentacao) {
        service.save(movimentacao);
    }
}
