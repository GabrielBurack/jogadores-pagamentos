package com.dw.futebol.controllers;

import com.dw.futebol.models.Jogador;
import com.dw.futebol.repositories.JogadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorRepository repo;

    public JogadorController(JogadorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Jogador> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Jogador criar(@RequestBody Jogador jogador) {
        return repo.save(jogador);
    }
}