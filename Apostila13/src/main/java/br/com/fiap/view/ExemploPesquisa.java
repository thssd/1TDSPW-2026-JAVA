package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.model.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploPesquisa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite o código do produto: ");
            int codigo = scanner.nextInt();

            ProdutoDao produtoDao = new ProdutoDao();

            Produto produto = produtoDao.buscar(codigo);
            System.out.println(produto);

        } catch (InputMismatchException ex) {
            System.err.println("Número inválido.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
