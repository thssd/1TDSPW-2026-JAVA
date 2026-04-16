package br.com.fiap.transportadora.model;

public class Produto {

    private int id;
    private String nome;
    private boolean fragil;
    private double peso;
    private float volume;

    public Produto(int id, String nome, boolean fragil, double peso, float volume){
        this.id = id;
        this.nome = nome;
        this.fragil = fragil;
        this.peso = peso;
        this.volume = volume;
    }

    public Produto(String nome, double peso, int id){
        this.nome = nome;
        this.peso = peso;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

}