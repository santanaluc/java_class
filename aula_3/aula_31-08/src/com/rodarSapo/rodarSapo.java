package com.rodarSapo;

import com.sapo.Sapo;

public class rodarSapo {
	public static void main (String[] args) throws Exception{ 
		// pq usa-se "public static void main":
			//pq nao precisa instanciar a classe
		Sapo s1 = new Sapo();
		Sapo s2 = new Sapo();
		Sapo s3 = new Sapo();
		Sapo s4 = new Sapo();
		Sapo s5 = new Sapo();
		
		System.out.println(s1.getQtPulo());
		System.out.println(s2.getQtPulo());
		System.out.println(s3.getQtPulo());
		System.out.println(s4.getQtPulo());
		System.out.println(s5.getQtPulo());
		
		System.out.println(Sapo.getNumeroSapo());
	}
}
