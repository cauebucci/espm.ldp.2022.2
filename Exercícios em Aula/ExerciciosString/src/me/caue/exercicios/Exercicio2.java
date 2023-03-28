package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String aux = "";
		String palavra;
		
		System.out.print("Digite a palavra que deseja decompor --> ");
		palavra = teclado.nextLine();
		
		for (int i = 0; i <= (palavra.length()-1); i++) {
			aux += palavra.charAt(i);
			System.out.println(aux.toUpperCase());
		}
	}
}
