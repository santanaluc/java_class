package aula_6;

public interface SerVivo {
	default void respirar() {
		System.out.println("...");
	}
}
