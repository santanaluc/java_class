package atividade_1;

public class Pessoa {
	String nome;
	sexoPessoa sexoPessoa;
	int idade;
	boolean vegetariana;
	
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		this.nome = nome;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
	void verificarConsumo() {
		if (vegetariana == true) {
			System.out.println("Nao come carne");
			return;
		}
		else {
			System.out.println("Come carne");
		} 
		if (idade > 0 && idade < 3) {
			System.out.println("Criancas nao comem");
		} 
		if (idade > 4 && idade < 12) {
			System.out.println("Consome, em media, 1kg de carne");
		}
		if (idade > 13) {
			System.out.println("Consome, em media, 2kg de carne");
		}
	}
}

