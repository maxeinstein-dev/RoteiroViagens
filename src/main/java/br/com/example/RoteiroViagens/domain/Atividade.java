package br.com.example.RoteiroViagens.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;

import java.time.LocalDate;
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoAtividade")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Voo.class, name = "VOO"),
        @JsonSubTypes.Type(value = ExperienciaGastronomica.class, name = "GASTRONOMIA")
})
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
abstract class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate data;
    private double custoEuros;

    public Atividade(String nome, LocalDate data, double custoEuros) {
        this.nome = nome;
        this.data = data;
        this.custoEuros = custoEuros;
    }

    public Atividade() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getCustoEuros() {
        return custoEuros;
    }

    public void setCustoEuros(double custoEuros) {
        this.custoEuros = custoEuros;
    }


    public double calcularCustoFinal(){
        return getCustoEuros();
    }
}