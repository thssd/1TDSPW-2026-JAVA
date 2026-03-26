package br.com.fiap.loja.model;

public class Produto {

    public String nome;
    public double preco;
    public int codigo;
    public boolean disponivel;
    public Fornecedor fornecedor;

    public double calcularDesconto(){
        double desconto = preco * 0.2;
        return desconto;
    }
    public void aumentarPreco (double porcentagem){
        preco += preco * porcentagem / 100;

        //Criar um método para calcular o valor total da compra
        //Dado a quantidade. calcular o valor de compra
    }
}