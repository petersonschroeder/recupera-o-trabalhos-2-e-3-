package com.seuprojeto.service;

import com.seuprojeto.dto.*;
import org.springframework.stereotype.Service;

@Service
public class Banco2ServiceImpl implements TransacaoService {

    @Override
    public void registrarTransacao(RequisicaoComBancoDTO dto) {
        if (dto.getValor() != null && dto.getValor() > 1000) {
            throw new IllegalArgumentException("Transações acima de R$1000 não são aceitas");
        }
    }

    @Override
    public void limparTransacoes(RequisicaoComBancoDTO dto) {}

    @Override
    public void excluirPorPeriodo(PeriodoRequestDTO dto) {
        if (!"BD2-456".equals(dto.getSenha())) {
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
