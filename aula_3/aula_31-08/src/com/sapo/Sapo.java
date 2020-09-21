package com.sapo;

public class Sapo {
	private int qtPulo;
	private static int numeroSapo;
	
	public Sapo() {
		qtPulo++;
		numeroSapo++;
	}

	public int getQtPulo() {
		return qtPulo;
	}

	public static int getNumeroSapo() {
		return numeroSapo;
	}
}
