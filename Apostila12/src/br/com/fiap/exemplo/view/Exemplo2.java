package br.com.fiap.exemplo.view;

import br.com.fiap.exemplo.model.Produto;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Produto produto = new Produto("churros", 19.90);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será o desconto? ");
        double desconto = scanner.nextDouble();

        double valorFinal = produto.calcularDesconto(desconto);

        System.out.println("Valor com desconto: " + valorFinal);
    }
}
