package com.example.importacoes.repository;

import com.example.importacoes.model.Importacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImportacaoRepository extends JpaRepository<Importacao, Long> {
}
