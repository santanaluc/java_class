/*Atributos sempre privados, m�todos sempre publicos*/

package com.aula3;
// modificador de acesso == default
public class Foo {
	
	public static int d; // vira um membro de classe
	// evitar na orientacao ao objeto 
	int x;
	public int y;
	private int z;
	//3 atributos com 3 modificadores
	
	public static void mostrarD () {
		System.out.println("d: " + d);
	} // metodos estaticos nao acessa atributos/metodos nao estaticos
	
	public void mostrarX() {
		System.out.println(d);
		System.out.println(x);
	} // m�todo nao estatico acessa o atributo/metodo estatico
	
	public int getZ() {
		return this.z; // z e privado, mas esta na mesma classe entao nao conta
		//privado so vale para diferentes packages 
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
