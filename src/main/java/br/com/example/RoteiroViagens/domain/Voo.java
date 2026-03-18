package br.com.example.RoteiroViagens.domain;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Voo extends Atividade{

    private String numeroVoo;
    private boolean incluiBagagem;

    public Voo(){}

    public Voo(String nome, LocalDate data, double custoEuros, String numeroVoo, boolean incluiBagagem) {
        super(nome, data, custoEuros);
        this.numeroVoo = numeroVoo;
        this.incluiBagagem = incluiBagagem;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public boolean isIncluiBagagem() {
        return incluiBagagem;
    }

    public void setIncluiBagagem(boolean incluiBagagem) {
        this.incluiBagagem = incluiBagagem;
    }


}