package br.com.example.RoteiroViagens.controller;

import br.com.example.RoteiroViagens.domain.Viagem;
import br.com.example.RoteiroViagens.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/viagens")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @GetMapping("/roteiro")
    public List<Viagem> obterRoteiro(){
        return viagemService.listarTodas();
    }

}