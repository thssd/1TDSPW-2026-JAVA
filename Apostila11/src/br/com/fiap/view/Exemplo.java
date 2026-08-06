package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

    public static void main(String[] args) {
        String turma = "1TDSPW";

        List<String> alunos = new ArrayList<>();

        alunos.add("Thiago");
        alunos.add("Alexandre");
        alunos.add(1, "Julia");
        alunos.set(2, "Carlos");

        System.out.println(alunos.size());

        System.out.println("Fulano está na lista? " + alunos.contains("Fulano"));

        System.out.println("Lista vazia? " + alunos.isEmpty());

        System.out.println(alunos.get(2));

        System.out.println(alunos);

    }

}
