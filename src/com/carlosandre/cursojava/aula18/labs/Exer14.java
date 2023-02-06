package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int contador = 0, media = 0, impares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º elemento do Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impares += vetorA[i];
				contador++;
			}
			media = impares / contador;
		}
		System.out.println("Quantidade de impares: " + contador);
		System.out.println("Média dos números ímpares: " + media);

	}

}
