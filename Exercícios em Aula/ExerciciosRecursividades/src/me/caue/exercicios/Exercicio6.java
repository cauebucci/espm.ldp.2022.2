package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.print("N: ");
		n = teclado.nextInt();
		
		System.out.println(calcular(n));
		
	}
	
	public static int calcular(int n) {
		if(n < 3) return 1;
		return calcular(n-1) + calcular(n-2);
	}
}
