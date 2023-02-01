package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		int base = scan.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = scan.nextInt();
		
		int potencia = base;
		
		for (int i = 1; i < expoente; i++) {
			potencia *= base;
		}
		System.out.println("o resultado da potência é: " + potencia);

	}

}
