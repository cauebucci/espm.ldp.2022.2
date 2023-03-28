package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		String dna, aux = "";
		
		System.out.print("Digite a sequência de DNA que deseja a cadeia complementar -- > ");
		dna = teclado.nextLine();
		dna = dna.toLowerCase();
		
		for (int i = 0; i < dna.length(); i++) {
			if(dna.charAt(i) == 'a') {
				aux += "t";
			}else if(dna.charAt(i) == 't') {
				aux += "a";
			}else if(dna.charAt(i) == 'c') {
				aux += "g";
			}else if(dna.charAt(i) == 'g') {
				aux += "c";
			}
		}
		System.out.println("Cadeia complementar: " + aux.toUpperCase());
		
	}
}


