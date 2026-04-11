package br.com.pratica.um;

public class Terminal {
    public static void main(String[] args) {
        Cor cor = new Cor();
        Aviao aviao = new Aviao();

        cor.alterarCor(255, 100, 0, "Crimson");

        aviao.setModelo("Boeing 767");
        aviao.setQtdTurbinas(4);
        aviao.setQtdLugares(300);
        aviao.setAnoFabricacao(2010);
        aviao.setCor(cor);

        System.out.println("Modelo: " + aviao.getModelo());
        System.out.println("Quantidade de turbinas: " + aviao.getQtdTurbinas());
        System.out.println("Quantidade de lugares: " + aviao.getQtdLugares());
        System.out.println("Ano de fabricação: " + aviao.getAnoFabricacao());
        System.out.println("Cor: " + cor.getNome());

    }
}
