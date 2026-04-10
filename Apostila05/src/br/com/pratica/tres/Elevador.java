package br.com.pratica.tres;

public class Elevador {

    private int terreo = 0;
    private int andares = 15;
    private int andarAtual;
    private int totalPessoas;
    private int capacidadeMaxima = 13;

    public void inicializa(){
        System.out.println("\nTotal de pessoas no elevador: " + totalPessoas);
        System.out.println("Total de andares do prédio: " + andares);
        System.out.println("Capacidade máxima: " + capacidadeMaxima);
        System.out.println("Andar atual: " + andarAtual);
    }

    public int entra(int entrada){
        return totalPessoas += entrada;
    }

    public int sai(int saida){
        return totalPessoas -= saida;
    }

    public int sobe(){
        return andarAtual++;
    }

    public int desce(){
        return andarAtual--;
    }

    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public void setTotalPessoas(int totalPessoas) {
        this.totalPessoas = totalPessoas;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

}
