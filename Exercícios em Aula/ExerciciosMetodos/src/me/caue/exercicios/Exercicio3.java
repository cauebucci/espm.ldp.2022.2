package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o 1� valor --> ");
		int Valor1 = teclado.nextInt();
		System.out.print("Digite o 2� valor --> ");
		int Valor2 = teclado.nextInt();
		System.out.print("Digite o 3� valor --> ");
		int Valor3 = teclado.nextInt();
		
		System.out.println("O maior n�mero � " + maiorValor(Valor1, Valor2, Valor3));
	}
	
	public static int maiorValor(int Valor1, int Valor2, int Valor3) {
		if(Valor1 > Valor2 && Valor1 > Valor3) {
			return Valor1;
		}else if(Valor2 > Valor1 && Valor2 > Valor3) {
			return Valor2;
		}else {
			return Valor3;
		}
	}
}
