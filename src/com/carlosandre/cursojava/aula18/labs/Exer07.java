package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o º" + (i + 1) + "elemento do Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Informe o º" + (i + 1) + "elemento do Vetor B: ");
			vetorB[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}

		System.out.println("==================");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A: " + vetorA[i]);
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B: " + vetorB[i]);
		}

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("Vetor C: " + vetorC[i]);
		}

	}

}
