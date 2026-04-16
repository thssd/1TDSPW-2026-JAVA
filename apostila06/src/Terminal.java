public class Terminal {
    public static void main(String[] args) {
        Profissao profissao = new Profissao("Encanador");
        Funcionario funcionario = new Funcionario("Roger", 3829, new Profissao("Encanador"),8923);

        funcionario.exibirDados();
    }
}
