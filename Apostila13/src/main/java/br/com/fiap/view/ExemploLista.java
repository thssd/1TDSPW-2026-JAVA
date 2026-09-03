package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.model.Produto;

import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {

        try {
            ProdutoDao produtoDao = new ProdutoDao();
            List<Produto> lista = produtoDao.listar();

            for (Produto p : lista) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
