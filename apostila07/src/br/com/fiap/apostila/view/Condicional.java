package br.com.fiap.apostila.view;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        String nota1Str = leitor.next();
        double nota1 = Double.parseDouble(nota1Str);

        System.out.println("Digite a nota 2");
        String nota2Str = leitor.next();
        double nota2 = Double.parseDouble(nota2Str);

        double media = (nota1 + nota2) / 2;

        if (media >= 6){
            System.out.println("Aprovado");
        } else if (media >= 5){
            System.out.println("Recuperação.");
        }else {
            System.out.println("Reprovado");
        }
    }
}
