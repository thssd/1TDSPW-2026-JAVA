package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

//Responsável por iteragir com o usuário
public class Terminal {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);
        //Ler as informaçãoes do produto (sem fornecedor por enquanto)
        System.out.println("Digite o nome do produto");
        String nome = leitor.nextLine();

        System.out.println("Digite o preço do produto");
        double preco = leitor.nextDouble();

        System.out.println("Digite o código do produto");
        int codigo = leitor.nextInt();

        System.out.println("O produto está disponivel (true/false)");
        boolean disponivel = leitor.nextBoolean();

        System.out.println("FORNECEDOR");
        System.out.println("Digite o nome do fornecedor");
        String nomeDoFornecedor = leitor.next();

        System.out.println("Digite o CNPJ do fornecedor");
        String cnpj = leitor.next();

        //Instanciar a classe produto
        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();

        produto.fornecedor = fornecedor;


        //Colocar as informações no objeto produto
        produto.nome = nome;
        produto.preco = preco;
        produto.codigo = codigo;
        produto.disponivel = disponivel;
        fornecedor.nomeDoFornecedor = nomeDoFornecedor;
        fornecedor.cnpj = cnpj;


        //Exibir as informações do objeto produto
        System.out.println("\nPRODUTO");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Codigo: " + produto.codigo);
        System.out.println("Disponibilidade: " + produto.disponivel);
        System.out.println("FORNECEDOR");
        System.out.println("Nome: " + fornecedor.nomeDoFornecedor);
        System.out.println("CNPJ " + fornecedor.cnpj);

        double promocao = produto.calcularDesconto();
        System.out.println("Desconto " + promocao);

        System.out.println("Qual a porcentagem de aumento?");
        double porcentagem = leitor.nextDouble();

        produto.aumentarPreco(porcentagem);

        System.out.println("Novo preço: " + produto.preco);
        System.out.println("Quantos itens deseja comprar?");
        int qtd = leitor.nextInt();

        double valorTotal = produto.calcularValorTotal(qtd);
        System.out.println("O valor total foi: " + valorTotal);
    }
}
