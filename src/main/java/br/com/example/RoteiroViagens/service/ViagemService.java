package br.com.example.RoteiroViagens.service;

import br.com.example.RoteiroViagens.domain.Viagem;
import br.com.example.RoteiroViagens.dto.ViagemRequestDTO;
import br.com.example.RoteiroViagens.repository.ViagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViagemService {

    private final ViagemRepository viagemRepository;

    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public Viagem criarViagem(ViagemRequestDTO viagemDTO) {
        Viagem viagem = new Viagem(viagemDTO.destino(), viagemDTO.orcamentoTotal());
        viagem.setAtividades(viagemDTO.atividades());
        return viagemRepository.save(viagem);
    }

    public List<Viagem> listarTodas() {
        return viagemRepository.findAll();
    }

    public Optional<Viagem> listarPorId(Long id) {
        return viagemRepository.findById(id);
    }
}