package br.com.wikicar.app;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.*;

public class InsertApp {
	
	public static void main(String[] args) {
		
		//Person p = new Person();
		Car c = new Car();
		
		//Dao<Person> daoPerson = new Dao<Person>();
		Dao<Car> daoCar = new Dao<Car>();
		
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
