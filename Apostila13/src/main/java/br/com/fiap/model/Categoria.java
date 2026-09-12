package br.com.fiap.model;

public class Categoria {

    private int codigo;
    private String nome;

    public Categoria(int id, String nome) {
        this.codigo = id;
        this.nome = nome;
    }

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Categoria " + codigo + "{" +
                " | nome=" + nome +
                '}';
    }
}