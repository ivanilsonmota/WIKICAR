package br.com.wiki.app;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.Carro;
import br.com.wikicar.entities.Pessoa;

public class InsertApplication {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Carro carro = new Carro();
		
		Dao<Pessoa> daoPessoa = new Dao<Pessoa>();
		Dao<Carro> daoCarro = new Dao<Carro>();
		
		
		pessoa.setNome("Raphael Neves");
		pessoa.setIdade(28);
		
		carro.setModelo("Mustang");
		carro.setAnoFabricacao(1989);
		
		daoPessoa.saveOrUpdate(pessoa);
		daoCarro.saveOrUpdate(carro);
		
		System.out.println("Entidades salvas com sucesso!");
		
	}

}
