package br.com.example.RoteiroViagens.repository;

import br.com.example.RoteiroViagens.domain.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {
}