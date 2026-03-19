package br.com.example.RoteiroViagens.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;
    private double orcamentoTotal;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "viagem_id")
    private List<Atividade> atividades = new ArrayList<>();

    public Viagem() {}

    public Viagem(String destino, double orcamentoTotal) {
        this.destino = destino;
        this.orcamentoTotal = orcamentoTotal;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getOrcamentoTotal() {
        return orcamentoTotal;
    }

    public void setOrcamentoTotal(double orcamentoTotal) {
        this.orcamentoTotal = orcamentoTotal;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public void adicionarAtividade(Atividade a) {
        this.atividades.add(a);
    }

    public double calcularCustoAtual() {
        double soma = 0.0;
        for (Atividade a : atividades) {
            soma += a.calcularCustoFinal();
        }
        return soma;
    }
}