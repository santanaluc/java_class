package com.insert;

public class Teste {
	public static void main(String[] args) {
		System.out.println(Montadora.montarInsert("Cliente"));
		System.out.println(Montadora.montarInsertBom(new Cliente("Teste", 30)));
	}
}
