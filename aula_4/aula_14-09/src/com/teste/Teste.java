package com.teste;
import com.siga.Aluno;
import com.siga.Disciplina;
import com.siga.Estado;
import com.siga.endereco;

public class Teste {
	public static void main(String[] args) {
		endereco e = new endereco("Rua F", 10,"Sao Vicente", Estado.SP);
		Aluno a = new Aluno("Joao",e);
		
		a.mostrarDados();
		Disciplina d1 = new Disciplina("DS1", 80);
		Disciplina d2 = new Disciplina("TE1", 40);
		Disciplina d3 = new Disciplina("ENC", 80);
		
		a.matricular(d1);
		a.matricular(d2);
		a.matricular(d3);
		
		a.mostrarGrade();
		
		System.out.println(a.mostrarTotalCursado());
		
		d1.listarChamada();
	}
}
