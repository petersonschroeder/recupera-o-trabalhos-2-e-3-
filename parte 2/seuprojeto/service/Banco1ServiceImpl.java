package com.seuprojeto.service;

import com.seuprojeto.dto.*;
import org.springframework.stereotype.Service;

@Service
public class Banco1ServiceImpl implements TransacaoService {

    @Override
    public void registrarTransacao(RequisicaoComBancoDTO dto) {
        if (dto.getValor() < 5.0) {
            throw new IllegalArgumentException("Transação abaixo de R$5 não permitida");
        }
    }

    @Override
    public void limparTransacoes(RequisicaoComBancoDTO dto) {
        // Lógica para limpar transações com mais de 3 anos
    }

    @Override
    public void excluirPorPeriodo(PeriodoRequestDTO dto) {
        if (!"BD1-123".equals(dto.getSenha())) {
            throw new IllegalArgumentException("Senha inválida");
        }
    }

    @Override
    public EstatisticaResponseDTO estatisticasRecentes(RequisicaoComBancoDTO dto) {
        return new EstatisticaResponseDTO();
    }

    @Override
    public EstatisticaResponseDTO estatisticasPorPeriodo(PeriodoRequestDTO dto) {
        return new EstatisticaResponseDTO();
    }

    @Override
    public TransacaoResponseDTO consultarUltima(RequisicaoComBancoDTO dto) {
        return new TransacaoResponseDTO();
    }
}
