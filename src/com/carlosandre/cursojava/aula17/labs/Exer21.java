package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " não é primo - divisível por " + i);
				primo = false;
			}
		}
		if(primo) {
			System.out.println(num + " é um número primo");
		}
	}

}
