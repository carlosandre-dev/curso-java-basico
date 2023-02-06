package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] pares = new int[vetorA.length];
		int contador = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º elemento do Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				pares[i] = vetorA[i];
				contador++;
			}
			
		}
		System.out.println("Quantidade de pares: " + contador);

	}

}
