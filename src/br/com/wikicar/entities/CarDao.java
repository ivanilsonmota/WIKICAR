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
	private String modelo;
	private String modeloMotor;
	private String potenciaMotor;
	private boolean estepe;
	private int qntAssentos;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_carro")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	@Column(name="qnt_assentos")
	public int getQntAssentos() {
		return qntAssentos;
	}
	
	public void setQntAssentos(int qntAssentos) {
		this.qntAssentos = qntAssentos;
	}
	
	
}
