package com.rodarPessoa;

import com.Pessoa.Pessoa;

public class rodar {
	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa("Lucas", 20);
		// p.setNome("");
		p.mostrarDados();
		p.aniversario();
		p.mostrarDados();
	}
}
