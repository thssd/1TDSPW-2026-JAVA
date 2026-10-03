package br.com.fiap.api.model;

import java.sql.Date;

public class TipoImovel {

    private int codigo;
    private String nome;
    private java.sql.Date dataCadastro;

    public TipoImovel(String nome, java.sql.Date dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public TipoImovel(int codigo, String nome, java.sql.Date dataCadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public TipoImovel() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
