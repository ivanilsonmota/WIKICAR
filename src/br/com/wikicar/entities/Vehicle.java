package br.com.wikicar.entities;

import javax.persistence.*;

@Entity
@Table(name="tb_carro")
public class Vehicle {
	protected Long id;
	protected int qntAssentos;
    protected double anoFabricacao;
    protected double periodoVenda;
	
    @Id
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="qnt_assentos")
	public int getQntAssentos() {
		return qntAssentos;
	}

	public void setQntAssentos(int qntAssentos) {
		this.qntAssentos = qntAssentos;
	}

	@Column(name="ano_fabricacao")
	public double getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(double anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Column(name="periodo_venda")
	public double getPeriodoVenda() {
		return periodoVenda;
	}

	public void setPeriodoVenda(double periodoVenda) {
		this.periodoVenda = periodoVenda;
	}
	
	
}