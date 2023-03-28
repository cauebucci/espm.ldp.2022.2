package me.caue.aula;

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String numero = "";
		int n;
		
		do {
			System.out.print("Digite o número que deseja ver os seus divisores --> ");
			n = teclado.nextInt();
			if(n < 0) {
				System.out.println("Número inválido!");
			}
		}while(n < 0);

		
		
		for(int i = -n; i <= n ; i++) {
			if (i != 0 && n % i == 0) {
				System.out.print(i + " , " );
				if(i == n) {
					System.out.print(i);
					System.out.println(numero);
				}
			}
		}
	}
}
