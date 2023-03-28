package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x, n;
		
		System.out.print("X: ");
		x = teclado.nextDouble();
		
		System.out.print("N: ");
		n = teclado.nextDouble();
		
		System.out.println(calcular(x, n));
	}
	
	public static double calcular(double x, double n) {
		if(n == 0) return 1;
		return x * calcular(x, n-1);
		
	}
}
