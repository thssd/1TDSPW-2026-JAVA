package br.com.fiap.apostila.exercicio;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a altura da primeira pessoa:");
        double altura1 = leitor.nextDouble();
        System.out.println("Digite o peso da primeira pessoa:");
        double peso1 = leitor.nextDouble();

        System.out.println("Digite a altura da segunda pessoa:");
        double altura2 = leitor.nextDouble();
        System.out.println("Digite o peso da segunda pessoa:");
        double peso2 = leitor.nextDouble();

        if (altura1 > altura2){
            System.out.println("Primeira pessoa é mais alta.");
        } else if (altura2 > altura1){
            System.out.println("Segunda pessoa é mais alta.");
        } else {
            System.out.println("As pessoas possuem a mesma altura.");
        }

        if (peso1 > peso2){
            System.out.println("Primeira pessoa é mais pesada.");
        } else if (peso2 > peso1){
            System.out.println("Segunda pessoa é mais pesada.");
        } else {
            System.out.println("'As pessoas possuem o mesmo peso.");
        }
    }
}
