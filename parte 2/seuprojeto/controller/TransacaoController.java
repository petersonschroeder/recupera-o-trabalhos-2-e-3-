package com.seuprojeto.controller;

import com.seuprojeto.dto.*;
import com.seuprojeto.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private final Banco1ServiceImpl banco1Service;
    private final Banco2ServiceImpl banco2Service;
    private final Banco3ServiceImpl banco3Service;

    public TransacaoController(Banco1ServiceImpl b1, Banco2ServiceImpl b2, Banco3ServiceImpl b3) {
        this.banco1Service = b1;
        this.banco2Service = b2;
        this.banco3Service = b3;
    }

    private TransacaoService getService(String banco) {
        switch (banco.toLowerCase()) {
            case "banco1": return banco1Service;
            case "banco2": return banco2Service;
            case "banco3": return banco3Service;
            default: throw new IllegalArgumentException("Banco inválido");
        }
    }

    @PostMapping
    public void registrar(@RequestBody RequisicaoComBancoDTO dto) {
        if (dto.getNome() == null || dto.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (!dto.getCpf().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        getService(dto.getBanco()).registrarTransacao(dto);
    }
}
