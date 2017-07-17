package br.com.java8.consumer;

import java.util.function.Consumer;
import br.com.java8.entidade.Usuario;

public class Mostrador implements Consumer<Usuario> {
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}
}
