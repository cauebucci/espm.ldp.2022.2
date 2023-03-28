package me.caue.exercicios;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		do {
			int x = teclado.nextInt();
			
			System.out.println(fatorial(x));
		}while(true);
		
	}
	
	public static double fatorial(double x) {
		double fatorial = 1;
		for (double i = x; i > 0; i--) {
			fatorial =+ fatorial*i;
		}
		
		
		return fatorial;
		
	}
}
