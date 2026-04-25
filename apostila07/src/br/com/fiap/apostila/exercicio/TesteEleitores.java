package br.com.fiap.apostila.exercicio;

import java.util.Scanner;

public class TesteEleitores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a idade do eleitor:");
            int idade = leitor.nextInt();
            if (idade < 16){
                System.out.println("Não eleitor.");
            } else if (idade >= 18 && idade <= 65) {
                System.out.println("Eleitor obrigatorio.");
                total++;
            } else {
                System.out.println("Eleitor facultativo");
            }
        }
        System.out.println("Total de eleitores obrigatorios: " + total);
    }
}
