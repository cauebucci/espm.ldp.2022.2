package me.caue.aula;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escreva o valor de a -> ");
		a = teclado.nextDouble();
		
		if(a == 0) {
			System.out.println("O valor de A não pode ser igual a 0.");
		}else { 
			
			System.out.print("Escreva o valor de b -> ");
			b = teclado.nextDouble();
			
			System.out.print("Escreva o valor de c -> ");
			c = teclado.nextDouble();
			
			delta = (b*b) - (4*a*c);
			
			if(delta < 0) {
				System.out.println("O resultado do delta é negativo. Tente outro.");
			}else {
				x1 = (-b + Math.sqrt(delta)) / (2*a);
				x2 = (-b - Math.sqrt(delta)) / (2*a);
				
				System.out.println("Delta = " + String.format("%.2f", delta));
				System.out.println("x1 = " + String.format("%.2f", x1));
				System.out.println("x2 = " + String.format("%.2f", x2));
			}
		}
	}
	
}
