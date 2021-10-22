package br.com.java;

import br.com.java.modelo.Livro;
import br.com.java.modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa = new Pessoa("Diego", 39, "M");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2 = new Pessoa("Teste", 40, "F");
		
		Livro livro = new Livro();
		livro = new Livro("Java POO", "Autor", 300, pessoa);
		
		Livro livro2 = new Livro();
		livro2 = new Livro("Teste", "teste", 400, pessoa2);
		
		
		

		
		System.out.println(livro.detalhes());
		System.out.println("-----------------");
		livro.abrir();
		livro.folhear(100);
		livro.voltarPagina();

		System.out.println(livro2.detalhes());
		System.out.println("-----------------");
		livro2.abrir();
		livro2.folhear(100);
		livro2.voltarPagina();
		System.out.println(livro2.detalhes());

	}

}
