package com.carlosandre.cursojava.aula18;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tam = scan.nextInt();
		
		double[] valores = new double[tam];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o valor da posição " + (i+1) + ": ");
			valores[i] = scan.nextDouble();
		}
		
		for (int j = 0; j < valores.length; j++) {
			System.out.println(valores[j]);
		}

	}

}
