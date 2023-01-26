package com.carlosandre.cursojava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		double popA = 80000;
		double popB = 200000;
		double taxaA = 3;
		double taxaB = 1.5;
		boolean taxaAnual = false;
		int contador = 0;
		
		do {
			popA += popA * taxaA /100;
			popB += popB * taxaB /100;
			contador++;
			
			if(popA >= popB) {
				taxaAnual = true;
			}
		} while(!taxaAnual);
		
		System.out.println("Foram necessários " + contador + " anos para a População A ultrapassar a População B");
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
	}

}
