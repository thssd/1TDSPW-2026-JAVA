package br.com.pratica.dois;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public int validaDia(int dia){
        if (dia > 31){
            return 1;
        } else if (dia < 1){
            return 1;
        } else {
            return dia;
        }
    }

    public int validaMes(int mes){
        if (mes > 12){
            return 1;
        } else if (mes < 1) {
            return 1;
        } else {
            return mes;
        }
    }

    public int validaAno(int ano){
        if (ano < 1){
            return 2023;
        } else {
            return ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String nomeMes(){
        if (mes == 1){
            return "Janeiro";
        }
        if (mes == 2) {
            return "Fevereiro";
        } if (mes == 3) {
            return "Março";
        } if (mes == 4) {
            return "Abril";
        } if (mes == 5) {
            return "Maio";
        } if (mes == 6) {
            return "Junho";
        } if (mes == 7) {
            return "Julho";
        } if (mes == 8) {
            return "Agosto";
        } if (mes == 9) {
            return "Setembro";
        } if (mes == 10) {
            return "Outubro";
        } if (mes == 11) {
            return "Novembro";
        } else {
            return "Dezembro";
        }
    }

    public String retornaData(){
        return validaDia(dia) + "/" + nomeMes() + "/" + validaAno(ano);
    }

}
