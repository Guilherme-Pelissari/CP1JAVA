package com.example.importacoes.service;

import com.example.importacoes.model.Importacao;
import com.example.importacoes.repository.ImportacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImportacaoService {

    private final ImportacaoRepository repository;

    public ImportacaoService(ImportacaoRepository repository) {
        this.repository = repository;
    }

    public List<Importacao> listarTodas() {
        return repository.findAll();
    }

    public void salvar(Importacao importacao) {
        repository.save(importacao);
    }

    public Optional<Importacao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
