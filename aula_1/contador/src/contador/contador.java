package contador;

public class contador {
	int numClicks;
	
	// Os metodos abaixo manipulam numClicks
	
	void zerar() {
		numClicks = 0;
	}
	
	void incrementar() {
		numClicks += 1;
		// numClicks = numclicks + 1
	}
	
	void decrementar() {
		if(numClicks > 0)
			numClicks--;
	}
	
	void mostrar() {
		System.out.println(numClicks);
	}
}
