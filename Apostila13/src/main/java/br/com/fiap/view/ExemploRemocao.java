package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;

import java.util.Scanner;

public class ExemploRemocao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o código do produto que será removido");
            int codigo = scanner.nextInt();

            ProdutoDao produtoDao = new ProdutoDao();
            produtoDao.apagar(codigo);
            System.out.println("Produto removido!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
