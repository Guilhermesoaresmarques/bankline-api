package com.guilherme.dio.santander.bankline.api.repository;

import com.guilherme.dio.santander.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
