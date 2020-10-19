package com.insert;

public class Montadora {
	//Sem OO -- PENSANDO EM IMPLEMENTACAO.
	public static String montarInsert(String tabela) {
		if (tabela.contentEquals("Cliente")) {
			return "INSERT INTO Client(nome, idade) VALUES (?,?)";
		} else if (tabela.contentEquals("Produto")){
			return "INSERT INTO Produto(nome, tipo preço) VALUES (?,?)";
		} else {
			return "Inválido";
		}
	}
	
	//RACIOCINIO POR ABSTRACAO -- COM OO
	public static String montarInsertBom(Tabela t) {
		return "INSERT INTO " + t.getNomeTabela() + "(" + t.getCampos() + ") VALUES (" + t.getDados() + ")"; 
	}
}
