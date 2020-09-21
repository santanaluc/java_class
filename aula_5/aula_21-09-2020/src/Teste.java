
public class Teste {
	public static void main(String[] args) {
		Cachorro c = new Cachorro("Rex");
		Gato g = new Gato("Branco");
		Gato g2 = new Gato("Branco");
		c.brincar();
		c.comer(); // heranca
		c.dormir();
		g.arranhar();// heranca
		g.comer(); //heranca
		g.dormir();
		
		System.out.println(g.equals(g2)); //heranca
		
		System.out.println(g instanceof Gato);
		System.out.println(g instanceof Animal);
		System.out.println(g instanceof Object);
	}
}
