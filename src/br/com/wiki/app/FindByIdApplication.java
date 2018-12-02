package br.com.wiki.app;

import br.com.wikicar.dao.*;
import br.com.wikicar.entities.*;

public class FindByIdApplication {
	
	public static void main(String[] args) {
		
		Dao<Pessoa> daoPessoa = new Dao<Pessoa>();
		Dao<Carro> daoCarro = new Dao<Carro>();
		
		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
		Carro carro = daoCarro.findById(Carro.class, 1L);
		
		System.out.println("### Entidade Pessoa encontrada ###");
		System.out.println("ID: " + pessoa.getId());
		System.out.println("NOME: " + pessoa.getNome());
		
		System.out.println("");
		
		System.out.println("### Entidade Carro encontrada ###");
		System.out.println("ID: " + carro.getId());
		System.out.println("MODELO: " + carro.getModelo());
		
		
	}

}
