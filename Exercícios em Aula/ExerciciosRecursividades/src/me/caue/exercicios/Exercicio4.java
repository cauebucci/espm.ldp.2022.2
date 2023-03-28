package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("N: ");
		int n = teclado.nextInt();
		System.out.print("R: ");
		int r = teclado.nextInt();
		
		System.out.println(calcular(n, r));
	}
	
	public static int calcular(int n, int nu) {
		if(n == 0) return 0;
		if(n%10 == nu) {
			return 1 + calcular(n/10, nu);
		}
		return calcular(n/10, nu);
	}
}
