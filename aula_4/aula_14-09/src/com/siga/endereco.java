package com.siga;
public class endereco {
	private String logradouro;
	private int numero;
	private String cidade;
	private Estado estado;
	
	public endereco(String logadouro, int numero, String cidade, Estado estado) {
		this.logradouro = logadouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void mostrarEndereco() {
		System.out.println("Logradouro: " + logradouro);
		System.out.println("Numero: " + numero);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
}
