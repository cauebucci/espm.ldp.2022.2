package me.caue.exercicios;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int[][] valores = new int[10][10];
		Random gerador = new Random();
		int maior = 0;
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				int n = gerador.nextInt(0,1000);
				if(n > maior) {
					maior = n;
				}
				valores[i][j] = n;
			}
		}
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\nMaior números: " + maior);
		System.out.println("Posição do maior número:");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if(valores[i][j] == maior) {
					System.out.println("  " + (i+1) + "x" + (j+1));
				}
			}
		}
	}
}
