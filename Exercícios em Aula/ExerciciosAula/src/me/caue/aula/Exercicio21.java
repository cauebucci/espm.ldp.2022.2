package me.caue.aula;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		int x, y;
		String n;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1º número --> ");
		x = teclado.nextInt();
		
		System.out.print("Digite o 2º número --> ");
		y = teclado.nextInt();
		
		while(x >= y) {
			System.out.println("");
			System.out.println("O 2º número deve ser maior que o 1º número.");
			System.out.print("Digite o 2º número --> ");
			y = teclado.nextInt();
		}
		
		System.out.println("");
		System.out.println("Números entre " + x + " e " + y + ":");
		n = "";
		while(x <= y) {
			n = x + ", ";
			x++;
		}
		
		System.out.println("[" + n + "]");
		
	}
}
