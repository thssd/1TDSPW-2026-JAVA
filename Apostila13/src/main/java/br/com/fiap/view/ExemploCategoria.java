package br.com.fiap.view;

import br.com.fiap.dao.CategoriaDao;
import br.com.fiap.model.Categoria;

import java.util.Scanner;

public class ExemploCategoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o nome da categoria");
            String nome = scanner.next();

            CategoriaDao dao = new CategoriaDao();
            Categoria categoria = new Categoria(nome);
            dao.cadastrar(categoria);

            System.out.println("Categoria cadastrada! " + categoria);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
