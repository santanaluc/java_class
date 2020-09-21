
public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void arranhar() {
		System.out.println(getNome() + ": Arranhou");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("MIAU");
	}
}
