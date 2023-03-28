package me.caue.exercicios.vetores;

import java.util.Scanner;

public class ExercicioExtra2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[5];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			valores[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("\nTabuada do " + valores[i] + ":");
			for (int j = 0; j <= 10; j++) {
				System.out.println("   " + valores[i] + "*" + j + "= " + valores[i]*j);
			}
		}

	}

}
