package br.com.wikicar.app;

import javax.swing.JOptionPane;

import br.com.wikicar.dao.GenericDao;
import br.com.wikicar.entities.PersonDao;

public class UpdateApp {
	
	public static void main(String[] args) {
		
		GenericDao<PersonDao> daoPerson = new GenericDao<PersonDao>();
		
		PersonDao person = daoPerson.findById(PersonDao.class, 1L);
		person.setNome("Raphael Oliveira Neves");
		daoPerson.saveOrUpdate(person);
		JOptionPane.showInputDialog("Entidade atualizada com sucesso.");
		
	}

}
