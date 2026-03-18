package br.com.example.RoteiroViagens.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;
    private double orcamentoTotal;
    private ArrayList<Atividade> atividades = new ArrayList<>();

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

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
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