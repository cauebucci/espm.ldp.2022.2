package me.caue.aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int op;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Selecione uma das op��es:");
		System.out.println("1 -> Tabuada");
		System.out.println("2 -> Potencia��o");
		System.out.println("3 -> Logar�timo");
		System.out.println("");
		op = teclado.nextInt();
		if (op == 1) {
			int n;
			System.out.print("Deseja a tabuada de que n�mero? ");
			n = teclado.nextInt();

			int i = 0;
			do {
				System.out.println(n + "x" + i + "= " + n * i);
				i++;
			} while (i <= 10);
		} else if (op == 2) {
			int n, a;
			System.out.print("Digite a base da sua opera��o: ");
			n = teclado.nextInt();
			System.out.print("Digite at� que pot�ncia deseja: ");
			a = teclado.nextInt();
			int i = 0;
			System.out.println("");
			System.out.println("Potencializa��o de base " + n + " at� a pot�ncia de " + a);
			do {
				System.out.println(n + "^" + i + "= " + Math.pow(n, i));
				i++;
			} while (i <= a);
		} else if (op == 3) {
			System.out.println(Math.log(2));
		} else {
			System.out.println("Op��o inv�lida. Tente novamente!");
		}

	}

}
