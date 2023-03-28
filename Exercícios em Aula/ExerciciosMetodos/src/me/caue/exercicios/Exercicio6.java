package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int[] p = new int[10];

		for (int i = 0; i < p.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			p[i] = teclado.nextInt();
		}
		OrdemCrescente(p);

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}

	public static void OrdemCrescente(int[] numeros) {
		int n;
		for (int o = 0; o < numeros.length; o++) {
			for (int i = 0; i < (numeros.length - 1); i++) {
				if (numeros[i] > numeros[i + 1]) {
					n = numeros[i + 1];
					numeros[i + 1] = numeros[i];
					numeros[i] = n;
				}
			}
		}
	}
}
