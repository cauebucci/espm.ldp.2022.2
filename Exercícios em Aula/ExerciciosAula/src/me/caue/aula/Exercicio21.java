package me.caue.aula;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		int x, y;
		String n;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero --> ");
		x = teclado.nextInt();
		
		System.out.print("Digite o 2� n�mero --> ");
		y = teclado.nextInt();
		
		while(x >= y) {
			System.out.println("");
			System.out.println("O 2� n�mero deve ser maior que o 1� n�mero.");
			System.out.print("Digite o 2� n�mero --> ");
			y = teclado.nextInt();
		}
		
		System.out.println("");
		System.out.println("N�meros entre " + x + " e " + y + ":");
		n = "";
		while(x <= y) {
			n = x + ", ";
			x++;
		}
		
		System.out.println("[" + n + "]");
		
	}
}
