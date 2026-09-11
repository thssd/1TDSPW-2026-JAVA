package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.model.Produto;

import java.sql.SQLException;
import java.util.Scanner;

public class ExemploCadastro {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o nome");
            String nome = scanner.next() + scanner.nextLine();

            System.out.println("Digite a descrição");
            String descricao = scanner.next() + scanner.nextLine();

            System.out.println("Digite o valor");
            double valor = scanner.nextDouble();

            System.out.println("Digite se tem estoque (true/false)");
            boolean estoque = scanner.nextBoolean();

            //Instanciar um Produto com os dados
            Produto produto = new Produto(nome, descricao, valor, estoque);

            //Instanciar um ProdutoDao
            ProdutoDao dao = new ProdutoDao();

            //Chamar o método de cadastro
            dao.cadastrar(produto);
            System.out.println("Produto cadastrado!");
            System.out.println(produto);

        } catch(Exception e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
