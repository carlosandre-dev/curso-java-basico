package com.carlosandre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i < 50; i++) {
			if(i % 2 != 0) {
				System.out.print("-" + i);
			}
		}

	}

}
