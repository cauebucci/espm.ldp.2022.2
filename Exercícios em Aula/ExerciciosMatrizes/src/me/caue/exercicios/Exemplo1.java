package me.caue.exercicios;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int[][] valor = new int[3][3];
		
		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor[i].length; j++) {
				System.out.print("Valor de " + (1+i) + "x" + (1+j) + ":" );
				valor[i][j] = teclado.nextInt();
			}
		}
		
		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor[i].length; j++) {
				System.out.print(valor[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
