package br.com.java8.tests;

import java.util.Arrays;
import java.util.List;

import br.com.java8.entidade.Usuario;

public class Capitulo2 {
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Malandro", 120);
		Usuario user3 = new Usuario("Tiririca Imaculado", 190);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		usuarios.forEach(u -> u.tornaModerador());
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}
