package br.com.fiap.api.dto;

public class ImovelRequestDto {

    private String descricao;
    private double metros;
    private double valor;
    private TipoImovelRequestDto tipoImovelRequestDto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoImovelRequestDto getTipoImovelRequestDto() {
        return tipoImovelRequestDto;
    }

    public void setTipoImovelRequestDto(TipoImovelRequestDto tipoImovelRequestDto) {
        this.tipoImovelRequestDto = tipoImovelRequestDto;
    }
}
