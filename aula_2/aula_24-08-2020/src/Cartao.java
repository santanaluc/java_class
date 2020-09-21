
public class Cartao {
	String nome;
	double valor;
	TipoCartao tipo;
	
	public Cartao(String nome, double valor, TipoCartao tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	double descontar() {
		switch (tipo) {
		case SILVER:
			return 1;
		case GOLD: 
			return 0.95;
		case PLATINUM:
			return 0.9;
		default:
			return 0.8;
		}
	}
	
	void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		double fatura = valor * descontar();
		System.out.println("Fatura: " + fatura);
	}
}
