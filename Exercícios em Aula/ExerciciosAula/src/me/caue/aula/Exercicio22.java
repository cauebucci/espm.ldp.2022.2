package me.caue.aula;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		int n;
		int i = 1;
		int maior = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		while (i <= 5) {
			System.out.print("Digite o " + i + "º número --> ");
			n = teclado.nextInt();		
			if (n > maior || i == 1) {
				maior = n;
			}
			i++;
		}
		
		System.out.println("O maior número é " + maior);
	}
}
