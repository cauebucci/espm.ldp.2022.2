package me.caue.exercicios;

import java.util.Random;

public class Exercicio5_Metodo {
	public static void main(String[] args) {

		int[][] x = new int[4][4];
		preencher(x);
		
		System.out.println("Antes de trocar");
		imprimir(x);
		System.out.println("\nDepois de trocar");
		imprimir(trocar(x));
	}

	public static void preencher(int[][] matriz) {
		Random gerador = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(0, 20);
			}
		}
	}

	public static void imprimir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static int[][] trocar(int[][] matriz) {
		int aux;
		for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
			aux = matriz[i][i];
			matriz[i][i] = matriz[i][j];
			matriz[i][j] = aux;
		}
		return matriz;
	}
}
