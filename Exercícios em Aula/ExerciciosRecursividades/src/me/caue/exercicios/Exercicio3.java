package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int[] numero = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numero.length; i++) {
			System.out.print(i+1 + ": ");
			numero[i] = teclado.nextInt();
		}
		
		System.out.println(calcular(numero, numero.length));
	}
	
	public static int calcular(int[] numero, int qnt) {
		if(qnt == 0) return 0;
		
		return numero[qnt-1] + calcular(numero, qnt-1);
		
	}
}
