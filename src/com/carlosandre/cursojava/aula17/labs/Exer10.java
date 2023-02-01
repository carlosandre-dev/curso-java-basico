package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		for (int i = num1+1; i < num2; i++) {
			System.out.print("-" + i);
		}

	}

}
