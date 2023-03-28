package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String palavra = "";
		String aux = "";
		do {
			System.out.print("Digite a palavra que deseja verificar --> ");
			palavra = teclado.nextLine();
			if(palavra.contains(" ")) {
				System.out.println("\nPalavra inválida! Tente novamente.");
			}
		}while(palavra.contains(" "));
		
		palavra = palavra.toUpperCase();
		
		for (int i = (palavra.length()-1); i >= 0 ; i--) {
			aux = aux + palavra.charAt(i);
		}
		
		if(aux.equals(palavra)) {
			System.out.println("\nEssa palavra é palíndromo.");
		}else {
			System.out.println("\nEssa palavra não é palíndromo.");
		}
		
	}
}
