package me.caue.aula;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		String letra;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a letra desejada --> ");
		letra = teclado.next();
		letra = letra.toUpperCase();
		
		if(letra.equalsIgnoreCase("a") 
				|| letra.equalsIgnoreCase("e") 
				|| letra.equalsIgnoreCase("i") 
				|| letra.equalsIgnoreCase("o") 
				|| letra.equalsIgnoreCase("u")) {
			System.out.println("A letra " + letra + " é uma vogal.");
		}else {
			System.out.println("A letra " + letra + " não é uma vogal.");
		}
	}
	
}
