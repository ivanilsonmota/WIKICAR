package br.com.wikicar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_carro")
public class CarDao extends Vehicle implements BaseEntity {
	private Long id;
	private String marca;
	private String modelo;
	private String modeloMotor;
	private String potenciaMotor;
	private boolean estepe;
	private double kmRodado;
    private double precoAtual;
    private double precoLancamento;
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_carro")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

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
	
	
	@Column(name="modelo_motor")
	public String getModeloMotor() {
		return modeloMotor;
	}
	
	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}
	
	@Column(name="potencia_motor")
	public String getPotenciaMotor() {
		return potenciaMotor;
	}
	
	public void setPotenciaMotor(String potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	@Column(name="estepe")
	public boolean isEstepe() {
		return estepe;
	}
	
	public void setEstepe(boolean estepe) {
		this.estepe = estepe;
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
	

	
	
	
}
