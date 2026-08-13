package br.com.fiap.exemplo.model;

public class Produto {

    private String nome;
    private double preco;

    public double calcularDesconto(double desconto) {
        if (desconto > preco) {
            throw new RuntimeException("desconto não pode ser maior que preço");
        }

        return preco - desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
