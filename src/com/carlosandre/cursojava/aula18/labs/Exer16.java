package com.carlosandre.cursojava.aula18.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int menor = 0, igual = 0, maior = 0, contador = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º elemento do Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				menor += vetorA[i];
			} else if(vetorA[i] == 15) {
				igual++;
			} else {
				maior += vetorA[i];
				contador++;
			}
		}
		double media = maior/contador;
				
		System.out.println("A soma dos elementos menores que 15: " + menor);
		System.out.println("Quantidade de elementos iguais a 15: " + igual);
		System.out.println("Média dos elementos maiores que 15: " + media);

	}

}
