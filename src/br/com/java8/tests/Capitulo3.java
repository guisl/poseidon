package br.com.java8.tests;

import br.com.java8.funcionais.Validador;

public class Capitulo3 {
	public static void main(String[] args) {
		Validador<String> validadorCEP = valor -> {
			return valor.matches("[0-9]{5}-[0-9]{3}");
		};
		boolean value = validadorCEP.valida("04101-300");
		System.out.println(value);
		
		Runnable o = () -> {
			System.out.println("O que sou eu? Que lambda?");
		};
		
		final int numero = 1;
		new Thread(() -> {
			System.out.println(numero);
		}).start();
		
		o.run();
		System.out.println(o);
		System.out.println(o.getClass());

	}
}
