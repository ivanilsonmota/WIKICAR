package br.com.wikicar.app;

import br.com.wikicar.dao.GenericDao;
import br.com.wikicar.entities.CarDao;
import br.com.wikicar.entities.PersonDao;

public class RemoveApp {
	public static void main(String[] args) {
		
		GenericDao<PersonDao> daoPerson = new GenericDao<PersonDao>();
		GenericDao<CarDao> daoCar = new GenericDao<CarDao>();
		
		daoPerson.remove(PersonDao.class, 1L);
		daoCar.remove(CarDao.class, 1L);
		
		System.out.println("Entidades removidas com sucesso!");
		
	}
}
