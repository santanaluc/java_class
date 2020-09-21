package com.siga;
import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private int carga;
	private ArrayList<Aluno> lista;
	
	public Disciplina(String nome, int carga) {
		this.nome = nome;
		this.carga = carga;
		lista = new ArrayList<Aluno>();
	}
	
	public void associar(Aluno a) {
		lista.add(a);
	}
	
	public void mostrarDisciplina () {
		System.out.println("Disciplina: " + nome);
		System.out.println("Carga: " + carga);
	}

	public int getCarga() {
		return carga;
	}
	
	public void listarChamada() {
		System.out.println("========Lista de Chamada=======");
		System.out.println("Disciplina: " + nome);
		for (Aluno a : lista) {
			a.mostrarDados();
		}
	}
}
