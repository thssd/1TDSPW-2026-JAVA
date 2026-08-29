package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.model.Produto;

import java.sql.SQLException;
import java.util.Scanner;

public class ExemploCadastro {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o nome: ");
        String nome = scanner.next() + scanner.nextLine();

        System.out.println("Digite a descrição: ");
        String descricao = scanner.next() + scanner.nextLine();

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.println("Em estoque? (true/false)");
        boolean emEstoque = scanner.nextBoolean();

        Produto produto = new Produto(codigo, nome, descricao, valor, emEstoque);

        ProdutoDao produtoDao = new ProdutoDao();

        produtoDao.cadastrar(produto);
    }
}
