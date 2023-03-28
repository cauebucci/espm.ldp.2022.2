package me.caue.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int linha_a, coluna_a;
		int linha_b, coluna_b;
		
		System.out.print("Total de linhas da matriz A --> ");
		linha_a = teclado.nextInt();
		System.out.print("Total de colunas da matriz A --> ");
		coluna_a = teclado.nextInt();
		linha_b = coluna_a;
		System.out.print("Total de colunas da matriz B --> ");
		coluna_b = teclado.nextInt();
		
		// declaração das matrizes
		int[][] a = new int[linha_a][coluna_a];
		int[][] b = new int[linha_b][coluna_b];
		int[][] c = new int[linha_a][coluna_b];
 		
		// preenche a matriz A
		preencher(a);
		
		//imprimir a matriz A
		System.out.println("Matriz A:");
		imprimir(a);
		
		// preenche a matriz B
		preencher(b);
		
		// imprimir a matriz B
		System.out.println("\nMatriz B:");
		imprimir(b);
		
		// multiplicação de A por B gerando C
		multiplicar(a, b, c);
		
		// imprimir a matriz C
		System.out.println("\nMatriz C:");
		imprimir(c);
	}
	
	public static void preencher(int[][] m) {
		Random gerador = new Random();
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = gerador.nextInt(1, 4);
			}
		}
	}
	
	public static void imprimir(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void multiplicar(int[][] a, int[][] b, int[][] c) {
		int soma;
		
		for(int i = 0; i < a.length; i++) { // controla as linhas da matriz A
			for(int k = 0; k < b[0].length; k++) { // controla as colunas de B
				soma = 0;
				for(int j = 0; j < a[i].length; j++) { // controla as colunas de A e as linhas de B
					soma += a[i][j] * b[j][k];
				}
				c[i][k] = soma;
			}
			
		}
		
	}
	
}
