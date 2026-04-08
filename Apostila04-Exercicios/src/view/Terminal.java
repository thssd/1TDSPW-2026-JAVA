package view;

import br.com.fiap.exercicio01.model.Aluno;

import java.util.Scanner;

public class Terminal {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        //Ler os dados do aluno
        System.out.println("Digite seu nome");
        aluno.nome = leitor.nextLine();

        System.out.println("Digite a nota da cp1");
        aluno.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp2");
        aluno.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do primeiro Challenge");
        aluno.sprint1 = leitor.nextDouble();

        System.out.println("Digite a nota do segundo Challenge");
        aluno.sprint2 = leitor.nextDouble();

        System.out.println("Digite da Global Solution");
        aluno.gs = leitor.nextDouble();

        //Calcular a media
        double media = aluno.calcularMedia();

        //Exibir a média
        System.out.printf("A média do aluno " + aluno.nome + " foi: %.2f", media);
    }
}
