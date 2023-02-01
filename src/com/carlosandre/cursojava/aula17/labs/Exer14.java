package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int par = 0, impar = 0, num;
		String sair = "n"; 
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + impar);

	}

}
