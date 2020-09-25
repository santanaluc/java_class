
public class Disciplina {
	String nome;
	int carga;
	Curso curso;
	
	public Disciplina(String nome, int carga, Curso curso) {
		this.nome = nome;
		this.carga = carga;
		this.curso = curso;
	}
	
	void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Carga: " + carga);
		System.out.println("Curso: " + curso);
	}
	
	void mensagem() {
		switch(curso) {
		case SI:
			System.out.println("CURSO DE DESIGN");
			break;
			
		case ADS:
			System.out.println("CURSO DE COBOL");
			break;
		case LOG:
			System.out.println("CURSO DE CAMINHAO");
			break;
		case GP:
			System.out.println("CURSO DE PORTO");
			break;
		default:
			System.out.println("CURSO EMP");
			/**ou "case GE"**/
		}
	}
}

