package br.com.pratica.tres;

public class Terminal {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.setAndarAtual(0);
        elevador.setTotalPessoas(4);
        elevador.inicializa();

        elevador.entra(4);
        elevador.sobe();
        elevador.sobe();
        elevador.inicializa();

        elevador.sai(3);
        elevador.entra(5);
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.inicializa();
    }
}
