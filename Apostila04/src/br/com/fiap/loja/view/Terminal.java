package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

//Responsável por iteragir com o usuário
public class Terminal {
    static void main() {
        Scanner leitor = new Scanner (System.in);
        //Ler as informaçãoes do produto (sem fornecedor por enquanto)
        System.out.println("Digite o nome do produto");
        String nome = leitor.nextLine();

        System.out.println("Digite o preço do produto");
        double preco = leitor.nextDouble();

        System.out.println("Digite o código do produto");
        int codigo = leitor.nextInt();

        System.out.println("O produto está disponivel (true/false");
        boolean disponivel = leitor.nextBoolean();

        System.out.println("FORNECEDOR");
        System.out.println("Digite o nome do fornecedor");
        String nomeDoFornecedor = leitor.nextLine();

        System.out.println("Digite o CNPJ do fornecedor");
        String cnpj = leitor.next();

        //Instanciar a classe produto
        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();

        //Colocar as informações no objeto produto
        produto.nome = nome;
        produto.preco = preco;
        produto.codigo = codigo;
        produto.disponivel = disponivel;

        //Exibir as informações do objeto produto
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Codigo do produto: " + codigo);
        System.out.println("Produto está disponível: " + disponivel);
        System.out.println("FORNECEDOR");
        System.out.println("Nome: " + nomeDoFornecedor);
        System.out.println("CNPJ " + cnpj);

    }
}
