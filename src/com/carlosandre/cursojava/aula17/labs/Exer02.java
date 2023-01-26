package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		String username, password;
		
		while (!valida) {
			System.out.print("Informe o nome do usuário: ");
			username = scan.nextLine();
			
			System.out.print("Informe a senha do usuário: ");
			password = scan.nextLine();
			
			if(username.equalsIgnoreCase(password)) {
				System.out.println("Valor inválido");
			} else {
				System.out.println("Usuário cadastrado com sucesso!");
				System.out.println("User: " + username);
				System.out.println("Password: " + password);
				valida = true;
			}
			
		}

	}

}
