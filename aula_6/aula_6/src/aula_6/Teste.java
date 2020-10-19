package aula_6;

public class Teste {
	public static void main(String[] args) {
		Gato g = new Gato();
		g.emitirSom();
		System.out.println(Animal.NUM_PATAS);
		Animal.mensagem();
		g.dormir();
		g.respirar();
		
		//POLIMORFISMO DE SUBTIPOS
		Animal a = new Gato();
		//a.arranhar(); //não aceita pq é um método do Gato() e não do Animal
		a.emitirSom();
		
		//Para recuperar:
		//Downcast
		Gato h = (Gato) a;
		h.arranhar();
		
		//Upcast
		Animal b = (Animal) g;
		b.emitirSom(); 
		
		//Problema: 
		Cachorro c = (Cachorro) b; //b é g e g é Gato (Gato não pode virar cachorro mas o compilador nao pega esse erro)
		c.brincar();
	}
}
