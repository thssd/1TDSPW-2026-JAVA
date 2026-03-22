public class ExemploCarro {

    public static void main(String[] args) {
        //Criar um objeto do tipo Carro
        Carro gol = new Carro();

        //Colocar valores nos atributos do objeto
        gol.cor = "Prata";
        gol.velocidadeMaxima = 120;
        gol.ano = 2003;
        gol.automatico = false; //true (verdadeiro), false (falso)
        gol.peso = 600;
        gol.modelo = "Gol Special Bola";
        gol.altura = 1.5f; //f no final para definir que o valor é float

        //Exibir os valores dos atributos do objeto
        System.out.println("Modelo: " + gol.modelo); //sout
        System.out.println("Ano: " + gol.ano);
        System.out.println("Cor: " + gol.cor);
        System.out.println("Peso: " + gol.peso);
        System.out.println("Altura: " + gol.altura);
        System.out.println("Automático: " + gol.automatico);
        System.out.println("Velocidade Máxima: " + gol.velocidadeMaxima);

        System.out.println("-----------------------------------------");

        //Criar um novo objeto do tipo carro
        Carro tera = new Carro();
        //Colocar valores para 2 atributos e exibir esses valores
        tera.modelo = "Tera Confortline 1.0 TSI";
        tera.ano = 2026;

        System.out.println("Modelo: " + tera.modelo + ", ano: " + tera.ano);

    }
}
