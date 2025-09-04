package com.example.importacoes.controller;

import com.example.importacoes.model.Importacao;
import com.example.importacoes.service.ImportacaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/importacoes")
public class ImportacaoController {

    private final ImportacaoService service;

    public ImportacaoController(ImportacaoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("importacoes", service.listarTodas());
        model.addAttribute("novaImportacao", new Importacao());
        return "importacoes";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Importacao importacao) {
        importacao.setDataImportacao(LocalDate.now());
        if (importacao.getStatus() == null) {
            importacao.setStatus(Importacao.StatusImportacao.PENDENTE);
        }
        service.salvar(importacao);
        return "redirect:/importacoes";
    }

    @GetMapping("/atualizar/{id}/{status}")
    public String atualizarStatus(@PathVariable Long id, @PathVariable Importacao.StatusImportacao status) {
        service.buscarPorId(id).ifPresent(importacao -> {
            importacao.setStatus(status);
            service.salvar(importacao);
        });
        return "redirect:/importacoes";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/importacoes";
    }
}
