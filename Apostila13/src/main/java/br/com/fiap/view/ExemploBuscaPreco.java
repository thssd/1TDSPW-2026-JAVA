package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.model.Produto;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExemploBuscaPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Ler o codigo do produto
            System.out.println("Digite o preço do produto");
            double preco = scanner.nextInt();
            //Instanciar o ProdutoDao
            ProdutoDao dao = new ProdutoDao();
            //Chamar o método de pesquisa por preco
            List<Produto> produto = dao.buscarPorPreco(preco);
            //Exibir os dados do produto
            for (Produto p : produto) {
                System.out.println(p);
            }
        } catch (InputMismatchException e) {
            System.err.println("Número inválido");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
