package com.seuprojeto.dto;

import java.time.LocalDate;

public class PeriodoRequestDTO {
    private String banco;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String senha;

    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
