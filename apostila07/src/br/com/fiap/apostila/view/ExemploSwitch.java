package br.com.fiap.apostila.view;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero 1");
        int num1 = leitor.nextInt();

        System.out.println("Digite o numero 2");
        int num2 = leitor.nextInt();

        System.out.println("Qual operação?");
        String operacao = leitor.next();

        switch (operacao){
            case "adição":
                int adicao = num1 + num2;
                System.out.println("Resultado da adição: " + adicao);
                break;
            case "subtração":
                int subtracao = num1 - num2;
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case "multiplicação":
                int multiplicacao = num1 * num2;
                System.out.println("Resultado da multiplicação: " + multiplicacao);
                break;
            case "divisão":
                double divisao = (double) num1 / num2;
                if (num1 == 0 || num2 == 0){
                    System.out.println("Não é possível dividir por zero.");
                    break;
                } else {
                    System.out.println("Resultado da divisão: " + divisao);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
