package com.seuprojeto.service;

import com.seuprojeto.dto.*;
import org.springframework.stereotype.Service;

@Service
public class Banco3ServiceImpl implements TransacaoService {

    @Override
    public void registrarTransacao(RequisicaoComBancoDTO dto) {}

    @Override
    public void limparTransacoes(RequisicaoComBancoDTO dto) {}

    @Override
    public void excluirPorPeriodo(PeriodoRequestDTO dto) {
        if (!"BD3-789".equals(dto.getSenha())) {
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
