package com.insert;

public class Cliente implements Tabela{
	private String nome;
	private int idade;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}

	@Override
	public String getNomeTabela() {
		// TODO Auto-generated method stub
		return "Cliente";
	}

	@Override
	public String getDados() {
		// TODO Auto-generated method stub
		return "?,?";
	}

	@Override
	public String getCampos() {
		// TODO Auto-generated method stub
		return "nome, idade";
	}
	
}
