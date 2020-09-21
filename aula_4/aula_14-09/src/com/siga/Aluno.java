package com.siga;
import java.util.ArrayList;

//ALUNO HAS-A ENDERECO
//ALUNO TEM-UM ENDERECO
//ALUNO TEM VÁRIAS DISCIPLINAS
public class Aluno {
	private String nome;
	private endereco endereco;
	private ArrayList<Disciplina> disciplinas; //1 - n
	
	public Aluno(String nome, endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void matricular(Disciplina d) {
		if (d != null) {
			disciplinas.add(d);
			d.associar(this);
		}
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		endereco.mostrarEndereco();
	}
	
	public void mostrarGrade() {
		for(Disciplina d : disciplinas) {
			d.mostrarDisciplina();
		}
	}
	
	public int mostrarTotalCursado() {
		int soma = 0;
		for (Disciplina d : disciplinas) {
			soma = soma + d.getCarga();
		}
		return soma;
	}
}
