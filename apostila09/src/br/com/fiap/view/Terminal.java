package br.com.fiap.view;

import br.com.fiap.model.Aluno;

import java.util.Scanner;

public class Terminal {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("CADASTRO DO ALUNO ");

        System.out.print("Digite o nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Digite o CPF: ");
        aluno.setCpf(scanner.nextLine());

        System.out.print("Digite a idade: ");
        aluno.setIdade(scanner.nextInt());

        System.out.print("Digite o RM: ");
        aluno.setRm(scanner.nextInt());

        System.out.print("Digite a turma: ");
        aluno.setTurma(scanner.nextLine());

        System.out.println("\n DADOS DO ALUNO ");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Turma: " + aluno.getTurma());

    }
}
