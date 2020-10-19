package aula_6;

public interface Animal extends SerVivo {
	
	//nunca muda
	public static int NUM_PATAS = 4;
	
	void emitirSom();
	
	static void mensagem() {
		System.out.println("Interface animal");
	}
	
	default void dormir() {
		System.out.println("zzzzzZZZZZZZZZz");
	}
}
