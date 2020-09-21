package com.main;

import com.aula3.Foo;

public class Teste {
	
	public static void main(String[] args) {
		Foo f = new Foo();
		// Acesso de leitura
		f.y = 5;
		System.out.println(f.y);
		// de outra classe conseguiu localizar o y e fazer a leitura dele
		// nao consigo fazer acesso de escrita no x ou no z
		// se colocar no mesmo pacote ele achara o x
		// a leitura e impedida pelo package.
		
		//onde e leitura, usa o "get"
		System.out.println(f.getZ());
		System.out.print(f.getX());
		
		// onde e escrita usa o "set"
		f.setZ(2);
		f.setX(4);
		
		//onde e leitura, usa o "get"
		System.out.println(f.getX());
		System.out.println(f.getZ());
		
		
		//Membro de classe
		f.d = 6;
		f.mostrarD();
	}
}
