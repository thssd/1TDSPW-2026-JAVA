package br.com.fiap.view;

import br.com.fiap.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Pikachu", "Eletrico", 3);
        Pokemon pokemon2 = new Pokemon("Charmander", "Fogo", 6);
        Pokemon pokemon3 = new Pokemon("Charizard", "Fogo", 20);

        List<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(pokemon1);
        pokedex.add(pokemon2);
        pokedex.add(pokemon3);

        System.out.println("Quantidade de Pokemon: " + pokedex.size());

        for (int i = 0; i < pokedex.size(); i++) {
            System.out.println(pokedex.get(i));
        }


    }

}
