package me.caue.aula;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		int n;
		int divisor = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Digite o n�mero que deseja verificar --> ");
			n = teclado.nextInt();
			
			if(n <= 0) {
				System.out.println("N�mero inv�lido.");
			}
		}while(n <= 0);
		
		for(int count = n; count >= 1; count--) {
			if (n % count == 0) {
				divisor++;
			}
		}
		
		if(divisor == 2) {
			System.out.println("O n�mero " + n + " � um n�mero primo.");
		}else {
			System.out.println("O n�mero " + n + " n�o � um n�mero primo.");
		}
		
		
		
		
	}
}
