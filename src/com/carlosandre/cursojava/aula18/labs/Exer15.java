package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int pares = 0, impares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º elemento do Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		double percentualPar = (pares * 100) / vetorA.length;
		double percentualImpar = (impares * 100) / vetorA.length;
		
		System.out.println("Percentual de pares: " + percentualPar);
		System.out.println("Percentual de ímpares: " + percentualImpar);

	}

}
