package me.caue.aula;

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int n;
		double lado1, lado2, lado3;

		System.out.println("Informe quantos triangulos se deseja calcular: ");
		n = teclado.nextInt();

		for (int count = 1; count <= n; count++) {
			System.out.println("Triangulo " + count);
			System.out.println("\nInforme o 1° lado desse triangulo:");
			lado1 = teclado.nextDouble();

			System.out.println("Informe o 2º lado desse triangulo:");
			lado2 = teclado.nextDouble();

			System.out.println("Informe o 3º lado desse triangulo:");
			lado3 = teclado.nextDouble();

			if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
				System.out.println(" valores aceitos");

				if ((lado1 == lado2 && lado2 == lado3)) {
					System.out.println("O triangulo é equilátero");
				} else if (lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado1 != lado2
						|| lado3 == lado1 && lado2 != lado1) {
					System.out.println("O triangulo é isóceles");
				} else {
					System.out.println("O triango é escaleno");
				}

			} else {
				System.out.println("Não é um triangulo");
			}

			System.out.println(" ");
		}
	}
}
