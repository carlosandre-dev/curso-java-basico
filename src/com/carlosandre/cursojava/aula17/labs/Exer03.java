package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean valida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		while (!valida) {
			System.out.print("Informe um nome maior que 3 caracteres: ");
			nome = scan.nextLine();

			if (nome.length() <= 3) {
				System.out.println("Nome inválido, maior que 3 caracteres!");
			} else {
				valida = true;
			}
		}

		valida = false;

		while (!valida) {
			System.out.print("Informe uma idade entre 0 e 150: ");
			idade = scan.nextInt();

			if ((idade <= 0) || (idade >= 150)) {
				System.out.println("Idade inválida, tente novamente");
			} else {
				valida = true;
			}
		}

		valida = false;

		while (!valida) {
			System.out.print("Digite o valor do salário: ");
			salario = scan.nextDouble();

			if (salario <= 0) {
				System.out.println("Salário inválido, tente novamente");
			} else {
				valida = true;
			}
		}

		valida = false;

		do {
			System.out.print("Informe o sexo 'f' ou 'm': ");
			sexo = scan.next();

			if ((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m"))) {
				valida = true;
			} else {
				System.out.println("Digite 'f' ou 'm': ");			
			}
		} while(!valida);

		valida = false;

		do {
			System.out.print("Informe o estado civil: ");
			estadoCivil = scan.next();

			if ((estadoCivil.equalsIgnoreCase("s")) || (estadoCivil.equalsIgnoreCase("c"))
					|| (estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))) {
				valida = true;
			} else {
				System.out.println("Digite 's', 'c', 'v' ou 'd': ");
			}
		} while(!valida);
		
		System.out.println("Cadastro realizado com sucesso!");
	}

}
