package br.com.wikicar.app;

import br.com.wikicar.dao.GenericDao;
import br.com.wikicar.entities.*;

public class InsertApp {
	
	public static void main(String[] args) {
		
		//Person p = new Person();
		CarDao c = new CarDao();
		
		
		//Dao<Person> daoPerson = new Dao<Person>();
		GenericDao<CarDao> daoCar = new GenericDao<CarDao>();
		
		c.setMarca("Chevrolet");
		c.setModelo("Corsa GT");
		c.setAnoLancamento(1987);
		c.setAnoEncerramento(2002);
		c.setEstepe(true);
		c.setModeloMotor("GTX 300");
		c.setPotenciaMotor("700cv");
		c.setPrecoLancamento(43000);
		c.setPrecoAtual(25000);
		c.setVendasInternacionais(200);
		c.setVendasNacionais(100);
		c.setQntAssentos(5);
		c.setKmRodado(53200);
		
		daoCar.saveOrUpdate(c);
		
		/*
		pessoa.setNome("Raphael Neves");
		pessoa.setIdade(28);
		
		carro.setModelo("Mustang");
		carro.setAnoFabricacao(1989);
		
		daoPessoa.saveOrUpdate(pessoa);
		daoCarro.saveOrUpdate(carro);
		
		*/
		System.out.println("Entidades salvas com sucesso!");
		
	}

}
