package br.com.pratica.um;

public class Aviao extends Automovel{

    private String prefixo;
    private int qtdTurbinas;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getQtdTurbinas() {
        return qtdTurbinas;
    }

    public void setQtdTurbinas(int qtdTurbinas) {
        this.qtdTurbinas = qtdTurbinas;
    }
}
