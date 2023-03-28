package me.caue.aula;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		int n;
		double y = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Digite o número que deseja encerrar -- > 1/");
			n = teclado.nextInt();
			
			if(n <= 0) {
				System.out.println("Número inválido.");
			}
		}while(n <= 0);
		
		
		for(int count = 1; count <= n; count++) {
			if(count % 2 == 0) {
				y = y - (1.0 / count);
			}else {
				y = y + (1.0 / count);
			}
		}
		
		System.out.println("Resultado --> " + String.format("%.3f", y));
	}
}
