package com.example.gestaodeendereco;

public class Endereco {


    private String identificacao;
    private String principal;
    private String complemento;
    private String numero;
    private String logradouro;
    private String ddiFixo;
    private String dddFixo;
    private String foneFixo;
    private String bairro;
    private String cidade;
    private String uf;
    private String codigoPostal;

    public Endereco() {
    }

    public Endereco(String identidicacao, String logradouro, String numero){
        this.identificacao = identidicacao;
        this.logradouro = logradouro;
        this.numero = numero;

    }


    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
