package com.guilherme.dio.santander.bankline.api.controllers;

import com.guilherme.dio.santander.bankline.api.dto.CorrentistaDto;
import com.guilherme.dio.santander.bankline.api.model.Correntista;
import com.guilherme.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.guilherme.dio.santander.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody  CorrentistaDto correntista) {
        service.save(correntista);
    }

}
