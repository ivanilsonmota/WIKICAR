package br.com.wikicar.app;

import br.com.wikicar.dao.*;
import br.com.wikicar.entities.*;

public class FindByIdApp {
	
	public static void main(String[] args) {
		
		Dao<Person> daoPessoa = new Dao<Person>();
		Dao<Car> daoCarro = new Dao<Car>();
		
		Person pessoa = daoPessoa.findById(Person.class, 1L);
		Car carro = daoCarro.findById(Car.class, 1L);
		
		System.out.println("### Entidade Pessoa encontrada ###");
		System.out.println("ID: " + pessoa.getId());
		System.out.println("NOME: " + pessoa.getNome());
		
		System.out.println("");
		
		System.out.println("### Entidade Carro encontrada ###");
		System.out.println("ID: " + carro.getId());
		System.out.println("MODELO: " + carro.getModelo());
		
		
	}

}
