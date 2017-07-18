package br.com.java8.tests;

import java.util.Arrays;
import java.util.List;

import br.com.java8.entidade.Usuario;

public class Capitulo6 {

	public static void main(String[] args) {

		Usuario user3 = new Usuario("Outro Ladrão aqui", 190);
		Usuario user1 = new Usuario("Luis inacio lula da silva", 150);
		Usuario user2 = new Usuario("Michel Temer", 120);

		List<Usuario> usuarios = Arrays.asList(user3, user2, user1);
		usuarios.forEach(us -> us.tornaModerador());
		for (Usuario us : usuarios) {
			System.out.println(us.getNome() +" " + us.getPontos() + " " +  us.isModerador());
		}
	}
}
