package me.caue.exercicios;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int somaA = 0, somaB = 0;
		int[][] valores = new int[4][4];
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				valores[i][j] = gerador.nextInt(100);
			}
		}
		
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				System.out.print(valores[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if (i == j) {
                    somaA = somaA + valores[i][j];
                    
                }
				if ((i + j) == (valores.length - 1)) {
					somaB = somaB + valores[i][j];
					
				}
			}
		}
		
		System.out.println("Diagonal Principal: " + somaA);
		System.out.println("Diagonal Secundária: " + somaB);

	}

}
