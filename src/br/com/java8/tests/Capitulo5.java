package br.com.java8.tests;

import static java.util.Comparator.comparing;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import br.com.java8.entidade.Usuario;


public class Capitulo5 {
	public static void main(String... args) throws FileNotFoundException {

		Usuario user3 = new Usuario("Outro Ladrão aqui", 190);
		Usuario user1 = new Usuario("Luis inacio lula da silva", 150);
		Usuario user2 = new Usuario("Michel Temer", 120);
		List<Usuario> usuarios = Arrays.asList(user3, user2, user1);
		
		//Outro método de utilizacaoo
		System.out.print("\n");
		System.out.println("NOVA ORDENAÇÃO UTILIZANDO METODO naturalOrder... \n");
		System.out.println("Lista original... \n");
		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		palavras.sort(Comparator.reverseOrder());
		
		System.out.print("\n");
		System.out.println("ORDENANDO... \n");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		Function<Usuario, String> extraiNome = u -> u.getNome();
		Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
		usuarios.sort(comparator);
	    //OU
		//usuarios.sort(comparing(u -> u.getNome()));
		
		for (Usuario user : usuarios) {
			System.out.println(user.getNome());
		}
		
		ToIntFunction<Usuario> extraiPontos = u -> u.getPontos();
		Comparator<Usuario> comp =
		Comparator.comparingInt(extraiPontos);
		usuarios.sort(comp);
		
		// chamada mais --> enxuta usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
		
		
		for (Usuario user : usuarios) {
			System.out.println(user.getPontos() +" "+ user.getNome());
		}
	}
}
