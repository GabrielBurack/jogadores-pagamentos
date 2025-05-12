package com.dw.futebol.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codJogador;

    private String nome;
    private String email;
    private LocalDate datanasc;

    @OneToMany(mappedBy = "jogador", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Pagamento> pagamentos;

    // Getters e Setters
    public Integer getCodJogador() { return codJogador; }
    public void setCodJogador(Integer codJogador) { this.codJogador = codJogador; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDatanasc() { return datanasc; }
    public void setDatanasc(LocalDate datanasc) { this.datanasc = datanasc; }

    public List<Pagamento> getPagamentos() { return pagamentos; }
    public void setPagamentos(List<Pagamento> pagamentos) { this.pagamentos = pagamentos; }
}
