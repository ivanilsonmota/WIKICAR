package br.com.wikicar.entities;


public class Veiculo {
	protected String marca;
    protected String modelo;
    protected double anoLancamento;
    protected double anoEncerramento;
    protected int vendasNacionais;
    protected int vendasInternacionais;
    protected double kmRodado;
    protected double precoAtual;
    protected double precoLancamento;

	
    public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(double anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public double getAnoEncerramento() {
		return anoEncerramento;
	}
	public void setAnoEncerramento(double anoEncerramento) {
		this.anoEncerramento = anoEncerramento;
	}
	public double getVendasNacionais() {
		return vendasNacionais;
	}
	public void setVendasNacionais(int vendasNacionais) {
		this.vendasNacionais = vendasNacionais;
	}
	public double getVendasInternacionais() {
		return vendasInternacionais;
	}
	public void setVendasInternacionais(int vendasInternacionais) {
		this.vendasInternacionais = vendasInternacionais;
	}
	public double getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	public double getPrecoAtual() {
		return precoAtual;
	}
	public void setPrecoAtual(double precoAtual) {
		this.precoAtual = precoAtual;
	}
	public double getPrecoLancamento() {
		return precoLancamento;
	}
	public void setPrecoLancamento(double precoLancamento) {
		this.precoLancamento = precoLancamento;
	}

    
}