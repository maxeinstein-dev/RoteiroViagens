package br.com.example.RoteiroViagens.service;

import br.com.example.RoteiroViagens.domain.Viagem;
import br.com.example.RoteiroViagens.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemService {

    private final ViagemRepository viagemRepository;

    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public Viagem criarViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    public List<Viagem> listarTodas() {
        return viagemRepository.findAll();
    }
}