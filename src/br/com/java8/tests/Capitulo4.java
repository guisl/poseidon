package br.com.java8.tests;

import java.util.ArrayList;
import java.util.List;

import br.com.java8.entidade.Usuario;

public class Capitulo4 {
	public static void main(String... args) {
		Usuario user1 = new Usuario("Luis inacio lula da silva", 150);
		Usuario user2 = new Usuario("Michel Temer", 120);
		Usuario user3 = new Usuario("Outro Ladrão aqui", 190);
		/*
		 * List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		 * Consumer<Usuario> mostraMensagem = u ->
		 * System.out.println("antes de imprimir os nomes"); Consumer<Usuario>
		 * imprimeNome = u -> System.out.println(u.getNome());
		 * usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		 */

		/*Predicate<Usuario> predicado = new Predicate<Usuario>() {
			public boolean test(Usuario u) {
				return u.getPontos() > 160;
			}
		};*/
		
		List<Usuario> usuarios1 = new ArrayList<>();
		usuarios1.add(user1);
		usuarios1.add(user2);
		usuarios1.add(user3);
		usuarios1.removeIf(u -> u.getPontos() > 160);
		usuarios1.forEach(u -> System.out.println(u.getNome()));
	}
}
