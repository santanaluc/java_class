package atividade_2;

public class Lampada {
	String estado;
	int numCliques;
	int totalCliques;
	
	public Lampada(String estado) {
		this.estado = estado;
	}

	void ligar () {
		estado = "ON";
		if (totalCliques >= 3) {
			System.out.println("Total de cliques excedido, favor trocar a lampada!");
			estado = "OFF";
		}
		if (estado == "ON") {
			totalCliques += 1;
			System.out.println("Ligada");
		}
	}
	
	void desligar () {
		if (estado == "ON") {
			estado = "OFF";
			System.out.println("Desligada");
		}
	}
	
	void estadoAtual () {
		/*if (totalCliques >= 3) {
			System.out.println("Total de cliques excedido, favor trocar!");
			return;
		}*/ if (estado == "ON"){
			System.out.println("Lampada ligada");
		} else {
			System.out.println("Lampada desligada");
		}
	}
}
