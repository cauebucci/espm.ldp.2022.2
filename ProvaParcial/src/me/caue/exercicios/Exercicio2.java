package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite a frase que desja inverter: ");
		frase = teclado.nextLine();
		
		System.out.println("Frase: " + frase);
		System.out.println("Frase invertida: " + inverter(frase));
	}
	
	public static String inverter(String frase) {
		String invertida = "";
		for (int i = frase.length(); i > 0 ; i--) {
			invertida += frase.charAt(i-1);
		}
		return invertida;
	}

}
