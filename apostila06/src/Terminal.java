import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine() + leitor.nextLine();

        System.out.println("Digite o numero de seua matricula: ");
        long matricula = leitor.nextLong();

        System.out.println("Digite sua profissão: ");
        String nomeProfissao = leitor.nextLine() + leitor.nextLine();

        System.out.println("Digite seu salario: ");
        double salario = leitor.nextDouble();

        Profissao profissao = new Profissao("Encanador");
        Funcionario funcionario = new Funcionario("Roger", 3829, profissao,8923);


        System.out.println(funcionario.exibirDados());
    }
}
