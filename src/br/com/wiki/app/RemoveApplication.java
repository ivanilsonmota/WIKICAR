package br.com.wiki.app;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.Carro;
import br.com.wikicar.entities.Pessoa;

public class RemoveApplication {
	public static void main(String[] args) {
		
		Dao<Pessoa> daoPessoa = new Dao<Pessoa>();
		Dao<Carro> daoCarro = new Dao<Carro>();
		
		daoPessoa.remove(Pessoa.class, 1L);
		daoCarro.remove(Carro.class, 1L);
		
		System.out.println("Entidades removidas com sucesso!");
		
	}
}
