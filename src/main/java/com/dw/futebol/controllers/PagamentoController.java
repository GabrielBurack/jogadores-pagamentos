package com.dw.futebol.controllers;

import com.dw.futebol.models.Pagamento;
import com.dw.futebol.models.Jogador;
import com.dw.futebol.repositories.PagamentoRepository;
import com.dw.futebol.repositories.JogadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoRepository repo;
    private final JogadorRepository jogadorRepo;

    public PagamentoController(PagamentoRepository repo, JogadorRepository jogadorRepo) {
        this.repo = repo;
        this.jogadorRepo = jogadorRepo;
    }

    @GetMapping
    public List<Pagamento> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Pagamento criar(@RequestBody Pagamento pagamento) {
        // Buscar o jogador pelo ID
        Jogador jogador = jogadorRepo.findById(pagamento.getJogador().getCodJogador())
            .orElseThrow(() -> new RuntimeException("Jogador não encontrado"));

        // Associar o jogador ao pagamento
        pagamento.setJogador(jogador);

        // Salvar o pagamento
        return repo.save(pagamento);
    }
}