package me.caue.exercicios;

import java.util.Scanner;

public class Exemplo1Recursivo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		do {
			int x = teclado.nextInt();
			
			System.out.println(fatorial(x));
		}while(true);	
	}
	
	public static double fatorial(double x) {
		if(x == 1) return 1;
		
		return x * fatorial(x-1);
		
	}
}
