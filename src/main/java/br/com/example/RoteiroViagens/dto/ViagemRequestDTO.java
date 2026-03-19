package br.com.example.RoteiroViagens.dto;

import br.com.example.RoteiroViagens.domain.Atividade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;

public record ViagemRequestDTO(@NotBlank String destino,
                               @PositiveOrZero double orcamentoTotal,
                               @Valid List<Atividade> atividades) {
}