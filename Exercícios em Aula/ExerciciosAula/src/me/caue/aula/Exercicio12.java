package me.caue.aula;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner taclado = new Scanner(System.in);
		double x, y;
		
		System.out.print("Digite o valor de X -> ");
		x = taclado.nextDouble();
		
		if(x >= -5 && x <= 5) {
			System.out.println("Número inválido.");
		}else {
			y = (x-8)/(Math.sqrt(Math.pow(x, 2)-25));
			System.out.println("O valor de Y é: " + String.format("%.2f", y));
			
		}
		
		
	}
}
