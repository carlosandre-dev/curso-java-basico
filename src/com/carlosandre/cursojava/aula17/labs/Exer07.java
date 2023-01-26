package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
		System.out.println("Informe o 1º número: ");
		num1 = scan.nextInt();
		
		System.out.println("Informe o 2º número: ");
		num2 = scan.nextInt();
		
		System.out.println("Informe o 3º número: ");
		num3 = scan.nextInt();
		
		System.out.println("Informe o 4º número: ");
		num4 = scan.nextInt();
		
		System.out.println("Informe o 5º número: ");
		num5 = scan.nextInt();
		
		if((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
			System.out.println("Número 1: " + num1 + " é maior");
		} else if((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
			System.out.println("Número 2: " + num2 + " é maior");
		} else if((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
			System.out.println("Número 3: " + num3 + " é maior");
		} else if((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
			System.out.println("Número 4: " + num4 + " é maior");
		} else {
			System.out.println("Número 5: " + num5 + " é maior");
		}
		

	}

}
