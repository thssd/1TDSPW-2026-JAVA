package br.com.fiap.model;

public class Aluno extends Pessoa{

    private int rm;
    private String turma;

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
