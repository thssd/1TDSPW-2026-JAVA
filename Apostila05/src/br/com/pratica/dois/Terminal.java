package br.com.pratica.dois;

public class Terminal {
    public static void main(String[] args) {
        Data data = new Data();

        data.setDia(14);
        data.setMes(8);
        data.setAno(2007);

        data.validaDia(data.getDia());
        data.validaMes(data.getMes());
        data.validaAno(data.getAno());

        System.out.println(data.retornaData());
    }
}
