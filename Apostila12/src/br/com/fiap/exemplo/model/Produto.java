package br.com.fiap.exemplo.model;

import br.com.fiap.exemplo.exception.CupomInvalidoException;
import br.com.fiap.exemplo.exception.DecontoInvalidoException;
import br.com.fiap.exemplo.exception.PorcentagemNegativaException;

public class Produto {

    private String nome;
    private double preco;

    public double calcularDesconto(double desconto) {
        if (desconto > preco) {
            throw new DecontoInvalidoException("desconto não pode ser maior que preço");
        }

        return preco - desconto;
    }

    public double darDesconto(String cupom) throws CupomInvalidoException {
        if (cupom.isBlank() || cupom.length() < 5) {
            throw new CupomInvalidoException("cupom vazio");
        }

        return preco / 0.2;
    }

    double aumentarPreco(int porcentagem) throws PorcentagemNegativaException {
        if (porcentagem < 0) {
            throw new PorcentagemNegativaException("porcentagem nao pode ser negativa");
        }

        return preco * porcentagem;
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
