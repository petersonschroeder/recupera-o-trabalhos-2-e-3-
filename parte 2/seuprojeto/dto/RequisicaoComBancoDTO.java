package com.seuprojeto.dto;

public class RequisicaoComBancoDTO {
    private String banco;
    private String nome;
    private String cpf;
    private Double valor;

    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
}
