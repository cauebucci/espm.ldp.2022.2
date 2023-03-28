package me.caue.aula;

import java.util.Scanner;

public class Teste4 {

	public static void main(String[] args) {
		String letra;
		double b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Número --> ");
		b = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Escreva a letra --> ");
		letra = teclado.nextLine();
		
		
		System.out.println(letra);
		System.out.println(b);

	}

}
