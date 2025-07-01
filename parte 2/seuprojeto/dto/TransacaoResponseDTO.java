package com.seuprojeto.dto;

import java.time.LocalDateTime;

public class TransacaoResponseDTO {
    private Double valor;
    private String nome;
    private String cpf;
    private LocalDateTime data;

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
}
