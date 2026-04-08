package view;

import br.com.fiap.exercicio01.model.Aluno;

import java.util.Scanner;

public class Terminal {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        //Ler os dados do aluno1
        System.out.println("Digite seu nome");
        aluno1.nome = leitor.nextLine();

        System.out.println("Digite a nota da cp1");
        aluno1.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp2");
        aluno1.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do primeiro Challenge");
        aluno1.sprint1 = leitor.nextDouble();

        System.out.println("Digite a nota do segundo Challenge");
        aluno1.sprint2 = leitor.nextDouble();

        System.out.println("Digite da Global Solution");
        aluno1.gs = leitor.nextDouble();

        //Calcular a media
        double media = aluno1.calcularMedia();

        //Exibir a média
        System.out.printf("A média do aluno1 " + aluno1.nome + " foi: %.2f", media);
    }
}
