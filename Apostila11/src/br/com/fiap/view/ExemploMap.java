package br.com.fiap.view;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        Map<Double, String> produto = new HashMap<>();

        produto.put(39.99, "Camiseta");
        produto.put(299.90, "Tênis");
        produto.put(100.00, "Calça");

        System.out.println("Quantidade: " + produto.size());

        System.out.println(produto);

    }

}
