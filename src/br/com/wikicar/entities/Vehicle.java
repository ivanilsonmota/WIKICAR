package br.com.wikicar.entities;

import javax.persistence.*;


public class Vehicle implements BaseEntity {
	protected String marca;
    protected String modelo;
    protected double anoLancamento;
    protected double anoEncerramento;
    protected int vendasNacionais;
    protected int vendasInternacionais;
    protected double kmRodado;
    protected double precoAtual;
    protected double precoLancamento;

	@Column(name="marca")
    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Column(name="modelo")
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Column(name="ano_lancamento")
	public double getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(double anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Column(name="ano_encerramento")
	public double getAnoEncerramento() {
		return anoEncerramento;
	}
	
	public void setAnoEncerramento(double anoEncerramento) {
		this.anoEncerramento = anoEncerramento;
	}

	@Column(name="vendas_nacionais")
	public double getVendasNacionais() {
		return vendasNacionais;
	}
	
	public void setVendasNacionais(int vendasNacionais) {
		this.vendasNacionais = vendasNacionais;
	}
	
	@Column(name="vendas_internacionais")
	public double getVendasInternacionais() {
		return vendasInternacionais;
	}
	
	public void setVendasInternacionais(int vendasInternacionais) {
		this.vendasInternacionais = vendasInternacionais;
	}
	
	@Column(name="km_rodado")
	public double getKmRodado() {
		return kmRodado;
	}
	
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	@Column(name="preco_atual")
	public double getPrecoAtual() {
		return precoAtual;
	}
	
	public void setPrecoAtual(double precoAtual) {
		this.precoAtual = precoAtual;
	}
	
	@Column(name="preco_lancamento")
	public double getPrecoLancamento() {
		return precoLancamento;
	}
	
	public void setPrecoLancamento(double precoLancamento) {
		this.precoLancamento = precoLancamento;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

    
}