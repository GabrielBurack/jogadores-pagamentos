package com.dw.futebol.repositories;

import com.dw.futebol.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {}