package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("N: ");
		int b = teclado.nextInt();
		
		binario(b);
	}
	
	public static void binario(int decimal) {
		if(decimal == 0) return;
		int numero = (decimal%2);
		
		System.out.print(numero);
		
		binario(decimal/2);
	}
}
