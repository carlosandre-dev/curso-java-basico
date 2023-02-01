package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num=0;
		double soma=0, media=0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Informe o "+ i + "º número: ");
			num = scan.nextInt();
			soma += num;
		}
		media = soma / 5;
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é de: " + media);
	}
	
}
