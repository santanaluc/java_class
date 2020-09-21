package atividade_3;

/*
Complexo para representar números imaginários e esta deve possuir:
Atributos: dois doubles a(Parte real) e b(Parte imaginária).
*/

public class complexo {
	public double a; 
	public double b;
	public double i;
	
	public complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	void soma() {
		i = Math.sqrt(-1);
		a = a + (b * i);
	}
	
	void multiplica() {
		a = (a + b * i) * (c + d * i) = (a*c - b*d) + (a*d + b*c) * i
	}
}
