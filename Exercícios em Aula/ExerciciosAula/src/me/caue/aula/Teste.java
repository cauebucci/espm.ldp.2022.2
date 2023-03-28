package me.caue.aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int op;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Selecione uma das opções:");
		System.out.println("1 -> Tabuada");
		System.out.println("2 -> Potenciação");
		System.out.println("3 -> Logarítimo");
		System.out.println("");
		op = teclado.nextInt();
		if (op == 1) {
			int n;
			System.out.print("Deseja a tabuada de que número? ");
			n = teclado.nextInt();

			int i = 0;
			do {
				System.out.println(n + "x" + i + "= " + n * i);
				i++;
			} while (i <= 10);
		} else if (op == 2) {
			int n, a;
			System.out.print("Digite a base da sua operação: ");
			n = teclado.nextInt();
			System.out.print("Digite até que potência deseja: ");
			a = teclado.nextInt();
			int i = 0;
			System.out.println("");
			System.out.println("Potencialização de base " + n + " até a potência de " + a);
			do {
				System.out.println(n + "^" + i + "= " + Math.pow(n, i));
				i++;
			} while (i <= a);
		} else if (op == 3) {
			System.out.println(Math.log(2));
		} else {
			System.out.println("Opção inválida. Tente novamente!");
		}

	}

}
