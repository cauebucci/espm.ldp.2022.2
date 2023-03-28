package me.caue.aula;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		double n;
		
		do{
			System.out.print("Digite o número que deseja terminar --> ");
			n = teclado.nextDouble();
			if(n < 0) {
				System.out.println("Digite um número maior que 0.");
			}
		}while(n < 0);
		
		double i = 1.0;
		double y = 0;
		
		while(i <= n) {
			y = i / Math.sqrt(i) + y;
			i++;
		}
		System.out.println(String.format("%.2f", y));
	}
}
