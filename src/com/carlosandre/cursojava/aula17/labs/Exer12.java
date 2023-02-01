package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escolha a Tabuaba de 1 a 10: ");
		int tabuada = scan.nextInt();
			
		System.out.print("Tabuada de " + tabuada);
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}


	}

}
