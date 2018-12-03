package br.com.wikicar.app;

import br.com.wikicar.dao.*;
import br.com.wikicar.entities.*;

public class FindByIdApp {
	
	public static void main(String[] args) {
		
		GenericDao<PersonDao> daoPessoa = new GenericDao<PersonDao>();
		GenericDao<CarDao> daoCarro = new GenericDao<CarDao>();
		
		PersonDao pessoa = daoPessoa.findById(PersonDao.class, 1L);
		CarDao carro = daoCarro.findById(CarDao.class, 1L);
		
		System.out.println("### Entidade Pessoa encontrada ###");
		System.out.println("ID: " + pessoa.getId());
		System.out.println("NOME: " + pessoa.getNome());
		
		System.out.println("");
		
		System.out.println("### Entidade Carro encontrada ###");
		System.out.println("ID: " + carro.getId());
		System.out.println("MODELO: " + carro.getModelo());
		
		
	}

}
