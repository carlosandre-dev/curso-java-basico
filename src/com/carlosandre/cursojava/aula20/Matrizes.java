package com.carlosandre.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		double [][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 7;
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 10;
		
		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 8;
		
		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 9.5;
		notasAlunos[2][2] = 8.7;
		notasAlunos[2][3] = 7.6;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média dos alunos:");
		
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + (i+1) + " é: " + (soma/4));
		}
	}

}
