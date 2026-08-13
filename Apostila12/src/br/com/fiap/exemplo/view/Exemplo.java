package br.com.fiap.exemplo.view;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Idade: " + idade);
        } catch (InputMismatchException ex) {
            System.out.println("número inválido");
        } catch (ArithmeticException ex) {
            System.out.println("operação inválida");
        }

    }
}
