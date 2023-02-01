package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0, maior = num, soma = 0, menor = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			soma += num;

			if (num > maior) {
				maior = num;
			} else {
				menor = num;
			}

		}
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Soma dos números: " + soma);

	}

}
