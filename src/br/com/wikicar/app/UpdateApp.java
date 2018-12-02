package br.com.wikicar.app;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.Person;

public class UpdateApp {
	
	public static void main(String[] args) {
		
		Dao<Person> daoPerson = new Dao<Person>();
		
		Person pessoa = daoPerson.findById(Person.class, 1L);
		pessoa.setNome("Raphael Oliveira Neves");
		daoPerson.saveOrUpdate(pessoa);
		System.out.println("Entidade atualizada com sucesso.");
		
	}

}
