package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o elemento na posição " + (i + 1) + ": ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A: " + vetorA[i]);
		}

		System.out.println("==================");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B: " + vetorB[i]);
		}

	}

}
