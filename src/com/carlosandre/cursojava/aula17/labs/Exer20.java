package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String sair = "s";
		
		while(sair.equals("s")) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			int fatorial = 1;
			
			if((num >= 0 ) && (num < 16)) {
				for (int i = num; i > 0; i--) {
					fatorial *= i;
					System.out.print("." + i);
				}
				System.out.println(" = " + fatorial);
			} else {
				sair = "n";
				System.out.println("O número precisa ser entre 0 e 16!");
			}
				
		}
	}
}
