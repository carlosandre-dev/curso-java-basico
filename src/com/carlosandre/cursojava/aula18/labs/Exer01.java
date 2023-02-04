package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º" + " elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i];
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
