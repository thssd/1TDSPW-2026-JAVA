package br.com.fiap.exemplo.view;

import br.com.fiap.exemplo.exception.CupomInvalidoException;
import br.com.fiap.exemplo.model.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) throws CupomInvalidoException {
        Produto produto = new Produto("churros", 19.90);

        Scanner scanner = new Scanner(System.in);

//        try {
//            System.out.println("Qual será o desconto? ");
//            double desconto = scanner.nextDouble();
//
//            double valorFinal = produto.calcularDesconto(desconto);
//
//            System.out.println("Valor com desconto: " + valorFinal);
//        } catch (InputMismatchException ex) {
//            System.err.println("o desconto deve ser um número");
//        } catch (RuntimeException ex) {
//            System.err.println(ex.getMessage());
//        } finally {
//            scanner.close();
//        }

        System.out.println("digite o cupom");
        String cupom = scanner.next();

        produto.darDesconto(cupom);
    }
}
