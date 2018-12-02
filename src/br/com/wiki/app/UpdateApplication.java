package br.com.wiki.app;

import br.com.wikicar.dao.Dao;
import br.com.wikicar.entities.Pessoa;

public class UpdateApplication {
	
	public static void main(String[] args) {
		
		Dao<Pessoa> daoPessoa = new Dao<Pessoa>();
		
		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
		pessoa.setNome("Raphael Oliveira Neves");
		daoPessoa.saveOrUpdate(pessoa);
		System.out.println("Entidade atualizada com sucesso.");
		
	}

}
