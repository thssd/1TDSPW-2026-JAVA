package br.com.fiap.loja.model;

public class Produto {

    public String nome;
    public double preco;
    public int codigo;
    public boolean disponivel;
    public Fornecedor fornecedor;

    public double calcularDesconto() {
        double desconto = preco * 0.2;
        return desconto;
    }

    public double aumentarPreco(double porcentagem) {
        preco += preco * porcentagem / 100;

    public double calcularValorTotal(int qtd) {
        return preco * qtd;
    }
}