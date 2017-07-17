package br.com.java8.tests;

import static java.util.Comparator.comparing;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.java8.entidade.Usuario;


public class Capitulo5 {
	public static void main(String... args) throws FileNotFoundException {

		Usuario user1 = new Usuario("Luis inacio lula da silva", 150);
		Usuario user2 = new Usuario("Michel Temer", 120);
		Usuario user3 = new Usuario("Outro Ladr�o aqui", 190);
		List<Usuario> usuarios = Arrays.asList(user3, user2, user1);
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());

		}
		System.out.print("\n");
		System.out.println("VOU ORDENADAR POR NOME DO LADRÃO... \n");

		// usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		// COm o uso do static import funciona assim: apenas usa o metodo
		// statico da interface
		usuarios.sort(comparing(u -> u.getNome()));

		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
		
		//Outro método de utilizacaoo
		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		palavras.sort(Comparator.naturalOrder());

		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}
}
