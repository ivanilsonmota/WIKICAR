package br.com.wikicar.entities;

public class Carro extends Veiculo{
	protected String modeloMotor;
	protected String potenciaMotor;
	protected boolean estepe;
	protected int qntAssentos;
	
	public String getModeloMotor() {
		return modeloMotor;
	}
	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}
	public String getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(String potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public boolean isEstepe() {
		return estepe;
	}
	public void setEstepe(boolean estepe) {
		this.estepe = estepe;
	}
	public int getQntAssentos() {
		return qntAssentos;
	}
	public void setQntAssentos(int qntAssentos) {
		this.qntAssentos = qntAssentos;
	}
	
	
}
