package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anterior = 1, atual = 1, proximo = 0;
		
		System.out.println("Digite o n-ésimo termo: ");
		int limite = scan.nextInt();
		
		do {
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			System.out.print(" " + proximo);
		} while(proximo < limite);

	}

}
