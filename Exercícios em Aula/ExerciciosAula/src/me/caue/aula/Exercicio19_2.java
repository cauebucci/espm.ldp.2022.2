package me.caue.aula;

import java.util.Scanner;

public class Exercicio19_2 {
	public static void main(String[] args) {
		String letra;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a letra desejada --> ");
		letra = teclado.next();
		letra = letra.toUpperCase();
		
		
		
		switch (letra) {
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("A letra " + letra + " é uma vogal.");
				break;
			default:
				System.out.println("A letra " + letra + " não é uma vogal.");
		}

	}
}
