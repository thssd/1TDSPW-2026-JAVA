package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

//Responsável por iteragir com o usuário
public class Terminal {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);
        //Ler as informaçãoes do produto e fornecedor

        System.out.println("PRODUTO");
        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o preço: R$");
        double preco = leitor.nextDouble();

        System.out.print("Digite o código: ");
        int codigo = leitor.nextInt();

        System.out.print("Está disponivel? (true/false) ");
        boolean disponivel = leitor.nextBoolean();

        System.out.println("\nFORNECEDOR");
        System.out.print("Digite o nome: ");
        String nomeDoFornecedor = leitor.next();

        System.out.print("Digite o CNPJ: ");
        String cnpj = leitor.next();

        //Instanciar as classes produto e fornecedor
        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();

        //Colocar as informações no objeto produto
        produto.nome = nome;
        produto.preco = preco;
        produto.codigo = codigo;
        produto.disponivel = disponivel;

        //Adicionar os valores no forncedor
        fornecedor.nomeDoFornecedor = nomeDoFornecedor;
        fornecedor.cnpj = cnpj;

        //Colocar o fornecedor no produto
        produto.fornecedor = fornecedor;

        //Exibir as informações do objeto produto e fornecedor
        System.out.println("\n************************************");
        System.out.println("\nPRODUTO");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$" + produto.preco);
        System.out.println("Codigo: " + produto.codigo);
        System.out.println("Disponibilidade: " + produto.disponivel);
        System.out.println("\nFORNECEDOR");
        System.out.println("Nome: " + fornecedor.nomeDoFornecedor);
        System.out.println("CNPJ: " + fornecedor.cnpj);

        System.out.println("\n************************************");
        double promocao = produto.calcularDesconto();
        System.out.println("\nDesconto " + promocao);

        System.out.print("Qual a porcentagem de aumento? ");
        double porcentagem = leitor.nextDouble();
        produto.aumentarPreco(porcentagem);

        //Ler a quantidade
        System.out.print("Quantos itens deseja comprar? ");
        int qtd = leitor.nextInt();

        double valorTotal = produto.calcularValorTotal(qtd);
        System.out.printf("PREÇO FINAL: R$%.2f", valorTotal);
    }
}
