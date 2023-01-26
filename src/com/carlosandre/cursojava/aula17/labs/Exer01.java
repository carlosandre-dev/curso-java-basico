package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		float nota = 0;
		
		while (!valida) {
			System.out.print("Informe uma nota (0 a 10): ");
			nota = scan.nextFloat();
			
			if((nota < 0) || (nota > 10)) {
				System.out.println("Valor inválido");
			} else {
				System.out.println("A nota Digitada foi: " + nota);
				valida = true;
			}
			
		}

	}

}
