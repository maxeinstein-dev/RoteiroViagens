package br.com.example.RoteiroViagens.controller;

import br.com.example.RoteiroViagens.domain.Viagem;
import br.com.example.RoteiroViagens.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viagens")
public class ViagemController {


    private final ViagemService viagemService;

    public ViagemController(ViagemService viagemService) {
        this.viagemService = viagemService;
    }

    @GetMapping("/roteiro")
    public List<Viagem> obterRoteiro(){
        return viagemService.listarTodas();
    }

    @PostMapping
    public Viagem criarNovaViagem(@RequestBody Viagem novaViagem){
        return viagemService.criarViagem(novaViagem);
    }

}