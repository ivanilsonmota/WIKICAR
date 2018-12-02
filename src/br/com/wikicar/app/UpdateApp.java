package br.com.wikicar.app;

import javax.swing.JOptionPane;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.Person;

public class UpdateApp {
	
	public static void main(String[] args) {
		
		Dao<Person> daoPerson = new Dao<Person>();
		
		Person person = daoPerson.findById(Person.class, 1L);
		person.setNome("Raphael Oliveira Neves");
		daoPerson.saveOrUpdate(person);
		JOptionPane.showInputDialog("Entidade atualizada com sucesso.");
		
	}

}
