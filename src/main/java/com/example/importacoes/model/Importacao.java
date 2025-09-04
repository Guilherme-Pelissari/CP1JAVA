package com.example.importacoes.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Importacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String produto;
    private String paisOrigem;
    private LocalDate dataImportacao;

    @Enumerated(EnumType.STRING)
    private StatusImportacao status;

    public enum StatusImportacao {
        PENDENTE,
        EM_ANDAMENTO,
        CONCLUIDA,
        CANCELADA
    }

    // Construtores
    public Importacao() {}

    public Importacao(String produto, String paisOrigem, LocalDate dataImportacao, StatusImportacao status) {
        this.produto = produto;
        this.paisOrigem = paisOrigem;
        this.dataImportacao = dataImportacao;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getProduto() { return produto; }
    public void setProduto(String produto) { this.produto = produto; }
    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String paisOrigem) { this.paisOrigem = paisOrigem; }
    public LocalDate getDataImportacao() { return dataImportacao; }
    public void setDataImportacao(LocalDate dataImportacao) { this.dataImportacao = dataImportacao; }
    public StatusImportacao getStatus() { return status; }
    public void setStatus(StatusImportacao status) { this.status = status; }
}

