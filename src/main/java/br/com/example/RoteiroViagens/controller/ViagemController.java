package br.com.example.RoteiroViagens.controller;

import br.com.example.RoteiroViagens.domain.Viagem;
import br.com.example.RoteiroViagens.dto.ViagemRequestDTO;
import br.com.example.RoteiroViagens.service.ViagemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/viagens")
public class ViagemController {


    private final ViagemService viagemService;

    public ViagemController(ViagemService viagemService) {
        this.viagemService = viagemService;
    }

    @GetMapping("/roteiros")
    public List<Viagem> obterRoteiro(){
        return viagemService.listarTodas();
    }

    @PostMapping
    public Viagem criarNovaViagem(@Valid @RequestBody ViagemRequestDTO novaViagem){
        return viagemService.criarViagem(novaViagem);
    }

    @GetMapping("{id}")
    public ResponseEntity<Viagem> obterRoteiroPorId(@PathVariable Long id){
        Optional<Viagem> viagemPesquisada = viagemService.listarPorId(id);
        return viagemPesquisada.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

}