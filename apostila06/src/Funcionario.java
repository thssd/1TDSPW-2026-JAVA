public class Funcionario {

    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    public Funcionario(String nome, long matricula, Profissao profissao, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.profissao = profissao;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Número de matricula: " + matricula);
        System.out.println("Profissão: " + profissao);
        System.out.println("Salario: " + salario);
    }
}
