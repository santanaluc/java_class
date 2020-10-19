package com.insert;

public class Produto implements Tabela {
	private String nome;
	private Tipo tipo;
	private double preco;
	
	public Produto(String nome, Tipo tipo, double preco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public double getPreco() {
		return preco;
	}

	@Override
	public String getNomeTabela() {
		// TODO Auto-generated method stub
		return "Produto";
	}

	@Override
	public String getDados() {
		// TODO Auto-generated method stub
		return "?, ?, ?";
	}

	@Override
	public String getCampos() {
		// TODO Auto-generated method stub
		return "nome, tipo, preco";
	}
}
