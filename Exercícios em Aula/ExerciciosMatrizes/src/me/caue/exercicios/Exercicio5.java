package me.caue.exercicios;

import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[][] x = new int[4][4];
		int aux;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = gerador.nextInt(0, 20);
			}
		}
		
		System.out.println("Antes de trocar");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for(int i = 0, j = x.length - 1; i < x.length; i++, j--) {
			aux = x[i][i];
			x[i][i] = x[i][j];
			x[i][j] = aux;
		}
		
		System.out.println("\nDepois de trocar");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
}
