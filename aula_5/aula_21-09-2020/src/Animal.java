//espera sempre o extends
abstract public class Animal {
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void dormir() {
		System.out.println(nome + ": zZZzzZZZzzz");
	}
	
	public void comer() {
		System.out.println(nome + ": comeu");
	}
	
	public void dormir(int x) {
		System.out.println(nome + " dormiu " + x + " horas");
	}

	public String getNome() {
		return nome;
	}

	abstract public void emitirSom();
}
