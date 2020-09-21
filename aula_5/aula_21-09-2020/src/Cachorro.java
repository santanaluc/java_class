
public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
		//this.nome = nome;
	}
	
	public void brincar() {
		System.out.println(getNome() + ": Brincou");
	}
	
	@Override 
	public void emitirSom() {
		System.out.println("AUAUAUA");
	}
}
