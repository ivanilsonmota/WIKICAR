package br.com.wikicar;

import br.com.wikicar.dao.GenericDao;
import br.com.wikicar.entities.CarDao;


public class Main {
	public static void main(String[] args) {
		
		CarDao c = new CarDao();
		GenericDao<CarDao> daoCar = new GenericDao<CarDao>();
		
		
	}
}
