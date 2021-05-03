package com.carlosandre.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();*/
		
		System.out.println("Matricula, Cor, Salário, Ativo:");
		int matricula = scan.nextInt();
		String cor = scan.next();
		double salario = scan.nextDouble();
		boolean ativo = scan.nextBoolean();
		
		System.out.println("Seus dados: ");
		System.out.println("Matrícula: " + matricula);
		System.out.println("Cor: " + cor);
		System.out.println("Salário: " + salario);
		System.out.println("Ativo: " + ativo);

	}

}
