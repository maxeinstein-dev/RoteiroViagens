package br.com.example.RoteiroViagens.domain;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class ExperienciaGastronomica extends Atividade{

    private double taxaServico;

    public ExperienciaGastronomica(){}

    public ExperienciaGastronomica(String nome, LocalDate data, double custoEuros, double taxaServico) {
        super(nome, data, custoEuros);
        this.taxaServico = taxaServico;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularCustoFinal() {
        return getCustoEuros() + (getCustoEuros() * getTaxaServico());
    }
}