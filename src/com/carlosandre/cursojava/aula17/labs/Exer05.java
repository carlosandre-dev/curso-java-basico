package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double popA = 0, popB = 0, taxaA = 0, taxaB = 0;
		boolean taxaValida = false;

		while (!taxaValida) {
			System.out.println("Informa a população A: ");
			popA = scan.nextDouble();

			if (popA <= 0) {
				System.out.println("População A precisa ser maior que 0!");
			} else {
				taxaValida = true;
			}
		}

		taxaValida = false;

		while (!taxaValida) {
			System.out.println("Informa a população B: ");
			popB = scan.nextDouble();

			if (popB <= 0) {
				System.out.println("População B precisa ser maior que 0!");
			} else {
				taxaValida = true;
			}
		}

		taxaValida = false;

		while (!taxaValida) {
			System.out.println("Informa a taxa da Pouplação A: ");
			taxaA = scan.nextDouble();

			if (taxaA <= 0) {
				System.out.println("A taxa A precisa ser maior que 0!");
			} else {
				taxaValida = true;
			}
		}
		
		taxaValida = false;

		while (!taxaValida) {
			System.out.println("Informa a taxa da Pouplação B: ");
			taxaB = scan.nextDouble();

			if (taxaB <= 0) {
				System.out.println("A taxa B precisa ser maior que 0!");
			} else {
				taxaValida = true;
			}
		}
		
		int contador = 0;

		while(popA < popB) {
			popA += popA * taxaA /100;
			popB += popB * taxaB /100;
			contador++;

		} ;

		System.out.println("Foram necessários " + contador + " anos para a População A ultrapassar a População B");
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);

	}

}
