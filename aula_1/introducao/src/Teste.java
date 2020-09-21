
public class Teste {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.nome = "BIDU";
		c.raca = "SRD";
		c.latir();
		c.mostrarRaca();
		Cachorro d = new Cachorro();
		d.nome = "REX";
		d.raca = "PITBULL";
		//QUANDO UM METODO EH CHAMADO DE FORA
		//DE CACHORRO, UM OBJETO CHAMADO this
		//EH CRIADO NO CONTEXTO E REPRESENTA
		//QUEM O CHAMOU. NESSE CASO, this = d.
		d.latir();
		d.mostrarRaca();
	}
}