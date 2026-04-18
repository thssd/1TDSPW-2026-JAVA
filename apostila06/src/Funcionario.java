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

    public String exibirDados(){
        return "nome: " + nome + " | matricula: " + matricula + " | profissão: " + profissao.getNome() + " | salario: " + salario;
    }
}
