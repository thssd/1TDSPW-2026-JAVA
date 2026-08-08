package br.com.fiap.view;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {

        Set<Integer> sorteio = new HashSet<>();

        sorteio.add(54);
        sorteio.add(23);
        sorteio.add(12);

        System.out.println("Quantidade: " + sorteio.size());

        System.out.println("Números: " + sorteio);

    }

}
