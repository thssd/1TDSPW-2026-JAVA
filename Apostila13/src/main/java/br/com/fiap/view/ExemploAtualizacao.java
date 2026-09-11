package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.model.Produto;

import java.util.Scanner;

public class ExemploAtualizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Ler os dados do produto
            System.out.println("Digite o código do produto");
            int codigo = scanner.nextInt();

            System.out.println("Digite o nome do produto");
            String nome = scanner.next() + scanner.nextLine();

            System.out.println("Digite a descrição do produto");
            String descricao = scanner.next() + scanner.nextLine();

            System.out.println("Digite o valor do produto");
            double valor = scanner.nextDouble();

            System.out.println("Digite se tem estoque (true/false)");
            boolean estoque = scanner.nextBoolean();
            //Instanciar o produto com os dados
            Produto produto = new Produto(codigo, nome, descricao, valor, estoque);
            //Instanciar o ProdutoDao
            ProdutoDao dao = new ProdutoDao();
            //Chamar o método do DAO para atualizar
            dao.atualizar(produto);
            System.out.println("Produto atualizado!");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
