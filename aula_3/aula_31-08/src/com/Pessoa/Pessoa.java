package com.Pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) throws Exception {
		if (nome.equals("")) {
			throw new Exception("Nome nao pode ser nulo!"); // classe para.
		} else {
			this.nome = nome;
		}
		if (idade >= 0 ) {
			this.idade = idade;
		} else {
			throw new Exception("Idade nao pode ser negativo");
		}
		// this.idade = Math.max(0, idade); // se passar negativo, fica 0
		//this.idade = Math.max(arg0, arg1);
	} // so muda o valor 1x
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
	public void aniversario() {
		idade++;
	}
	
	/*public void setNome(String nome) {
		System.out.println(nome);
	} // set destroi a regra de negpcio*/
	
}
