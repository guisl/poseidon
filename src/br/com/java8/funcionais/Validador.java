package br.com.java8.funcionais;

@FunctionalInterface
public interface Validador<T> {
	boolean valida(T t);
}
