package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o º"+(i + 1)+"elemento do Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		System.out.println("==================");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A: " + vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B: " + vetorB[i]);
		}

	}

}
