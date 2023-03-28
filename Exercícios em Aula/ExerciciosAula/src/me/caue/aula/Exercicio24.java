package me.caue.aula;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		int n, n2;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.print("Digite o número que deseja calcular o fatorial --> ");
			n = teclado.nextInt();
			if (n <= 0) {
				System.out.println("\nERRO| O número precisa ser positivo!");
			}

		} while (n <= 0);

		n2 = n;

		while (n2 > 1) {
			n2--;
			n = n * n2;

		}

		System.out.println("Resposta --> " + n);
	}
}
