package br.com.wikicar.app;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.Car;
import br.com.wikicar.entities.Person;

public class RemoveApp {
	public static void main(String[] args) {
		
		Dao<Person> daoPerson = new Dao<Person>();
		Dao<Car> daoCar = new Dao<Car>();
		
		daoPerson.remove(Person.class, 1L);
		daoCar.remove(Car.class, 1L);
		
		System.out.println("Entidades removidas com sucesso!");
		
	}
}
